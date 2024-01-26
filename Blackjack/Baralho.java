package VF.Questão2.Blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private List<Carta> cartasDisponiveis;

    public Baralho() {
        cartasDisponiveis = new ArrayList<>();

        // Inicializa o baralho com todas as cartas possíveis (52 no total)
        String[] naipes = {"Espadas", "Paus", "Copas", "Ouros"};
        String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            for (int valor = 1; valor <= 13; valor++) {
                Carta carta = new CartaJogo(valor, naipe);
                cartasDisponiveis.add(carta);
            }
        }
    }

    public Carta distribuirCartaAleatoria() {
        Random random = new Random();
        int index = random.nextInt(cartasDisponiveis.size());
        Carta carta = cartasDisponiveis.remove(index);
        return carta;
    }
}
