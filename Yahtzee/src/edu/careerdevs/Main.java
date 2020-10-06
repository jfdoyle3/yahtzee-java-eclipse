package edu.careerdevs;

import java.util.List;

import edu.careerdevs.objects.Die;
import edu.careerdevs.objects.Hand;

public class Main {

	public static void main(String[] args) {
	
		List<Die> hand=Hand.Dice(6,1);
		Die cube=new Die(6,2);
		System.out.println(cube.getFaceUp());
		
//		for(Die cubes : hand)
//		System.out.println(cubes.getFaceUp());
	}
	

}
