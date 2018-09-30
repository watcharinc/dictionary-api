package me.watcharin.dictionary.services

import me.watcharin.dictionary.models.Category
import me.watcharin.dictionary.repositories.AccountingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface ICategoryService{
    fun findAll() : Category
}

@Service
@Transactional
class CategoryService(val accountingRepository: AccountingRepository) : ICategoryService{
    override fun findAll(): Category {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}