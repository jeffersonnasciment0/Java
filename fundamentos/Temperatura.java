package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = c°
		
		double fahrenheit = 86;
		final int DIM = 32;
		final double FATOR = 5.0/9;
		
		double celsius = (fahrenheit - DIM) * FATOR; 
		
		System.out.println(fahrenheit + " °F Em C° é -> " + celsius + "°C");
	}
}
