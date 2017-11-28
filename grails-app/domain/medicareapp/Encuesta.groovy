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
        
        uuid blank:false
        nombre blank:false
        f_creacion blank:false
        f_mod blank:false
        
        
    }
}
