package people;

public class Ethnicity {

//Input is string
	
	public Ethnicity(String skinColor, String colorEyes, String typeEyes, String typeVoice){
	}
	
	Ethnicity american = new Ethnicity("White", "Blue", "Round", "Sound like people from reality TV");
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
	
	
	

}