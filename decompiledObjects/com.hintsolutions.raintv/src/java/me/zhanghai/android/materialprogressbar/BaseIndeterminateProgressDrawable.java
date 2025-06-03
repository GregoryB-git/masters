/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Animatable
 *  java.lang.Object
 *  me.zhanghai.android.materialprogressbar.R$attr
 *  me.zhanghai.android.materialprogressbar.internal.ThemeUtils
 */
package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import me.zhanghai.android.materialprogressbar.BaseProgressDrawable;
import me.zhanghai.android.materialprogressbar.R;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

abstract class BaseIndeterminateProgressDrawable
extends BaseProgressDrawable
implements Animatable {
    public Animator[] mAnimators;

    @SuppressLint(value={"NewApi"})
    public BaseIndeterminateProgressDrawable(Context context) {
        this.setTint(ThemeUtils.getColorFromAttrRes((int)R.attr.colorControlActivated, (int)-16777216, (Context)context));
    }

    private boolean isStarted() {
        Animator[] animatorArray = this.mAnimators;
        int n2 = animatorArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!animatorArray[i2].isStarted()) continue;
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.isStarted()) {
            this.invalidateSelf();
        }
    }

    public boolean isRunning() {
        Animator[] animatorArray = this.mAnimators;
        int n2 = animatorArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!animatorArray[i2].isRunning()) continue;
            return true;
        }
        return false;
    }

    public void start() {
        if (this.isStarted()) {
            return;
        }
        Animator[] animatorArray = this.mAnimators;
        int n2 = animatorArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            animatorArray[i2].start();
        }
        this.invalidateSelf();
    }

    public void stop() {
        Animator[] animatorArray = this.mAnimators;
        int n2 = animatorArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            animatorArray[i2].end();
        }
    }
}

