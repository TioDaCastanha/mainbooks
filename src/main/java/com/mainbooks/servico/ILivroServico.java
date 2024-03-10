package com.mainbooks.servico;

import java.util.List;
import com.mainbooks.modelo.Livro;

public interface ILivroServico {

    public Livro salvarLivro(Livro livro);

    public List<Livro> buscarTodosLivros();

    public Livro buscarLivroPorId(Long id);

    public void deletarLivroPorId(Long id);

    public void atualizarLivro(Livro livro);

}
