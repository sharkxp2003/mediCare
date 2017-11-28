package Encuesta

import grails.rest.*
import grails.converters.*
import medicareapp.Encuesta

class EncuestaController {
    static responseFormats = ['json']
    EncuestaController() {
        super(Encuesta)
    }
}

