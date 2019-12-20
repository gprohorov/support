package com.angular.support.services;


import com.angular.support.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServive {

private List<Student> students = new ArrayList<>(

        Arrays.asList(
                new Student(1, "John Lennon", LocalDateTime.now(), 66),
                new Student(2, "Paul McCartney", LocalDateTime.now(), 77),
                new Student(3, "Ringo Star", LocalDateTime.now(), 88)
        ));

public List<Student> showAll(){
    return  this.students;
}

}




