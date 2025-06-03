/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.WindowManager
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.appcompat.view.menu;

import I.e;
import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import e.c;

public class f {
    public final Context a;
    public final d b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g = 8388611;
    public boolean h;
    public g.a i;
    public k.b j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l;

    public f(Context context, d d8, View view, boolean bl, int n8) {
        this(context, d8, view, bl, n8, 0);
    }

    public f(Context context, d d8, View view, boolean bl, int n8, int n9) {
        this.l = new PopupWindow.OnDismissListener(){

            public void onDismiss() {
                f.this.e();
            }
        };
        this.a = context;
        this.b = d8;
        this.f = view;
        this.c = bl;
        this.d = n8;
        this.e = n9;
    }

    public final k.b a() {
        Object object = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        object.getRealSize(point);
        object = Math.min((int)point.x, (int)point.y) >= this.a.getResources().getDimensionPixelSize(c.a) ? new b(this.a, this.f, this.d, this.e, this.c) : new i(this.a, this.b, this.f, this.d, this.e, this.c);
        object.l(this.b);
        object.u(this.l);
        object.p(this.f);
        object.k(this.i);
        object.r(this.h);
        object.s(this.g);
        return object;
    }

    public void b() {
        if (this.d()) {
            this.j.dismiss();
        }
    }

    public k.b c() {
        if (this.j == null) {
            this.j = this.a();
        }
        return this.j;
    }

    public boolean d() {
        k.b b8 = this.j;
        if (b8 != null && b8.i()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean bl) {
        this.h = bl;
        k.b b8 = this.j;
        if (b8 != null) {
            b8.r(bl);
        }
    }

    public void h(int n8) {
        this.g = n8;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(g.a a8) {
        this.i = a8;
        k.b b8 = this.j;
        if (b8 != null) {
            b8.k(a8);
        }
    }

    public void k() {
        if (this.m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public final void l(int n8, int n9, boolean bl, boolean bl2) {
        k.b b8 = this.c();
        b8.v(bl2);
        if (bl) {
            int n10 = n8;
            if ((e.a(this.g, s.m(this.f)) & 7) == 5) {
                n10 = n8 - this.f.getWidth();
            }
            b8.t(n10);
            b8.w(n9);
            n8 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            b8.q(new Rect(n10 - n8, n9 - n8, n10 + n8, n9 + n8));
        }
        b8.a();
    }

    public boolean m() {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.l(0, 0, false, false);
        return true;
    }

    public boolean n(int n8, int n9) {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.l(n8, n9, true, true);
        return true;
    }

}

