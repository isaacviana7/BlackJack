package VF.Questão2.Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        mao = new ArrayList<>();
    }

    public void receberCarta(Carta carta) {
        mao.add(carta);
    }

    public void mostrarMao() {
        System.out.println("Mão do jogador " + nome + ":");
        for (Carta carta : mao) {
            carta.mostrarCarta();
        }
    }
}
