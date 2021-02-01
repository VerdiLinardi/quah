package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun profiletologin(view: View) {
        var intent = Intent(this,LoginActivity::class.java)
        startActivity(intent);
    }
    fun profiletodiscussion(view: View) {
        var intent = Intent(this,DiscussionActivity::class.java)
        startActivity(intent);
    }
    fun profiletobooks(view: View) {
        var intent = Intent(this,BooksActivity::class.java)
        startActivity(intent);
    }
    fun profiletoquiz(view: View) {
        var intent = Intent(this,QuizActivity::class.java)
        startActivity(intent);
    }
    fun profiletohome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent);
    }
}