package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Persona;

public class PersonaJDBC {
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM persona WHERE persona_id = ?";
    private static final String SQL_SELECT_BY_RFC = "SELECT persona_id FROM persona WHERE rfc=?";
    private static final String SQL_INSERT  = "INSERT INTO persona (nombre, ap_Materno, ap_Paterno, fch_nacimiento, sexo, rfc, foto, celular, tipo, nacionalidad, estatus, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, ap_Materno=?, ap_Paterno=?, fch_nacimiento=?, sexo=?, rfc=?, foto=?, celular=?, tipo=?, nacionalidad=?, estatus=?, email=? WHERE persona_id=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE persona_id=?";
    private static final String SQL_DELETE_DOM = "DELETE FROM domicilio WHERE persona_id=?";
    
    
    public int obtenerId(String rfc){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int personaId = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_RFC);
            stmt.setString(1, rfc);
            rs = stmt.executeQuery();
            rs.absolute(1);
            personaId = rs.getInt("persona_id");
            System.out.println(personaId);
        } catch (SQLException e) {
            System.out.println("ERROR DE SELECT RFC");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }        
        return personaId;
    }
    
    public List<Persona> listar(){
        Connection conn =null;
        PreparedStatement stmt= null;
        ResultSet rs= null;        
        List<Persona> personas = new ArrayList();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);  
            rs = stmt.executeQuery();        
            while(rs.next()){
                Persona persona = new Persona(rs.getInt("persona_id"),
                        rs.getString("nombre"),rs.getString("ap_Materno"),
                        rs.getString("ap_Paterno"),rs.getString("fch_nacimiento"),
                        rs.getString("sexo"), rs.getString("rfc"),rs.getString("foto"),
                        rs.getString("celular"),rs.getString("tipo"),rs.getString("nacionalidad"),
                        rs.getString("estatus"),rs.getString("email"));
                personas.add(persona);
            }
        } catch (SQLException e) {            
            System.out.println("ERROR DE LISTAR");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }  
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return personas;
    }
    
    public Persona encontrar(Persona persona) {
        Connection conn =null;
        PreparedStatement stmt= null;
        ResultSet rs= null; 
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);  
            stmt.setInt(1, persona.getIdPersona());
            rs = stmt.executeQuery();                    
            rs.absolute(1);//nos pocionamos en el primer registro devuelto
            persona.setNombre(rs.getString("nombre"));
            persona.setApMaterno(rs.getString("ap_materno"));
            persona.setApPaterno(rs.getString("ap_paterno"));
            persona.setEmail(rs.getString("email"));
            persona.setEstatus(rs.getString("estatus"));
            persona.setFechaNac(rs.getString("fch_nacimiento"));
            persona.setFoto(rs.getString("foto"));
            persona.setNacionalidad(rs.getString("nacionalidad"));
            persona.setRfc(rs.getString("rfc"));
            persona.setSexo(rs.getString("sexo"));
            persona.setCelular(rs.getString("celular"));
            persona.setTipo(rs.getString("tipo"));
        } catch (SQLException e) {
            System.out.println("ERROR DE ENCONTRAR");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }  
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);
            Conexion.close(rs);
        }         
        return persona;
    }
    
    public int insert(Persona persona){
        Connection conn =null;
        PreparedStatement stmt= null;        
        int rows = 0;
         try {
            //nombre, ap_Materno, ap_Paterno, fch_nacimiento, sexo, rfc, foto, celular, tipo, nacionalidad, estatus, email            
            conn = Conexion.getConnection();
            if(persona.getFechaNac().equals("")){
                persona.setFechaNac(null);
            }
            stmt = conn.prepareStatement(SQL_INSERT);                
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApMaterno());
            stmt.setString(3, persona.getApPaterno());
            stmt.setString(4,  persona.getFechaNac());
            stmt.setString(5, persona.getSexo());
            stmt.setString(6, persona.getRfc());
            stmt.setString(7, persona.getFoto());
            stmt.setString(8, persona.getCelular());
            stmt.setString(9, persona.getTipo());
            stmt.setString(10, persona.getNacionalidad());
            stmt.setString(11, persona.getEstatus());
            stmt.setString(12, persona.getEmail());
            
            rows = stmt.executeUpdate();  
        } catch (SQLException e) {
            System.out.println("ERROR DE INSERTAR");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }  
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);            
        }
         return rows;
    }
    
    public int update(Persona persona){
        Connection conn =null;
        PreparedStatement stmt= null;        
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);  
            
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApMaterno());
            stmt.setString(3, persona.getApPaterno());
            stmt.setString(4,  persona.getFechaNac());
            stmt.setString(5, persona.getSexo());
            stmt.setString(6, persona.getRfc());
            stmt.setString(7, persona.getFoto());
            stmt.setString(8, persona.getCelular());
            stmt.setString(9, persona.getTipo());
            stmt.setString(10, persona.getNacionalidad());
            stmt.setString(11, persona.getEstatus());
            stmt.setString(12, persona.getEmail());
            stmt.setInt(13, persona.getIdPersona());
            
            rows = stmt.executeUpdate();  
        } catch (SQLException e) {
            System.out.println("ERROR DE UPDATE");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }  
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);            
        }
         return rows;
    }
    
    public int delete(int personaId){
        Connection conn =null;
        PreparedStatement stmt= null;        
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);                        
            stmt.setInt(1, personaId);
            rows = stmt.executeUpdate();  
        } catch (SQLException e) {
            System.out.println("ERROR DE DELETE");
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
            e.printStackTrace(System.out);
        }  
        finally{
            Conexion.close(conn);
            Conexion.close(stmt);            
        }
         return rows;
    }    
}