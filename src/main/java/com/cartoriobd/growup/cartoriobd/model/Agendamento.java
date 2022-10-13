package com.cartoriobd.growup.cartoriobd.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipodeservico", length = 14)
    @NotNull
    private String tipodeservico;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Column(name = "usuario", length = 14)
    @NotNull
    private Usuario usuario;

    @Column(name = "data", length = 14)
    @NotNull
    private Date data;
}
