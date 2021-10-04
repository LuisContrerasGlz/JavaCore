
package figures;

// Extends the Parent class Figure in the class Rectangle 
public class Rectangle extends Figure{
    double area, perimeter;
    // Define dim2 which is the second side of the rectangle 
    double dim2;
    String met;
    
    //Define the metod findArea for class Rectangle 
    @Override
    public void findArea(){
        this.area=super.dim1*this.dim2;
    }
    
    //Define the metod findPerimeter for class Rectangle
    @Override
    public void findPerimeter(){
        this.perimeter=2*super.dim1+2*this.dim2;
    }
    
    // Define the  method set for Dim2
    public void setDim2(double dato2) {
        this.dim2 = dato2;
    }
    
    //Return a string with the description for this Rectangle 
    public String tostring(){
        this.findArea();
        this.findPerimeter();
        this.met="Area del rectangulo "+String.valueOf(this.area)+" y su perimetro "+String.valueOf(this.perimeter);
        return this.met;
    }
    
}
