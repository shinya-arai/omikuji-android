package jp.wings.nikkeibp.omikuji

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.fortune.*
import kotlinx.android.synthetic.main.omikuji.*

class OmikujiActivity : AppCompatActivity() {

    var omikujiShelf = Array<OmikujiParts>(20){ OmikujiParts(R.drawable.homepage, R.string.contents1) }
    var omikujiNumber = -1

    val omikujiBox = OmikujiBox()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)

        omikujiBox.omikujiView = imageView

        omikujiShelf[0].drawID = R.drawable.snoopy
        omikujiShelf[0].fortuneID = R.string.contents2

        omikujiShelf[1].drawID = R.drawable.ic_launcher_background
        omikujiShelf[1].fortuneID = R.string.contents9

        omikujiShelf[2].fortuneID = R.string.contents3
        omikujiShelf[3].fortuneID = R.string.contents4
        omikujiShelf[4].fortuneID = R.string.contents5
        omikujiShelf[5].fortuneID = R.string.contents6

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val toast = Toast.makeText(this, item?.title, Toast.LENGTH_LONG)
        toast.show()

        return super.onOptionsItemSelected(item)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if(event?.action === MotionEvent.ACTION_DOWN) {
            if(omikujiNumber < 0 && omikujiBox.finish) {
                drawResult()
            }
        }
        return super.onTouchEvent(event)
    }

    fun onButtonClick(v: View) {
        omikujiBox.shake()

    }

    private fun drawResult() {
        omikujiNumber = omikujiBox.number

        val op = omikujiShelf[omikujiNumber]

        setContentView(R.layout.fortune)

        imageView2.setImageResource(op.drawID)
        textView.setText(op.fortuneID)
    }

}
