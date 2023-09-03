package com.dev.listaUserDept.entity;

import javax.persistence.*;

// Mapear minhas classes para indicar oque vai ser tabela, oque vai ser chave
// Mapeamentoobjeto relacional jpa
// O @Entity da jpa
// Table para dizer qual o nome da tabela

@Entity
@Table(name = "tb_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
