package com.angular.support.controller;

import com.angular.support.model.Student;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentController {

    private List<Student> list = new ArrayList<>(

            Arrays.asList(

                    new Student(1,"John", LocalDate.now(), 77),
                    new Student(2,"Paul", LocalDate.now(), 88),
/*                    new Student(3,"Ringo", LocalDate.now(), 57),
                    new Student(4,"George", LocalDate.now(), 78),
                    new Student(5,"Freddy", LocalDate.now(), 58),
                    new Student(6,"Brian", LocalDate.now(), 80),
                    new Student(7,"Mik", LocalDate.now(), 58),
                    new Student(8,"David", LocalDate.now(), 80),*/
                    new Student(9,"Roger", LocalDate.now(), 94)
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

    @PostMapping("student/add")
    public void add(@Valid @RequestBody Student student)
    {
        System.out.println("----------------------");
        System.out.println(student);
        list.add(student);
    }

    @RequestMapping("student/get/list/{from}/{amount}")
    List<Student> showPage(@PathVariable("from") int from, @PathVariable("amount") int amount)
    {
         if(from + amount> list.size()) amount = list.size() - from -1;
       // List<Student>  page = list.stream().filter(student -> student.)
        return list.subList(from, from + amount);
    }


}
