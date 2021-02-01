package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun toQuiz(view: View) {
            var intent = Intent(this,QuizActivity::class.java)
            startActivity(intent);
        }

    fun toDiscussion(view: View) {
        var intent = Intent(this,DiscussionActivity::class.java)
        startActivity(intent);
    }

    fun toBooks(view: View) {
        var intent = Intent(this,BooksActivity::class.java)
        startActivity(intent);
    }

    fun toProfile(view: View) {
        var intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent);
    }
}

