package com.example.applicationone

import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.ViewGroup
import android.widget.ImageView
import androidx.palette.graphics.Palette
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picture.*
import java.io.File

class PictureActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        imageView = findViewById(R.id.image)

        Picasso.get()
            .load("https://goo.gl/32YN2B")
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .fit()
            .into(imageView)
    }
}


