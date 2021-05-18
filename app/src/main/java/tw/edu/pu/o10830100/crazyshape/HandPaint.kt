package tw.edu.pu.o10830100.crazyshape

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.icu.lang.UCharacter.DecompositionType.SQUARE
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View


class HandPaint(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    val paint = Paint(Paint.ANTI_ALIAS_FLAG)  //畫筆(避免踞齒)
    var path : Path = Path() //繪圖軌跡


    init {
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE //描邊
        paint.strokeWidth = 20f  //設置畫筆寬度
        paint.strokeCap = Paint.Cap.ROUND //線帽(線條開始區域，筆觸端點)平滑
        paint.strokeJoin = Paint.Join.ROUND //連接處圓弧
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.BLACK)  //背景
        //canvas.drawRect(200f,200f,400f,600f,paint)

        //path.moveTo(500f,800f)
        //path.lineTo(500f,1200f)
        // path.lineTo(700f,1000f)
        canvas.drawPath(path, paint)

    }

    /*
    override fun onTouchEvent(event: MotionEvent): Boolean {
        var xPos = event.getX()
        var yPos = event.getY()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> path.moveTo(xPos, yPos)
            MotionEvent.ACTION_MOVE -> path.lineTo(xPos, yPos)
        }
        invalidate()
        return true
    }
*/

}