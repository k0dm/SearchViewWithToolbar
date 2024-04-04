package com.example.searchview

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.MarginLayoutParamsCompat
import androidx.core.view.marginEnd
import com.google.android.material.appbar.CollapsingToolbarLayout

class CustomSearchView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : SearchView(context, attrs, defStyleAttr) {


    init {
        maxWidth = Integer.MAX_VALUE
        queryHint = context.getString(R.string.app_name)
        val closeButton = findViewById<ImageView>(androidx.appcompat.R.id.search_close_btn)
        closeButton.setImageResource(R.drawable.clear_24)

//        (getChildAt(0) as LinearLayout).addView(
//            LayoutInflater.from(context).inflate(R.layout.filter_button, this, false)
//        )
//            .addView(ImageButton(context).apply {
//            setImageResource(R.drawable.filter_24)
//            setBackgroundColor(0)
//            id =
//        })
//        val filterButton = findViewById<Image>()
    }
}