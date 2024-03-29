package com.kodilla.stream;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(f->f.getGender() == 'm')
                .filter(f->LocalDate.now().getYear() - f.getBirthDate().getYear() >= 20)
                .filter(f->f.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, f-> f));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}




