// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.util.AttributeSet;
import I.e;
import android.view.KeyEvent;
import l.L;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.Rect;
import I.s;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import android.content.res.Resources;
import e.c;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.ArrayList;
import e.f;
import l.J;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.List;
import android.os.Handler;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

public final class b extends k.b implements g, View$OnKeyListener, PopupWindow$OnDismissListener
{
    public static final int P;
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
    public a L;
    public ViewTreeObserver M;
    public PopupWindow$OnDismissListener N;
    public boolean O;
    public final Context p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final Handler u;
    public final List v;
    public final List w;
    public final ViewTreeObserver$OnGlobalLayoutListener x;
    public final View$OnAttachStateChangeListener y;
    public final J z;
    
    static {
        P = f.e;
    }
    
    public b(final Context p5, final View c, final int r, final int s, final boolean t) {
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (b.this.i() && b.this.w.size() > 0 && !b.this.w.get(0).a.n()) {
                    final View d = b.this.D;
                    if (d != null && d.isShown()) {
                        final Iterator<d> iterator = b.this.w.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().a.a();
                        }
                    }
                    else {
                        b.this.dismiss();
                    }
                }
            }
        };
        this.y = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                final ViewTreeObserver m = b.this.M;
                if (m != null) {
                    if (!m.isAlive()) {
                        b.this.M = view.getViewTreeObserver();
                    }
                    final b o = b.this;
                    o.M.removeGlobalOnLayoutListener(o.x);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.z = new J() {
            @Override
            public void b(final androidx.appcompat.view.menu.d d, final MenuItem menuItem) {
                final Handler u = b.this.u;
                d d2 = null;
                u.removeCallbacksAndMessages((Object)null);
                final int size = b.this.w.size();
                int i = 0;
                while (true) {
                    while (i < size) {
                        if (d == ((d)b.this.w.get(i)).b) {
                            if (i == -1) {
                                return;
                            }
                            final int n = i + 1;
                            if (n < b.this.w.size()) {
                                d2 = (d)b.this.w.get(n);
                            }
                            b.this.u.postAtTime((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    final d o = d2;
                                    if (o != null) {
                                        b.this.O = true;
                                        o.b.d(false);
                                        b.this.O = false;
                                    }
                                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                                        d.H(menuItem, 4);
                                    }
                                }
                            }, (Object)d, SystemClock.uptimeMillis() + 200L);
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    i = -1;
                    continue;
                }
            }
            
            @Override
            public void c(final androidx.appcompat.view.menu.d d, final MenuItem menuItem) {
                b.this.u.removeCallbacksAndMessages((Object)d);
            }
        };
        this.A = 0;
        this.B = 0;
        this.p = p5;
        this.C = c;
        this.r = r;
        this.s = s;
        this.t = t;
        this.J = false;
        this.E = this.D();
        final Resources resources = p5.getResources();
        this.q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.c.b));
        this.u = new Handler();
    }
    
    public final int A(final androidx.appcompat.view.menu.d d) {
        for (int size = this.w.size(), i = 0; i < size; ++i) {
            if (d == ((d)this.w.get(i)).b) {
                return i;
            }
        }
        return -1;
    }
    
    public final MenuItem B(final androidx.appcompat.view.menu.d d, final androidx.appcompat.view.menu.d d2) {
        for (int size = d.size(), i = 0; i < size; ++i) {
            final MenuItem item = d.getItem(i);
            if (item.hasSubMenu() && d2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }
    
    public final View C(final d d, final androidx.appcompat.view.menu.d d2) {
        final MenuItem b = this.B(d.b, d2);
        if (b == null) {
            return null;
        }
        final ListView a = d.a();
        final ListAdapter adapter = a.getAdapter();
        final boolean b2 = adapter instanceof HeaderViewListAdapter;
        int i = 0;
        int headersCount;
        androidx.appcompat.view.menu.c c;
        if (b2) {
            final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c = (androidx.appcompat.view.menu.c)headerViewListAdapter.getWrappedAdapter();
        }
        else {
            c = (androidx.appcompat.view.menu.c)adapter;
            headersCount = 0;
        }
        while (true) {
            while (i < c.getCount()) {
                if (b == c.c(i)) {
                    if (i == -1) {
                        return null;
                    }
                    final int n = i + headersCount - ((AdapterView)a).getFirstVisiblePosition();
                    if (n < 0) {
                        return null;
                    }
                    if (n >= ((ViewGroup)a).getChildCount()) {
                        return null;
                    }
                    return ((ViewGroup)a).getChildAt(n);
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public final int D() {
        final int m = I.s.m(this.C);
        int n = 1;
        if (m == 1) {
            n = 0;
        }
        return n;
    }
    
    public final int E(final int n) {
        final List w = this.w;
        final ListView a = w.get(w.size() - 1).a();
        final int[] array = new int[2];
        ((View)a).getLocationOnScreen(array);
        final Rect rect = new Rect();
        this.D.getWindowVisibleDisplayFrame(rect);
        if (this.E == 1) {
            if (array[0] + ((View)a).getWidth() + n > rect.right) {
                return 0;
            }
            return 1;
        }
        else {
            if (array[0] - n < 0) {
                return 1;
            }
            return 0;
        }
    }
    
    public final void F(final androidx.appcompat.view.menu.d d) {
        final LayoutInflater from = LayoutInflater.from(this.p);
        final androidx.appcompat.view.menu.c c = new androidx.appcompat.view.menu.c(d, from, this.t, b.P);
        if (!this.i() && this.J) {
            c.d(true);
        }
        else if (this.i()) {
            c.d(k.b.x(d));
        }
        int n = k.b.o((ListAdapter)c, null, this.p, this.q);
        final L z = this.z();
        z.p((ListAdapter)c);
        z.s(n);
        z.t(this.B);
        Object o;
        View c2;
        if (this.w.size() > 0) {
            final List w = this.w;
            o = w.get(w.size() - 1);
            c2 = this.C((d)o, d);
        }
        else {
            o = (c2 = null);
        }
        if (c2 != null) {
            z.H(false);
            z.E(null);
            final int e = this.E(n);
            final boolean b = e == 1;
            this.E = e;
            int n3;
            int n2;
            if (Build$VERSION.SDK_INT >= 26) {
                z.q(c2);
                n2 = (n3 = 0);
            }
            else {
                final int[] array = new int[2];
                this.C.getLocationOnScreen(array);
                final int[] array2 = new int[2];
                c2.getLocationOnScreen(array2);
                if ((this.B & 0x7) == 0x5) {
                    array[0] += this.C.getWidth();
                    array2[0] += c2.getWidth();
                }
                n3 = array2[0] - array[0];
                n2 = array2[1] - array[1];
            }
            int n4 = 0;
            Label_0372: {
                Label_0350: {
                    if ((this.B & 0x5) == 0x5) {
                        if (!b) {
                            n = c2.getWidth();
                            break Label_0350;
                        }
                    }
                    else {
                        if (!b) {
                            break Label_0350;
                        }
                        n = c2.getWidth();
                    }
                    n4 = n3 + n;
                    break Label_0372;
                }
                n4 = n3 - n;
            }
            z.v(n4);
            z.A(true);
            z.C(n2);
        }
        else {
            if (this.F) {
                z.v(this.H);
            }
            if (this.G) {
                z.C(this.I);
            }
            z.u(this.n());
        }
        this.w.add(new d(z, d, this.E));
        z.a();
        final ListView d2 = z.d();
        ((View)d2).setOnKeyListener((View$OnKeyListener)this);
        if (o == null && this.K && d.u() != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(f.i, (ViewGroup)d2, false);
            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
            ((View)frameLayout).setEnabled(false);
            textView.setText(d.u());
            d2.addHeaderView((View)frameLayout, (Object)null, false);
            z.a();
        }
    }
    
    public void a() {
        if (this.i()) {
            return;
        }
        final Iterator<androidx.appcompat.view.menu.d> iterator = this.v.iterator();
        while (iterator.hasNext()) {
            this.F(iterator.next());
        }
        this.v.clear();
        final View c = this.C;
        if ((this.D = c) != null) {
            final boolean b = this.M == null;
            final ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
            this.M = viewTreeObserver;
            if (b) {
                viewTreeObserver.addOnGlobalLayoutListener(this.x);
            }
            this.D.addOnAttachStateChangeListener(this.y);
        }
    }
    
    @Override
    public void b(final androidx.appcompat.view.menu.d d, final boolean b) {
        final int a = this.A(d);
        if (a < 0) {
            return;
        }
        final int n = a + 1;
        if (n < this.w.size()) {
            ((d)this.w.get(n)).b.d(false);
        }
        final d d2 = this.w.remove(a);
        d2.b.K(this);
        if (this.O) {
            d2.a.F(null);
            d2.a.r(0);
        }
        d2.a.dismiss();
        final int size = this.w.size();
        int e;
        if (size > 0) {
            e = this.w.get(size - 1).c;
        }
        else {
            e = this.D();
        }
        this.E = e;
        if (size == 0) {
            this.dismiss();
            final a l = this.L;
            if (l != null) {
                l.b(d, true);
            }
            final ViewTreeObserver m = this.M;
            if (m != null) {
                if (m.isAlive()) {
                    this.M.removeGlobalOnLayoutListener(this.x);
                }
                this.M = null;
            }
            this.D.removeOnAttachStateChangeListener(this.y);
            this.N.onDismiss();
            return;
        }
        if (b) {
            this.w.get(0).b.d(false);
        }
    }
    
    public ListView d() {
        if (this.w.isEmpty()) {
            return null;
        }
        final List w = this.w;
        return w.get(w.size() - 1).a();
    }
    
    public void dismiss() {
        final int size = this.w.size();
        if (size > 0) {
            final d[] array = this.w.toArray(new d[size]);
            for (int i = size - 1; i >= 0; --i) {
                final d d = array[i];
                if (d.a.i()) {
                    d.a.dismiss();
                }
            }
        }
    }
    
    @Override
    public boolean e(final j j) {
        for (final d d : this.w) {
            if (j == d.b) {
                ((View)d.a()).requestFocus();
                return true;
            }
        }
        if (j.hasVisibleItems()) {
            this.l(j);
            final a l = this.L;
            if (l != null) {
                l.c(j);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void f(final boolean b) {
        final Iterator<d> iterator = this.w.iterator();
        while (iterator.hasNext()) {
            b.y(iterator.next().a().getAdapter()).notifyDataSetChanged();
        }
    }
    
    @Override
    public boolean g() {
        return false;
    }
    
    public boolean i() {
        final int size = this.w.size();
        boolean b = false;
        if (size > 0) {
            b = b;
            if (this.w.get(0).a.i()) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void k(final a l) {
        this.L = l;
    }
    
    @Override
    public void l(final androidx.appcompat.view.menu.d d) {
        d.b(this, this.p);
        if (this.i()) {
            this.F(d);
            return;
        }
        this.v.add(d);
    }
    
    @Override
    public boolean m() {
        return false;
    }
    
    public void onDismiss() {
        while (true) {
            for (int size = this.w.size(), i = 0; i < size; ++i) {
                final d d = this.w.get(i);
                if (!d.a.i()) {
                    if (d != null) {
                        d.b.d(false);
                    }
                    return;
                }
            }
            final d d = null;
            continue;
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void p(final View c) {
        if (this.C != c) {
            this.C = c;
            this.B = e.a(this.A, I.s.m(c));
        }
    }
    
    @Override
    public void r(final boolean j) {
        this.J = j;
    }
    
    @Override
    public void s(final int a) {
        if (this.A != a) {
            this.A = a;
            this.B = e.a(a, I.s.m(this.C));
        }
    }
    
    @Override
    public void t(final int h) {
        this.F = true;
        this.H = h;
    }
    
    @Override
    public void u(final PopupWindow$OnDismissListener n) {
        this.N = n;
    }
    
    @Override
    public void v(final boolean k) {
        this.K = k;
    }
    
    @Override
    public void w(final int i) {
        this.G = true;
        this.I = i;
    }
    
    public final L z() {
        final L l = new L(this.p, null, this.r, this.s);
        l.G(this.z);
        l.z((AdapterView$OnItemClickListener)this);
        l.y((PopupWindow$OnDismissListener)this);
        l.q(this.C);
        l.t(this.B);
        l.x(true);
        l.w(2);
        return l;
    }
    
    public static class d
    {
        public final L a;
        public final androidx.appcompat.view.menu.d b;
        public final int c;
        
        public d(final L a, final androidx.appcompat.view.menu.d b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public ListView a() {
            return this.a.d();
        }
    }
}
