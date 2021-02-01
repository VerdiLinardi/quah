package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    }

    fun quiztoprofile(view: View) {
        var intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent);
    }
    fun quiztodisc(view: View) {
        var intent = Intent(this,DiscussionActivity::class.java)
        startActivity(intent);
    }
    fun quiztohome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent);
    }
    fun quiztobooks(view: View) {
        var intent = Intent(this,BooksActivity::class.java)
        startActivity(intent);
    }
}