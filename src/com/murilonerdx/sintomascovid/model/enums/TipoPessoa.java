package com.murilonerdx.sintomascovid.model.enums;

public enum TipoPessoa {
    IDOSO("Idoso de 60 a 74 anos"),
    CRIANCA("Criança até 12 anos"),
    GESTANTE("Gestante"),
    ADULTO("Adulto homem ou mulher entre 20 e 40"),
    JOVEM("Jovem dos 12 até os 20");

    private String descricao;

    TipoPessoa(String descricao){
        this.descricao=descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
