package com.company;
import java.util.Arrays;

class Team {
    public static void main(String[] args) {
        Member[] members = new Member[]{
                new Member("Alex", 0, 0, 0, 10, 7, 12),
                new Member("Max", 0, 0, 0, 12, 5, 10),
                new Member("Mark", 0, 0, 0, 15, 6, 9),
                new Member("Nick", 0, 0, 0,18, 8,11)
        };
        Group group = new Group(" Iron man", members);
        System.out.println(group);
        Course course = new Course(100, 5000, 200);
        course.doIt(members);
        for (Member member:members ) {
            System.out.println(member.toString());
        }
    }
}
