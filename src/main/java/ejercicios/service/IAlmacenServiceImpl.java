package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dto.Almacen;

public class IAlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenService iAlmacenServ;
	
	@Override
	public List<Almacen> listAlmacen() {
		// TODO Auto-generated method stub
		return iAlmacenServ.listAlmacen();
	}

	@Override
	public Almacen almacenPorId(Integer codigo) {
		// TODO Auto-generated method stub
		return iAlmacenServ.almacenPorId(codigo);
	}

	@Override
	public Almacen saveAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenServ.saveAlmacen(almacen);
	}

	@Override
	public Almacen updateAlmacen(Integer codigo, Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenServ.updateAlmacen(codigo, almacen);
	}

	@Override
	public void deleteAlmacen(Integer codigo) {
		// TODO Auto-generated method stub
		iAlmacenServ.deleteAlmacen(codigo);
	}
	
	@GetMapping("/all")
	public List<Almacen> listAllAlmacen(){
		return listAlmacen();
	}

}
