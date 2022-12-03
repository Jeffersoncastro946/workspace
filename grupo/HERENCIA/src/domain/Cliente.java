/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author jeffe
 */
public class Cliente extends Persona{
    //declaracion de atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contador;
    //declaracion de metodos
    public Cliente(Date fechaRegistro, boolean vip, String nombre, 
            String direccion, char genero, int edad){
        super( nombre, direccion, genero, edad);
        this.idCliente=++Cliente.contador;
        this.fechaRegistro=fechaRegistro;
        this.vip=vip;
    }
    
    public int getIdCliente(){
        return this.idCliente;    
    }
    
    public Date getFechaRegistro(){return this.fechaRegistro;}
    
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro=fechaRegistro;
    }
    
    public boolean isVip(){
        return this.vip;
    }
    
    public void setVip(boolean vip){
        this.vip=vip;
    }

    @Override
    public String toString() {
        return "persona: " + super.toString()+ "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
}
