package Categoria


import grails.rest.*
import grails.converters.*
import medicareapp.Categoria



class CategoriaController extends  RestfulController{
	static responseFormats = ['json']
    CategoriaController(){
        super(Categoria)
    }

}
