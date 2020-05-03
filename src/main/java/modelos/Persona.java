package modelos;

import java.util.Date;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apMaterno;
    private String apPaterno;
    private String email;
    private String celular;
    private Date fechaNac;
    private String sexo;
    private String rfc;
    private String foto;
    private String tipo;
    private String nacionalidad;
    private String estatus; 

    public Persona(){
    }
    
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(int idPersona, String nombre, String apMaterno, String apPaterno, String celular, Date fechaNac, String sexo, String rfc, String foto, String tipo, String nacionalidad, String estatus, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apMaterno = apMaterno;
        this.apPaterno = apPaterno;
        this.email = email;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.rfc = rfc;
        this.foto = foto;
        this.tipo = tipo;
        this.nacionalidad = nacionalidad;
        this.estatus = estatus;
    }

    public Persona(String nombre, String apMaterno, String apPaterno, String celular, Date fechaNac, String sexo, String rfc, String foto, String tipo, String nacionalidad, String estatus, String email) {
        this.nombre = nombre;
        this.apMaterno = apMaterno;
        this.apPaterno = apPaterno;
        this.email = email;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.rfc = rfc;
        this.foto = foto;
        this.tipo = tipo;
        this.nacionalidad = nacionalidad;
        this.estatus = estatus;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apMaterno=" + apMaterno + ", apPaterno=" + apPaterno + ", email=" + email + ", celular=" + celular + ", fechaNac=" + fechaNac + ", sexo=" + sexo + ", rfc=" + rfc + ", foto=" + foto + ", tipo=" + tipo + ", nacionalidad=" + nacionalidad + ", estatus=" + estatus + '}';
    }            
}
