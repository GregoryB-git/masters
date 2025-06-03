/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.i;

public abstract class a
extends ViewGroup.MarginLayoutParams {
    public int a;

    public a(int n8, int n9) {
        super(n8, n9);
        this.a = 8388627;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        context = context.obtainStyledAttributes(attributeSet, i.r);
        this.a = context.getInt(i.s, 0);
        context.recycle();
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public a(a a8) {
        super((ViewGroup.MarginLayoutParams)a8);
        this.a = 0;
        this.a = a8.a;
    }
}

