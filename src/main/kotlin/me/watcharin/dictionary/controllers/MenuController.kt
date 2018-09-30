package me.watcharin.dictionary.controllers

import me.watcharin.dictionary.services.MenuService
import me.watcharin.dictionary.models.Menu
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.CrossOrigin
import java.lang.Exception

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/menus")
class MenuController(val menuService: MenuService) {

    @PostMapping()
    fun create(@RequestBody menu: Menu): ResponseEntity<Any> {
        try{
            return ok(menuService.save(menu))
        }catch(ex: Exception){
            throw ex
        }
    }

    @PutMapping(value = "/{id}")
    fun update(@RequestBody menu: Menu, @PathVariable id: String): ResponseEntity<Any> {
        try{
            menu.id = id
            return ok(menuService.update(menu))
        }catch(ex: Exception){
            throw ex
        }
    }

    @GetMapping()
    fun getAll(): ResponseEntity<Any> {
        try{
            return ok(menuService.findAll())
        }catch(ex: Exception){
            throw ex
        }
    }

    @GetMapping(value = "/{id}")
    fun get(@PathVariable id: String): ResponseEntity<Any>{
        try{
            return ok(menuService.findById(id))
        }catch(ex: Exception){
            throw ex
        }
    }

    @DeleteMapping(value = "/{id}")
    fun delete(@PathVariable id: String) : ResponseEntity<Any> {
        try{
            return ok(menuService.delete(id))
        }catch(ex: Exception){
            throw ex
        }
    }

    @GetMapping(value = "/findByName/{name}")
    fun getByName(@PathVariable name: String): ResponseEntity<Any> {
        try{
            return ok(menuService.findByName(name))
        }catch(ex: Exception){
            throw ex
        }
    }
}