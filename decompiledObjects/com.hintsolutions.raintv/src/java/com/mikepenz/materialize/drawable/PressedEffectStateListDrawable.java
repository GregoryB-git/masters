/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  java.lang.Object
 */
package com.mikepenz.materialize.drawable;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

@SuppressLint(value={"InlinedApi"})
public class PressedEffectStateListDrawable
extends StateListDrawable {
    private int color;
    private int selectionColor;

    public PressedEffectStateListDrawable(Drawable drawable2, int n, int n2) {
        drawable2 = drawable2.mutate();
        this.addState(new int[]{0x10100A1}, drawable2);
        this.addState(new int[0], drawable2);
        this.color = n;
        this.selectionColor = n2;
    }

    public PressedEffectStateListDrawable(Drawable drawable2, Drawable drawable3, int n, int n2) {
        drawable2 = drawable2.mutate();
        drawable3 = drawable3.mutate();
        this.addState(new int[]{0x10100A1}, drawable3);
        this.addState(new int[0], drawable2);
        this.color = n;
        this.selectionColor = n2;
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] nArray) {
        int n = nArray.length;
        boolean bl = false;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] != 0x10100A1) continue;
            bl = true;
        }
        if (bl) {
            super.setColorFilter(this.selectionColor, PorterDuff.Mode.SRC_IN);
        } else {
            super.setColorFilter(this.color, PorterDuff.Mode.SRC_IN);
        }
        return super.onStateChange(nArray);
    }
}

