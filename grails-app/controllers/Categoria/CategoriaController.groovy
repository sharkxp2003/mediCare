package Categoria


import grails.rest.*
import grails.converters.*
import medicareapp.Categoria
import medicareapp.Encuesta



class CategoriaController extends  RestfulController{
	static responseFormats = ['json']
    CategoriaController(){
        super(Categoria)
    }



    def getCategoriasByEncuesta () {
        println getParams()
        def encuesta = Encuesta.get(params.EncuestaId)
        def categorias = encuesta ? Categoria.findAllByEncuesta(encuesta) : []
        respond categorias
    }



    def setCategoriaByEncuesta() {
        def encuesta = Encuesta.get(params.EncuestaId)
        def jsonObj =  request.JSON
        jsonObj << [encuesta:encuesta,f_creacion: new Date()]
        Categoria cat
        try {
            cat = new Categoria(jsonObj).save()
        } catch (Exception e) {
            println e.toString()
        }
        println jsonObj.toString()
        respond cat ,view:'show'

    }

}
