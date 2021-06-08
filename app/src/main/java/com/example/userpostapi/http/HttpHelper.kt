package com.example.userpostapi.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {

    fun post (json: String) : String {
        val URL =  "http://192.168.0.100:3001/users"

        val herderHttp = MediaType.parse("application/json; charset=utf-8")

        val client = OkHttpClient()

        val body = RequestBody.create(herderHttp, json)

        var request = Request.Builder().url(URL).post(body).build()

        val response = client.newCall(request).execute()

        return response.body().toString()
    }

    fun get() : String {
        val URL =  "http://192.168.0.100:3001/users"

        val client = OkHttpClient()

        var request = Request.Builder().url(URL).get().build()

        val response = client.newCall(request).execute()

        val data = response.body()

//        if(data != null) {
//            println("RESPOSTA ============= ${data.string()}")
//            return data.string()
//        }

       return data?.string().toString()
    }
}