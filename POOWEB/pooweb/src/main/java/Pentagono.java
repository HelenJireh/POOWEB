 import java.util.*;
public class Pentagono extends Figura{
    //atributos
    private double perimetro;
    private double apotema;
    private  Double lado1,lado2,lado3,lado4,lado5;

    //constructor
   public Pentagono() {
   }

    public Pentagono(double perimetro, double apotema) {
    this.perimetro = perimetro;
    this.apotema = apotema;
}

    //getter y setter
       
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    //metodos
    public void registrarDatos() {
        Scanner leer=new  Scanner(System.in);
        System.out.println("Ingrese el perimetro");
        perimetro=leer.nextInt();
           System.out.println("Ingrese el apotema");
        apotema=leer.nextInt();
       
    }
    public Double calcularArea() {
        double areapen=(perimetro*apotema)/2;
        System.out.println("El área es "+areapen);
        return areapen;
        }
        public  Double calcularPerimetro(){
             Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese el lado 1");
    lado1=leer.nextDouble();
   System.out.println("Ingrese el lado 1");
    lado2=leer.nextDouble();
    System.out.println("Ingrese el lado 1");
    lado3=leer.nextDouble(); 
    System.out.println("Ingrese el lado 1");
    lado4=leer.nextDouble();
     System.out.println("Ingrese el lado 1");
    lado5=leer.nextDouble();
        double perimepen=lado1+lado2+lado3;
        System.out.println("El perimetro es"+perimepen);
        return perimepen;
        };
        
}
