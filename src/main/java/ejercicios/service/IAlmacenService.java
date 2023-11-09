package ejercicios.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ejercicios.dto.Almacen;

@Service
public interface IAlmacenService{

	public List<Almacen> listAlmacen();
	
	public Almacen almacenPorId(Integer codigo); 
	
	public Almacen saveAlmacen(Almacen almacen);
	
	public Almacen updateAlmacen(Almacen almacen);
	
	public void deleteAlmacen(Integer codigo);
}
