public class Activity {
    public static void main(String[] args) {
      Dog myDog = new Dog("cath", true);
      myDog.setNumberOfPuppies(5); 
   
      Dog puppy1 = new Dog("bello", true);
      Dog puppy2 = new Dog("jannus", true);
      Dog puppy3 = new Dog("lawrence", true);
      Dog puppy4 = new Dog("mat", true);
      Dog puppy5 = new Dog("pusa", true);
   
      
      myDog.addPuppy(puppy1);
      myDog.addPuppy(puppy2);
      myDog.addPuppy(puppy3);
      myDog.addPuppy(puppy4);
      myDog.addPuppy(puppy5);
   
      System.out.println("My dog's name is " + myDog.showName());
      myDog.bark(); 
      System.out.println("My dog has " + myDog.showNumberOfPuppies() + " puppies.");
      myDog.showPuppies();
    }
  }
   
   
   

  
