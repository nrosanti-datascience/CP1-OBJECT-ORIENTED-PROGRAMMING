package br.com.fiapride.model;

public class Veiculos {

    private String dono;
    private String placa;
    private int gasolina;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getGasolina() {
        return gasolina;
    }


    public void adicionarGasolina(int litro) {
        if (litro > 0) {
            this.gasolina += litro;
        } else {
            System.out.println("Valor inválido para abastecimento!");
        }
    }

    public void gastoGasolina(int litro) {
        if (litro > 0 && litro <= this.gasolina) {
            this.gasolina -= litro;
        } else {
            System.out.println("Consumo inválido!");
        }
    }
}
