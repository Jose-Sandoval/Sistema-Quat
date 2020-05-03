<div class="modal fade" id="agregarClienteModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agrear Persona</h5>
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            <form action="${pageContext.request.contextPath}/PersonaServlet?accion=insertar" method="post" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required/>
                    </div>
                    <div class="form-group">
                        <label for="apParterno">Apellido Paterno</label>
                        <input type="text" class="form-control" name="apPaterno" required/>
                    </div>
                    <div class="form-group">
                        <label for="apMaterno">Apellido Materno</label>
                        <input type="text" class="form-control" name="apMaterno" required/>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required/>
                    </div>
                    <div class="form-group">
                        <label for="calular">Celular</label>
                        <input type="tel" class="form-control" name="celular"/>
                    </div>
                    <div class="form-group">
                        <label for="fch_nacmiento">Fecha de Nacimiento</label>
                        <input type="date" class="form-control" name="fch_nacimiento"/>  
                    </div>
                    <div class="form-group">
                        <label for="sexo">Sexo</label>                        
                        <input type="radio" id="masculino" name="sexo" value="masculino">
                        <label for="masculino">Masculino</label>
                        <input type="radio" id="female" name="sexo" value="masculino">
                        <label for="femenino">Femenino</label>                        
                    </div>
                    <div class="form-group">
                        <label for="rfc">RFC</label>
                        <input type="text" pattern="[A-Z]{3-4}[0-9]{6}[[:alnum]]{3}"class="form-control" name="rfc"/>  
                    </div>
                    <div class="form-group">
                        <label for="fch_nacmiento">Fecha de Nacimiento</label>
                        <input type="date" class="form-control" name="fch_nacimiento"/>  
                    </div>
                </div>
                <div class="modal-footer">                    
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>
            </form>
        </div>
    </div>
</div>