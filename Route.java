package flights;

public class Route {
	
	Airport origin, destination;
	
	public Route(Airport origin, Airport destination) {
		this.origin = origin;
		this.destination = destination;
	}
	
	public double getDistance() {
		return Math.sqrt(Math.pow(destination.getX() - origin.getX(), 2) 
				
				+ Math.pow(destination.getY() - origin.getY(), 2));
	}

}
