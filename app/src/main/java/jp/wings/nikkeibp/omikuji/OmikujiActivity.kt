package jp.wings.nikkeibp.omikuji

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.main.*
import kotlinx.android.synthetic.main.omikuji.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)

//        val rnd = Random()
//        val number = rnd.nextInt(20)
//
//        val omikujiShelf = Array<String>(20, {"吉"})
//        omikujiShelf[0] = "大吉"
//        omikujiShelf[19] = "凶"
//
//        var text = omikujiShelf[number]
//
//        hello_view.text = text

    }

    fun onButtonClick(v: View) {
//        imageView.setImageResource(R.drawable.homepage)
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100
        imageView.startAnimation(translate)
    }

}
