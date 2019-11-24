package com.example.movieapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initui()
    }
    private fun initui(){
        signİnButton.setOnClickListener {
            val email = editText.text.toString()
            val password = editText2.text.toString()
        saveUser(email,password)
        navigateDetailActivity()}

    }
    private fun navigateDetailActivity(){
        val detailIntent = Intent(this,MovieDetailActivity::class.java)
        startActivity(detailIntent)
    }
    private fun saveUser(email: String, password: String){
        val preferences = getSharedPreferences("MovieApp", Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putString("email",email)
        editor.putString("password",password)
        editor.apply()

    }
}
