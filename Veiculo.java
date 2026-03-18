package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private double combustivel;

    public Veiculo(String dono, String placa) {
        this.dono = dono;
        this.placa = placa;
        this.combustivel = 0;
    }

    public String getDono() {
        return dono;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel < 0) {
            System.out.println("❌ Combustível não pode ser negativo.");
        } else {
            this.combustivel = combustivel;
        }
    }

    public void adicionarCombustivel(double valor) {
        if (valor <= 0) {
            System.out.println("❌ Valor inválido.");
            return;
        }
        this.combustivel += valor;
    }

    public void gastarCombustivel(double valor) {
        if (valor <= 0 || valor > this.combustivel) {
            System.out.println("❌ Operação inválida.");
            return;
        }
        this.combustivel -= valor;
    }
}