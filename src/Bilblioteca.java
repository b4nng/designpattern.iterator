import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Bilblioteca implements Iterable<Jogo> {

    private List<Jogo> jogos = new ArrayList<Jogo>();

    public Bilblioteca(Jogo... jogos){
        this.jogos = Arrays.asList(jogos);
    }

    @Override
    public Iterator<Jogo> iterator() {
        return jogos.iterator();
    }
}
