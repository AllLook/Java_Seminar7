package data;

import java.util.Comparator;
import java.util.List;

public class GroupStreamComparator implements Comparator<GroupStream> {
    GroupStream groupStream = new GroupStream();



    @Override
    public int compare(GroupStream groupStream, GroupStream groupStream1) {
        return (groupStream.getGroupStudent1().compareTo(groupStream.getGroupStudent()));
    }
}


