package com.example.pruebaform.controllers;


import com.example.pruebaform.entities.FormularioEntity;
import com.example.pruebaform.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/formulario")
public class FormularioController {

    private final FormularioService formularioService;

    @Autowired
    public FormularioController(FormularioService formularioService) {
        this.formularioService = formularioService;
    }

    @GetMapping("/crear")
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarFormulario(
            @RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("telefono") String telefono,
            @RequestParam("asunto") String asunto,
            @RequestParam("mensaje") String mensaje,
            Model model) {

        // Crear una instancia de FormularioEntity y establecer los valores
        FormularioEntity formularioEntity = new FormularioEntity();
        formularioEntity.setNombre(nombre);
        formularioEntity.setEmail(email);
        formularioEntity.setTelefono(telefono);
        formularioEntity.setAsunto(asunto);
        formularioEntity.setMensaje(mensaje);

        // Guardar el formulario en la base de datos utilizando el servicio
        formularioService.guardarFormulario(formularioEntity);

        // Agregar un mensaje de éxito al modelo para mostrarlo en la vista
        model.addAttribute("mensaje", "El formulario se ha guardado correctamente");

        return "formulario";
    }
}