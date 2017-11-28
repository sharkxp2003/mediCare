package Pregunta


import grails.rest.*
import grails.converters.*
import medicareapp.Pregunta

class PreguntaController extends RestfulController{
	static responseFormats = ['json']
    PreguntaController(){
        super(Pregunta)
    }

}
