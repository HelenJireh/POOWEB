import java.util.*;

public class Triangulo extends Figura{
   


    //atributos
    private int base,altura;
    private  Double lado1,lado2,lado3;
   

//constructores
public Triangulo() {
}
public Triangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
}

//getter y setter
public int getBase() {
    return base;
}

public void setBase(int base) {
    this.base = base;
}

public int getAltura() {
    return altura;
}

public void setAltura(int altura) {
    this.altura = altura;
}

//metodos 

public void registrarDatos() {
    Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese la base");
    base=leer.nextInt();
    System.out.println("Ingrese la altura");
    altura=leer.nextInt();
}
public Double calcularArea() {
    double area=(base*altura)/2;
    System.out.println("El área es "+area);
    return area;
    }

    public  Double calcularPerimetro(){
        Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese el lado 1");
    lado1=leer.nextDouble();
   System.out.println("Ingrese el lado 1");
    lado2=leer.nextDouble();
    System.out.println("Ingrese el lado 1");
    lado3=leer.nextDouble();
        double perime=lado1+lado2+lado3;
        System.out.println("El perimetro es"+perime);
        return perime;
    };
    
}

    

