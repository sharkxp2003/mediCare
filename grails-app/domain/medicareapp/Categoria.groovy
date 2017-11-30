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
        

        encuesta nullable:true
        
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
        
    }
}
