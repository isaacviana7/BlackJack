package VF.Questão2.Blackjack;

import java.util.HashMap;
import java.util.Map;

public class BlackjackGame {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        Map<String, Jogador> jogadores = new HashMap<>();

        // Adicionando jogadores
        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        jogadores.put("Jogador 1", jogador1);
        jogadores.put("Jogador 2", jogador2);

        // Distribuir uma carta aleatória para cada jogador e atualizar a respectiva mão de cartas
        for (Jogador jogador : jogadores.values()) {
            Carta carta = baralho.distribuirCartaAleatoria();
            jogador.receberCarta(carta);
        }

        // Mostrar a mão de cada jogador
        for (Jogador jogador : jogadores.values()) {
            jogador.mostrarMao();
        }
    }
}
