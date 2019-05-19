package jp.wings.nikkeibp.omikuji

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main.*
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
}
