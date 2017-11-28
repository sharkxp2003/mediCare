package Tipo_usuario

import Tipo_respuesta.Tipo_respuestaController
import grails.rest.*
import grails.converters.*
import medicareapp.Tipo_usuario

class Tipo_usuarioController {
	static responseFormats = ['json', 'xml']
	Tipo_usuarioController() {
        super(Tipo_usuario)
    }
    def index() { }
}
