
package figures;

// Extends the Parent class Figure in the class Circle     
public class Square extends Figure{
    double area, perimeter;
    String met;
    
    
    //Define the metod findArea for class Square
    @Override
    public void findArea(){
        this.area=Math.pow(super.dim1,2);
    }
    
    //Define the metod findPerimeter for class Square
    @Override
    public void findPerimeter(){
        this.perimeter=4*super.dim1;
    }
    
    //Return a string with the description for this Squeare
    public String tostring(){
        this.findArea();
        this.findPerimeter();
        this.met="Area del cuadrado "+String.valueOf(this.area)+" y su perimetro "+String.valueOf(this.perimeter);
        return this.met;
    }
    
}
