package me.watcharin.dictionary.controllers

import com.fasterxml.jackson.databind.util.BeanUtil
import me.watcharin.dictionary.models.Accounting
import me.watcharin.dictionary.models.Category
import me.watcharin.dictionary.services.*
import org.springframework.beans.BeanUtils
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/categories")
class CategoryController(val accountingService: AccountingService) {
    @PostMapping()
    fun create(@RequestBody category: Category): ResponseEntity<Any> {
        try{
            var accounting = Accounting()
            BeanUtils.copyProperties(category, accounting)
            return ResponseEntity.ok(accountingService.save(accounting))
        }catch(ex: Exception){
            throw ex
        }
    }

    @GetMapping()
    fun getAll(): ResponseEntity<Any> {
        try{
            return ResponseEntity.ok(accountingService.findAll())
        }catch(ex: Exception){
            throw ex
        }
    }
}