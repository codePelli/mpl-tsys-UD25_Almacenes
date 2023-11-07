package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.CajaDTO;

public interface ICajaDAO extends JpaRepository<CajaDTO, String>{
}
