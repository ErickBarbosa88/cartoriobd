package com.cartoriobd.growup.cartoriobd.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", length = 255)
    @NotNull
    private String rua;

    @Column(name = "cep", length = 14)
    @NotNull
    private String cep;

    @Column(name = "bairro", length = 255)
    @NotNull
    private String bairro;

    @Column(name = "cidade", length = 60)
    @NotNull
    private String cidade;

    @Column(name = "estado", length = 60)
    @NotNull
    private String estado;

}
