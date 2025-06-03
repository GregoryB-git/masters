/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.PopupWindow
 *  java.lang.Object
 */
package l;

import L.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import l.X;

public class i
extends PopupWindow {
    public static final boolean b = false;
    public boolean a;

    public i(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        this.a(context, attributeSet, n8, n9);
    }

    public final void a(Context object, AttributeSet attributeSet, int n8, int n9) {
        if ((object = X.s((Context)object, attributeSet, e.i.w1, n8, n9)).p(e.i.y1)) {
            this.b(object.a(e.i.y1, false));
        }
        this.setBackgroundDrawable(object.f(e.i.x1));
        object.t();
    }

    public final void b(boolean bl) {
        if (b) {
            this.a = bl;
            return;
        }
        g.a(this, bl);
    }

    public void showAsDropDown(View view, int n8, int n9) {
        int n10 = n9;
        if (b) {
            n10 = n9;
            if (this.a) {
                n10 = n9 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n8, n10);
    }

    public void showAsDropDown(View view, int n8, int n9, int n10) {
        int n11 = n9;
        if (b) {
            n11 = n9;
            if (this.a) {
                n11 = n9 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n8, n11, n10);
    }

    public void update(View view, int n8, int n9, int n10, int n11) {
        int n12 = n9;
        if (b) {
            n12 = n9;
            if (this.a) {
                n12 = n9 - view.getHeight();
            }
        }
        super.update(view, n8, n12, n10, n11);
    }
}

