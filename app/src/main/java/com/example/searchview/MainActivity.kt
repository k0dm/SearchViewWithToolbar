package com.example.searchview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val materialToolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
//        val searchView = materialToolbar.menu.findItem(R.id.action_search).actionView as SearchView
//        searchView.queryHint = getString(R.string.search)
//        materialToolbar.setOnMenuItemClickListener {
//
//            val searchView: SearchView = it.actionView as SearchView
//            //searchView.queryHint = " lot"
//            true
//        }
    }


}