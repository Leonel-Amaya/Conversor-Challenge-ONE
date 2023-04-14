package logica;

/**
 *
 * @author Leonel Amaya
 */
public class Temperaturas {
    private double temperatura, resultado;
    private String temp1, temp2;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }
    
    public Temperaturas(){};
    
    public double Transformar(){
        switch (temp1) {
            case "Celcius":
                if(temp2.equals("Kelvin")){
                    resultado = temperatura + 273.15;
                } else if (temp2.equals("Fahrenheit")){
                    resultado = (temperatura * 9/5) + 32;
                } else {
                    resultado = temperatura;
                }
                break;
            case "Kelvin":
                if(temp2.equals("Celsius")){
                    resultado = temperatura - 273.15;
                } else if (temp2.equals("Fahrenheit")){
                    resultado = (temperatura - 273.15)*(9/5) + 32;
                } else {
                    resultado = temperatura;
                }
                break;
            case "Fahrenheit":
                if (temp2.equals("Celsius")){
                    resultado = (temperatura - 32)* (5/9);
                } else if (temp2.equals("Kelvin")){
                    resultado = (temperatura - 32)*(5/9) + 273.15;
                } else {
                    resultado = temperatura;
                }
                break;
        }
        return resultado;
    }
}
