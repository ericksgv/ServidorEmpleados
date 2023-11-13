package com.empleados.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleados.demo.entidad.Empleado;

@Repository
public interface RepositorioEmpleado extends JpaRepository<Empleado, Long>{
    Empleado findByCodigo(Long codigo);
}

