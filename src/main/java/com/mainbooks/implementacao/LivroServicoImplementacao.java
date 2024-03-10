package com.mainbooks.implementacao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mainbooks.excecao.LivroNaoEcontradoExcecao;
import com.mainbooks.modelo.Livro;
import com.mainbooks.repositorio.LivroRepositorio;
import com.mainbooks.servico.ILivroServico;

@Service
public class LivroServicoImplementacao implements ILivroServico {

    @Autowired
    private LivroRepositorio repositorio;

    @Override
    public Livro salvarLivro(Livro livro) {
        return repositorio.save(livro);
    }

    @Override
    public List<Livro> buscarTodosLivros() {
        return repositorio.findAll();
    }

    @Override
    public Livro buscarLivroPorId(Long id) {
        Optional<Livro> opcional = repositorio.findById(id);
        if (opcional.isPresent()) {
            return opcional.get();
        } else {
            throw new LivroNaoEcontradoExcecao("Livro com ID: " + id + " não encontrado. ");
        }
    }

    @Override
    public void deletarLivroPorId(Long id) {
        repositorio.delete(buscarLivroPorId(id));
    }

    @Override
    public void atualizarLivro(Livro livro) {
        repositorio.save(livro);
    }


}
