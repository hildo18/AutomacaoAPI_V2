package modulos.postagem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes de API do modulo de Postagem")
public class PostagemTest {
    @Test
    @DisplayName("Validar os limites prodibidos ")
    public void testValidarLimiteProibido(){
        double valor = 0.00;
        Assertions.assertTrue(valor>0.0);
    }
}
