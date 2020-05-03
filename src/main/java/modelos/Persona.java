package modelos;

import java.util.Date;

public class Persona {
    private int idpersona;
    private String nombre;
    private String apeMaterno;
    private String apePaterno;
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
    
    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(int idpersona, String nombre, String apeMaterno, String apePaterno, String celular, Date fechaNac, String sexo, String rfc, String foto, String tipo, String nacionalidad, String estatus, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apeMaterno = apeMaterno;
        this.apePaterno = apePaterno;
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

    public Persona(String nombre, String apeMaterno, String apePaterno, String celular, Date fechaNac, String sexo, String rfc, String foto, String tipo, String nacionalidad, String estatus, String email) {
        this.nombre = nombre;
        this.apeMaterno = apeMaterno;
        this.apePaterno = apePaterno;
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

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
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
        return "Persona{" + "idpersona=" + idpersona + ", nombre=" + nombre + ", apeMaterno=" + apeMaterno + ", apePaterno=" + apePaterno + ", email=" + email + ", celular=" + celular + ", fechaNac=" + fechaNac + ", sexo=" + sexo + ", rfc=" + rfc + ", foto=" + foto + ", tipo=" + tipo + ", nacionalidad=" + nacionalidad + ", estatus=" + estatus + '}';
    }            
}
