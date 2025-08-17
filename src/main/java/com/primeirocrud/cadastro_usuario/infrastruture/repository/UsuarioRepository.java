package com.primeirocrud.cadastro_usuario.infrastruture.repository;

import com.primeirocrud.cadastro_usuario.infrastruture.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    //Em JPA não existe o find by email e sim find by id, então temos que criar
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
