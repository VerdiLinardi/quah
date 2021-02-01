package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewtopicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newtopic)
    }

    fun newtoquiz(view: View) {
        var intent = Intent(this,QuizActivity::class.java)
        startActivity(intent);
    }
    fun newtoprofile(view: View) {
        var intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent);
    }
    fun newtobooks(view: View) {
        var intent = Intent(this,BooksActivity::class.java)
        startActivity(intent);
    }
    fun newtohome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent);
    }
    fun newtodisc(view: View) {
        var intent = Intent(this,DiscussionActivity::class.java)
        startActivity(intent);
    }
}