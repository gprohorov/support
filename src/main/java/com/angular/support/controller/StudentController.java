package com.angular.support.controller;

import com.angular.support.model.Student;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentController {

    private List<Student> list = new ArrayList<>(

            Arrays.asList(

                    new Student(1,"John", LocalDateTime.now(), 77),
                    new Student(2,"Paul", LocalDateTime.now(), 88),
                    new Student(3,"Ringo", LocalDateTime.now(), 88)
            )
    );

    @RequestMapping("student/get/list")
    List<Student> showAll(){
        return list;
    }

    @PostMapping("student/delete/list")
    public int deleteAll(@Valid @RequestBody List<Integer> list)
        {
            System.out.println(" list size "  + list.size());
        return list.size();
    }

}
