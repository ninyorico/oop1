public class Dog {
    public String name;
    public boolean isMale;
    public int numberOfPuppies;
    public Dog[] puppies;
   
    public Dog(String name, boolean isMale) {
      this.name = name;
      this.isMale = isMale;
      this.numberOfPuppies = 0;
      this.puppies = new Dog[0]; 
    }
   
    public void setName(String name) {
      this.name = name;
    }
   
    public String showName() {
      return this.name;
    }
   
    public void bark() {
      System.out.println("Woof!Woof!");
    }
   
    public void addPuppy(Dog puppy) {
      
      Dog[] newPuppies = new Dog[this.puppies.length + 1];
      System.arraycopy(this.puppies, 0, newPuppies, 0, this.puppies.length);
      newPuppies[this.puppies.length] = puppy;
      this.puppies = newPuppies;
      this.setNumberOfPuppies(this.puppies.length);
    }
   
    public void setNumberOfPuppies(int number) {
      this.numberOfPuppies = number;
    }
   
    public int showNumberOfPuppies() {
      return this.numberOfPuppies;
    }
   
    public void showPuppies() {
      for (Dog puppy : this.puppies) {
        System.out.println(puppy.name);
      }
    }
  }
