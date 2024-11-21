package flights;

public class Plane {
	
	private int numOfSeats;
	private int numOfRows;
	private int seatsPerRow;
	private boolean[][] seats;
	private double gasCapacity;
	private double gasAmount;
	private double speed;
	private String model;
	
	public Plane(String model, int numOfRows, int seatsPerRow, int speed) {
		this.model = model;
		this.numOfRows = numOfRows;
		this.seatsPerRow = seatsPerRow;
		this.speed = speed;
		seats = new boolean[this.numOfRows][this.seatsPerRow];
	}
	
	public Plane(String model, int numOfRows, int seatsPerRow, int speed, double gasCapacity) {
		this(model, numOfRows, seatsPerRow, speed);
		this.gasCapacity = gasCapacity;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public int getSeatsPerRow() {
		return seatsPerRow;
	}
	
	public double getGasAmount() {
		return gasAmount;
	}

	public void setGasAmount(double gasAmount) {
		this.gasAmount = gasAmount;
	}

	public double getGasCapacity() {
		return gasCapacity;
	}

	public double getSpeed() {
		return speed;
	}
	
	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		
		String distribution = "\t" + model + "\n\t";
		for(int i = 0; i < seatsPerRow + 2; i++) {
			distribution += '-';
		}
		distribution += '\n';
		
		for(int row = 0; row < numOfRows; row++) {
			distribution += "\t|";
			for(int seat = 0; seat < seatsPerRow; seat++) {
				distribution += seats[row][seat] ? 'X' : '#'; 
			}
			distribution += "|\n";
		}
		
		distribution += '\t';
		for(int i = 0; i < seatsPerRow + 2; i++) {
			distribution += '-';
		}
		distribution += '\n';
		
		return distribution;
	}
	
	public void bookSeat(int row, int seat) {
		if(!seats[row][seat]) {
			seats[row][seat] = true;
		} else {
			System.out.println("That seat is already booked");
		}
	}
	
	public void cancelSeat(int row, int seat) {
		if(seats[row][seat]) {
			seats[row][seat] = false;
		} else {
			System.out.println("That seat is not booked");
		}
	}

}
