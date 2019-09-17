package people;

public class Person {
	public String name;
	Ethnicity ethnicity;
	public double height;
	public String hobby;
	public String characteristics;
	
	//--constructor for my person Attributes-- 
	
	public Person(String name, /*Ethnicity Ethnicity,*/ double height, String hobby, String characteristics){
	}
	
	
	//-- Describe itself function--
	
	void describeSelf(){
		System.out.println("Hi there, let VERY BASICALLY describe myself.");
		System.out.println("My name is" + this.name);
	}
}
