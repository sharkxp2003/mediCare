package medicareapp
import grails.rest.*

@Resource(readOnly = false, formats = ['json'])

class Categoria {

    String nombre
    Date f_creacion
    Date f_mod




    static belongsTo =[encuesta: Encuesta]
    static hasMany = [pregunta: Pregunta]

    static constraints = {
        

        encuesta nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
        
    }
}
