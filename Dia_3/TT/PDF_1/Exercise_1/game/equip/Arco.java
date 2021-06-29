package game.equip;

public class Arco implements Arma{
    private String nome;
    private int dano;

    public Arco() {
        nome = "Arco";
        dano = 50;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public void atacar() {
        System.out.println("Atacou com o arco!");
    }

    @Override
    public int danocausado() {
        return dano;
    }
}
