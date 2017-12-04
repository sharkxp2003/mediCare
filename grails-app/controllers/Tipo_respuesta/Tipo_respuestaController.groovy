package Tipo_respuesta


import grails.rest.*
import grails.converters.*
import medicareapp.Respuesta
import medicareapp.Tipo_respuesta

class Tipo_respuestaController extends RestfulController {
	static responseFormats = ['json', 'xml']
	Tipo_respuestaController() {
        super(Tipo_respuesta)
    }


    def getTiporespuestaByRespuesta () {
        println getParams()
        def respuesta = Respuesta.get(params.CategoriaId)
        def tiporespuesta = respuesta ? Respuesta.findAllByRespuesta(categoria) : []
        respond tiporespuesta, view:'index'
    }

    def setTiporespuestaByRespuesta() {
        def respuesta = Respuesta.get(params.EncuestaId)
        def jsonObj =  request.JSON
        jsonObj << [respuesta:respuesta,f_creacion: new Date()]
        Tipo_respuesta tr
        try {
            tr = new Tipo_respuesta(jsonObj).save()
        } catch (Exception e) {
            println e.toString()
        }
        println jsonObj.toString()
        respond tr,view:'show'

    }
}
