package tw.edu.pu.o10830100.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"作者:王琪雯",Toast.LENGTH_LONG).show()



        img.setOnLongClickListener (object: View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {

                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)

                return true
            }
        })

    }
}