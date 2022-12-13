package com.example.rss_aggregator.domain

class SaveRssUseCase(val repository: SourceRssRepository) {

    fun execute(name: String, urlRss: String){
        repository.saveSourceRss(name, urlRss)
    }
}