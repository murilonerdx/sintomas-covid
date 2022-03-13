package com.murilonerdx.sintomascovid.model;


import com.murilonerdx.sintomascovid.model.enums.Adverso;
import com.murilonerdx.sintomascovid.model.enums.TipoPessoa;
import com.murilonerdx.sintomascovid.util.Sintoma;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.murilonerdx.sintomascovid.util.Sintoma.itemParaAnalisar;

public class Diagnostico {

    public static boolean grupoDeRisco(Usuario usuario) {
        return usuario.getIdade() >= 60 |
                usuario.getDetalheUsuario().getTipoPessoa() == TipoPessoa.CRIANCA |
                usuario.getDetalheUsuario().getTipoPessoa() == TipoPessoa.IDOSO |
                usuario.getDetalheUsuario().getTipoPessoa() == TipoPessoa.GESTANTE;
    }


    public static Map<String, Integer> analiseAdversos(Usuario usuario) {
        Map<String, Integer> items = new LinkedHashMap<>();
        List<Adverso> adversosUsuario = usuario.getDetalheUsuario().getAdverso();

        for (String v : itemParaAnalisar) {
            items.putAll(analiseType(v, adversosUsuario));
        }
        return items;
    }

    public static Map<String, List<Adverso>> gerarPossiveisAnalises() {
        Map<String, List<Adverso>> analisePossivel = new LinkedHashMap<>();

        analisePossivel.put("DENGUE", Sintoma.sintomasDengue);
        analisePossivel.put("COVID-19", Sintoma.sintomasCovid);
        analisePossivel.put("SINDROME_RESPIRATORIA", Sintoma.sintomaInfluenza);

        return analisePossivel;

    }

    public static Map<String, Integer> analiseType(String typeSearch, List<Adverso> sintomasUsuario) {
        Map<String, Integer> values = new LinkedHashMap<>();
        Map<String, List<Adverso>> analise = gerarPossiveisAnalises();
        int contador = 0;
        for (Adverso ads : analise.get(typeSearch)) {
            if (sintomasUsuario.contains(ads)) {
                contador = contador + 1;
                values.put(typeSearch, contador);
            }
        }

        return values;
    }

    public static Map<String, Float> gerarPorcentagemDeCadaItemBaseadoNoSintoma(Usuario usuario) {
        Map<String, Float> portangemCadaItem = new LinkedHashMap<>();
        Map<String, Integer> stringIntegerMap = Diagnostico.analiseAdversos(usuario);

        int i = obterQuantidadeDeCadaPossivelAnalise(stringIntegerMap);

        int tamMax = stringIntegerMap.size();
        if (tamMax != 0) {
            for (String v : itemParaAnalisar) {
                portangemCadaItem.put(v, ((float) stringIntegerMap.get(v) / i) * 100);
            }
        }
        return portangemCadaItem;
    }

    private static int obterQuantidadeDeCadaPossivelAnalise(Map<String, Integer> stringIntegerMap) {
        int qtdItems = 0;
        for (Integer i : stringIntegerMap.values()) {
            qtdItems = qtdItems + i;
        }
        return qtdItems;
    }

    public static boolean altoRisco(Usuario usuario) {
        boolean altoRisco = false;
        for (Adverso ad : usuario.getDetalheUsuario().getAdverso()) {
            if (ad.getGrauPerigo() == 3) {
                altoRisco = true;
                break;
            }
        }
        return altoRisco;
    }
}
