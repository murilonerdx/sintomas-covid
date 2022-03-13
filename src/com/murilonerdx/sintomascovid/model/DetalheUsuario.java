package com.murilonerdx.sintomascovid.model;

import com.murilonerdx.sintomascovid.model.enums.Adverso;
import com.murilonerdx.sintomascovid.model.enums.TipoPessoa;

import java.util.List;

/*
    - Localizacao: Referente a latitude e longitude da onde o usuario está no momento, possibilitando uma melhor captação de possiveis casos
    - Adverso: Esse parametro demonstra uma lista de sintomas que o usuario pode vir a ter, então podemos mapear e de forma
    exemplificada saber quais sintomas aparentes estão de acordo com o seu diagnostico
    -TipoPessoa: Essa parametro diz a respeito da faixa etaria do usuario, podendo estar em estado de risco, mantendo uma maior atenção
    a seu diagnostico e monitoração
 */
public class DetalheUsuario {
    private Localizacao localizacao;
    private List<Adverso> adverso;
    private TipoPessoa tipoPessoa;
    private Registro registro;

    public DetalheUsuario(Localizacao localizacao, List<Adverso> adverso, TipoPessoa tipoPessoa, Registro registro) {
        this.registro = registro;
        this.localizacao = localizacao;
        this.adverso = adverso;
        this.tipoPessoa = tipoPessoa;
    }

    public DetalheUsuario() {
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public List<Adverso> getAdverso() {
        return adverso;
    }

    public void setAdverso(List<Adverso> adverso) {
        this.adverso = adverso;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "DetalheUsuario{" +
                "localizacao=" + localizacao +
                ", adverso=" + adverso +
                ", tipoPessoa=" + tipoPessoa +
                ", registro=" + registro +
                '}';
    }
}
