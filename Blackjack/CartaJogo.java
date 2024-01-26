package VF.Questão2.Blackjack;

public class CartaJogo extends Carta {
    public CartaJogo(int valor, String naipe) {
        super(valor, naipe);
    }

    @Override
    public void mostrarCarta() {
        String nomeValor;

        switch (getValor()) {
            case 1:
                nomeValor = "Ás";
                break;
            case 11:
                nomeValor = "Valete";
                break;
            case 12:
                nomeValor = "Dama";
                break;
            case 13:
                nomeValor = "Rei";
                break;
            default:
                nomeValor = Integer.toString(getValor());
                break;
        }

        System.out.println(nomeValor + " de " + getNaipe());
    }
}
