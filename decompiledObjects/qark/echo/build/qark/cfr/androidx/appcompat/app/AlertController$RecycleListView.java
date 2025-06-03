/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.widget.ListView
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.i;

public class AlertController$RecycleListView
extends ListView {
    public final int o;
    public final int p;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, i.A1);
        this.p = context.getDimensionPixelOffset(i.B1, -1);
        this.o = context.getDimensionPixelOffset(i.C1, -1);
    }
}

