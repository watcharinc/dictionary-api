package me.watcharin.dictionary.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Accounting(
        @Id var id: String? = null,
        var vocabulary: String = "",
        var read: String = "",
        var translation: String = "",
        var sound: String = ""
)