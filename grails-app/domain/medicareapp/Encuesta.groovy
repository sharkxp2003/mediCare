package medicareapp
import grails.rest.*

@Resource(readOnly = false, formats = ['json'])

class Encuesta {


    String uuid
    String nombre
    Date f_creacion
    Date f_mod

    static hasMany = [categoria: Categoria]
    static belongsTo = [usuario: Usuario]

    
    static constraints = {

        usuario nullable:false
        
        uuid nullable:true
        nombre nullable:true
        f_creacion nullable:true
        f_mod nullable:true
        
        
    }
}
