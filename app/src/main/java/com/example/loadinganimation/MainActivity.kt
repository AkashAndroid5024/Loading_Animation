package com.example.loadinganimation


import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.DoubleBounce
import com.github.ybq.android.spinkit.style.WanderingCubes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar = findViewById<View>(R.id.spin_kit) as ProgressBar
        val wanderingCubes: Sprite = WanderingCubes()
        progressBar.indeterminateDrawable = wanderingCubes
    }
}