package com.murilonerdx.sintomascovid.util;

import com.murilonerdx.sintomascovid.model.enums.Adverso;

import java.util.Arrays;
import java.util.List;

public class Sintoma {

    public final static List<String> itemParaAnalisar = List.of("DENGUE", "COVID-19", "SINDROME_RESPIRATORIA");

    public final static List<Adverso> sintomasCovid = Arrays.asList(Adverso.FEBRE, Adverso.TOSSE, Adverso.CANSACO, Adverso.PERDA_DE_APETITE, Adverso.DIARREIA,
            Adverso.DOR_NA_GARGANTA, Adverso.DOR_DE_CABECA,Adverso.DORES_E_DESCONFORTOS,Adverso.DOR_NOS_OLHOS,
            Adverso.DIFICULDADE_EM_RESPIRAR, Adverso.DORES_NO_PEITO, Adverso.IRRITACAO_DESCOLORACAO);

    public final static List<Adverso> sintomasDengue = Arrays.asList(Adverso.FEBRE,Adverso.DOR_DE_CABECA,Adverso.MANCHAS_VERMELHAS_NO_CORPO,
            Adverso.DORES_E_DESCONFORTOS,Adverso.DORES_NAS_ARTICULACOES,Adverso.DOR_NOS_OLHOS,Adverso.DOR_NOS_OLHOS,Adverso.PERDA_DE_APETITE,
            Adverso.MAL_ESTAR);

    public final static List<Adverso> sintomaInfluenza = Arrays.asList(Adverso.TOSSE,Adverso.FEBRE,Adverso.CORIZA,Adverso.DOR_NA_GARGANTA,
            Adverso.DOR_DE_CABECA,Adverso.DOR_NOS_OLHOS,Adverso.DORES_NAS_ARTICULACOES,Adverso.CANSACO,Adverso.DIARREIA,Adverso.ANSIA);
}
