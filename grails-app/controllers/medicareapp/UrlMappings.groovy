package medicareapp

class UrlMappings {

    static mappings = {

        "/"(controller: 'application', action:'index')

        "/tipousuario"(resources:"Tipo_usuario")

        "/usuario"(resources: 'Usuario') {
            "/encuesta"(controller: 'Encuesta', action: 'getEncuestaByUsuario', method: 'GET')
            "/encuesta"(controller: 'Encuesta', action: 'setEncuestaByUsuario', method: 'POST')

        }
        "/usuario/username/$username"(controller: 'Usuario', action: 'getByUsername', method: 'GET')

        "/encuesta/nombre/$nombre"(controller: 'Encuesta', action: 'getEncuestaByNombre', method: 'GET')

        "/encuesta"(resources:"Encuesta") {
            "/categoria"(controller: 'Categoria', action: 'getCategoriasByEncuesta', method: 'GET')
            "/categoria"(controller: 'Categoria', action: 'setCategoriaByEncuesta', method: 'POST')
        }
        "/categoria"(resources: "Categoria") {
            "/pregunta"(controller: 'Pregunta', action: 'getPreguntaByCategoria', method: 'GET')
            "/pregunta"(controller: 'Pregunta', action: 'setPreguntaByCategoria', method: 'POST')
        }
        "/pregunta"(resources:"Pregunta") {
            "/respuesta"(controller: 'Respuesta', action: 'getRespuestaByPregunta', method: 'GET')
            "/respuesta"(controller: 'Respuesta', action: 'setRespuestaByPregunta', method: 'POST')
        }
        "/respuesta"(resources:"Respuesta") {
            "/tipoRespuesta"(controller: 'Tipo_respuesta', action: 'getTiporespuestaByRespuesta', method: 'GET')
            "/tipoRespuesta"(controller: 'Tipo_respuesta', action: 'setTiporespuestaByRespuesta', method: 'POST')
        }
        "/tipoRespuesta"(resources:"Tipo_respuesta")



        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
