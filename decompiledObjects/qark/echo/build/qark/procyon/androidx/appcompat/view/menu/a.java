// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;

public abstract class a implements g
{
    public Context o;
    public Context p;
    public d q;
    public LayoutInflater r;
    public LayoutInflater s;
    public g.a t;
    public int u;
    public int v;
    public h w;
    
    public a(final Context o, final int u, final int v) {
        this.o = o;
        this.r = LayoutInflater.from(o);
        this.u = u;
        this.v = v;
    }
    
    public void a(final View view, final int n) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup)this.w).addView(view, n);
    }
    
    @Override
    public void b(final d d, final boolean b) {
        final g.a t = this.t;
        if (t != null) {
            t.b(d, b);
        }
    }
    
    @Override
    public void c(final Context p2, final d q) {
        this.p = p2;
        this.s = LayoutInflater.from(p2);
        this.q = q;
    }
    
    public abstract void d(final e p0, final h.a p1);
    
    @Override
    public boolean e(j q) {
        final g.a t = this.t;
        if (t != null) {
            if (q == null) {
                q = (j)this.q;
            }
            return t.c(q);
        }
        return false;
    }
    
    @Override
    public void f(final boolean b) {
        final ViewGroup viewGroup = (ViewGroup)this.w;
        if (viewGroup == null) {
            return;
        }
        final d q = this.q;
        int i = 0;
        if (q != null) {
            q.q();
            final ArrayList a = this.q.A();
            int n;
            for (int size = a.size(), j = i = 0; j < size; ++j, i = n) {
                final e e = a.get(j);
                n = i;
                if (this.o(i, e)) {
                    final View child = viewGroup.getChildAt(i);
                    e itemData;
                    if (child instanceof h.a) {
                        itemData = ((h.a)child).getItemData();
                    }
                    else {
                        itemData = null;
                    }
                    final View n2 = this.n(e, child, viewGroup);
                    if (e != itemData) {
                        n2.setPressed(false);
                        n2.jumpDrawablesToCurrentState();
                    }
                    if (n2 != child) {
                        this.a(n2, i);
                    }
                    n = i + 1;
                }
            }
        }
        while (i < viewGroup.getChildCount()) {
            if (!this.l(viewGroup, i)) {
                ++i;
            }
        }
    }
    
    @Override
    public boolean h(final d d, final e e) {
        return false;
    }
    
    public h.a i(final ViewGroup viewGroup) {
        return (h.a)this.r.inflate(this.v, viewGroup, false);
    }
    
    @Override
    public boolean j(final d d, final e e) {
        return false;
    }
    
    @Override
    public void k(final g.a t) {
        this.t = t;
    }
    
    public boolean l(final ViewGroup viewGroup, final int n) {
        viewGroup.removeViewAt(n);
        return true;
    }
    
    public g.a m() {
        return this.t;
    }
    
    public View n(final e e, final View view, final ViewGroup viewGroup) {
        h.a i;
        if (view instanceof h.a) {
            i = (h.a)view;
        }
        else {
            i = this.i(viewGroup);
        }
        this.d(e, i);
        return (View)i;
    }
    
    public abstract boolean o(final int p0, final e p1);
}
