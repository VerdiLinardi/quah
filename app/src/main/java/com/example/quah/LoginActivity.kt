package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_signup.setOnClickListener(){
            var intent = Intent(this,HomeActivity::class.java)
            startActivity(intent);
        }
        textsignup.setOnClickListener(){
            var intent = Intent(this,SignupActivity::class.java)
            startActivity(intent);
        }
    }
}