package me.watcharin.dictionary.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Menu (
            @Id var id: String? = null,
            var name: String? = ""
    )