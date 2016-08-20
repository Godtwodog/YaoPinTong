package com.jack.yaopintong.Help;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by JackCheung on 2016/8/19.
 * 此类用于自定义imageButton实现imageButton下方出现文字
 */
public class MyImageButton extends ImageButton {
    private  String text=null;  //要显示的文字
    private int color;          //文字的颜色
    private float  size;    //文字的大小
    public MyImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 设置文字
     */
    public void setText(String text){
        this.text = text;
    }

    /**
     * 设置字体大小
     */
    public void setSize(float   size){this.size=size;}

    /**
     * 设置文字颜色
     */
    public void setColor(int color){
        this.color = color;
    }

    /**
     *   x     The x-coordinate of the origin of the text being drawn
     *   y    The y-coordinate of the baseline of the text being drawn
     *   绘制文字
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(color);
        paint.setTextSize(size);
        canvas.drawText(text,75,145,paint);
    }
}
