package servicios;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.bibliotecaDto;

public class OperativaImplementacion implements OperativaInterfaz{

	
	public void AltaCliente(List<ClienteDto> listaClientes, List<bibliotecaDto> listaAntigua) {
		
		try {
			
		
		
		ClienteDto clienteN = new ClienteDto();
		
		bibliotecaDto bibliotecaid = new bibliotecaDto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Apellidos del cliente Nuevo");
		clienteN.setApellidos(sc.nextLine());
		
		System.out.print("Nombre del cliente Nuevo");
		clienteN.setNombre(sc.next());
		
		
		System.out.println("Fecha de nacimiento en formato dd-MM-yyyy");
		String fechaNac = sc.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("DNI:");
		String dni = sc.next();
		
		System.out.println("Correo electrónico:");
		String correo = sc.next();
		
		for(ClienteDto cliente : listaClientes) {
			clienteN.setBibliotecaId(cliente.getBibliotecaId());
		}
		
		listaClientes.add(clienteN);
		 } catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Error al añadir el cliente " + e.getMessage());
		}
		
	}
	
	public void pedidoCliente(List<ClienteDto> listaClientes, List<bibliotecaDto> listaAntigua) {
		
		
		
	}
	
}
