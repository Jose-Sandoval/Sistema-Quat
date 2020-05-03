<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es-MX"></fmt:setLocale>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado Personas</h4>
                    </div>
                    <table class="table table-stiped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>ID</th>
                                <th>nombre</th>
                                <th>telefono</th>
                                <th>tipo</th>
                                <th></th>
                            </tr>                            
                        </thead> 
                        <tbody>
                            <!--iteramos la lista de clientes-->
                        <c:forEach var="persona" items="${personas}" varStatus="status">
                                <tr>
                                    <th>${status.count}</th>
                                    <th>${persona.idPersona}</th>
                                    <th>${persona.nombre} ${persona.apPaterno}</th>
                                    <th>${persona.celular}</th>
                                    <th>${persona.tipo}</th>                                    
                                    <th>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}"
                                           class="btn btn-secondary"><i class="fas fa-angle-double-right"></i>Editar
                                        </a>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idCliente=${cliente.idCliente}"
                                           class="btn btn-danger"><i class="fas fa-angle-double-right"></i>Eliminar
                                        </a>                                                                        
                                    </th>
                                </tr>                                
                            </c:forEach>
                        </tbody>
                    </table>
                </div>                
            </div> 
        </div>
    </div>
</section>
<!--Agregar Cliente Modal-->   
<%@include file="agregarPersonas.jsp"%>



      

    
