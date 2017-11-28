package medicareapp
import grails.rest.*

@Resource(readOnly = false, formats = ['json'])

class Pregunta {

    String nombre
    String f_creacion
    String f_mod

    static belongsTo = [categoria: Categoria]
    static hasMany = [respuesta : Respuesta]
    
    static constraints = {

        categoria nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
    }
}
