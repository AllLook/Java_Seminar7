package data;

import java.util.Comparator;
import java.lang.Comparable;

public class GroupStreamComparator implements Comparator<GroupStream> {
   //GroupStream groupStream = new GroupStream();

    @Override
    public int compare(GroupStream  groupStream1, GroupStream groupStream2) {
        return groupStream1.getGroupStudent().size().compareTo(groupStream2.getGroupStudent1().size());
    }
}







