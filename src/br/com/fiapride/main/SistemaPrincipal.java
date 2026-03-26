package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemaPrincipal {
    
    public static void main(String[] args) {
        
        // Instancia o objeto
        Veiculos carro1 = new Veiculos();
        
        // Usando SETTERS (não pode mais acessar direto!)
        carro1.setDono("Carlos");
        carro1.setPlaca("ABC-1234");

        // Abastecendo o carro
        carro1.adicionarGasolina(50);
        carro1.adicionarGasolina(100);

        // Exibindo os dados com GETTERS
        System.out.println(
            "Dono: " + carro1.getDono() +
            " | Placa: " + carro1.getPlaca() +
            " | Gasolina: " + carro1.getGasolina()
        );
    }
}