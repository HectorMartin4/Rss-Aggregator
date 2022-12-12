package com.example.rss_aggregator.app.domain

interface SourceRssRepository {

    fun saveSourceRss(name: String, urlRss: String)
}