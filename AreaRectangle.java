class AreaRectangle{
    //parameters
    double length=0;
    double breadth=0;
    //constractor
    AreaRectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    //method to calculate and return area of rectangle
    double returnArea(){
        return length * breadth;
    }

}