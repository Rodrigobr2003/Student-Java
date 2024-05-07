package com.fatec.student.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.entities.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    
    @GetMapping
    public List<Student> getStudents(){

        Student s1 = new Student();
        s1.setId(1);
        s1.setNome("Rodrigo");
        s1.setCurso("ADS");

        Student s2 = new Student();
        s2.setId(2);
        s2.setNome("Gabriel");
        s2.setCurso("ADS");

        Student s3 = new Student();
        s3.setId(3);
        s3.setNome("Enzo");
        s3.setCurso("ADS");

        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);

        return lista;

    }
}
