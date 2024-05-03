package servicios;

import java.util.List;

import dtos.ClienteDto;

import dtos.bibliotecaDto;

public interface OperativaInterfaz {

	public void AltaCliente(List<ClienteDto> listaClientes, List<bibliotecaDto> listaAntigua);
}
