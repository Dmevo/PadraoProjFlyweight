package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<AparelhoEletronico> aparelhos = new ArrayList<>();

    public void adicionarEstoque(String aparelho, String nomeMarca) {
        Marca marca = MarcaFactory.getMarca(nomeMarca);
        AparelhoEletronico aparelhoEletronico = new AparelhoEletronico(aparelho, marca);
        aparelhos.add(aparelhoEletronico);
    }

    public List<String> obterAparelhos() {
        List<String> saida = new ArrayList<String>();
        for (AparelhoEletronico aparelhoEletronico : this.aparelhos) {
            saida.add(aparelhoEletronico.obterAparelho());
        }
        return saida;
    }
}
