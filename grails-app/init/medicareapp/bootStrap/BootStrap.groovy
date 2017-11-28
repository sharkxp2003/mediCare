package medicareapp.bootStrap

import medicareapp.Tipo_usuario
import medicareapp.Usuario

class BootStrap {

    def init = { servletContext ->
        def tu1 = new Tipo_usuario(nombre: "Administrador", descripcion: "").save()
        def tu2 = new Tipo_usuario(nombre: "Encuestador", descripcion: "").save()
        def tu3 = new Tipo_usuario(nombre: "Cliente", descripcion: "").save()

        def u1 = new Usuario(nss: "123123123", ine: "12313", nombre: "Alejandro", apellido1: "Cortizo", apellido2: "Franza", username: "alexCortizo", password: "Abc123..", email: "alex.cortizo.franza@gmail.com", f_creacion: null, f_nacimiento: null, f_mod: null).save()


    }
    def destroy = {
    }
}