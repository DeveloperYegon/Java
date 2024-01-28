//implementation of getters and setters
public class Person{
    private String name;
            //getter
    public String getName() {
        return name;
    }
            //setter
    public void setName(String newName) {
    this.name = newName;
        }

    public static void main(String[] args){
        //creating an instance of Person
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println("Hello " + myObj.getName());

    }
}