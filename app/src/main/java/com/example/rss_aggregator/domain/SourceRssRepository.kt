package com.example.rss_aggregator.domain

interface SourceRssRepository {

    fun createRss(name: String, urlRss: String)
}