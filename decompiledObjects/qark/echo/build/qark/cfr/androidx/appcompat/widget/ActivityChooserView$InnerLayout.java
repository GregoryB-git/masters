/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 *  java.lang.Object
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.X;

public class ActivityChooserView$InnerLayout
extends LinearLayout {
    public static final int[] o = new int[]{16842964};

    public ActivityChooserView$InnerLayout(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        object = X.r((Context)object, attributeSet, o);
        this.setBackgroundDrawable(object.f(0));
        object.t();
    }
}

