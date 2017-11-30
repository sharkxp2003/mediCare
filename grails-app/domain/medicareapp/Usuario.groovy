package medicareapp

import grails.rest.Resource

@Resource(readOnly = false, formats = ['json', 'xml'])

class Usuario {

    String nss
    String ine
    String nombre
    String apellido1
    String apellido2
    String username
    String password
    String email
    Date f_nacimiento
    Date f_creacion
    Date f_mod


    static  hasMany = [encuesta: Encuesta]

    static constraints = {
        

        nss nullable:false
        ine nullable:false
        username nullable:false

        
        nombre nullable:true
        apellido1 nullable:true
        apellido2 nullable:true
        password nullable:true
        email nullable:true
        f_nacimiento nullable:true
        f_creacion nullable:true
        f_mod nullable:true
    }
}
