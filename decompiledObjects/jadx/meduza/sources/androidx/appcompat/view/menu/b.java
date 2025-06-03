package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import e0.d0;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.j0;
import l.o0;
import l.p0;

/* loaded from: classes.dex */
public final class b extends k.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public int B;
    public int C;
    public boolean E;
    public j.a F;
    public ViewTreeObserver G;
    public PopupWindow.OnDismissListener H;
    public boolean I;

    /* renamed from: b, reason: collision with root package name */
    public final Context f627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f630e;
    public final boolean f;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f631o;

    /* renamed from: w, reason: collision with root package name */
    public View f638w;

    /* renamed from: x, reason: collision with root package name */
    public View f639x;

    /* renamed from: y, reason: collision with root package name */
    public int f640y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f641z;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f632p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f633q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final a f634r = new a();

    /* renamed from: s, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0011b f635s = new ViewOnAttachStateChangeListenerC0011b();
    public final c t = new c();

    /* renamed from: u, reason: collision with root package name */
    public int f636u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f637v = 0;
    public boolean D = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!b.this.a() || b.this.f633q.size() <= 0 || ((d) b.this.f633q.get(0)).f645a.F) {
                return;
            }
            View view = b.this.f639x;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f633q.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f645a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0011b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0011b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.G;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.G = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.G.removeGlobalOnLayoutListener(bVar.f634r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements o0 {
        public c() {
        }

        @Override // l.o0
        public final void c(f fVar, h hVar) {
            b.this.f631o.removeCallbacksAndMessages(null);
            int size = b.this.f633q.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == ((d) b.this.f633q.get(i10)).f646b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f631o.postAtTime(new androidx.appcompat.view.menu.c(this, i11 < b.this.f633q.size() ? (d) b.this.f633q.get(i11) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // l.o0
        public final void f(f fVar, MenuItem menuItem) {
            b.this.f631o.removeCallbacksAndMessages(fVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final p0 f645a;

        /* renamed from: b, reason: collision with root package name */
        public final f f646b;

        /* renamed from: c, reason: collision with root package name */
        public final int f647c;

        public d(p0 p0Var, f fVar, int i10) {
            this.f645a = p0Var;
            this.f646b = fVar;
            this.f647c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f627b = context;
        this.f638w = view;
        this.f629d = i10;
        this.f630e = i11;
        this.f = z10;
        WeakHashMap<View, e0.o0> weakHashMap = d0.f3766a;
        this.f640y = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f628c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f631o = new Handler();
    }

    @Override // k.f
    public final boolean a() {
        return this.f633q.size() > 0 && ((d) this.f633q.get(0)).f645a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        int i10;
        int size = this.f633q.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (fVar == ((d) this.f633q.get(i11)).f646b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < this.f633q.size()) {
            ((d) this.f633q.get(i12)).f646b.c(false);
        }
        d dVar = (d) this.f633q.remove(i11);
        dVar.f646b.r(this);
        if (this.I) {
            p0.a.b(dVar.f645a.G, null);
            dVar.f645a.G.setAnimationStyle(0);
        }
        dVar.f645a.dismiss();
        int size2 = this.f633q.size();
        if (size2 > 0) {
            i10 = ((d) this.f633q.get(size2 - 1)).f647c;
        } else {
            View view = this.f638w;
            WeakHashMap<View, e0.o0> weakHashMap = d0.f3766a;
            i10 = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        this.f640y = i10;
        if (size2 != 0) {
            if (z10) {
                ((d) this.f633q.get(0)).f646b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.F;
        if (aVar != null) {
            aVar.b(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.G.removeGlobalOnLayoutListener(this.f634r);
            }
            this.G = null;
        }
        this.f639x.removeOnAttachStateChangeListener(this.f635s);
        this.H.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.F = aVar;
    }

    @Override // k.f
    public final void dismiss() {
        int size = this.f633q.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) this.f633q.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f645a.a()) {
                dVar.f645a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        Iterator it = this.f633q.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f645a.f9410c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.f
    public final j0 h() {
        if (this.f633q.isEmpty()) {
            return null;
        }
        return ((d) this.f633q.get(r0.size() - 1)).f645a.f9410c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) {
        Iterator it = this.f633q.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f646b) {
                dVar.f645a.f9410c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.F;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // k.d
    public final void k(f fVar) {
        fVar.b(this, this.f627b);
        if (a()) {
            u(fVar);
        } else {
            this.f632p.add(fVar);
        }
    }

    @Override // k.d
    public final void m(View view) {
        if (this.f638w != view) {
            this.f638w = view;
            int i10 = this.f636u;
            WeakHashMap<View, e0.o0> weakHashMap = d0.f3766a;
            this.f637v = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // k.d
    public final void n(boolean z10) {
        this.D = z10;
    }

    @Override // k.d
    public final void o(int i10) {
        if (this.f636u != i10) {
            this.f636u = i10;
            View view = this.f638w;
            WeakHashMap<View, e0.o0> weakHashMap = d0.f3766a;
            this.f637v = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        int size = this.f633q.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f633q.get(i10);
            if (!dVar.f645a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f646b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.d
    public final void p(int i10) {
        this.f641z = true;
        this.B = i10;
    }

    @Override // k.d
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // k.d
    public final void r(boolean z10) {
        this.E = z10;
    }

    @Override // k.d
    public final void s(int i10) {
        this.A = true;
        this.C = i10;
    }

    @Override // k.f
    public final void show() {
        if (a()) {
            return;
        }
        Iterator it = this.f632p.iterator();
        while (it.hasNext()) {
            u((f) it.next());
        }
        this.f632p.clear();
        View view = this.f638w;
        this.f639x = view;
        if (view != null) {
            boolean z10 = this.G == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.G = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f634r);
            }
            this.f639x.addOnAttachStateChangeListener(this.f635s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.appcompat.view.menu.f r17) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.u(androidx.appcompat.view.menu.f):void");
    }
}
