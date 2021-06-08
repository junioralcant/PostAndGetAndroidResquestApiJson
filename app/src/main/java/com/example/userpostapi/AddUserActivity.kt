package com.example.userpostapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.userpostapi.http.HttpHelper
import com.example.userpostapi.model.User
import com.google.gson.Gson
import org.jetbrains.anko.doAsync

class AddUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        val buttonAddUser = findViewById<Button>(R.id.button_add_user)
        val name = findViewById<EditText>(R.id.edit_text_name)
        val cpf = findViewById<EditText>(R.id.edit_text_cpf)

        buttonAddUser.setOnClickListener {
            var user = User()
            user.name = name.text.toString()
            user.cpf = cpf.text.toString()

            val gson = Gson()
            val userJson = gson.toJson(user)


           doAsync {
               val http = HttpHelper()
               http.post(userJson)
           }


            name.setText("")
            cpf.setText("")
        }

    }
}