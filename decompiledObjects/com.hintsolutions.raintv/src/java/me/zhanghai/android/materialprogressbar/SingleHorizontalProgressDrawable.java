/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  java.lang.Object
 *  java.lang.Override
 *  me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import me.zhanghai.android.materialprogressbar.BaseSingleHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;

class SingleHorizontalProgressDrawable
extends BaseSingleHorizontalProgressDrawable
implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private boolean mShowBackground;

    public SingleHorizontalProgressDrawable(Context context) {
        super(context);
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override
    public void onDrawRect(Canvas canvas, Paint paint) {
        int n2 = this.getLevel();
        if (n2 == 0) {
            return;
        }
        int n3 = canvas.save();
        canvas.scale((float)n2 / 10000.0f, 1.0f, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, 0.0f);
        super.onDrawRect(canvas, paint);
        if (this.mShowBackground) {
            super.onDrawRect(canvas, paint);
        }
        canvas.restoreToCount(n3);
    }

    public boolean onLevelChange(int n2) {
        this.invalidateSelf();
        return true;
    }

    public void setShowBackground(boolean bl) {
        if (this.mShowBackground != bl) {
            this.mShowBackground = bl;
            this.invalidateSelf();
        }
    }
}

