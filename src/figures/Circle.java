
package figures;

// Extends the Parent class Figure in the class Circle 
public class Circle extends Figure{
    double area, perimeter;
    double pi=3.14159;
    String met;
    
    //Define the metod findArea for class Circle 
    @Override
    public void findArea(){
        this.area=Math.pow(super.dim1,2)*pi;
    }
    
    //Define the metod findPerimeter for class Circle 
    @Override
    public void findPerimeter(){
        this.perimeter=2*pi*super.dim1;
    }
    
    
    //Return a string with the description for this circle 
    public String tostring(){
        this.findArea();
        this.findPerimeter();
        this.met="Area del circulo "+String.valueOf(this.area)+" y su perimetro "+String.valueOf(this.perimeter);
        return this.met;
    }
    
}
