package com.iesvdc.dibujo01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dibujo01 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Grafico grafico = new Grafico(this);

        setContentView(grafico);





    }



    private class Grafico extends View{

        public Grafico(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint pincel = new Paint();
            pincel.setColor(Color.CYAN);
            canvas.drawPaint(pincel);

            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            pincel.setColor(Color.BLACK);
            pincel.setTextSize(30);
            pincel.setAntiAlias(true);
            canvas.drawText("ANCHO= "+ ancho + " ," + " ALTO= " + alto, 40,40, pincel);
        }
    }
}
