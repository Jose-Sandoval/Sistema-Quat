package controladores;

import com.mysql.cj.Session;
import datos.DomicilioJDBC;
import datos.PersonaJDBC;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelos.Domicilio;
import modelos.Persona;

@WebServlet("/Personas")

public class PersonasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{   
        listarDomicilios(request, response);                
    }    
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){       
                
    }   
    
    private void listarPersonas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{        
        HttpSession sesion = request.getSession();
        List <Persona> personas = new PersonaJDBC().listar(); 
        for(Persona persona: personas){
            System.out.println("persona: "+ persona);
        }        
        sesion.setAttribute("personas", personas);
        request.getRequestDispatcher("/WEB-INF/personas/listarPersonas.jsp").forward(request, response);
        //response.sendRedirect("WEB-INF/listarPersonas.jsp");
    }
    
    private void listarDomicilios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession sesion = request.getSession();
        List<Domicilio> domicilios = new DomicilioJDBC().listar();
        sesion.setAttribute("domicilios", domicilios);
        request.getRequestDispatcher("/WEB-INF/domicilios/listarDomicilios.jsp").forward(request, response);
    }
}
