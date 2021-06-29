package game.equip;

public class Espada implements Arma{
    private String nome;
    private int dano;

    public Espada() {
        nome = "Espada";
        dano = 100;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public void atacar() {
        System.out.println("causou dano com a espada");
    }

    @Override
    public int danocausado() {
        return dano;
    }
}
