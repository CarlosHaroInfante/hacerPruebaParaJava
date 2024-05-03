package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	public int menuBiblioteca() {
		
		 System.out.println("Bibliotecas");
		 System.out.println("///////////");
		 System.out.println("[0] - Cerrar Menú");
		 System.out.println("[1] - Crear una nueva Biblioteca");
		 System.out.println("[2] - Entrar en una biblioteca específica");
		 System.out.println("///////////");
		 int op = sc.nextInt();

		 return op;
	}
	
	public int menuParaBibliotecas() {
		
		System.out.println("Opciones de la biblioteca");
		System.out.println("///////////");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Dar de alta un nuevo cliente");
		System.out.println("[2] - Dar de alta un nuevo libro");
		System.out.println("[3] - Dar de alta un nuevo prestamo");
		System.out.println("[4] - Estado actual de libros");
		System.out.println("[5] - Libros de la biblioteca");
		System.out.println("///////////");
		int op = sc.nextInt();

		 return op;
	}
}
