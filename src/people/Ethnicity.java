package people;

public class Ethnicity { returns String;

//Input is string
	public String skinColor;
	public String colorEyes;
	public String typeEyes;
	public String typeVoice;
	
	public Ethnicity(String skinColor, String colorEyes, String typeEyes, String typeVoice){
	}
	
	Ethnicity american = new Ethnicity("White", "Blue", "Round", "sound like people from reality TV")
	Ethnicity european = new Ethnicity("White", "Blue, Grey or Brown", "Round", "like trying to speak whilst gagging");
	Ethnicity asian = new Ethnicity("Yellow", "brown or darkbrown", "Round", "high and weird words emphasis");
	Ethnicity african = new Ethnicity("Black", "Darkbrown", "Round", "2+2=4");

	public Ethnicity(Ethnicity american, Ethnicity european, Ethnicity asian, Ethnicity african) {
		super();
		this.american = american;
		this.european = european;
		this.asian = asian;
		this.african = african;
	}
	
	//functie Ethnicity () is this.eyecolor printen
	System.out.println (american.skinColor);

}