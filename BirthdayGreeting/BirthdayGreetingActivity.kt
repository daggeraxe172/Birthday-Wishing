package com.tejasrafale1.BirthdayGreeting

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_birthday_greeting.*


class BirthdayGreetingActivity : AppCompatActivity() {

    private var imageView: ImageView? = null
    private var textView: TextView? = null
    private var button: Button? = null

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.birthdayGreetingLayout)
        val animationDrawable = constraintLayout .background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(3000)
        animationDrawable.start()

        val name = (intent.getStringExtra(NAME_EXTRA))?.uppercase()
        birthdayGreeting.text = "HAPPY BIRTHDAY \n$name"

        imageView = findViewById(R.id.`fun`)
        textView = findViewById(R.id.birthdayGreeting)
        button = findViewById(R.id.sharebtn)

    }

}