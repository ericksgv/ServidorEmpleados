package com.empleados.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.demo.entidad.Empleado;
import com.empleados.demo.servicio.ServicioEmpleado;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpleado {
    @Autowired
    ServicioEmpleado servicioEmpleado;

    @GetMapping("/find-all")
    public List<Empleado> findAll() {
        return servicioEmpleado.obtenerEmpleados();
    }

    @GetMapping("/find-by-codigo/{codigo}")
    public Empleado findByCodigo(@PathVariable("codigo") Long codigo) {
        return servicioEmpleado.obtenerEmpleadoPorCodigo(codigo);
    }
}
