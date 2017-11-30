package medicareapp

class UrlMappings {

    static mappings = {

        "/"(controller: 'application', action:'index')

        "/usuario"(resources: 'Usuario') {
            "/encuesta"(resources: "Encuesta") {
                "/categoria"(resources: "Categoria") {
                    "/pregunta"(resources: "Pregunta") {
                        "/respuesta"(resources: "Respuesta") {
                            "/tiporespuesta"(resource: "Tipo_respuesta")
                        }
                    }
                }
            }
        }



        "/categoria"(resource: "Categoria") {
            "/pregunta"(resource: "Pregunta.Pregunta") {
                "/respuesta"(resource: "Respuesta.Respuesta") {
                    "/tiporespuesta"(resource: "Tipo_respuesta.Tipo_respuesta")
                }
            }
        }

        "/encuesta"(resources:"Encuesta") {
            "/categoria"(resource: "Categoria.Categoria") {
                "/pregunta"(resource: "Pregunta.Pregunta") {
                    "/respuesta"(resource: "Respuesta.Respuesta")
                }
            }
        }


        "/pregunta"(resources:"Pregunta") {
            "/respuesta"(resources:"Respuesta.Respuesta") {
                "/tiporespuesta"(resource: "Tipo_respuesta.Tipo_respuesta")
            }
        }

        "/respuesta"(resources:"Respuesta")
        "/tipoRespuesta"(resources:"Tipo_respuesta.Tipo_respuesta")

        "/tipousuario"(resources:"Tipo_usuario") {
            "/usuario"(resources: "Usuario.Usuario")
        }






        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
