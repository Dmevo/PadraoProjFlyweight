package flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {

    @Test
    void deveRetornarAparelhos() {
        Loja loja = new Loja();
        loja.adicionarEstoque("Celular", "Samsung");
        loja.adicionarEstoque("Tablet", "Samsung");
        loja.adicionarEstoque("Fone de Ouvido", "Samsung");
        loja.adicionarEstoque("Notebook", "Asus");

        List<String> saida = Arrays.asList(
                "Aparelho Eletronico{aparelho='Celular', marca='Samsung'}",
                "Aparelho Eletronico{aparelho='Tablet', marca='Samsung'}",
                "Aparelho Eletronico{aparelho='Fone de Ouvido', marca='Samsung'}",
                "Aparelho Eletronico{aparelho='Notebook', marca='Asus'}");

        assertEquals(saida, loja.obterAparelhos());
    }

    @Test
    void deveRetornarTotalMarcas() {
        Loja loja = new Loja();
        loja.adicionarEstoque("Celular", "Samsung");
        loja.adicionarEstoque("Tablet", "Samsung");
        loja.adicionarEstoque("Fone de Ouvido", "Samsung");
        loja.adicionarEstoque("Notebook", "Asus");

        assertEquals(2, MarcaFactory.getTotalMarcas());
    }
}
