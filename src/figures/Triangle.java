package figures;

// Extends the Parent class Figure in the class Rectangle 
public class Triangle extends Figure{
    double area, perimeter;
    // Define dim2 which is the second and third side of the triangle 
    double dim2, dim3;
    String met;
    
    //Define the metod findArea for class Triangle 
    @Override
    public void findArea(){
        this.area=(super.dim1*this.dim2)/2;
    }
    
    //Define the metod findPerimeter for class Triangle
    @Override
    public void findPerimeter(){
        this.setDim3();
        this.perimeter=super.dim1+this.dim2+this.dim3;
    }
    
    // Define the  method set for Dim2
    public void setDim2(double dato2) {
        this.dim2 = dato2;
    }
    
    // Define the  method set for Dim3
    public void setDim3() {
        this.dim3 = Math.sqrt(Math.pow(this.dim1,2)+Math.pow(this.dim2,2));
    }
    
    //Return a string with the description for this Triangle
    public String tostring(){
        this.findArea();
        this.findPerimeter();
        this.met="Area del triangulo "+String.valueOf(this.area)+" y su perimetro "+String.valueOf(this.perimeter);
        return this.met;
    }   
    
    
    
    
    
}
