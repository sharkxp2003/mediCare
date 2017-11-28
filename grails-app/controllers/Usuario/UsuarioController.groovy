package Usuario


import grails.rest.*
import grails.converters.*
import medicareapp.Usuario

class UsuarioController {
	static responseFormats = ['json', 'xml']
	UsuarioController() {
        super(Usuario)
    }
    def index() { }
}
