package medicareapp

class Tipo_respuesta {
    int idTipoRespuesta
    String nombre
    String descripcion

    static hasMany = [respuesta:Respuesta]

    static constraints = {
        idTipoRespuesta nullable:false
        
        nombre blank:false
        descripcion blank:false
       
    }
}
