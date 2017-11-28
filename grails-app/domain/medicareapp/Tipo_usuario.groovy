package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])
class Tipo_usuario {

    String nombre
    String descripcion

    static hasMany = [usuario: Usuario];
    
    static constraints = {

        
        nombre blank:false
        descripcion blank:false
    }
}
