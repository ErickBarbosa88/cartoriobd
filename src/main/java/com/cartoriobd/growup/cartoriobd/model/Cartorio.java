package com.cartoriobd.growup.cartoriobd.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "cartorio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cartorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 255)
    @NotNull
    private String nome;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Column(name = "endereco", length = 255)
    @NotNull
    private Endereco endereco;

    @Column(name = "listaservicos", length = 255)
    @NotNull
    private String listaservicos;
}
