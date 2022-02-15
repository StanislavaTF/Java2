package com.company;
import java.util.Arrays;

public class Group {
    private String name;
    private Member[] members;

    public Group (String name, Member[] members) {
        this.name = name;
        this.members = members;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group:" +  name;
    }

    public Member[] getMembers() {
        return members;
    }
}
