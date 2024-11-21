package flights;

public class Airport {

	private String name;
	private Plane[] hangar;
	private int x, y;
	
	public Airport(String name, int capacity) {
		this.name = name;
		hangar = new Plane[capacity];
	}
	
	public int getCapacity() {
		return hangar.length;
	}

	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0; i < hangar.length; i++) {
			if(hangar[i] != null) {
				result += hangar[i].toString();
			}
		}
		
		return result;
	}
	
	public void depositPlane(Plane plane) {
		for(int i = 0; i < hangar.length; i++) {
			if(hangar[i] == null) {
				hangar[i] = plane;
				break;
			}
		}
	}

	public String getName() {
		return name;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
