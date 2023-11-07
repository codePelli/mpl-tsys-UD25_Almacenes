package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dto.Caja;

public class ICajaServiceImpl implements ICajaService{

	@Autowired
	ICajaService iCajaServ;

	@Override
	public List<Caja> listCaja() {
		// TODO Auto-generated method stub
		return iCajaServ.listCaja();
	}

	@Override
	public Caja cajaPorCod(String numReferencia) {
		// TODO Auto-generated method stub
		return iCajaServ.cajaPorCod(numReferencia);
	}

	@Override
	public Caja saveCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaServ.saveCaja(caja);
	}

	@Override
	public Caja updateCaja(String numReferencia, Caja caja) {
		// TODO Auto-generated method stub
		return iCajaServ.updateCaja(numReferencia, caja);
	}

	@Override
	public void deleteCaja(String numReferencia) {
		// TODO Auto-generated method stub
		iCajaServ.deleteCaja(numReferencia);
	}
	
	@GetMapping("/all")
	public List<Caja> listAllCaja(){
		return listCaja();
	}

}
