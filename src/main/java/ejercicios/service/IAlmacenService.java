package ejercicios.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Almacen;

public interface IAlmacenService{

	public List<Almacen> listAlmacen();
	
	public Almacen almacenPorId(Integer codigo); 
	
	public Almacen saveAlmacen(Almacen almacen);
	
	public Almacen updateAlmacen(Integer codigo, Almacen almacen);
	
	public void deleteAlmacen(Integer codigo);
}
