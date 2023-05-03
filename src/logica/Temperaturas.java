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
            case "Celsius":
                if(temp2.equals("Kelvin")){
                    resultado = Math.round((temperatura + 273.15)*100.0)/100.0;
                } else if (temp2.equals("Fahrenheit")){
                    resultado = Math.round(((temperatura * 9/5) + 32)*100.0)/100.0;
                } else {
                    resultado = temperatura;
                }
                break;
            case "Kelvin":
                if(temp2.equals("Celsius")){
                    resultado = Math.round((temperatura - 273.15)*100.0)/100.0;
                } else if (temp2.equals("Fahrenheit")){
                    resultado = Math.round(((temperatura - 273.15)*9/5 + 32)*100.0)/100.0;
                } else {
                    resultado = temperatura;
                }
                break;
            case "Fahrenheit":
                if (temp2.equals("Celsius")){
                    //resultado = ((temperatura - 32)*5/9)*10.0/10.0;
                    resultado = Math.round(((temperatura - 32)*5/9)*100.0)/100.0;
                } else if (temp2.equals("Kelvin")){
                    resultado = Math.round(((temperatura - 32) * 5/9 + 273.15)*100.0)/100.0;
                } else {
                    resultado = temperatura;
                }
                break;
        }
        return resultado;
    }
}
