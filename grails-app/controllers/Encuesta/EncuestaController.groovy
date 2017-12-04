package Encuesta


import grails.rest.*
import medicareapp.Categoria
import medicareapp.Encuesta
import medicareapp.Pregunta
import medicareapp.Respuesta
import medicareapp.Usuario

import java.text.SimpleDateFormat


class EncuestaController extends RestfulController{
    static responseFormats = ['json']
    EncuestaController() {
        super(Encuesta)
    }



    def getEncuestaByUsuario () {
        println getParams()
        def usuario = Usuario.get(params.UsuarioId)
        def encuestas =  usuario ? Encuesta.findAllByUsuario(usuario) : []
        respond encuestas

    }

    def setEncuestaByUsuario() {
        def usuario = Usuario.get(params.UsuarioId)
        def jsonObj =  request.JSON



        //println jsonObj
        jsonObj << [usuario:usuario,f_creacion: new Date(),uuid: UUID.randomUUID()]
        Encuesta en
        try {

            en = new Encuesta(jsonObj).save()

        } catch (Exception e) {
            println e.toString()
        }

        def vectorCategorias =  jsonObj["categorias"]
        //println vectorCategorias
        for (elemento in vectorCategorias) {
            def nombreCategoria = elemento["nombre"]

            def cat = new Categoria(nombre: nombreCategoria,f_creacion: new Date(),f_mod: null).save()
            def preguntas = elemento["preguntas"]
            for (pregunta in preguntas) {
                def nombrePregunta = pregunta["nombre"]
                def preg = new Pregunta(nombre: nombrePregunta,f_creacion: new Date(),f_mod: null).save()
                def vectorRespuestas = pregunta["respuestas"]
                for (respuesta in vectorRespuestas) {
                    def res = new Respuesta(nombre:respuesta["texto"],f_creacion: new Date(),f_mod: null,tipo_respuesta: respuesta["tipo_respuesta"]).save(failOnError: true)
                    println respuesta["tipo_respuesta"].toString()
                    preg.addToRespuesta(res).save(flush:true)
                }
                cat.addToPregunta(preg).save(flush:true)
            }


            en.addToCategoria(cat).save(flush:true)
        }



        //println jsonObj.toString()
        respond en ,view:'show'
    }





}

