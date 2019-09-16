package people;

public class Person {
	public String name;
//	Ethnicity ethnicity; //TODO: make new class, containing strings declaring AMERICAN, EUROPEAN, ASAIN, AFRICAN with fixed attributes: skincolor, type of eyes, color of eyes, type voice
	public double height;
	public String hobby;
	public String characteristics;
	
	//--constructor for my person Attributes--
	
//	Person(String name, Ethnicity Ethnicity, float height, String hobby, String characteristics){
//		this.name = name;
//	//	this.Ethnicity = Ethnicity;
//		this.height = height;
//		this.hobby = hobby;
//		this.characteristics = characteristics;
//	}
	
	
	//-- Describe itself function--
	void describeSelf(){
		System.out.println("Hi there, let VERY BASICALLY describe myself.");
		System.out.println("My name is" + this.name);
	}
}
//When Ethnicity Object is called, I want the ethnicity to automatically call: its skincolor