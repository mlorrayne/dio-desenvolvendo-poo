package poo.model;

public class Endereco {
    public enum TipoEndereco{RESIDENCIAL, COMERCIAL, ENTREGA}

    public String Endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String cep;
    public String estado;
    public TipoEndereco tipo;

}
