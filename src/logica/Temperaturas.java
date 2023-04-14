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
                }
                break;
        }
        
        return resultado;
    }
}
