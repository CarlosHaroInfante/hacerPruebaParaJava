package servicios;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.bibliotecaDto;

public class OperativaImplementacion implements OperativaInterfaz{

	public void AltaCliente(List<ClienteDto> listaClientes, List<bibliotecaDto> listaAntigua) {
		
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
		
			
		 
		
	}
}
