package eva1_5_circulo;

public class Circle {
    private double area, perim, ratio;
    
    //default constructor
    Circle(){
        area = 0;
        perim = 0;
        ratio = 0;   
    }
    //constructor with args
    Circle(double _ratio){
        ratio = _ratio;
    }
    
    //compute perimeter
    public double calcPerim(){
        perim = 3.14159*ratio*2;
        return perim;
    }
    
    //compute area
    public double calcArea(){
        area = 3.14159*ratio*ratio;
        return area;
    }
    
    //get methods
    public double getArea(){
        return area;
    }
    public double getPerim(){
        return perim;
    }
    public double getRatio(){
        return ratio;
    }
    
    //set methods
    public void setRatio(double val){
        ratio = val;
    }
}
