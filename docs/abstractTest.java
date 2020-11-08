]// Abstract class
abstract class Animal {
  
}
//------------------------ --------------------------
//

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    
    System.out.println("The pig says: wee wee");
  }
}



class abstractTest {
  public static void main(String[] args) {
    // Animal X = new Animal();
    Pig myPig = new Pig(); // Create a Pig object
    // Dog dog = new Dog();
    myPig.animalSound();
   
    
  }
}
