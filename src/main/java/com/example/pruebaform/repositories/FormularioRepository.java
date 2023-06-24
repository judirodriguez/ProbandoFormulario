package com.example.pruebaform.repositories;


import com.example.pruebaform.entities.FormularioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioEntity, Long> {
    // Puedes agregar métodos personalizados de consulta si los necesitas
}