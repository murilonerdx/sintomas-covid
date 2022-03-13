package com.murilonerdx.sintomascovid.model.enums;

public enum Adverso {
    CONFUSAO("Sinto confusão mental",2),
    PERDA_DE_APETITE("Estive/Estou com perda de apetite",2),
    TONTURA("Estive/Estou com tontura",1),
    ANSIA("Estive/Estou com ansia de vomito",0),
    ENJOOU("Estive/Estou com enjoou",0),
    REFLUXO("Estive/Estou com refluxo",0),
    MAL_ESTAR("Estive/Estou com mal estar",0),
    DORES_NO_CORPO("Estive/Estou com dores no corpo",1),
    FEBRE("Estive/Estou com febre",1),
    TOSSE("Estive/Estou com tosse frequente",1),
    CANSACO("Estive/Estou me sentindo cansado(a)",1),
    DIARREIA("Estive/Estou com diarreia",2),
    DIFICULDADE_EM_RESPIRAR("Estive/Estou com dificuldade em respirar",3),
    DORES_NO_PEITO("Estive/Estou com dores no peito",3),
    MANCHAS_VERMELHAS_NO_CORPO("Estive/Estou com varias manchas vermelhas pelo corpo",3),
    DORES_NAS_ARTICULACOES("Estive/Estou com dores nas articulações",3),
    DOR_NOS_OSSOS("Estive/Estou com dor nos ossos",2),
    DOR_NOS_OLHOS("Estive/Estou com com dor nos olhos",2),
    DOR_NA_GARGANTA("Estive/Estou com dores na garganta", 1),
    DOR_DE_CABECA("Estive/Estou com dores na garganta", 1),
    DORES_E_DESCONFORTOS("Estive/Estou com dores e desconfortos pelo corpo", 3),
    IRRITACAO_DESCOLORACAO("Eu estou com irritações na pele ou descoloração dos dedos dos pés ou das mãos",3),
    SANGRAMENTO_NARIZ_E_GENGIVAS("Eu estou com sangramentos pelo nariz olhos ou gengivas", 3),
    URINA_ROSA_VERMELHA_OU_MARROM("Minha urina está rosa, vermelha ou marrom",2),
    CORIZA("Eu estou com Coriza", 2);

    private String descricao;
    private int grauPerigo;

    Adverso(String descricao, int grauPerigo){
        this.descricao=descricao;
        this.grauPerigo=grauPerigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getGrauPerigo() {
        return grauPerigo;
    }

    public void setGrauPerigo(int grauPerigo) {
        this.grauPerigo = grauPerigo;
    }
}
