package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])
class Respuesta {

    String nombre
    Date f_creacion
    Date f_mod


    static belongsTo = [pregunta : Pregunta,tipo_respuesta:Tipo_respuesta]

    static constraints = {

        //pregunta nullable:false
        
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
    }
}
