package com.empleados.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.demo.entidad.Empleado;
import com.empleados.demo.repositorio.RepositorioEmpleado;

@Service
public class ServicioEmpleadoImpl implements ServicioEmpleado{

    @Autowired
    RepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleado> obtenerEmpleados() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado obtenerEmpleadoPorCodigo(Long codigo) {
        return repositorioEmpleado.findByCodigo(codigo);
    }
    
}
