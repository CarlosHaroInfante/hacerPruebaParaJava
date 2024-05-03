package servicios;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.bibliotecaDto;

public class BibliotecaImplementacion implements BibliotecaInterfaz{
	
	Scanner sc = new Scanner(System.in);
	private long idAuto(List<bibliotecaDto> listaAntigua) {
		
		long idN = 0;
		
		int tamanioLista = listaAntigua.size();
		
		if(tamanioLista > 0) {
			
			idN = listaAntigua.get(tamanioLista - 1).getId() + 1;
		}
		else {
			idN = 1;
		}
		
		return idN;
		
		
	}
	
	
	public void bibliotecaNueva(List<bibliotecaDto> listaAntigua) {
		try{
			
		
		bibliotecaDto bibliotecaNueva = new bibliotecaDto();
		System.out.println("Biblioteca Nueva, ingrese los siguientes datos: ");
		
		long id = idAuto(listaAntigua);
		bibliotecaNueva.setId(id);
		
		System.out.println("Nombre de la biblioteca: ");
		String nomBiblioteca = sc.nextLine();
		bibliotecaNueva.setNombre(nomBiblioteca);
		
		System.out.println("Dirección de la biblioteca");
		String dirBiblioteca = sc.nextLine();
		bibliotecaNueva.setDireccion(dirBiblioteca);
		
		listaAntigua.add(bibliotecaNueva);
		
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.print("Error en la creación de la biblioteca  " + e.getMessage());
	}
	}
	

	public void bibliotecaExistente(List<bibliotecaDto> listaAntigua, List<ClienteDto> listaClientes) {
		try {
			
		MenuInterfaz menu = new MenuImplementacion();
		
		long idBiblioteca = sc.nextLong();
		
		for (bibliotecaDto biblioteca : listaAntigua) {
			
			System.out.println(biblioteca.toString());
			
			if(idBiblioteca == biblioteca.getId()) {
				
				System.out.println("Entrando en la biblioteca: " + biblioteca.getNombre());
				
				boolean cerrarMenu = false;
				
				 while (!cerrarMenu)
				 {
				     int num = menu.menuParaBibliotecas();

				     switch (num)
				     {
				         case 0:
				             cerrarMenu = true;
				             break;
				         case 1:
				             System.out.println("Alta Cliente: ");
				             op.darAltaCliente(listaClientes, listaAntigua);
				             break;
				         case 2:
				        	 System.out.println("Hacer un pedido: ");
				         default:
				        	 System.out.println("Ninguna opción válida");
				             break;


				     }


				 }
			}
		}
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.print("Error en la entrada a la biblioteca  " + e.getMessage());
		}
		
		
		
	}
}
