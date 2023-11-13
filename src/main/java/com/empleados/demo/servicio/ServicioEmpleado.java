package com.empleados.demo.servicio;

import java.util.List;

import com.empleados.demo.entidad.Empleado;

public interface ServicioEmpleado {
    List<Empleado> obtenerEmpleados();
    Empleado obtenerEmpleadoPorCodigo(Long codigo);
}
