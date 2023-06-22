import java.util.*;

public class Rectangulo extends Figura{
  


    //atributos
private Double base,altura;
private  Double lado1,lado2,lado3,lado4;
//constructores
public Rectangulo() {
}

public Rectangulo(Double base, Double altura) {
    this.base = base;
    this.altura = altura;
}

//getter y setter
public Double getBase() {
    return base;
}

public void setBase(Double base) {
    this.base = base;
}

public Double getAltura() {
    return altura;
}

public void setAltura(Double altura) {
    this.altura = altura;
}

//metodos 

public void registrarDatos() {
    Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese la base");
    base=leer.nextDouble();
    System.out.println("Ingrese la altura");
    altura=leer.nextDouble();
}

public Double calcularArea() {
   Double arearec= (base*altura);
    System.out.println("El área es "+arearec);
    return arearec;
    }
    public Double calcularPerimetro(){
            Scanner leer=new  Scanner(System.in);
    System.out.println("Ingrese el lado 1");
    lado1=leer.nextDouble();
   System.out.println("Ingrese el lado 1");
    lado2=leer.nextDouble();
    System.out.println("Ingrese el lado 1");
    lado3=leer.nextDouble(); 
    System.out.println("Ingrese el lado 1");
    lado4=leer.nextDouble();
        double perimerec=lado1+lado2+lado3;
        System.out.println("El perimetro es"+perimerec);
        return perimerec;
    };
    
}


