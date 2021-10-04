
package figures;

// Defining the parent class for the figure
public abstract class Figure {
    // Define dim 1 which is the side or radius 
    double dim1;
    
    // Define the abstract method to find the area
    public abstract void findArea();
    
    // Define the abstract method to find the area
    public abstract void findPerimeter();
    
    // Define the  method set fro Dim1
    public void setDim1(double dato1) {
        this.dim1 = dato1;
    }
    
    // Define the  method get fro Dim1
    public double getDim1() {
        return this.dim1;
    }
       
}
