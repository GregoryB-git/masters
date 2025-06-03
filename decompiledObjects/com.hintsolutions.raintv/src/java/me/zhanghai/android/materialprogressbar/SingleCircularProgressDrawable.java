/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;

class SingleCircularProgressDrawable
extends BaseSingleCircularProgressDrawable
implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public SingleCircularProgressDrawable(int n2) {
        if (n2 != 0) {
            if (n2 != 1) throw new IllegalArgumentException("Invalid value for style");
            this.mStartAngleMax = 360.0f;
            return;
        } else {
            this.mStartAngleMax = 0.0f;
        }
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    @Override
    public void onDrawRing(Canvas canvas, Paint paint) {
        int n2 = this.getLevel();
        if (n2 == 0) {
            return;
        }
        float f2 = (float)n2 / 10000.0f;
        float f3 = this.mStartAngleMax * f2;
        this.drawRing(canvas, paint, f3, f2 *= 360.0f);
        if (this.mShowBackground) {
            this.drawRing(canvas, paint, f3, f2);
        }
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

