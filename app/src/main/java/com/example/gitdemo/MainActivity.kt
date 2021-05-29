package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        number = savedInstanceState?.getInt("number") ?: 0
        setContentView(R.layout.activity_main)
        textView.text = "$number"
        add.setOnClickListener {
            number++
            textView.text = "$number"
        }
        sub.setOnClickListener {
            number--
            textView.text = "$number"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("number", number)
    }
}