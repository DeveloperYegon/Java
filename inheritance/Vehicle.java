public class Vehicle{
    protected String brand="Ford";
   // public static void main(String[] args){
        public void honk(){
        System.out.println("Tuut, Tuut!");       
        }
    
}

class Car extends Vehicle{
private String modelName ="Mustang";
public static void main(String[] args){
    Car myCar= new Car();
    myCar.honk();
System.out.println(myCar.brand  + " " + myCar.modelName);

}
}