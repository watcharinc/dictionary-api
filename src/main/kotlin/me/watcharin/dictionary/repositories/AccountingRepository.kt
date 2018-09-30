package me.watcharin.dictionary.repositories

import me.watcharin.dictionary.models.Accounting
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.transaction.annotation.Transactional

@Transactional
interface AccountingRepository : MongoRepository<Accounting, String>{

}