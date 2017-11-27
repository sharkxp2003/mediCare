package medicareapp

class Encuesta {
    int idEncuesta
    String uuid
    String nombre
    Date f_creacion
    Date f_mod
    int usuario

    static belongsTo = [usuario: Usuario];

    
    static constraints = {
        idEncuesta nullable:false
        usuario nullable:false
        
        uuid blank:false
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
        
        
    }
}
