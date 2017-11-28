package Encuesta


import grails.rest.*
import grails.converters.*
import medicareapp.Encuesta



class EncuestaController extends RestfulController{
    static responseFormats = ['json']
    EncuestaController() {
        super(Encuesta)
    }
}

