package edu.careerdevs.objects;

import java.util.Random;

public class Die {

	private int faces;
	private int faceUp;
	private Random random=new Random();
	
	public Die(int faces) {
		this.faces=faces;
		this.setFaceUp(random.nextInt(faces)+1);
	}
	public Die(int faces, int faceUp) {
		this.faces=faces;
		this.setFaceUp(faceUp);
	}
	
	public void Roll() {
		this.setFaceUp(random.nextInt(faces)+1);
	}
	public int getFaceUp() {
		return faceUp;
	}
	public void setFaceUp(int faceUp) {
		this.faceUp = faceUp;
	}
}
