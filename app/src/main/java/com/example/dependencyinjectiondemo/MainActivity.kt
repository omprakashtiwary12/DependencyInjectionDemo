package com.example.dependencyinjectiondemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    private lateinit var mainContainer:ConstraintLayout
    private lateinit var linearLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainContainer = findViewById(R.id.parent)

        val parent = LinearLayout(this)
        parent.layoutParams =
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        parent.orientation = LinearLayout.HORIZONTAL
        val iv = ImageView(this)

        val layout2 = LinearLayout(this)

        layout2.layoutParams =
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        layout2.orientation = LinearLayout.VERTICAL

        parent.addView(iv)
        parent.addView(layout2)

        val tv1 = TextView(this)

        tv1.setText("Text1")
        tv1.setTextSize(21f)
        tv1.setTextColor(Color.BLACK)
        val tv2 = TextView(this)
        tv2.setText("Text2")
        tv2.setTextColor(Color.BLACK)
        val tv3 = TextView(this)
        tv3.setText("Text3")
        tv3.setTextColor(Color.BLACK)
        val tv4 = TextView(this)
        tv4.setText("Text4")
        tv4.setTextColor(Color.BLACK)

        layout2.addView(tv1)
        layout2.addView(tv2)
        layout2.addView(tv3)
        layout2.addView(tv4)

        mainContainer.addView(parent)

        // I am ready for publishing some new version
        println("This is the second commit")


    }
}