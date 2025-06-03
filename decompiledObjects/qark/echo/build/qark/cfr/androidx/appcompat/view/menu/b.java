/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.appcompat.view.menu;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.J;
import l.L;

public final class b
extends k.b
implements g,
View.OnKeyListener,
PopupWindow.OnDismissListener {
    public static final int P = f.e;
    public int A;
    public int B;
    public View C;
    public View D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public g.a L;
    public ViewTreeObserver M;
    public PopupWindow.OnDismissListener N;
    public boolean O;
    public final Context p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final Handler u;
    public final List v = new ArrayList();
    public final List w = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener x;
    public final View.OnAttachStateChangeListener y;
    public final J z;

    public b(Context context, View view, int n8, int n9, boolean bl) {
        this.x = new ViewTreeObserver.OnGlobalLayoutListener(){

            public void onGlobalLayout() {
                if (b.this.i() && b.this.w.size() > 0 && !((d)b.this.w.get((int)0)).a.n()) {
                    View view = b.this.D;
                    if (view != null && view.isShown()) {
                        view = b.this.w.iterator();
                        while (view.hasNext()) {
                            ((d)view.next()).a.a();
                        }
                    } else {
                        b.this.dismiss();
                    }
                }
            }
        };
        this.y = new View.OnAttachStateChangeListener(){

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                Object object = b.this.M;
                if (object != null) {
                    if (!object.isAlive()) {
                        b.this.M = view.getViewTreeObserver();
                    }
                    object = b.this;
                    object.M.removeGlobalOnLayoutListener(object.x);
                }
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
        };
        this.z = new J(){

            @Override
            public void b(androidx.appcompat.view.menu.d d8, MenuItem object) {
                d d9;
                int n8;
                block4 : {
                    Handler handler = b.this.u;
                    d9 = null;
                    handler.removeCallbacksAndMessages((Object)null);
                    int n9 = b.this.w.size();
                    for (n8 = 0; n8 < n9; ++n8) {
                        if (d8 != ((d)b.this.w.get((int)n8)).b) {
                            continue;
                        }
                        break block4;
                    }
                    n8 = -1;
                }
                if (n8 == -1) {
                    return;
                }
                if (++n8 < b.this.w.size()) {
                    d9 = (d)b.this.w.get(n8);
                }
                object = new Runnable((MenuItem)object, d8){
                    public final /* synthetic */ MenuItem p;
                    public final /* synthetic */ androidx.appcompat.view.menu.d q;
                    {
                        this.p = menuItem;
                        this.q = d92;
                    }

                    public void run() {
                        d d8 = d9;
                        if (d8 != null) {
                            b.this.O = true;
                            d8.b.d(false);
                            b.this.O = false;
                        }
                        if (this.p.isEnabled() && this.p.hasSubMenu()) {
                            this.q.H(this.p, 4);
                        }
                    }
                };
                long l8 = SystemClock.uptimeMillis();
                b.this.u.postAtTime((Runnable)object, (Object)d8, l8 + 200L);
            }

            @Override
            public void c(androidx.appcompat.view.menu.d d8, MenuItem menuItem) {
                b.this.u.removeCallbacksAndMessages((Object)d8);
            }

        };
        this.A = 0;
        this.B = 0;
        this.p = context;
        this.C = view;
        this.r = n8;
        this.s = n9;
        this.t = bl;
        this.J = false;
        this.E = this.D();
        context = context.getResources();
        this.q = Math.max((int)(context.getDisplayMetrics().widthPixels / 2), (int)context.getDimensionPixelSize(e.c.b));
        this.u = new Handler();
    }

    public final int A(androidx.appcompat.view.menu.d d8) {
        int n8 = this.w.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (d8 != ((d)this.w.get((int)i8)).b) continue;
            return i8;
        }
        return -1;
    }

    public final MenuItem B(androidx.appcompat.view.menu.d d8, androidx.appcompat.view.menu.d d9) {
        int n8 = d8.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = d8.getItem(i8);
            if (!menuItem.hasSubMenu() || d9 != menuItem.getSubMenu()) continue;
            return menuItem;
        }
        return null;
    }

    public final View C(d object, androidx.appcompat.view.menu.d d8) {
        int n8;
        int n9;
        ListView listView;
        block8 : {
            if ((d8 = this.B(object.b, d8)) == null) {
                return null;
            }
            listView = object.a();
            object = listView.getAdapter();
            boolean bl = object instanceof HeaderViewListAdapter;
            n8 = 0;
            if (bl) {
                object = (HeaderViewListAdapter)object;
                n9 = object.getHeadersCount();
                object = (c)object.getWrappedAdapter();
            } else {
                object = (c)((Object)object);
                n9 = 0;
            }
            int n10 = object.getCount();
            while (n8 < n10) {
                if (d8 != object.c(n8)) {
                    ++n8;
                    continue;
                }
                break block8;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return null;
        }
        if ((n8 = n8 + n9 - listView.getFirstVisiblePosition()) >= 0) {
            if (n8 >= listView.getChildCount()) {
                return null;
            }
            return listView.getChildAt(n8);
        }
        return null;
    }

    public final int D() {
        int n8 = s.m(this.C);
        int n9 = 1;
        if (n8 == 1) {
            n9 = 0;
        }
        return n9;
    }

    public final int E(int n8) {
        List list = this.w;
        list = ((d)list.get(list.size() - 1)).a();
        int[] arrn = new int[2];
        list.getLocationOnScreen(arrn);
        Rect rect = new Rect();
        this.D.getWindowVisibleDisplayFrame(rect);
        if (this.E == 1) {
            if (arrn[0] + list.getWidth() + n8 > rect.right) {
                return 0;
            }
            return 1;
        }
        if (arrn[0] - n8 < 0) {
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void F(androidx.appcompat.view.menu.d var1_1) {
        block14 : {
            block12 : {
                block13 : {
                    var9_2 = LayoutInflater.from((Context)this.p);
                    var6_3 = new c(var1_1, var9_2, this.t, b.P);
                    if (!this.i() && this.J) {
                        var6_3.d(true);
                    } else if (this.i()) {
                        var6_3.d(k.b.x(var1_1));
                    }
                    var3_4 = k.b.o((ListAdapter)var6_3, null, this.p, this.q);
                    var8_5 = this.z();
                    var8_5.p((ListAdapter)var6_3);
                    var8_5.s(var3_4);
                    var8_5.t(this.B);
                    if (this.w.size() > 0) {
                        var6_3 = this.w;
                        var6_3 = (d)var6_3.get(var6_3.size() - 1);
                        var7_6 = this.C((d)var6_3, var1_1);
                    } else {
                        var7_6 = var6_3 = null;
                    }
                    if (var7_6 == null) break block12;
                    var8_5.H(false);
                    var8_5.E(null);
                    var2_7 = this.E(var3_4);
                    var4_8 = var2_7 == 1;
                    this.E = var2_7;
                    if (Build.VERSION.SDK_INT >= 26) {
                        var8_5.q((View)var7_6);
                        var5_9 = var2_7 = 0;
                    } else {
                        var10_10 = new int[2];
                        this.C.getLocationOnScreen(var10_10);
                        var11_11 = new int[2];
                        var7_6.getLocationOnScreen(var11_11);
                        if ((this.B & 7) == 5) {
                            var10_10[0] = var10_10[0] + this.C.getWidth();
                            var11_11[0] = var11_11[0] + var7_6.getWidth();
                        }
                        var5_9 = var11_11[0] - var10_10[0];
                        var2_7 = var11_11[1] - var10_10[1];
                    }
                    if ((this.B & 5) != 5) break block13;
                    if (var4_8) ** GOTO lbl45
                    var3_4 = var7_6.getWidth();
                    ** GOTO lbl-1000
                }
                if (var4_8) {
                    var3_4 = var7_6.getWidth();
lbl45: // 2 sources:
                    var3_4 = var5_9 + var3_4;
                } else lbl-1000: // 2 sources:
                {
                    var3_4 = var5_9 - var3_4;
                }
                var8_5.v(var3_4);
                var8_5.A(true);
                var8_5.C(var2_7);
                break block14;
            }
            if (this.F) {
                var8_5.v(this.H);
            }
            if (this.G) {
                var8_5.C(this.I);
            }
            var8_5.u(this.n());
        }
        var7_6 = new d(var8_5, var1_1, this.E);
        this.w.add(var7_6);
        var8_5.a();
        var7_6 = var8_5.d();
        var7_6.setOnKeyListener((View.OnKeyListener)this);
        if (var6_3 != null) return;
        if (this.K == false) return;
        if (var1_1.u() == null) return;
        var6_3 = (FrameLayout)var9_2.inflate(f.i, (ViewGroup)var7_6, false);
        var9_2 = (TextView)var6_3.findViewById(16908310);
        var6_3.setEnabled(false);
        var9_2.setText(var1_1.u());
        var7_6.addHeaderView((View)var6_3, (Object)null, false);
        var8_5.a();
    }

    @Override
    public void a() {
        if (this.i()) {
            return;
        }
        Iterator iterator = this.v.iterator();
        while (iterator.hasNext()) {
            this.F((androidx.appcompat.view.menu.d)iterator.next());
        }
        this.v.clear();
        iterator = this.C;
        this.D = iterator;
        if (iterator != null) {
            boolean bl = this.M == null;
            iterator = iterator.getViewTreeObserver();
            this.M = iterator;
            if (bl) {
                iterator.addOnGlobalLayoutListener(this.x);
            }
            this.D.addOnAttachStateChangeListener(this.y);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(androidx.appcompat.view.menu.d d8, boolean bl) {
        int n8 = this.A(d8);
        if (n8 < 0) {
            return;
        }
        int n9 = n8 + 1;
        if (n9 < this.w.size()) {
            ((d)this.w.get((int)n9)).b.d(false);
        }
        Object object = (d)this.w.remove(n8);
        object.b.K(this);
        if (this.O) {
            object.a.F(null);
            object.a.r(0);
        }
        object.a.dismiss();
        n9 = this.w.size();
        n8 = n9 > 0 ? ((d)this.w.get((int)(n9 - 1))).c : this.D();
        this.E = n8;
        if (n9 == 0) {
            this.dismiss();
            object = this.L;
            if (object != null) {
                object.b(d8, true);
            }
            if ((d8 = this.M) != null) {
                if (d8.isAlive()) {
                    this.M.removeGlobalOnLayoutListener(this.x);
                }
                this.M = null;
            }
            this.D.removeOnAttachStateChangeListener(this.y);
            this.N.onDismiss();
            return;
        }
        if (bl) {
            ((d)this.w.get((int)0)).b.d(false);
        }
    }

    @Override
    public ListView d() {
        if (this.w.isEmpty()) {
            return null;
        }
        List list = this.w;
        return ((d)list.get(list.size() - 1)).a();
    }

    @Override
    public void dismiss() {
        int n8 = this.w.size();
        if (n8 > 0) {
            d[] arrd = (d[])this.w.toArray((Object[])new d[n8]);
            --n8;
            while (n8 >= 0) {
                d d8 = arrd[n8];
                if (d8.a.i()) {
                    d8.a.dismiss();
                }
                --n8;
            }
        }
    }

    @Override
    public boolean e(j j8) {
        for (d d8 : this.w) {
            if (j8 != d8.b) continue;
            d8.a().requestFocus();
            return true;
        }
        if (j8.hasVisibleItems()) {
            this.l(j8);
            g.a a8 = this.L;
            if (a8 != null) {
                a8.c(j8);
            }
            return true;
        }
        return false;
    }

    @Override
    public void f(boolean bl) {
        Iterator iterator = this.w.iterator();
        while (iterator.hasNext()) {
            k.b.y(((d)iterator.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean i() {
        boolean bl;
        int n8 = this.w.size();
        boolean bl2 = bl = false;
        if (n8 > 0) {
            bl2 = bl;
            if (((d)this.w.get((int)0)).a.i()) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public void k(g.a a8) {
        this.L = a8;
    }

    @Override
    public void l(androidx.appcompat.view.menu.d d8) {
        d8.b(this, this.p);
        if (this.i()) {
            this.F(d8);
            return;
        }
        this.v.add((Object)d8);
    }

    @Override
    public boolean m() {
        return false;
    }

    public void onDismiss() {
        d d8;
        block3 : {
            int n8 = this.w.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                d8 = (d)this.w.get(i8);
                if (d8.a.i()) {
                    continue;
                }
                break block3;
            }
            d8 = null;
        }
        if (d8 != null) {
            d8.b.d(false);
        }
    }

    public boolean onKey(View view, int n8, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n8 == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override
    public void p(View view) {
        if (this.C != view) {
            this.C = view;
            this.B = I.e.a(this.A, s.m(view));
        }
    }

    @Override
    public void r(boolean bl) {
        this.J = bl;
    }

    @Override
    public void s(int n8) {
        if (this.A != n8) {
            this.A = n8;
            this.B = I.e.a(n8, s.m(this.C));
        }
    }

    @Override
    public void t(int n8) {
        this.F = true;
        this.H = n8;
    }

    @Override
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.N = onDismissListener;
    }

    @Override
    public void v(boolean bl) {
        this.K = bl;
    }

    @Override
    public void w(int n8) {
        this.G = true;
        this.I = n8;
    }

    public final L z() {
        L l8 = new L(this.p, null, this.r, this.s);
        l8.G(this.z);
        l8.z(this);
        l8.y(this);
        l8.q(this.C);
        l8.t(this.B);
        l8.x(true);
        l8.w(2);
        return l8;
    }

    public static class d {
        public final L a;
        public final androidx.appcompat.view.menu.d b;
        public final int c;

        public d(L l8, androidx.appcompat.view.menu.d d8, int n8) {
            this.a = l8;
            this.b = d8;
            this.c = n8;
        }

        public ListView a() {
            return this.a.d();
        }
    }

}

