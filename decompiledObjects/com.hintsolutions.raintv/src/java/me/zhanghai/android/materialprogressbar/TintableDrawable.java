/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  androidx.annotation.ColorInt
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface TintableDrawable {
    public void setTint(@ColorInt int var1);

    public void setTintList(@Nullable ColorStateList var1);

    public void setTintMode(@NonNull PorterDuff.Mode var1);
}

