package com.example.quah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DiscussionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dicussion)
    }

    fun disctoprofile(view: View) {
        var intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent);
    }
    fun disctoquiz(view: View) {
        var intent = Intent(this,QuizActivity::class.java)
        startActivity(intent);
    }
    fun disctobooks(view: View) {
        var intent = Intent(this,BooksActivity::class.java)
        startActivity(intent);
    }
    fun disctohome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent);
    }
    fun toNew(view: View) {
        var intent = Intent(this,NewtopicActivity::class.java)
        startActivity(intent);
    }
}