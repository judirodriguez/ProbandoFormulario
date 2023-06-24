package com.example.pruebaform.services;


import com.example.pruebaform.entities.FormularioEntity;
import com.example.pruebaform.repositories.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioServiceImpl implements FormularioService {
    private final FormularioRepository formularioRepository;

    @Autowired
    public FormularioServiceImpl(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }

    @Override
    public void guardarFormulario(FormularioEntity formularioEntity) {
        formularioRepository.save(formularioEntity);
    }

    // Implementación de otros métodos del servicio del formulario, si los hay
}