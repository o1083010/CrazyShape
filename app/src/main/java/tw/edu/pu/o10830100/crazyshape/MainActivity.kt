package tw.edu.pu.o10830100.crazyshape

import android.content.Intent
import android.os.Build.VERSION_CODES.N
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
import java.util.stream.DoubleStream.generate


@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class MainActivity : AppCompatActivity() {

    var X: Int = (1..N).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shape =
            intArrayOf(R.drawable.circle, R.drawable.square, R.drawable.star, R.drawable.triangle)
        val i: Int = (1..N).random()
        imgNext.setImageResource(shape[i])

        Toast.makeText(this, "作者:王琪雯", Toast.LENGTH_LONG).show()

        val img: ImageView = findViewById(R.id.imgTitle)

        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(img)


        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {

                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
                recreate()

                return true
            }
        })



        imgNext.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val shape =
                    intArrayOf(R.drawable.circle, R.drawable.square, R.drawable.star, R.drawable.triangle)
                val i: Int = (0..3).random()
                imgNext.setImageResource(shape[i])
                imgNext.setImageResource(shape[i])

                recreate()


            }
        })
    }
}