package Categoria


import grails.rest.*
import grails.converters.*
import medicareapp.Categoria



class CategoriaController {
	static responseFormats = ['json']
    CategoriaController(){
        super(Categoria)
    }

}
