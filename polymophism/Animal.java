// Achieced through method overriding and 
public class Animal{
    public void animalSound(){
    System.out.println("The animal akes a sound");

    }
}
class Pig extends Animal{
    public void animalSound(){
         System.out.println("The pig makes the sound wee! wee!");
    }

}

class Dog extends Animal{
    public void animalSound(){
         System.out.println("Dog makes the soond Woow! Woow!");
    }
}

class Main{
    public static void main(String[] args){
            Animal myAnimal = new  Animal();
            Animal myPig = new Pig();
            Animal myDog =new Dog();
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();

        
    } 
}