import java.util.*;
public class Circulo extends Figura{
    




    //atributos
    private double radio;

    //constructor
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    } 
    //metodos
    public void registrarDatos() {
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio=leer.nextInt();
       
    }
    public Double calcularArea() {
        double areacir=3.1416*Math.pow(radio, 2);
        System.out.println("El área es "+areacir);
        return areacir;
        }
        public Double calcularPerimetro(){
            Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese el radio");
    radio=leer.nextInt();
     double perimecir=2*3.1416*radio;
        System.out.println("El perimetro es"+perimecir);
        return perimecir;
        };
        
    
}


