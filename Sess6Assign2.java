package session6Assignment2;

public class Sess6Assign2 {

	public static void main(String[] args) {
		Instrument guitar = new StringedInstrument();	//Object for Stringed Instrument referencing the abstract class Instrument
		guitar.play();		// invoking the method of the abstract class on its sub class
		
		StringedInstrument electric = new ElectricGuitar(); //object of ElectricGuitar referencing parent class StringedInstrument
		electric.getNumberOfStrings();
	
		StringedInstrument bass = new ElectricBassGuitar(); //object of ElectricBassGuitar referencing parent class StringedInstrument
		bass.getNumberOfStrings();
	}

}
class StringedInstrument extends Instrument{		//sub class of abstract class Instrument
	
	
	public StringedInstrument() {					// constructor of StringedInstrument class
		stringStrum = "Am I a Guitar.";
	}


	String numberOfStrings="";
	public void getNumberOfStrings(){				// method to be overridden by Electricguitar and ElectricBassGuitar
		System.out.println(numberOfStrings);
	}
	 
	@Override
	public void play() {
		System.out.println(stringStrum+ " The electric guitar has 6 strings or 12 strings and the electric bass guitar has 4 strings.");
		
	}
	
}

class ElectricGuitar extends StringedInstrument{    // subclass of Stringed instrument

	@Override
	public void getNumberOfStrings() {
		
		super.getNumberOfStrings();
	}
	public ElectricGuitar(){						//constructor of ElectricGuitar subclass
		numberOfStrings = "I am a 6 string electric guitar";
		
		}
	
}
class ElectricBassGuitar extends StringedInstrument{			// sub class of Stringed instrument
	
	@Override
	public void getNumberOfStrings() {
		super.getNumberOfStrings();
	}
	public ElectricBassGuitar() {					// constructor of ElectricBassGuitar subclass
		numberOfStrings = "I am a 4 string bass guitar";
		
	}  
	
	
		
}

abstract class Instrument{					// abstract class
	String stringStrum = ""; //field name
	abstract public void play();	//method play	
}
