package com.game.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;



public class ProportionalImageView extends ImageView {
    public ProportionalImageView(Context context){
        super(context);
    }
    public ProportionalImageView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    public ProportionalImageView (Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }
    protected void onMeasure(int widthMeaseureSpec, int heightMeasureSpec){
        Drawable d = getDrawable();
        if (d!=null){
            int w = MeasureSpec.getSize(widthMeaseureSpec);
            int h = w * d.getIntrinsicHeight() / d.getIntrinsicWidth() ;
            setMeasuredDimension (w, h);
        }
        else super.onMeasure(widthMeaseureSpec, heightMeasureSpec);
    }
}
