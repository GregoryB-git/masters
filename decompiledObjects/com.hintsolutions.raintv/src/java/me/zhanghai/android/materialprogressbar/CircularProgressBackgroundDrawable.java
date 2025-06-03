/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  java.lang.Object
 *  java.lang.Override
 *  me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;

class CircularProgressBackgroundDrawable
extends BaseSingleCircularProgressDrawable
implements ShowBackgroundDrawable {
    private boolean mShow = true;

    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    @Override
    public void onDrawRing(Canvas canvas, Paint paint) {
        this.drawRing(canvas, paint, 0.0f, 360.0f);
    }

    public void setShowBackground(boolean bl) {
        if (this.mShow != bl) {
            this.mShow = bl;
            this.invalidateSelf();
        }
    }
}

