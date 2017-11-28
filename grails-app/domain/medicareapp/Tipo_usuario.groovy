package medicareapp

class Tipo_usuario {

    String nombre
    String descripcion

    static hasMany = [usuario: Usuario];
    
    static constraints = {

        
        nombre nullable:true
        descripcion nullable:true
    }
}
