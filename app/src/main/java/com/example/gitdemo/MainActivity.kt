package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var myViewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        textView.text = "${myViewModel.number}"
        add.setOnClickListener {
            myViewModel.number++
            textView.text = "${myViewModel.number}"
        }
        sub.setOnClickListener {
            myViewModel.number--
            textView.text = "${myViewModel.number}"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.reset) {
            myViewModel.number = 0
            textView.text = "${myViewModel.number}"
        }
        return super.onOptionsItemSelected(item)
    }
}