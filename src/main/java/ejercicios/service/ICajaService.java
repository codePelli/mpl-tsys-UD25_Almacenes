package ejercicios.service;

import java.util.List;

import ejercicios.dto.CajaDTO;

public interface ICajaService {
	
	List<CajaDTO> listCaja();
	
	CajaDTO cajaPorCod(String numReferencia);
	
	CajaDTO saveCaja(CajaDTO caja);
	
	CajaDTO updateCaja(String numReferencia, CajaDTO caja);
	
	public void deleteCaja(String numReferencia);

}
