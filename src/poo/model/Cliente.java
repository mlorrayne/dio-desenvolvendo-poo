package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public int codigo;
    public String nome;
    public String CPF;

    private List<Endereco> enderecos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo");
        }

        if (endereco.cep == null) {
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);


    }


        //public void setEnderecos(List<Endereco> enderecos) {
        //   this.enderecos = enderecos;
        //} está comentado para que haja a adição de endereço por endereço



    }

