/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.text.Layout
 *  android.util.AttributeSet
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import e.i;
import l.w;

public class DialogTitle
extends w {
    public DialogTitle(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public void onMeasure(int n8, int n9) {
        int n10;
        super.onMeasure(n8, n9);
        Layout layout2 = this.getLayout();
        if (layout2 != null && (n10 = layout2.getLineCount()) > 0 && layout2.getEllipsisCount(n10 - 1) > 0) {
            this.setSingleLine(false);
            this.setMaxLines(2);
            layout2 = this.getContext().obtainStyledAttributes(null, i.Z1, 16842817, 16973892);
            n10 = layout2.getDimensionPixelSize(i.a2, 0);
            if (n10 != 0) {
                this.setTextSize(0, n10);
            }
            layout2.recycle();
            super.onMeasure(n8, n9);
        }
    }
}

