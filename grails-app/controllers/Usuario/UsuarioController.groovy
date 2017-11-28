package Usuario


import grails.rest.*
import grails.converters.*

class UsuarioController {
	static responseFormats = ['json', 'xml']
	UsuarioController() {
        super(Usuario)
    }
    def index() { }
}
