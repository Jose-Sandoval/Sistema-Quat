
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informacion de Personas</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!--FontAwesome-->
        <script src="https://kit.fontawesome.com/0725d80fe5.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <section id="actions" class="py-4 mb-4 bg-light">
            <a href="index.jsp" class="btn btn-primary" >Inicio</a>
            <div class="container">                
                <div class="row">                    
                    <div class="col-md-6">
                        <a href="#" class="btn btn-primary " data-toggle="modal" data-target="#editarDomicilioModal">
                            <i class="fas fa-address-card"></i> </i>Editar domicilio
                        </a>
                    </div>
                    <div class="col-md-6">
                        <a href="#" class="btn btn-primary " data-toggle="modal" data-target="#editarPersonaModal">
                           <i class="fas fa-user-edit"></i>Editar Persona
                        </a>
                    </div>
                </div>
            </div>            
        </section>
        <section id="actions" class="py-4 mb-4 bg-light" >
            <div class="container">
                <div class="row">                        
                    <div class="col-md-6">                                                    
                        <h3>${domicilio.calle} #${domicilio.numero}</h3>                                                        
                        <h3>${domicilio.colonia}</h3>
                        <h3>${domicilio.idEstado}</h3>
                        <h3>${domicilio.idMunDel}</h3>
                        <h3>${domicilio.tipo}</h3>
                        <h3>${domicilio.estatus}</h3>                                                               
                    </div>                        
                    <div class="col-md-6">                        
                        <h4>${persona.nombre} ${persona.apPaterno} ${persona.apMaterno}</h4>
                        <h4>${persona.fechaNac}</h4>
                        <h4>${persona.rfc}</h4>
                        <h4>${persona.sexo}</h4>
                        <h4>${persona.estatus}</h4>
                    </div>                           
                </div>                    
            </div> 
        </section>
        <%@include file="../personas/personaModal.jsp" %>
        <%@include file="../domicilios/domicilioModal.jsp" %>
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>

