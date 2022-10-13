package com.cartoriobd.growup.cartoriobd.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 14)
    @NotNull
    private String nome;

    @Column(name = "email", length = 14)
    @NotNull
    private String email;

    @Column(name = "senhadeacesso", length = 20)
    @NotNull
    private String senhadeacesso;
}
