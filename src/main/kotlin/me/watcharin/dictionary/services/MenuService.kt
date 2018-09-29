package me.watcharin.dictionary.services

import me.watcharin.dictionary.repositories.MenuRepository
import me.watcharin.dictionary.models.Menu
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface IMenuService {
    fun save(menu: Menu) : Menu
    fun findAll() : Iterable<Menu>
    fun findById(id: String) : Menu
    fun findByName(name: String) : Iterable<Menu>
    fun update (menu: Menu) : Menu
    fun delete(id: String)
}

@Service()
@Transactional
class MenuService(val repository: MenuRepository) : IMenuService {
    override fun save(menu: Menu) = repository.save(menu)
    override fun findAll() = repository.findAll()
    override fun findById(id: String) = repository.findById(id).get()
    override fun findByName(name: String) = repository.findByNameLikeIgnoreCase(name)
    override fun update(menu: Menu) = repository.save(menu)
    override fun delete(id: String) = repository.deleteById(id)
}