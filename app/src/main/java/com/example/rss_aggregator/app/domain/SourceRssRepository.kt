package com.example.rss_aggregator.app.domain

interface SourceRssRepository {

    fun saveRss(name: String, urlRss: String)
}