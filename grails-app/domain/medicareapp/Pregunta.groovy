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

        categoria nullable:true
        
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
    }
}
