package medicareapp.bootstrap
import medicareapp.*

class BootStrap {

    def init = { servletContext ->


        def mydate = new Date(System.currentTimeMillis())

        //new Tipo_usuario(nombre:"Administrador",descripcion: "Descr",version: 0).save(failOnError:true)
        def tu1 = new Tipo_usuario(nombre:"Administrador",descripcion: "Descripcion de Administrador").save(failOnError:true)
        def tu2 = new Tipo_usuario(nombre:"Encuestador",descripcion: "Descripcion de Encuestador").save(failOnError:true)
        def tu3 = new Tipo_usuario(nombre:"Cliente",descripcion: "Descripcion de cliente").save(failOnError:true)


        def u1 = new Usuario(nss: "123123123",ine:"1231304",nombre: "Alejandro", apellido1: "Cortizo", apellido2: "Franza", username: "alexCortizo", password: "Abc123..", email: "alex.cortizo.franza@gmail.com", f_creacion: mydate, f_nacimiento: mydate, f_mod: mydate, tipo_Usuario: tu1).save(failOnError:true)
        def u2 = new Usuario(nss: "280439220",ine: "123203",nombre: "Alberto", apellido1: "Pérez", apellido2: "Gómez", username: "aPerezGom", password: "Ab123..",email:"aleberto.perez@gmail.com",f_creacion: mydate, f_nacimiento: mydate, f_mod: mydate, tipo_Usuario: tu2).save(failOnError:true)
        def u3 = new Usuario(nss: "280285220",ine: "123822",nombre: "Juan", apellido1: "Gómez", apellido2: "Pérez", username: "jPerezG", password: "Ab123..",email:"juan.perez@gmail.com",f_creacion: mydate, f_nacimiento: mydate, f_mod: mydate, tipo_Usuario: tu3).save(failOnError:true)

        def en1 = new Encuesta(uuid: "2312923", nombre: "Encuesta1",f_creacion: mydate,f_mod: mydate, usuario: u2).save(failOnError:true)
        def en2 = new Encuesta(uuid: "2332212", nombre: "Encuesta2",f_creacion: mydate,f_mod: mydate, usuario: u2).save(failOnError:true)

    }
    def destroy = {
    }
}
