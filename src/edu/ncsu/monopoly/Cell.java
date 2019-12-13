package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player proprietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	public Player getProprietary() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
    
    public String toString() {
        return name;
    }
}
