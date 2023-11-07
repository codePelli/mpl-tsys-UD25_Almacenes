package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String>{
}
