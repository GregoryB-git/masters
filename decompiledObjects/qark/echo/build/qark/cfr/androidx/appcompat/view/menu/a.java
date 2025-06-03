/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.util.ArrayList
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

public abstract class a
implements g {
    public Context o;
    public Context p;
    public d q;
    public LayoutInflater r;
    public LayoutInflater s;
    public g.a t;
    public int u;
    public int v;
    public h w;

    public a(Context context, int n8, int n9) {
        this.o = context;
        this.r = LayoutInflater.from((Context)context);
        this.u = n8;
        this.v = n9;
    }

    public void a(View view, int n8) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup)this.w).addView(view, n8);
    }

    @Override
    public void b(d d8, boolean bl) {
        g.a a8 = this.t;
        if (a8 != null) {
            a8.b(d8, bl);
        }
    }

    @Override
    public void c(Context context, d d8) {
        this.p = context;
        this.s = LayoutInflater.from((Context)context);
        this.q = d8;
    }

    public abstract void d(e var1, h.a var2);

    @Override
    public boolean e(j d8) {
        g.a a8 = this.t;
        if (a8 != null) {
            if (d8 == null) {
                d8 = this.q;
            }
            return a8.c(d8);
        }
        return false;
    }

    @Override
    public void f(boolean bl) {
        ViewGroup viewGroup = (ViewGroup)this.w;
        if (viewGroup == null) {
            return;
        }
        Object object = this.q;
        int n8 = 0;
        if (object != null) {
            int n9;
            object.q();
            ArrayList arrayList = this.q.A();
            int n10 = arrayList.size();
            n8 = n9 = 0;
            while (n9 < n10) {
                e e8 = (e)arrayList.get(n9);
                int n11 = n8;
                if (this.o(n8, e8)) {
                    View view = viewGroup.getChildAt(n8);
                    object = view instanceof h.a ? ((h.a)view).getItemData() : null;
                    View view2 = this.n(e8, view, viewGroup);
                    if (e8 != object) {
                        view2.setPressed(false);
                        view2.jumpDrawablesToCurrentState();
                    }
                    if (view2 != view) {
                        this.a(view2, n8);
                    }
                    n11 = n8 + 1;
                }
                ++n9;
                n8 = n11;
            }
        }
        while (n8 < viewGroup.getChildCount()) {
            if (this.l(viewGroup, n8)) continue;
            ++n8;
        }
    }

    @Override
    public boolean h(d d8, e e8) {
        return false;
    }

    public h.a i(ViewGroup viewGroup) {
        return (h.a)this.r.inflate(this.v, viewGroup, false);
    }

    @Override
    public boolean j(d d8, e e8) {
        return false;
    }

    @Override
    public void k(g.a a8) {
        this.t = a8;
    }

    public boolean l(ViewGroup viewGroup, int n8) {
        viewGroup.removeViewAt(n8);
        return true;
    }

    public g.a m() {
        return this.t;
    }

    public View n(e e8, View object, ViewGroup viewGroup) {
        object = object instanceof h.a ? (h.a)object : this.i(viewGroup);
        this.d(e8, (h.a)object);
        return (View)object;
    }

    public abstract boolean o(int var1, e var2);
}

