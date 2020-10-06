package edu.careerdevs.objects;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private static List<Die> dice=new ArrayList<Die>();
	
	public static List<Die> Dice(int sides, int quantity){
		for (int idx=0; idx<quantity; idx++) {
			Die die=new Die(sides);
			dice.add(die);
		}
		return dice;
	}
}
