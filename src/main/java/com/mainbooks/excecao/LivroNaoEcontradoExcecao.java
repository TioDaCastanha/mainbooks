package com.mainbooks.excecao;

public class LivroNaoEcontradoExcecao extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LivroNaoEcontradoExcecao() {
        super();
    }

    public LivroNaoEcontradoExcecao(String mensagemPersonalizada){
        super(mensagemPersonalizada);
    }
}
