package eu.senla;

import java.util.stream.Collector;

public class Processor {
	
	String name;
	Integer freq;
	
	
	public Processor(String name, Integer freq) {
		super();
		this.name = name;
		this.freq = freq;
	}



	@Override
	public String toString() {
		return "Processor [name = " + name + ", freq = " + freq + "]";
	}



	public String getName() {
		return name;
	}



	public Integer getFreq() {
		return freq;
	}



	public static Collector toList() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
