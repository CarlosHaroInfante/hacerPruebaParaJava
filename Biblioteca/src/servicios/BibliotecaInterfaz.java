package servicios;

import java.util.List;

import dtos.ClienteDto;
import dtos.bibliotecaDto;

public interface BibliotecaInterfaz {

	public void bibliotecaNueva(List<bibliotecaDto> listaAntigua);
	
	public void bibliotecaExistente(List<bibliotecaDto> listaAntigua, List<ClienteDto> listaClientes);
}
