package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])
class Respuesta {

    String nombre
    Date f_creacion
    Date f_mod


    static belongsTo = [tipo: Tipo_respuesta, pregunta : Pregunta]

    static constraints = {

        pregunta nullable:false
        tipo nullable:false
        
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
    }
}
