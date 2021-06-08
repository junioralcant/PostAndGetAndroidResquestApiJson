package com.example.userpostapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenAddUser = findViewById<Button>(R.id.button_open_add_user)

        val buttonOpenListUser = findViewById<Button>(R.id.button_open_list_user)


        buttonOpenAddUser.setOnClickListener {
            val openAddUser = Intent(this, AddUserActivity::class.java)
            startActivity(openAddUser)
        }

        buttonOpenListUser.setOnClickListener {
            val openListUser = Intent(this, ListUser::class.java)
            startActivity(openListUser)
        }
    }
}