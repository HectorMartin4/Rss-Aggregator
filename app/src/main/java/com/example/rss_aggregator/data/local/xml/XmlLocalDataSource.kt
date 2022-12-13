package com.example.rss_aggregator.data.local.xml

import android.content.SharedPreferences
import com.example.rss_aggregator.data.local.LocalDataSource

class XmlLocalDataSource(sharedPreferences: SharedPreferences) : LocalDataSource
{
    private val edit = sharedPreferences.edit()

    override fun create(name: String, url: String) {
        edit.putString(name, url)
        edit.apply()
    }
}