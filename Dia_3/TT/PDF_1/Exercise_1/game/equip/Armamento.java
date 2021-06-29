package game.equip;

public class Armamento implements Arma{
    Arma tipoarma;

    public Armamento(String nome) {
        switch (nome) {
            case "espada":
                tipoarma = new Espada();
                break;
            case "arco":
                tipoarma = new Arco();
                break;
        }
    }

    @Override
    public String toString() {
        return "Armamento{" +
                "tipoarma=" + tipoarma +
                '}';
    }

    @Override
    public void atacar() {
        tipoarma.atacar();
    }

    @Override
    public int danocausado() {
        return tipoarma.danocausado();
    }
}
