package com.murilonerdx.sintomascovid.model;

import com.murilonerdx.sintomascovid.model.enums.TipoPessoa;

public class Usuario {
    private String nome;
    private int idade;
    private String telefone;
    private DetalheUsuario detalheUsuario = new DetalheUsuario();
    public String getNome() {
        return nome;
    }

    public Usuario() {
    }

    public Usuario(String nome, int idade, String telefone, DetalheUsuario detalheUsuario) {
        if(idade >=60){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.IDOSO);
        }else if(idade >= 12 && idade <= 20){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.JOVEM);
        }else if(idade <= 12){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.CRIANCA);
        }else{
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.ADULTO);
        }
        this.detalheUsuario = detalheUsuario;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >=60){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.IDOSO);
        } else if(idade >= 12 && idade <= 20){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.JOVEM);
        }else if(idade <= 12){
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.CRIANCA);
        }else{
            this.getDetalheUsuario().setTipoPessoa(TipoPessoa.ADULTO);
        }
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DetalheUsuario getDetalheUsuario() {
        return detalheUsuario;
    }

    public void setDetalheUsuario(DetalheUsuario detalheUsuario) {
        this.detalheUsuario = detalheUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", telefone='" + telefone + '\'' +
                ", detalheUsuario=" + detalheUsuario +
                '}';
    }
}
