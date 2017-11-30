package Usuario


import grails.rest.*
import medicareapp.Usuario

class UsuarioController extends RestfulController {
	static responseFormats = ['json', 'xml']
	UsuarioController() {
        super(Usuario)
    }

}
