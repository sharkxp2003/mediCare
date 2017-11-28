package medicareapp

class Respuesta {

    String nombre
    Date f_creacion
    Date f_mod


    static belongsTo = [tipo: Tipo_respuesta, pregunta : Pregunta]

    static constraints = {

        pregunta nullable:false
        tipo nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
    }
}
