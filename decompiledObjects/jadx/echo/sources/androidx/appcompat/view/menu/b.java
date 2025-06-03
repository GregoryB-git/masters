package androidx.appcompat.view.menu;

import I.AbstractC0408e;
import I.AbstractC0421s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import e.AbstractC1232c;
import e.AbstractC1235f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.AbstractC1394b;
import l.J;
import l.L;

/* loaded from: classes.dex */
public final class b extends AbstractC1394b implements g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: P, reason: collision with root package name */
    public static final int f8399P = AbstractC1235f.f13443e;

    /* renamed from: C, reason: collision with root package name */
    public View f8402C;

    /* renamed from: D, reason: collision with root package name */
    public View f8403D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8405F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8406G;

    /* renamed from: H, reason: collision with root package name */
    public int f8407H;

    /* renamed from: I, reason: collision with root package name */
    public int f8408I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8410K;

    /* renamed from: L, reason: collision with root package name */
    public g.a f8411L;

    /* renamed from: M, reason: collision with root package name */
    public ViewTreeObserver f8412M;

    /* renamed from: N, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8413N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f8414O;

    /* renamed from: p, reason: collision with root package name */
    public final Context f8415p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8416q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8417r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8418s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8419t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f8420u;

    /* renamed from: v, reason: collision with root package name */
    public final List f8421v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final List f8422w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f8423x = new a();

    /* renamed from: y, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f8424y = new ViewOnAttachStateChangeListenerC0152b();

    /* renamed from: z, reason: collision with root package name */
    public final J f8425z = new c();

    /* renamed from: A, reason: collision with root package name */
    public int f8400A = 0;

    /* renamed from: B, reason: collision with root package name */
    public int f8401B = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8409J = false;

    /* renamed from: E, reason: collision with root package name */
    public int f8404E = D();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.i() || b.this.f8422w.size() <= 0 || ((d) b.this.f8422w.get(0)).f8433a.n()) {
                return;
            }
            View view = b.this.f8403D;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f8422w.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f8433a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0152b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0152b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f8412M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f8412M = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f8412M.removeGlobalOnLayoutListener(bVar.f8423x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements J {

        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ d f8429o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ MenuItem f8430p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.d f8431q;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.d dVar2) {
                this.f8429o = dVar;
                this.f8430p = menuItem;
                this.f8431q = dVar2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f8429o;
                if (dVar != null) {
                    b.this.f8414O = true;
                    dVar.f8434b.d(false);
                    b.this.f8414O = false;
                }
                if (this.f8430p.isEnabled() && this.f8430p.hasSubMenu()) {
                    this.f8431q.H(this.f8430p, 4);
                }
            }
        }

        public c() {
        }

        @Override // l.J
        public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f8420u.removeCallbacksAndMessages(null);
            int size = b.this.f8422w.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (dVar == ((d) b.this.f8422w.get(i7)).f8434b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            b.this.f8420u.postAtTime(new a(i8 < b.this.f8422w.size() ? (d) b.this.f8422w.get(i8) : null, menuItem, dVar), dVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // l.J
        public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f8420u.removeCallbacksAndMessages(dVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final L f8433a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f8434b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8435c;

        public d(L l7, androidx.appcompat.view.menu.d dVar, int i7) {
            this.f8433a = l7;
            this.f8434b = dVar;
            this.f8435c = i7;
        }

        public ListView a() {
            return this.f8433a.d();
        }
    }

    public b(Context context, View view, int i7, int i8, boolean z7) {
        this.f8415p = context;
        this.f8402C = view;
        this.f8417r = i7;
        this.f8418s = i8;
        this.f8419t = z7;
        Resources resources = context.getResources();
        this.f8416q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1232c.f13356b));
        this.f8420u = new Handler();
    }

    public final int A(androidx.appcompat.view.menu.d dVar) {
        int size = this.f8422w.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (dVar == ((d) this.f8422w.get(i7)).f8434b) {
                return i7;
            }
        }
        return -1;
    }

    public final MenuItem B(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.d dVar2) {
        int size = dVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = dVar.getItem(i7);
            if (item.hasSubMenu() && dVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, androidx.appcompat.view.menu.d dVar2) {
        androidx.appcompat.view.menu.c cVar;
        int i7;
        int firstVisiblePosition;
        MenuItem B7 = B(dVar.f8434b, dVar2);
        if (B7 == null) {
            return null;
        }
        ListView a7 = dVar.a();
        ListAdapter adapter = a7.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i7 = headerViewListAdapter.getHeadersCount();
            cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
        } else {
            cVar = (androidx.appcompat.view.menu.c) adapter;
            i7 = 0;
        }
        int count = cVar.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (B7 == cVar.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + i7) - a7.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a7.getChildCount()) {
            return a7.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return AbstractC0421s.m(this.f8402C) == 1 ? 0 : 1;
    }

    public final int E(int i7) {
        List list = this.f8422w;
        ListView a7 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a7.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f8403D.getWindowVisibleDisplayFrame(rect);
        return this.f8404E == 1 ? (iArr[0] + a7.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    public final void F(androidx.appcompat.view.menu.d dVar) {
        d dVar2;
        View view;
        int i7;
        int i8;
        int i9;
        LayoutInflater from = LayoutInflater.from(this.f8415p);
        androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(dVar, from, this.f8419t, f8399P);
        if (!i() && this.f8409J) {
            cVar.d(true);
        } else if (i()) {
            cVar.d(AbstractC1394b.x(dVar));
        }
        int o7 = AbstractC1394b.o(cVar, null, this.f8415p, this.f8416q);
        L z7 = z();
        z7.p(cVar);
        z7.s(o7);
        z7.t(this.f8401B);
        if (this.f8422w.size() > 0) {
            List list = this.f8422w;
            dVar2 = (d) list.get(list.size() - 1);
            view = C(dVar2, dVar);
        } else {
            dVar2 = null;
            view = null;
        }
        if (view != null) {
            z7.H(false);
            z7.E(null);
            int E6 = E(o7);
            boolean z8 = E6 == 1;
            this.f8404E = E6;
            if (Build.VERSION.SDK_INT >= 26) {
                z7.q(view);
                i8 = 0;
                i7 = 0;
            } else {
                int[] iArr = new int[2];
                this.f8402C.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f8401B & 7) == 5) {
                    iArr[0] = iArr[0] + this.f8402C.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i7 = iArr2[0] - iArr[0];
                i8 = iArr2[1] - iArr[1];
            }
            if ((this.f8401B & 5) == 5) {
                if (!z8) {
                    o7 = view.getWidth();
                    i9 = i7 - o7;
                }
                i9 = i7 + o7;
            } else {
                if (z8) {
                    o7 = view.getWidth();
                    i9 = i7 + o7;
                }
                i9 = i7 - o7;
            }
            z7.v(i9);
            z7.A(true);
            z7.C(i8);
        } else {
            if (this.f8405F) {
                z7.v(this.f8407H);
            }
            if (this.f8406G) {
                z7.C(this.f8408I);
            }
            z7.u(n());
        }
        this.f8422w.add(new d(z7, dVar, this.f8404E));
        z7.a();
        ListView d7 = z7.d();
        d7.setOnKeyListener(this);
        if (dVar2 == null && this.f8410K && dVar.u() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC1235f.f13447i, (ViewGroup) d7, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(dVar.u());
            d7.addHeaderView(frameLayout, null, false);
            z7.a();
        }
    }

    @Override // k.c
    public void a() {
        if (i()) {
            return;
        }
        Iterator it = this.f8421v.iterator();
        while (it.hasNext()) {
            F((androidx.appcompat.view.menu.d) it.next());
        }
        this.f8421v.clear();
        View view = this.f8402C;
        this.f8403D = view;
        if (view != null) {
            boolean z7 = this.f8412M == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8412M = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8423x);
            }
            this.f8403D.addOnAttachStateChangeListener(this.f8424y);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z7) {
        int A7 = A(dVar);
        if (A7 < 0) {
            return;
        }
        int i7 = A7 + 1;
        if (i7 < this.f8422w.size()) {
            ((d) this.f8422w.get(i7)).f8434b.d(false);
        }
        d dVar2 = (d) this.f8422w.remove(A7);
        dVar2.f8434b.K(this);
        if (this.f8414O) {
            dVar2.f8433a.F(null);
            dVar2.f8433a.r(0);
        }
        dVar2.f8433a.dismiss();
        int size = this.f8422w.size();
        this.f8404E = size > 0 ? ((d) this.f8422w.get(size - 1)).f8435c : D();
        if (size != 0) {
            if (z7) {
                ((d) this.f8422w.get(0)).f8434b.d(false);
                return;
            }
            return;
        }
        dismiss();
        g.a aVar = this.f8411L;
        if (aVar != null) {
            aVar.b(dVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8412M;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8412M.removeGlobalOnLayoutListener(this.f8423x);
            }
            this.f8412M = null;
        }
        this.f8403D.removeOnAttachStateChangeListener(this.f8424y);
        this.f8413N.onDismiss();
    }

    @Override // k.c
    public ListView d() {
        if (this.f8422w.isEmpty()) {
            return null;
        }
        return ((d) this.f8422w.get(r0.size() - 1)).a();
    }

    @Override // k.c
    public void dismiss() {
        int size = this.f8422w.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f8422w.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f8433a.i()) {
                    dVar.f8433a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        for (d dVar : this.f8422w) {
            if (jVar == dVar.f8434b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        l(jVar);
        g.a aVar = this.f8411L;
        if (aVar != null) {
            aVar.c(jVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z7) {
        Iterator it = this.f8422w.iterator();
        while (it.hasNext()) {
            AbstractC1394b.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        return false;
    }

    @Override // k.c
    public boolean i() {
        return this.f8422w.size() > 0 && ((d) this.f8422w.get(0)).f8433a.i();
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f8411L = aVar;
    }

    @Override // k.AbstractC1394b
    public void l(androidx.appcompat.view.menu.d dVar) {
        dVar.b(this, this.f8415p);
        if (i()) {
            F(dVar);
        } else {
            this.f8421v.add(dVar);
        }
    }

    @Override // k.AbstractC1394b
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f8422w.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f8422w.get(i7);
            if (!dVar.f8433a.i()) {
                break;
            } else {
                i7++;
            }
        }
        if (dVar != null) {
            dVar.f8434b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.AbstractC1394b
    public void p(View view) {
        if (this.f8402C != view) {
            this.f8402C = view;
            this.f8401B = AbstractC0408e.a(this.f8400A, AbstractC0421s.m(view));
        }
    }

    @Override // k.AbstractC1394b
    public void r(boolean z7) {
        this.f8409J = z7;
    }

    @Override // k.AbstractC1394b
    public void s(int i7) {
        if (this.f8400A != i7) {
            this.f8400A = i7;
            this.f8401B = AbstractC0408e.a(i7, AbstractC0421s.m(this.f8402C));
        }
    }

    @Override // k.AbstractC1394b
    public void t(int i7) {
        this.f8405F = true;
        this.f8407H = i7;
    }

    @Override // k.AbstractC1394b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f8413N = onDismissListener;
    }

    @Override // k.AbstractC1394b
    public void v(boolean z7) {
        this.f8410K = z7;
    }

    @Override // k.AbstractC1394b
    public void w(int i7) {
        this.f8406G = true;
        this.f8408I = i7;
    }

    public final L z() {
        L l7 = new L(this.f8415p, null, this.f8417r, this.f8418s);
        l7.G(this.f8425z);
        l7.z(this);
        l7.y(this);
        l7.q(this.f8402C);
        l7.t(this.f8401B);
        l7.x(true);
        l7.w(2);
        return l7;
    }
}
