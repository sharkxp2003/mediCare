package Pregunta


import grails.rest.*
import grails.converters.*
import medicareapp.Pregunta

class PreguntaController {
	static responseFormats = ['json']
    PreguntaController(){
        super(Pregunta)
    }

}
