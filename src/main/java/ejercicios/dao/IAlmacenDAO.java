package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ejercicios.dto.AlmacenDTO;

@Repository
public interface IAlmacenDAO extends JpaRepository<AlmacenDTO, Integer> {
}
