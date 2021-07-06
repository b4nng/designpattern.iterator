import java.util.Iterator;

public class Contadores {
    public static double valorDaBiblioteca(Bilblioteca bilblioteca){
        double price = 0;
        for(Jogo jogo : bilblioteca){
            price += jogo.getPrice();
        }
        return price;
    }
}
