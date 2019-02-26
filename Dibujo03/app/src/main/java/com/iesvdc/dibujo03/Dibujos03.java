package com.iesvdc.dibujo03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dibujos03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Grafico grafico = new Grafico(this);
        setContentView(grafico);
    }

    private class Grafico extends View{
        Integer color = 0;
        float alto = 0;
        float ancho = 0;

        public Grafico(Context context) {
            super(context);
            Paint pincel = new Paint();
            pincel.setStyle(Paint.Style.FILL);
            pincel.setAntiAlias(true);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

        }
    }
}
