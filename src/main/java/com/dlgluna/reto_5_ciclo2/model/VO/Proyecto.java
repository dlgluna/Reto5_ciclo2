/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dlgluna.reto_5_ciclo2.model.VO;

/**
 *
 * @author user
 */
public class Proyecto {
    
    private int id_proyecto;
    private String constructora;
    private int numero_habitaciones;
    private String ciudad;

    /**
     * @return the id_proyecto
     */
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     * @param id_proyecto the id_proyecto to set
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the numero_habitaciones
     */
    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    /**
     * @param numero_habitaciones the numero_habitaciones to set
     */
    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
