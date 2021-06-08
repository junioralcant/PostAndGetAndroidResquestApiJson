package com.example.userpostapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userpostapi.http.HttpHelper
import org.jetbrains.anko.doAsync

class ListUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)

        doAsync {
            val htttp = HttpHelper()
            val teste = htttp.get()

            println("TESTE ==========> ${teste}")
        }
    }
}