package Usuario


import grails.rest.*
import medicareapp.Usuario

class UsuarioController extends RestfulController {
	static responseFormats = ['json', 'xml']
	UsuarioController() {
        super(Usuario)
    }

    def getByUsername () {
        Usuario user = Usuario.findByUsername(params.username)
        println params.username
        respond user ,view:'show'
    }

}
