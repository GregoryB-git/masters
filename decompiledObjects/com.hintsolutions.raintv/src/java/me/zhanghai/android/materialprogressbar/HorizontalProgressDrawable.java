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
import me.zhanghai.android.materialprogressbar.HorizontalProgressBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.SingleHorizontalProgressDrawable;

public class HorizontalProgressDrawable
extends BaseProgressLayerDrawable<SingleHorizontalProgressDrawable, HorizontalProgressBackgroundDrawable> {
    public HorizontalProgressDrawable(Context context) {
        super(new Drawable[]{new HorizontalProgressBackgroundDrawable(context), new SingleHorizontalProgressDrawable(context), new SingleHorizontalProgressDrawable(context)}, context);
    }
}

