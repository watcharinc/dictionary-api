package me.watcharin.dictionary.repositories

import me.watcharin.dictionary.models.Menu
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.transaction.annotation.Transactional

@Transactional
interface MenuRepository : MongoRepository<Menu, String>{
    fun findByNameLikeIgnoreCase(name: String): Iterable<Menu>
}