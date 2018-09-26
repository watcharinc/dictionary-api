package me.watcharin.dictionary.services

import me.watcharin.dictionary.repositories.MenuRepository
import me.watcharin.dictionary.models.Menu
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service()
@Transactional
class MenuService(val repository: MenuRepository) {
    fun save(menu: Menu) = repository.save(menu)
    fun findAll() = repository.findAll()
    fun findById(id: String) = repository.findById(id)
    fun findByName(name: String) = repository.findByNameLikeIgnoreCase(name)
    fun update(menu: Menu) = repository.save(menu)
    fun delete(id: String) = repository.deleteById(id)
}