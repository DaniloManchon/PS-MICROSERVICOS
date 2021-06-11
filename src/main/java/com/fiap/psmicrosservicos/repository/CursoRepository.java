package com.fiap.psmicrosservicos.repository;


import com.fiap.psmicrosservicos.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long>{

}
