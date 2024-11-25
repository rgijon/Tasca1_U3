package ud4funciones;

public class Ejercicio43 {
	static void dibujarRectangulo(int ancho, int alto) {
		
		//comprobamos ancho y alto
		if (ancho <=0 || alto <= 0) {
			System.out.println("Error, el ancho y el alto del rectángulo, NO son positivos.");
			//salir si los valores no son válidos
			return;
		}

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		dibujarRectangulo(-5, 8);
	}
}
