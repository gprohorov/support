package com.angular.support.services;


import com.angular.support.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServive {

private List<Student> students = new ArrayList<>(

        Arrays.asList(
                new Student(1, "John Lennon", LocalDate.now(), 66),
                new Student(2, "Paul McCartney", LocalDate.now(), 77),
                new Student(3, "Ringo Star", LocalDate.now(), 88)
        ));

public List<Student> showAll(){
    return  this.students;
}



}




