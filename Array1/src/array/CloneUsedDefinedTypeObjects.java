package array;

import java.util.Arrays;

public class CloneUsedDefinedTypeObjects 
{
	public static void main(String [] args)
	{
	Dog[] myDogs = new Dog[4];
    myDogs[0] = new Dog("Wolf",5);
    myDogs[1] = new Dog("Cool",6);
    myDogs[2] = new Dog("Bullet",7);
    myDogs[3] = new Dog("Sadie",8);	
	
	
	System.out.println("*********************************************");
    
    Dog[] myDogsClone = myDogs.clone();
    
    System.out.println(myDogsClone.getClass().getName());
    System.out.println(myDogs.getClass().getName());
    
    System.out.println(myDogs[0] == myDogsClone[0] ? "Same":"Different");
    System.out.println(myDogs[1] == myDogsClone[1] ? "Same":"Different");
    System.out.println(myDogs[2] == myDogsClone[2] ? "Same":"Different");
    System.out.println(myDogs[3] == myDogsClone[3] ? "Same":"Different");
    
    System.out.println(myDogsClone[1].getDetails());
    System.out.println(myDogs[1].getDetails());
    
    System.out.println("*********************************************");
    
    myDogsClone[0].setName("Ruff"); 
    System.out.println(myDogs[0].getDetails());
    System.out.println(myDogsClone[0].getDetails());
    System.out.println("*********************************************");
    myDogsClone[1] = new Dog("Spot",9);
    System.out.println(myDogsClone[1].getDetails());
    System.out.println(myDogs[1].getDetails());
}

}
class Dog{

private String name;
private int age;

public Dog(String name,int age) {
    super();
    this.name = name;
    this.age=age;
}
public String getDetails() {
    return name+":"+age;
}
public void setName(String name) {
    this.name = name;
}
public String toString() {
    return name+":"+age;
}

}
