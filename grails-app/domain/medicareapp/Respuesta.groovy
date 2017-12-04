package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])
class Respuesta {

    String nombre
    Date f_creacion
    Date f_mod
    Tipo_respuesta tipo_respuesta

    static belongsTo = [pregunta : Pregunta,tipo_respuesta:Tipo_respuesta]

    static constraints = {

        pregunta nullable:true
        tipo_respuesta nullable: true
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
    }
}
