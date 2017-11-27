package medicareapp

class Pregunta {
    int idPregunta
    String nombre
    String f_creacion
    String f_mod
    int categoria

    static belongsTo = [categoria: Categoria]
    static hasMany = [respuesta : Respuesta]
    
    static constraints = {
        idPregunta nullable:false
        categoria nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
    }
}
