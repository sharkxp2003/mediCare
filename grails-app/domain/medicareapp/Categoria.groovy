package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json'])
class Categoria {
    int idCategoria
    String nombre
    Date f_creacion
    Date f_mod



    static belongsTo =[encuesta: Encuesta]
    static hasMany = [pregunta: Pregunta]

    static constraints = {
        
        idCategoria nullable:false
        encuesta nullable:false
        
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
        
    }
}
