package people;

public class Person {
	String name;
	Ethnicity ethnicity; //TODO: make new class, containing strings declaring AMERICAN, EUROPEAN, ASAIN, AFRICAN with fixed attributes: skincolor, type of eyes, color of eyes, type voice
	float height;
	String hobby;
	String characteristics;
	
	//--constructor for my person Attributes--
	
	Person(String name, String Ethnicity, String height, String hobby, String characteristics){
		this.name = name;
		this.Ethnicity = Ethnicity;
		this.height = height;
		this.hobby = hobby;
		this.characteristics = characteristics;
	}
	
	//--this class' function is to describe itself--
	void describeSelf(){
		System.out.println("Hi there, let VERY BASICALLY describe myself.");
		System.out.println("My name is" + this.name);
	}
}
