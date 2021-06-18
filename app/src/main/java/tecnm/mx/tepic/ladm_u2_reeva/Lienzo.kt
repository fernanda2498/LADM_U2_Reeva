package mx.tecnm.tepic.ladm_u2_ejercicio3_canvas
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import tecnm.mx.tepic.ladm_u2_reeva.Copos
import tecnm.mx.tepic.ladm_u2_reeva.MainActivity


class Lienzo (p: MainActivity):View(p){
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        c.drawColor(Color.argb(255,46, 134, 193))

        /////////////////////Arbol///////////////////////////
        p.color = Color.argb(255,110, 44, 0 )
        c.drawRect(200f,1000f,290f,1300f,p)

        p.color = Color.argb(255,25, 111, 61)
        c.drawOval(140f,1100f,350f,810f,p)
        c.drawOval(140f,1000f,350f,700f,p)


        p.color = Color.argb(255,192, 57, 43 )
        c.drawRect(600f,1600f,1050f,1920f,p)

        p.color = Color.argb(255,135, 54, 0  )
        c.drawRect(600f,1600f,1050f,1700f,p)

        p.color = Color.argb(255,135, 54, 0  )
        c.drawRect(700f,1750f,800f,1920f,p)

        p.color = Color.WHITE
        c.drawRect(900f,1770f,1000f,1830f,p)

        /////Copos//////////////////
            var hilo = HiloCopos(p,c)
            hilo.start()

        invalidate()

    }
}

    class HiloCopos(p: Paint, c: Canvas) : Thread(){
    var color = p
    var canvas = c
    var copos = ArrayList<Copos>()


    override fun run() {
        super.run()
        while (true){
            var copo = Copos()
            copo.dibujarCopos(canvas,color)
            copo.velocidadCopos()
            copo.caerCopo()
            sleep(3000)
        }
    }
}