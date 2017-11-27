package medicareapp

class Respuesta {
    int idRespuesta
    String nombre
    Date f_creacion
    Date f_mod
    int pregunta
    int tipo

    static belongsTo = [tipo: Tipo_respuesta, pregunta : Pregunta]

    static constraints = {
        idRespuesta nullable:false
        pregunta nullable:false
        tipo nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
    }
}
