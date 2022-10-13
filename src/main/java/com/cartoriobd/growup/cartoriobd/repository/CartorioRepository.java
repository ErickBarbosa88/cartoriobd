package com.cartoriobd.growup.cartoriobd.repository;

import com.cartoriobd.growup.cartoriobd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CartorioRepository extends JpaRepository<Usuario, Long>{

}
