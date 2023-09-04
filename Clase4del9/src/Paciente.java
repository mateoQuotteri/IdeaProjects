package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
    }

    public Date getFechaInternacion() {
        if ()


        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException
    {
        if (fechaAlta.after(fechaInternacion))
            throw new PacienteException("Limite superado para la operacion");

    }

  /*  public void comprar (Double importe) throws ClienteException {
        if (deuda+importe > limite)     {
            throw new ClienteException("Limite superado para la operacion");
        }

        deuda+=importe;*/

}
