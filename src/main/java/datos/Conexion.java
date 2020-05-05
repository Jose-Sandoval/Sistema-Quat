
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/quat?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";    
    private static final String JDBC_USER="root";
    private static final String JDBC_PASS="desaqs";
    private static BasicDataSource ds;
    
    public static DataSource getDataSource(){
        if(ds==null){
            ds = new BasicDataSource();
            ds.setUrl(JDBC_URL);
            ds.setUsername(JDBC_USER);
            ds.setPassword(JDBC_PASS);        
            //esta linea a veces es necesarioa, con versiones del driver de sql mas antiguas
            //ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setInitialSize(50); 
        }
        return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }  
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement pstm){
        try {
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
