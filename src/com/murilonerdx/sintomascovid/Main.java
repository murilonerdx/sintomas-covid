package com.murilonerdx.sintomascovid;

import com.murilonerdx.sintomascovid.model.Diagnostico;
import com.murilonerdx.sintomascovid.model.Usuario;
import com.murilonerdx.sintomascovid.model.enums.Adverso;
import com.murilonerdx.sintomascovid.util.Sintoma;

import java.util.List;
import java.util.Map;

import static com.murilonerdx.sintomascovid.model.Diagnostico.altoRisco;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.getDetalheUsuario().setAdverso(Sintoma.sintomasCovid);
        usuario.setNome("Murilo");
        usuario.setIdade(61);

        Map<String, Integer> stringIntegerMap = Diagnostico.analiseAdversos(usuario);
        Map<String, Float> stringIntegerMap2 = Diagnostico.gerarPorcentagemDeCadaItemBaseadoNoSintoma(usuario);

        System.out.println(stringIntegerMap +" | " + stringIntegerMap2);
        System.out.println(usuario);
        System.out.println(altoRisco(usuario));
    }
}
