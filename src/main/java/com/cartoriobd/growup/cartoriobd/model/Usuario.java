package com.cartoriobd.growup.cartoriobd.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    @NotNull
    private String nome;

    @Column(name = "cpf", length = 14)
    @NotNull
    private String cpf;

    @Column(name = "email", length = 255)
    private String email;








}
