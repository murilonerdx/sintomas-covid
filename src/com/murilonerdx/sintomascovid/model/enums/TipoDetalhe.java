package com.murilonerdx.sintomascovid.model.enums;

public enum TipoDetalhe {
    DENGUE("Paciente com diagnostico de dengue"),
    COVID_19("Paciente com diagnostico de COVID-19"),
    SINDROME_RESPIRATORIA("Paciente com diagnostico de alguma sindrome respiratoria");

    private String descricao;

    TipoDetalhe(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
