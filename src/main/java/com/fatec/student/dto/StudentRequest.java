package com.fatec.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentRequest(
    @NotNull(message = "Nome não pode ser vazio")
    String nome,

    @NotBlank(message =  "Curso não pode ser nulo")
    String curso
) {
    
}
