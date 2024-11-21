package flights;

public class Map {
	
	private Airport[][] map;
	
	public Map(int width, int height) {
		map = new Airport[height][width];
	}
	
	public int getWidth() {
		return map[0].length;
	}
	
	public int getHeight() {
		return map.length;
	}
	
	public void placeAirport(Airport airport, int x, int y) {
		if(map[y][x] == null) {
			map[y][x] = airport;
			airport.setCoordinates(x, y);
		} else {
			System.out.println("En esas coordenadas ya hay un aeropuerto");
		}
	}
	
	public void removeAirport(int x, int y) {
		if(map[y][x] != null) {
			map[y][x] = null;
		} else {
			System.out.println("No hay ningun aeropuerto en esas coordenadas");
		}
	}

	@Override
	public String toString() {
		String result = "\t";
		for(int i = 0; i < getWidth() + 2; i++) {
			result += "-";
		}
		result += '\n';
		
		for(int y = 0; y < map.length; y++) {
			result += "\t|";
			for(int x = 0; x < map[0].length; x++) {
				result += map[y][x] != null ? "X" : " ";
			}
			result += "|\n";
		}
		
		result += "\t";
		for(int i = 0; i < getWidth() + 2; i++) {
			result += "-";
		}
		
		return result;
	}
	
	
	
}
