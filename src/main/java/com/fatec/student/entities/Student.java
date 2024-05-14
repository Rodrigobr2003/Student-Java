package com.fatec.student.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //define student como entidade
@Table(name="TBL_STUDENT") //define nome p tabela
public class Student {

    @Id //define ID como chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //define a estratégia de criação do ID do banco de dados
    private Integer id;

    @Column(length = 40) //definindo nome como uma coluna e dando um tamanho max de 40
    private String nome;


    private String curso;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }    

    
}
