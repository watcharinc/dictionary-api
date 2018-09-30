package me.watcharin.dictionary.repositories

import me.watcharin.dictionary.models.Banking
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.transaction.annotation.Transactional

@Transactional
interface BankingRepository : MongoRepository<Banking, String>{

}