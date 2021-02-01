package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
    }

    fun bookstoprofile(view: View) {
        var intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent);
    }
    fun bookstoquiz(view: View) {
        var intent = Intent(this,QuizActivity::class.java)
        startActivity(intent);
    }
    fun bookstodiscussion(view: View) {
        var intent = Intent(this,DiscussionActivity::class.java)
        startActivity(intent);
    }
    fun bookstohome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent);
    }
}