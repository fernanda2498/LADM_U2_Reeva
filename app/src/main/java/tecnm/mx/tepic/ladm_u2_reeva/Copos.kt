package tecnm.mx.tepic.ladm_u2_reeva

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class Copos {
    var x = (0..1200).random().toFloat()
    var y = 0f
    var radio = (1..50).random().toFloat()
    var vel = 0f

    fun dibujarCopos (canvas: Canvas, pincel: Paint){
        pincel.color = Color.WHITE
        canvas.drawCircle(x,y,radio,pincel)
    }

    fun velocidadCopos(){
        if (radio < 10){
            vel = 1f
        }
        if (radio > 10 && radio < 20){
            vel = 2f
        }
        if (radio > 20 && radio < 30){
            vel = 3f
        }
        if (radio > 30 && radio < 40){
            vel = 4f
        }
        if (radio > 40 && radio <50){
            vel = 5f
        }
    }

    fun caerCopo(){
        y += vel
    }
}