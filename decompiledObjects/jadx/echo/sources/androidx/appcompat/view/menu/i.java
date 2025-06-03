package androidx.appcompat.view.menu;

import I.AbstractC0421s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import e.AbstractC1232c;
import e.AbstractC1235f;
import k.AbstractC1394b;
import l.L;

/* loaded from: classes.dex */
public final class i extends AbstractC1394b implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, g, View.OnKeyListener {

    /* renamed from: J, reason: collision with root package name */
    public static final int f8512J = AbstractC1235f.f13448j;

    /* renamed from: A, reason: collision with root package name */
    public View f8513A;

    /* renamed from: B, reason: collision with root package name */
    public View f8514B;

    /* renamed from: C, reason: collision with root package name */
    public g.a f8515C;

    /* renamed from: D, reason: collision with root package name */
    public ViewTreeObserver f8516D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8517E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8518F;

    /* renamed from: G, reason: collision with root package name */
    public int f8519G;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8521I;

    /* renamed from: p, reason: collision with root package name */
    public final Context f8522p;

    /* renamed from: q, reason: collision with root package name */
    public final d f8523q;

    /* renamed from: r, reason: collision with root package name */
    public final c f8524r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8525s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8526t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8527u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8528v;

    /* renamed from: w, reason: collision with root package name */
    public final L f8529w;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8532z;

    /* renamed from: x, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f8530x = new a();

    /* renamed from: y, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f8531y = new b();

    /* renamed from: H, reason: collision with root package name */
    public int f8520H = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!i.this.i() || i.this.f8529w.n()) {
                return;
            }
            View view = i.this.f8514B;
            if (view == null || !view.isShown()) {
                i.this.dismiss();
            } else {
                i.this.f8529w.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = i.this.f8516D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    i.this.f8516D = view.getViewTreeObserver();
                }
                i iVar = i.this;
                iVar.f8516D.removeGlobalOnLayoutListener(iVar.f8530x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public i(Context context, d dVar, View view, int i7, int i8, boolean z7) {
        this.f8522p = context;
        this.f8523q = dVar;
        this.f8525s = z7;
        this.f8524r = new c(dVar, LayoutInflater.from(context), z7, f8512J);
        this.f8527u = i7;
        this.f8528v = i8;
        Resources resources = context.getResources();
        this.f8526t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1232c.f13356b));
        this.f8513A = view;
        this.f8529w = new L(context, null, i7, i8);
        dVar.b(this, context);
    }

    @Override // k.c
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z7) {
        if (dVar != this.f8523q) {
            return;
        }
        dismiss();
        g.a aVar = this.f8515C;
        if (aVar != null) {
            aVar.b(dVar, z7);
        }
    }

    @Override // k.c
    public ListView d() {
        return this.f8529w.d();
    }

    @Override // k.c
    public void dismiss() {
        if (i()) {
            this.f8529w.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        if (jVar.hasVisibleItems()) {
            f fVar = new f(this.f8522p, jVar, this.f8514B, this.f8525s, this.f8527u, this.f8528v);
            fVar.j(this.f8515C);
            fVar.g(AbstractC1394b.x(jVar));
            fVar.i(this.f8532z);
            this.f8532z = null;
            this.f8523q.d(false);
            int j7 = this.f8529w.j();
            int l7 = this.f8529w.l();
            if ((Gravity.getAbsoluteGravity(this.f8520H, AbstractC0421s.m(this.f8513A)) & 7) == 5) {
                j7 += this.f8513A.getWidth();
            }
            if (fVar.n(j7, l7)) {
                g.a aVar = this.f8515C;
                if (aVar == null) {
                    return true;
                }
                aVar.c(jVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z7) {
        this.f8518F = false;
        c cVar = this.f8524r;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        return false;
    }

    @Override // k.c
    public boolean i() {
        return !this.f8517E && this.f8529w.i();
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f8515C = aVar;
    }

    @Override // k.AbstractC1394b
    public void l(d dVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f8517E = true;
        this.f8523q.close();
        ViewTreeObserver viewTreeObserver = this.f8516D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8516D = this.f8514B.getViewTreeObserver();
            }
            this.f8516D.removeGlobalOnLayoutListener(this.f8530x);
            this.f8516D = null;
        }
        this.f8514B.removeOnAttachStateChangeListener(this.f8531y);
        PopupWindow.OnDismissListener onDismissListener = this.f8532z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f8513A = view;
    }

    @Override // k.AbstractC1394b
    public void r(boolean z7) {
        this.f8524r.d(z7);
    }

    @Override // k.AbstractC1394b
    public void s(int i7) {
        this.f8520H = i7;
    }

    @Override // k.AbstractC1394b
    public void t(int i7) {
        this.f8529w.v(i7);
    }

    @Override // k.AbstractC1394b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f8532z = onDismissListener;
    }

    @Override // k.AbstractC1394b
    public void v(boolean z7) {
        this.f8521I = z7;
    }

    @Override // k.AbstractC1394b
    public void w(int i7) {
        this.f8529w.C(i7);
    }

    public final boolean z() {
        View view;
        if (i()) {
            return true;
        }
        if (this.f8517E || (view = this.f8513A) == null) {
            return false;
        }
        this.f8514B = view;
        this.f8529w.y(this);
        this.f8529w.z(this);
        this.f8529w.x(true);
        View view2 = this.f8514B;
        boolean z7 = this.f8516D == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8516D = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8530x);
        }
        view2.addOnAttachStateChangeListener(this.f8531y);
        this.f8529w.q(view2);
        this.f8529w.t(this.f8520H);
        if (!this.f8518F) {
            this.f8519G = AbstractC1394b.o(this.f8524r, null, this.f8522p, this.f8526t);
            this.f8518F = true;
        }
        this.f8529w.s(this.f8519G);
        this.f8529w.w(2);
        this.f8529w.u(n());
        this.f8529w.a();
        ListView d7 = this.f8529w.d();
        d7.setOnKeyListener(this);
        if (this.f8521I && this.f8523q.u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f8522p).inflate(AbstractC1235f.f13447i, (ViewGroup) d7, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f8523q.u());
            }
            frameLayout.setEnabled(false);
            d7.addHeaderView(frameLayout, null, false);
        }
        this.f8529w.p(this.f8524r);
        this.f8529w.a();
        return true;
    }
}
