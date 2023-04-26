package flyweight;

public class AparelhoEletronico {

    private String aparelho;
    private Marca marca;

    public AparelhoEletronico(String aparelho, Marca marca) {
        this.aparelho = aparelho;
        this.marca = marca;
    }

    public String obterAparelho() {
        return "Aparelho Eletronico{" +
                "aparelho='" + this.aparelho + '\'' +
                ", marca='" + marca.getMarca() + '\'' +
                '}';
    }
}
