package medicareapp

class Tipo_usuario {
    int idTipoUsuario
    String nombre
    String descripcion

    static belongsTo = [usuario: Usuario];
    
    static constraints = {
        idTipoUsuario nullable:false
        
        nombre blank:false
        descripcion blank:false
    }
}
