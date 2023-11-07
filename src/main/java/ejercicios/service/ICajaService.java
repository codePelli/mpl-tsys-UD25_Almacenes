package ejercicios.service;

import java.util.List;

import ejercicios.dto.Caja;

public interface ICajaService {
	
	List<Caja> listCaja();
	
	Caja cajaPorCod(String numReferencia);
	
	Caja saveCaja(Caja caja);
	
	Caja updateCaja(String numReferencia, Caja caja);
	
	public void deleteCaja(String numReferencia);

}
