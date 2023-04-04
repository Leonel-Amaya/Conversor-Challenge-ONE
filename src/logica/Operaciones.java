/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Leonel Amaya
 */
public class Operaciones {
    private double valor, resultado;
    private String divisa1, divisa2;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(String divisa1) {
        this.divisa1 = divisa1;
    }

    public String getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(String divisa2) {
        this.divisa2 = divisa2;
    }
    
    public Operaciones(){}
    
    public double convertir() {
        switch(divisa1){
            case "Pesos Colombianos":
                if(divisa2.equals("Dólar")){
                    resultado = Math.round((valor / 4750.23)*100.0)/100.0;
                } else if (divisa2.equals("Libras Esterlinas")){
                    resultado = Math.round((valor / 5808.11)*100.0)/100.0;
                } else if (divisa2.equals("Euros")){
                    resultado = Math.round((valor / 5121.94)*100.0)/100.0;
                } else if (divisa2.equals("Yen Japonés")){
                    resultado = Math.round((valor / 36.33)*100.0)/100.0;
                } else if (divisa2.equals("Won Sul-coreano")){
                    resultado = Math.round((valor / 3.67)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
            case "Dólar":
                if(divisa2.equals("Pesos Colombianos")){
                    resultado = Math.round((valor * 4750.23)*100.0)/100.0;
                } else if (divisa2.equals("Libras Esterlinas")){
                    resultado = Math.round((valor * 0.82)*100.0)/100.0;
                } else if (divisa2.equals("Euros")){
                    resultado = Math.round((valor * 0.93)*100.0)/100.0;
                } else if (divisa2.equals("Yen Japonés")){
                    resultado = Math.round((valor * 130.75)*100.0)/100.0;
                } else if (divisa2.equals("Won Sul-coreano")){
                    resultado = Math.round((valor * 1295.83)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
            case "Libras Esterlinas":
                if(divisa2.equals("Pesos Colombianos")){
                    resultado = Math.round((valor * 5746.14)*100.0)/100.0;
                } else if (divisa2.equals("Dólar")){
                    resultado = Math.round((valor * 1.23)*100.0)/100.0;
                } else if (divisa2.equals("Euros")){
                    resultado = Math.round((valor * 1.14)*100.0)/100.0;
                } else if (divisa2.equals("Yen Japonés")){
                    resultado = Math.round((valor * 163.91)*100.0)/100.0;
                } else if (divisa2.equals("Won Sul-coreano")){
                    resultado = Math.round((valor * 1612.84)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
            case "Euros":
                if(divisa2.equals("Pesos Colombianos")){
                    resultado = Math.round((valor * 5059.82)*100.0)/100.0;
                } else if (divisa2.equals("Libras Esterlinas")){
                    resultado = Math.round((valor * 0.88)*100.0)/100.0;
                } else if (divisa2.equals("Dólar")){
                    resultado = Math.round((valor * 1.09)*100.0)/100.0;
                } else if (divisa2.equals("Yen Japonés")){
                    resultado = Math.round((valor * 144.34)*100.0)/100.0;
                } else if (divisa2.equals("Won Sul-coreano")){
                    resultado = Math.round((valor * 1420.20)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
            case "Yen Japonés":
                if(divisa2.equals("Pesos Colombianos")){
                    resultado = Math.round((valor * 35.06)*100.0)/100.0;
                } else if (divisa2.equals("Libras Esterlinas")){
                    resultado = Math.round((valor * 0.0061)*100.0)/100.0;
                } else if (divisa2.equals("Dólar")){
                    resultado = Math.round((valor * 0.0075)*100.0)/100.0;
                } else if (divisa2.equals("Euros")){
                    resultado = Math.round((valor * 0.0069)*100.0)/100.0;
                } else if (divisa2.equals("Won Sul-coreano")){
                    resultado = Math.round((valor * 9.84)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
            case "Won Sul-coreano":
                if(divisa2.equals("Pesos Colombianos")){
                    resultado = Math.round((valor * 3.56)*100.0)/100.0;
                } else if (divisa2.equals("Libras Esterlinas")){
                    resultado = Math.round((valor * 0.00062)*100.0)/100.0;
                } else if (divisa2.equals("Dólar")){
                    resultado = Math.round((valor * 0.00077)*100.0)/100.0;
                } else if (divisa2.equals("Euros")){
                    resultado = Math.round((valor * 0.00070)*100.0)/100.0;
                } else if (divisa2.equals("Yen Japonés")){
                    resultado = Math.round((valor * 0.10)*100.0)/100.0;
                } else {
                    resultado = valor;
                }
                break;
        }
        /*if(divisa1.equals(divisa2)){
            JOptionPane.showMessageDialog(null, "No puedes hacer eso");
        } else if(divisa1.equals("Pesos Colombianos") && divisa2.equals("Euros")){
            resultado = Math.round((valor / 5100)*100d)/100;
        }*/
        return resultado;
    }
}
