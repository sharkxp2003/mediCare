package medicareapp.bootstrap
import medicareapp.*

class BootStrap {

    def init = { servletContext ->


        def mydate = new Date(System.currentTimeMillis())

        def tu1 = new Tipo_usuario(nombre:"Administrador",descripcion: "Descripcion de Administrador").save(failOnError:true)
        def tu2 = new Tipo_usuario(nombre:"Encuestador",descripcion: "Descripcion de Encuestador").save(failOnError:true)
        def tu3 = new Tipo_usuario(nombre:"Cliente",descripcion: "Descripcion de cliente").save(failOnError:true)
        def en1 = new Encuesta(nombre: "Encuesta1",uuid: "asdasd",f_creacion: mydate,f_mod: null)
        def u1 = new Usuario(
                nombre: "usuario1",
                nss: "1231231",
                ine: "123123as",
                apellido1: "apellido1",
                apellido2: "apellido2",
                username: "username1",
                password: "abc123..",
                email: "a@b",
                f_nacimiento: mydate,
                f_creacion: mydate,
                f_mod: null).save(failOnError :true);

        def u2 = new Usuario(
                nombre: "usuario2",
                nss: "asdasd12",
                ine: "adasd123",
                apellido1: "apellido1",
                apellido2: "apellido2",
                username: "username2",
                password: "abc123..",
                email: "c@b",
                f_nacimiento: mydate,
                f_creacion: mydate,
                f_mod: null).save(failOnError :true);

        tu1.addToUsuario(u1);
        tu1.addToUsuario(u2);

        u1.addToEncuesta(en1);





    }
    def destroy = {
    }
}
