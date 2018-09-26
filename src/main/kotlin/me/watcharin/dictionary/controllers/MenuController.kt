package me.watcharin.dictionary.controllers

import me.watcharin.dictionary.services.MenuService
import me.watcharin.dictionary.models.Menu
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.CrossOrigin
import java.lang.Exception

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/menus")
class PlatformController(val menuService: MenuService) {

    @PostMapping()
    fun create(@RequestBody menu: Menu): Menu {
        try{
            return menuService.save(menu)
        }catch(ex: Exception){
            throw ex
        }
    }

    @PutMapping(value = "/{id}")
    fun update(@RequestBody menu: Menu, @PathVariable id: String): Menu {
        try{
            menu.id = id
            return menuService.update(menu)
        }catch(ex: Exception){
            throw ex
        }
    }

    @GetMapping()
    fun getAll(): Iterable<Menu> {
        try{
            return menuService.findAll()
        }catch(ex: Exception){
            throw ex
        }
    }

//    @GetMapping(value = "/{id}")
//    fun get(@PathVariable id: String): Menu{
//        try{
//            return menuService.findById(id)
//        }catch(ex: Exception){
//            throw ex
//        }
//    }
//
//    @DeleteMapping(value = "/{id}")
//    fun delete(@PathVariable id: String): Menu{
//        try{
//            return menuService.delete(id)
//        }catch(ex: Exception){
//            throw ex
//        }
//    }

    @GetMapping(value = "/findByName/{name}")
    fun getByName(@PathVariable name: String): Iterable<Menu> {
        try{
            return menuService.findByName(name)
        }catch(ex: Exception){
            throw ex
        }
    }
}