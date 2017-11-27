package medicareapp

class Categoria {
    int idCategoria
    String nombre
    Date f_creacion
    Date f_mod
    int encuesta

    static constraints = {
        
        idCategoria nullable:false
        encuesta nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
        
    }
}
