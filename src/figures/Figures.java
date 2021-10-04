package figures;

import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);//Objeto de lectura
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Square s1 = new Square();
        Square s2 = new Square();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();        
        double radio, l1,l2;
        
        System.out.println("Radio del circulo 1 ");
        radio=lee.nextDouble();
        c1.setDim1(radio);
        
        System.out.println("Radio del circulo 1 ");
        radio=lee.nextDouble();
        c2.setDim1(radio);
        
        
        System.out.println("Lado del cuadrado ");
        l1=lee.nextDouble();
        s1.setDim1(l1);
        
        System.out.println("Lado del cuadrado ");
        l1=lee.nextDouble();
        s2.setDim1(l1);
        
        
        
        System.out.println("Lado 1 del rectangulo ");
        l1=lee.nextDouble();
        System.out.println("Lado 2 del rectangulo ");
        l2=lee.nextDouble();
        r1.setDim1(l1);        
        r1.setDim2(l2);
        
        
        System.out.println("Lado 1 del rectangulo ");
        l1=lee.nextDouble();
        System.out.println("Lado 2 del rectangulo ");
        l2=lee.nextDouble();
        r2.setDim1(l1);        
        r2.setDim2(l2);
        
        
        System.out.println("Altura del triangulo ");
        l1=lee.nextDouble();
        System.out.println("Base del triangulo ");
        l2=lee.nextDouble();
        t1.setDim1(l1);        
        t1.setDim2(l2);
        
        System.out.println("Altura del triangulo ");
        l1=lee.nextDouble();
        System.out.println("Base del triangulo ");
        l2=lee.nextDouble();
        t2.setDim1(l1);        
        t2.setDim2(l2);
        
        System.out.println(c1.tostring());
        System.out.println(c2.tostring());
        System.out.println(s1.tostring());
        System.out.println(s2.tostring());
        System.out.println(r1.tostring());
        System.out.println(r2.tostring());
        System.out.println(t1.tostring());
        System.out.println(t2.tostring());
        
        lee.close();
        
    }
    
}
