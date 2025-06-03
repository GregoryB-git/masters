/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  java.lang.Object
 *  me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import me.zhanghai.android.materialprogressbar.BaseSingleHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;

class HorizontalProgressBackgroundDrawable
extends BaseSingleHorizontalProgressDrawable
implements ShowBackgroundDrawable {
    private boolean mShow = true;

    public HorizontalProgressBackgroundDrawable(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    public void setShowBackground(boolean bl) {
        if (this.mShow != bl) {
            this.mShow = bl;
            this.invalidateSelf();
        }
    }
}

