package com.etekhno.first;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students = new ArrayList(){{
        Student s1 = new Student("1", "usman");
        Student s2 = new Student("2", "Kiran");
        Student s3 = new Student("3", "Saeed");
        add(s1);
        add(s2);
        add(s3);
    }};


    /*@GetMapping("/student")

    public Student getStudent(){
        Student s1 = new Student();
        s1.setId("1");
        s1.setName("usman");
        return s1;
    }*/

    @GetMapping("/students")
  public List<Student> getStudentList() {





        return students;

    }

    @PostMapping("/student")
    public void addNewStudent(@RequestBody Student student){

        students.add(student);


    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        for(int i=0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getId().equals(id)){
                students.remove(i);
            }
        }
    }

}
