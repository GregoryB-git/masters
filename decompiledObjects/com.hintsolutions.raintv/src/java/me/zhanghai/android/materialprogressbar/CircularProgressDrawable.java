/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  java.lang.Object
 *  me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable
 */
package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import me.zhanghai.android.materialprogressbar.BaseProgressLayerDrawable;
import me.zhanghai.android.materialprogressbar.CircularProgressBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.SingleCircularProgressDrawable;

public class CircularProgressDrawable
extends BaseProgressLayerDrawable<SingleCircularProgressDrawable, CircularProgressBackgroundDrawable> {
    public CircularProgressDrawable(int n2, Context context) {
        super(new Drawable[]{new CircularProgressBackgroundDrawable(), new SingleCircularProgressDrawable(n2), new SingleCircularProgressDrawable(n2)}, context);
    }
}

