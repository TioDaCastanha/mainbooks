package com.mainbooks.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mainbooks.modelo.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}

