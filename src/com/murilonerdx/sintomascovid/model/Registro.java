package com.murilonerdx.sintomascovid.model;


/*
 strcOxigenio Saturação do oxigenio
 freqCardiaca Frequencia cardiaca
 */
public class Registro {
    private String strcOxigenio;
    private String freqCardiaca;
    private String tempCorporal;

    private String descricao;

    public String getStrcOxigenio() {
        return strcOxigenio;
    }

    public void setStrcOxigenio(String strcOxigenio) {
        this.strcOxigenio = strcOxigenio;
    }

    public String getFreqCardiaca() {
        return freqCardiaca;
    }

    public void setFreqCardiaca(String freqCardiaca) {
        this.freqCardiaca = freqCardiaca;
    }

    public String getTempCorporal() {
        return tempCorporal;
    }

    public void setTempCorporal(String tempCorporal) {
        this.tempCorporal = tempCorporal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
