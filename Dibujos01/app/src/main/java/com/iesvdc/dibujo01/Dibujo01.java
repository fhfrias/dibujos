package com.iesvdc.dibujo01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
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

            pincel.setColor(Color.rgb(100,20,0));
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            canvas.drawLine((float) (metrics.widthPixels*0.5), 80, metrics.widthPixels,80, pincel);
            pincel.setColor(Color.rgb(0, 100, 20));
            canvas.drawLine((float) (metrics.widthPixels*0.5), 80, (float) (metrics.widthPixels*0.5), metrics.heightPixels, pincel);
            canvas.drawLine((float) (metrics.widthPixels*0.5), (float)((metrics.heightPixels-80)*0.5), metrics.widthPixels,(float)((metrics.heightPixels-80)*0.5), pincel );
        }
    }
}
