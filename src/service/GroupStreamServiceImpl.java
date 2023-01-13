package service;

import data.GroupStream;
import data.GroupStreamComparator;

import java.util.Collections;

public class GroupStreamServiceImpl {

    public static void sortStream(GroupStream groupStream){
        Collections.sort(groupStream.getGroupStudent(),new GroupStreamComparator());
    }
}
