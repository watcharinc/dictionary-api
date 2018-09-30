package me.watcharin.dictionary.services

import me.watcharin.dictionary.models.Accounting
import me.watcharin.dictionary.repositories.AccountingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface IAccounting{
    fun findAll() : Iterable<Accounting>
    fun save(accounting: Accounting) : Accounting
    fun findById(id: String) : Accounting
}

@Service
@Transactional
class AccountingService(val repository: AccountingRepository) : IAccounting {
    override fun save(accounting: Accounting) = repository.save(accounting)
    override fun findAll() = repository.findAll()
    override fun findById(id: String) = repository.findById(id).get()
}