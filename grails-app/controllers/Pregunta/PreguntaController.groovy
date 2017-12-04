package Pregunta


import grails.rest.*
import grails.converters.*
import medicareapp.Pregunta
import medicareapp.Categoria

class PreguntaController extends RestfulController {
	static responseFormats = ['json']
    PreguntaController(){
        super(Pregunta)
    }


    def getPreguntaByCategoria () {
        println getParams()
        def categoria = Categoria.get(params.CategoriaId)
        def preguntas = categoria ? Pregunta.findAllByCategoria(categoria) : []
        respond preguntas
    }

    def setPreguntaByCategoria() {
        def categoria = Categoria.get(params.EncuestaId)
        def jsonObj =  request.JSON
        jsonObj << [categoria:categoria,f_creacion: new Date()]
        Pregunta pre
        try {
            pre = new Pregunta(jsonObj).save()
        } catch (Exception e) {
            println e.toString()
        }
        println jsonObj.toString()
        respond pre ,view:'show'

    }

}
