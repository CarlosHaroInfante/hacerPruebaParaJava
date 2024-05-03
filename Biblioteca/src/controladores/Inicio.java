package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import dtos.bibliotecaDto;
import servicios.BibliotecaImplementacion;
import servicios.BibliotecaInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		

		List<bibliotecaDto> biblioteca = new ArrayList<bibliotecaDto>();
		List<ClienteDto> clientes = new ArrayList<ClienteDto>();
		
		MenuInterfaz menu = new MenuImplementacion();
		BibliotecaInterfaz bibliotecas = new BibliotecaImplementacion();
		
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			
			
			 int op = menu.menuBiblioteca();

			 switch (op)
			 {

			     case 0:
			         cerrarMenu = true;
			         break;
			     case 1:
			         System.out.println("Añadir nueva biblioteca");
			         bibliotecas.bibliotecaNueva(biblioteca);
			         break;
			     case 2:
			    	 System.out.println("Biblioteca Existente");
			         bibliotecas.bibliotecaExistente(biblioteca, clientes);
			         break;
			     default:
			    	 System.out.println("Opción seleccionada erroneamente, intentelo de nuevo.");
			         break;
			 }
			
		}
		
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.print("Error al iniciar la aplicación " + e.getMessage());
		}
		
	}

}
