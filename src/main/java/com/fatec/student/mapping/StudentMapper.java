package com.fatec.student.mapping;

import com.fatec.student.dto.StudentRequest;
import com.fatec.student.dto.StudentResponse;
import com.fatec.student.entities.Student;

public class StudentMapper {
    
    public static Student toEntity(StudentRequest request){
        Student student = new Student();
        student.setNome(request.nome());
        student.setCurso(request.curso());
        return student;
    }

    public static StudentResponse toDTO(Student student){
        return new StudentResponse(student.getId(), student.getNome(), student.getCurso());
    }
}
