package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;

import ejercicios.dao.IAlmacenDAO;
import ejercicios.dto.Almacen;

public class IAlmacenServiceImpl implements IAlmacenService{

	@Autowired
	@Lazy
	IAlmacenDAO iAlmacenServ;
	
	@Override
	public List<Almacen> listAlmacen() {
		// TODO Auto-generated method stub
		return iAlmacenServ.findAll();
	}

	@Override
	public Almacen almacenPorId(Integer codigo) {
		// TODO Auto-generated method stub
		return iAlmacenServ.findById(codigo).get();
	}

	@Override
	public Almacen saveAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenServ.save(almacen);
	}

	@Override
	public Almacen updateAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenServ.save(almacen);
	}

	@Override
	public void deleteAlmacen(Integer codigo) {
		// TODO Auto-generated method stub
		iAlmacenServ.deleteById(codigo);
	}

}
