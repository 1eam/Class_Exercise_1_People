package people;

public class Person {
	String name;
	Ethnicity ethnicity; //TODO: make new class, containing strings declaring AMERICAN, EUROPEAN, ASAIN, AFRICAN with fixed attributes: skincolor, type of eyes, color of eyes, type voice
	float height;
	String hobby;
	String character;
	
	//this calss' function is to describe itself
	void describeSelf(){
		System.out.println("Hi there, let VERY BASICALLY describe myself.");
		System.out.println("My name is" + this.name);
	}
}
