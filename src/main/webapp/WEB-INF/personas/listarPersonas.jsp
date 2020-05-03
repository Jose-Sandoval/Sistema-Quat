<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../comunes/cabecero.jsp" %> 
<%@include file="../comunes/botonesNavegaciom.jsp" %>
              
    <ul>
        <c:forEach var="persona" items="${personas}">                
            <li> ${persona.nombre} </li>
        </c:forEach>                        
    </ul>        

    <%@include file="../comunes/piePagina.jsp" %>
