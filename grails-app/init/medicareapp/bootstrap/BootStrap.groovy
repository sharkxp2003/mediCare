package medicareapp.bootstrap
import medicareapp.*

class BootStrap {

    def init = { servletContext ->

        //new Tipo_usuario(nombre:"Administrador",descripcion: "Descr",version: 0).save(failOnError:true)
        def tu1 = new Tipo_usuario(nombre:"Administrador",descripcion: "Descripcion de Administrador").save(failOnError:true)
        def tu2 = new Tipo_usuario(nombre:"Encuestador",descripcion: "Descripcion de Encuestador").save(failOnError:true)
        def tu3 = new Tipo_usuario(nombre:"Cliente",descripcion: "Descripcion de cliente").save(failOnError:true)


        //def u1 = new Usuario(nss: "123123123",ine:"12313",nombre: "Alejandro", apellido1: "Cortizo", apellido2: "Franza", username: "alexCortizo", password: "Abc123..", email: "alex.cortizo.franza@gmail.com", f_creacion: null, f_nacimiento: null, f_mod: null, tipo_Usuario: tu1).save()





    }
    def destroy = {
    }
}
