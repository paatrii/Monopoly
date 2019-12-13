package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String msg) {
		boolean booleano = true;
    	return booleano;
	}
	
	void setName(String name) {
	}
}
