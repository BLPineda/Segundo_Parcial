/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segundo_Parcial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lenin
 */
public class Datos {
    protected String Nombre;
    protected String Apellido;
    protected String Pais;
    protected String municipio;
    protected String departamento;
    protected String comunidad;
    protected long DPI;
    protected int [] telefono = new int [9];
    protected static List<Datos> Datos_personales = new ArrayList();
    protected static List<Datos> Datos_personales1 = new ArrayList();
    protected static List<Datos> Datos_personales2 = new ArrayList();
    protected String [] Direccion = new String[7];

    public void Datos_persona(){
        Datos datos = new Datos();
        datos.setNombre("Lenín");
        datos.setApellido("Pineda");
        datos.setPais("Guatemala");
        datos.setDepartamento("Escuintla");
        datos.setMunicipio("Escuintla");
        datos.setComunidad("Ladino");
        datos.setDPI(292910293);
        
        Datos_personales.add(datos);
        
        Datos datos1 = new Datos();
        datos1.setNombre("Eleanor");
        datos1.setApellido("Menchu");
        datos1.setPais("Guatemala");
        datos1.setDepartamento("Guatemala");
        datos1.setMunicipio("Villanueva");
        datos1.setDPI(493290101);
        datos1.setComunidad("Ladino");
        
        Datos_personales1.add(datos1);
        
        Datos datos2 = new Datos();
        datos2.setNombre("Elmer");
        datos2.setApellido("Soto");
        datos2.setPais("Guatemala");
        datos2.setDepartamento("Escuintla");
        datos2.setMunicipio("Masagua");
        datos2.setDPI(202403211);
        datos2.setComunidad("Ladino");
        
        Datos_personales2.add(datos2);
    }
     public void mostrarDatos(){
        Direccion [0] = "1ra calle, lote 5, colonia la hermosita";
        Direccion [1] = "3ra calle, lote 7, colonia la hermosita";
        telefono [0] = 49421098; 
        telefono [1] = 49418204; 
        telefono [2] = 30319852; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void mostrarDatos1(){
        Direccion [0] = "10ma calle, lote 9, colonia la estrella del oceano";
        Direccion [1] = "7ma calle, lote 10, colonia el angel de la luna";
        telefono [0] = 38281098; 
        telefono [1] = 49391809; 
        telefono [2] = 40329100; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad +  "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
     public void mostrarDatos2(){
        Direccion [0] = "1ra calle, zona 4, colonia villamar";
        Direccion [1] = "10ma calle, zona 5, colonia estrella roja";
        telefono [0] = 18291830; 
        telefono [1] = 21909102; 
        telefono [2] = 21384019; 
        System.out.println(this.Nombre +"\t"+ this.Apellido + "\t" + this.DPI + "\n\n"
                + "\t" + this.departamento + "\t" + this.municipio + "\t" + this.Pais + "\t" + this.comunidad + "\n\n");
        
        for (int c=0; c <1;c++){
            System.out.println("\t" + Direccion[c] + "\t\t" + Direccion [c+1]
                + "\n\n\t" + telefono[c] + "\t" + telefono[c+1] + "\t" + telefono[c+2] + "\t" + "\n\n");
        }
    }
    public void Mostrar_datos(){
        Iterator <Datos> Iterador = Datos_personales.iterator();
        while (Iterador.hasNext()){
            Iterador.next().mostrarDatos();
        }
        Iterator <Datos> Iterador1 = Datos_personales1.iterator();
        while (Iterador1.hasNext()){
            Iterador1.next().mostrarDatos1();
        }
        Iterator <Datos> Iterador2 = Datos_personales2.iterator();
        while (Iterador2.hasNext()){
            Iterador2.next().mostrarDatos2();
        }
    }

    //telefono [3] = 40201021; telefono [6] = 40921890; telefono [4] = 40201940; telefono [7] = 29102395; telefono [5] = 40391092; telefono [8] = 49321049;
    public Datos(String Nombre, String Apellido, String Pais, String municipio, String departamento, String comunidad, long DPI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Pais = Pais;
        this.municipio = municipio;
        this.departamento = departamento;
        this.comunidad = comunidad;
        this.DPI = DPI;
    }

    
    public Datos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public long getDPI() {
        return DPI;
    }

    public void setDPI(long DPI) {
        this.DPI = DPI;
    }

    public List<Datos> getDatos_personales() {
        return Datos_personales;
    }

    public void setDatos_personales(List<Datos> Datos_personales) {
        this.Datos_personales = Datos_personales;
    }

    public int[] getTelefono() {
        return telefono;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }

    public static List<Datos> getDatos_personales1() {
        return Datos_personales1;
    }

    public static void setDatos_personales1(List<Datos> Datos_personales1) {
        Datos.Datos_personales1 = Datos_personales1;
    }

    public static List<Datos> getDatos_personales2() {
        return Datos_personales2;
    }

    public static void setDatos_personales2(List<Datos> Datos_personales2) {
        Datos.Datos_personales2 = Datos_personales2;
    }

    public String[] getDireccion() {
        return Direccion;
    }

    public void setDireccion(String[] Direccion) {
        this.Direccion = Direccion;
    }

    
}
