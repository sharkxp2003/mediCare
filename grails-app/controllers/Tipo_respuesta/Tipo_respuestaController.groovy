package Tipo_respuesta


import grails.rest.*
import grails.converters.*
import medicareapp.Tipo_respuesta

class Tipo_respuestaController extends RestfulController {
	static responseFormats = ['json', 'xml']
	Tipo_respuestaController() {
        super(Tipo_respuesta)
    }


}
