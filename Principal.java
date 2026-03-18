package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        v1.setCombustivel(-10);
        v1.adicionarCombustivel(50);
        v1.gastarCombustivel(100);

        System.out.println(
            "Dono: " + v1.getDono() +
            " | Placa: " + v1.getPlaca() +
            " | Combustível: " + v1.getCombustivel()
        );
    }
}