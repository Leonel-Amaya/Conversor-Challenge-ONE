package logica;

/**
 *
 * @author Leonel Amaya
 */
public class Longitud {
    String unidad1, unidad2;
    double valor, resultado;

    public String getUnidad1() {
        return unidad1;
    }

    public void setUnidad1(String unidad1) {
        this.unidad1 = unidad1;
    }

    public String getUnidad2() {
        return unidad2;
    }

    public void setUnidad2(String unidad2) {
        this.unidad2 = unidad2;
    }

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
    
    public double convertir(){
        switch (unidad1) {
            case "Centimetros":
                if(unidad2.equals("Metros")){
                    resultado = valor*0.01;
                } else if(unidad2.equals("Kilometros")){
                    resultado = valor * (1*Math.pow(10, -5));
                } else {
                    resultado = valor;
                }
                break;
            case "Metros":
                if(unidad2.equals("Centimetros")){
                    resultado = valor * 100;
                } else if (unidad2.equals("Kilometros")){
                    resultado = valor * 0.001;
                } else {
                    resultado = valor;
                }
                break;
            case "Kilometros":
                if(unidad2.equals("Metros")){
                    resultado = valor * 1000;
                } else if (unidad2.equals("Centimetros")){
                    resultado = valor * 100000;
                } else {
                    resultado = valor;
                }
                break;
        }
        return resultado;
    }
}
