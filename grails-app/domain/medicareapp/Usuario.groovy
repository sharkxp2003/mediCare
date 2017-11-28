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


    static  belongsTo = [tipo_Usuario: Tipo_usuario];
    static  hasMany = [encuesta: Encuesta];

    static constraints = {
        

        nss nullable:false
        ine nullable:false
        username nullable:false

        /*
        nombre blank:false
        apellido1 blank:false
        apellido2 blank:false
        password blank:false
        email blank:false
        f_nacimiento blank:false
        f_creacion blank:false
        f_mod blank:false
        */
    }
}
