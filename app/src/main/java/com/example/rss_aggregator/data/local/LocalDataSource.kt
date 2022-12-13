package com.example.rss_aggregator.data.local

interface LocalDataSource {
    fun create(name: String, url: String)
}