package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])
class Tipo_respuesta {

    String nombre
    String descripcion

    static hasMany = [respuesta:Respuesta]

    static constraints = {

        
        nombre nullable:true
        descripcion nullable:true
       
    }
}
