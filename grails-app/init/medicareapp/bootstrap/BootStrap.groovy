package medicareapp.bootStrap

import medicareapp.Categoria
import medicareapp.Encuesta
import medicareapp.Pregunta
import medicareapp.Tipo_respuesta
import medicareapp.Tipo_usuario
import medicareapp.Usuario

class BootStrap {

    def init = { servletContext ->
        def tu1 = new Tipo_usuario(nombre: "Administrador", descripcion: "").save()
        def tu2 = new Tipo_usuario(nombre: "Encuestador", descripcion: "").save()
        def tu3 = new Tipo_usuario(nombre: "Cliente", descripcion: "").save()

        def u1 = new Usuario(nss: "123123123", ine: "12313", nombre: "Alejandro", apellido1: "Cortizo", apellido2: "Franza", username: "alexCortizo", password: "Abc123..", email: "alex.cortizo.franza@gmail.com", f_creacion: null, f_nacimiento: null, f_mod: null).save()
        def u2 = new Usuario(nss: "12312312", ine: "123123", nombre: "Usuario2", apellido2: "apellido2", apellido1: "apellido1", username: "username1", password: "Abc123..", email: "asdasd", f_creacion: new Date(), f_mod: new Date(), f_nacimiento: new Date()).save()

        def cat1 = new Categoria(nombre: "categoria1", f_creacion: new Date(), f_mod: null).save()
        def cat2 = new Categoria(nombre: "categoria2", f_creacion: new Date(), f_mod: null).save()
        def cat3 = new Categoria(nombre: "categoria1", f_creacion: new Date(), f_mod: null).save()

        def en1 = new Encuesta(uuid: "123ada", nombre: "Encuesta1",f_creacion: new Date(), f_mod: null,usuario:u1).save();
        def en2 = new Encuesta(uuid: "123422", nombre: "Encuesta2",f_creacion: new Date(), f_mod: null, usuario:u2).save();

        def pr1 = new Pregunta(nombre: "Pregunta1", f_creacion: new Date(), f_mod: new Date()).save()
        def pr2 = new Pregunta(nombre: "Pregunta2", f_creacion: new Date(), f_mod: new Date()).save()
        def pr3 = new Pregunta(nombre: "Pregunta3", f_creacion: new Date(), f_mod: new Date()).save()
        def pr4 = new Pregunta(nombre: "Pregunta1", f_creacion: new Date(), f_mod: new Date()).save()
        def pr5 = new Pregunta(nombre: "Pregunta2", f_creacion: new Date(), f_mod: new Date()).save()

        en1.addToCategoria(cat1)
        en1.addToCategoria(cat2)
        en2.addToCategoria(cat3)

        cat1.addToPregunta(pr1)

        cat1.addToPregunta(pr2)
        cat1.addToPregunta(pr3)

        cat2.addToPregunta(pr4)
        cat2.addToPregunta(pr5)


        def tr1 = new Tipo_respuesta(nombre: "Opción múltiple",descripcion: "De varias opciones, se pueden escoger varias opciones.").save()
        def tr2 = new Tipo_respuesta(nombre: "Opción múltiple única",descripcion: "De varias opciones, solo se escoge una.").save()






        //u1.addToEncuesta(en1)
        //u2.addToEncuesta(en2)

    }
    def destroy = {
    }
}