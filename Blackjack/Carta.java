package VF.Questão2.Blackjack;

public abstract class Carta {
    private int valor;
    private String naipe;

    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public abstract void mostrarCarta();
}
