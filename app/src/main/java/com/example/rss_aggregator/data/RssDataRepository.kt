package com.example.rss_aggregator.data

import com.example.rss_aggregator.data.local.xml.XmlLocalDataSource
import com.example.rss_aggregator.domain.SourceRssRepository

class RssDataRepository(private val localSource: XmlLocalDataSource) :SourceRssRepository{

    override fun createRss(name: String, urlRss: String) =
        localSource.create(name,urlRss)
}