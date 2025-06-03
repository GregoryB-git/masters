/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  java.lang.Object
 *  me.zhanghai.android.materialprogressbar.BaseDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import me.zhanghai.android.materialprogressbar.BaseDrawable;

abstract class BasePaintDrawable
extends BaseDrawable {
    private Paint mPaint;

    public final void onDraw(Canvas canvas, int n2, int n3) {
        if (this.mPaint == null) {
            Paint paint;
            this.mPaint = paint = new Paint();
            paint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            this.onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(this.getColorFilterForDrawing());
        this.onDraw(canvas, n2, n3, this.mPaint);
    }

    public abstract void onDraw(Canvas var1, int var2, int var3, Paint var4);

    public abstract void onPreparePaint(Paint var1);
}

