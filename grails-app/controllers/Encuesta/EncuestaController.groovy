package Encuesta


import grails.rest.*
import medicareapp.Encuesta



class EncuestaController extends RestfulController{
    static responseFormats = ['json']
    EncuestaController() {
        super(Encuesta)
    }
}

