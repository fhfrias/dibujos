package com.iesvdc.dibujo03;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;
import java.util.jar.Attributes;

public class Grafico extends View {
    Integer color = 0;
    float alto ;
    float ancho;

    Paint pincel;
    public Grafico(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray colorTyped = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0 , 0);
        color = colorTyped.getInteger(R.styleable.CustomView_viewColor,0);

        pincel = new Paint();
        pincel.setStyle(Paint.Style.FILL);
        pincel.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ancho = w;
        alto = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPaint(pincel);

        if(this.color == 0){
            Random rnd = new Random();
            this.color = Color.argb(255,(int) rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        }
        pincel.setColor(color);
        canvas.drawRect(0,0, ancho, alto, pincel);

    }

    public Integer getColor() {
        invalidate();
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}