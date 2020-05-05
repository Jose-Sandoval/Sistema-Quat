<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <!--FontAwesome-->
        <script src="https://kit.fontawesome.com/0725d80fe5.js" crossorigin="anonymous"></script>
        
        <title>Editar Personas</title>
    </head>
    <body>        
        
        <form action="${pageContext.request.contextPath}/PersonaServlet?accion=modificar&idPersona=${persona.idPersona}" method="post" class="was-validated">
            <section id="actions" class="py-4 mb-4 bg-light" >
                <div class="container">
                    <div class="row">
                        <div class="col-md-3"> 
                            <a href="${pageContext.request.contextPath}/PersonaServlet" class="btn btn-ligth btn-block" > <i class="fas fa-arrow-left"></i>Inicio</a>                             
                        </div>
                        <div class="col-md-3">
                            <button type="submit" class="btn btn-success btn-block" >
                                <i class="fas fa-check"></i>Guardar Persona                       
                            </button>
                        </div>   
                    </div>
                </div>    
            </section>
            <table>
            <td class="col" >
            <section id="details">
                <div  class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card" >
                                <div class="card-header">
                                    <h4>Editar Cliente</h4>
                                </div>
                                <div class="card-body">                                                                        
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" required value="${persona.nombre}"/>
                                        <label for="apParterno">Apellido Paterno</label>
                                        <input type="text" class="form-control" name="apPaterno" required value="${persona.apPaterno}"/>
                                   
                                   
                                        <label for="apMaterno">Apellido Materno</label>
                                        <input type="text" class="form-control" name="apMaterno" required value="${persona.apMaterno}"/>
                                  
                                        <label for="fch_nacmiento">Fecha de Nacimiento</label>
                                        <input type="date" class="form-control" name="fch_nacimiento" value="${persona.fechaNac}" />  
                                 
                                                      
                                        <div class="form-control" id="sexo" > 
                                            <labels>Masculino</label>
                                            <input type="radio" name="genero" value="masculino" required/>
                                            <label> Femenino</label>
                                            <input type="radio" name="genero" value="femenino" requiered />
                                        </div>
                                 
                                        <label for="rfc">RFC</label>
                                        <input type="text" class="form-control" name="rfc" required value="${persona.rfc}"/>  
                              
                                        <label for="foto">Foto</label>
                                        <input type="text" class="form-control" name="foto" value="${persona.foto}"/>  
                                  
                                        <label for="calular">Celular</label>
                                        <input type="tel" class="form-control" name="celular" value="${persona.celular}"/>
                               
                                        <label for="tipo">Tipo</label>
                                        <input type="text" class="form-control" name="tipo" required value="${persona.tipo}"/>
                                 
                                        <label for="nacionalidad">Nacionalidad</label>
                                        <input type="text" class="form-control" name="nacionalidad" required value="${persona.nacionalidad}"/>
                                 
                                        <label for="estatus ">Estatus</label>
                                        <input type="text" class="form-control" name="estatus" required value="${persona.estatus}"/>
                                    
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" name="email" required value="${persona.email}"/>
                                    </div>
                                </div>
                            </div>
                        </div>    
                    </div>                    
                </div>
            </section>   
            </td>
            </table>
        </form>
            
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
