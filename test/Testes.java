import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    public void deveRetornar500(){
        Bilblioteca library = new Bilblioteca(
                new Jogo("CSGO", "FPS", 100),
                new Jogo("Rime","RPG", 50),
                new Jogo("Cod Mw3", "FPS", 250),
                new Jogo("World of Warcraft", "MMORPG", 100)
        );
        Assertions.assertEquals(500, Contadores.valorDaBiblioteca(library));
    }
}
