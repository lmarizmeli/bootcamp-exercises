package game.character;

import game.equip.Armamento;

public class Character {
    String nome;
    Armamento arma;

    public Character(String nome) {
        this.nome = nome;
    }

    public void equipar(String armaNome){
        this.arma = new Armamento(armaNome);
    }

    public void atacar(){
        arma.atacar();
    }

    @Override
    public String toString() {
        return "Character{" +
                "nome='" + nome + '\'' +
                ", arma=" + arma +
                '}';
    }

    public static void main(String[] args) {
        Character player1 = new Character("Kizuki");

        player1.equipar("espada");

        System.out.println(player1);

        player1.equipar("arco");

        System.out.println(player1);
    }
}
