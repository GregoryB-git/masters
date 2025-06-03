package g;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b.a0;
import e0.d0;
import e0.o0;
import e0.q0;
import e0.r0;
import g.a;
import g.g;
import j.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.h0;

/* loaded from: classes.dex */
public final class x extends g.a implements ActionBarOverlayLayout.d {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f5674a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5675b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f5676c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f5677d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f5678e;
    public ActionBarContextView f;

    /* renamed from: g, reason: collision with root package name */
    public View f5679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5680h;

    /* renamed from: i, reason: collision with root package name */
    public d f5681i;

    /* renamed from: j, reason: collision with root package name */
    public d f5682j;

    /* renamed from: k, reason: collision with root package name */
    public a.InterfaceC0121a f5683k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5684l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<a.b> f5685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5686n;

    /* renamed from: o, reason: collision with root package name */
    public int f5687o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5688p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5689q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5690r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5691s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public j.g f5692u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5693v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5694w;

    /* renamed from: x, reason: collision with root package name */
    public final a f5695x;

    /* renamed from: y, reason: collision with root package name */
    public final b f5696y;

    /* renamed from: z, reason: collision with root package name */
    public final c f5697z;

    public class a extends q0 {
        public a() {
            super(0);
        }

        @Override // e0.p0
        public final void c() {
            View view;
            x xVar = x.this;
            if (xVar.f5688p && (view = xVar.f5679g) != null) {
                view.setTranslationY(0.0f);
                x.this.f5677d.setTranslationY(0.0f);
            }
            x.this.f5677d.setVisibility(8);
            x.this.f5677d.setTransitioning(false);
            x xVar2 = x.this;
            xVar2.f5692u = null;
            a.InterfaceC0121a interfaceC0121a = xVar2.f5683k;
            if (interfaceC0121a != null) {
                interfaceC0121a.b(xVar2.f5682j);
                xVar2.f5682j = null;
                xVar2.f5683k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = x.this.f5676c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                d0.c.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends q0 {
        public b() {
            super(0);
        }

        @Override // e0.p0
        public final void c() {
            x xVar = x.this;
            xVar.f5692u = null;
            xVar.f5677d.requestLayout();
        }
    }

    public class c implements r0 {
        public c() {
        }
    }

    public class d extends j.a implements f.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f5701c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f5702d;

        /* renamed from: e, reason: collision with root package name */
        public a.InterfaceC0121a f5703e;
        public WeakReference<View> f;

        public d(Context context, g.e eVar) {
            this.f5701c = context;
            this.f5703e = eVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f675l = 1;
            this.f5702d = fVar;
            fVar.f669e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0121a interfaceC0121a = this.f5703e;
            if (interfaceC0121a != null) {
                return interfaceC0121a.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f5703e == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = x.this.f.f9253d;
            if (aVar != null) {
                aVar.l();
            }
        }

        @Override // j.a
        public final void c() {
            x xVar = x.this;
            if (xVar.f5681i != this) {
                return;
            }
            if ((xVar.f5689q || xVar.f5690r) ? false : true) {
                this.f5703e.b(this);
            } else {
                xVar.f5682j = this;
                xVar.f5683k = this.f5703e;
            }
            this.f5703e = null;
            x.this.v(false);
            ActionBarContextView actionBarContextView = x.this.f;
            if (actionBarContextView.f756s == null) {
                actionBarContextView.h();
            }
            x xVar2 = x.this;
            xVar2.f5676c.setHideOnContentScrollEnabled(xVar2.f5694w);
            x.this.f5681i = null;
        }

        @Override // j.a
        public final View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // j.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f5702d;
        }

        @Override // j.a
        public final MenuInflater f() {
            return new j.f(this.f5701c);
        }

        @Override // j.a
        public final CharSequence g() {
            return x.this.f.getSubtitle();
        }

        @Override // j.a
        public final CharSequence h() {
            return x.this.f.getTitle();
        }

        @Override // j.a
        public final void i() {
            if (x.this.f5681i != this) {
                return;
            }
            this.f5702d.w();
            try {
                this.f5703e.c(this, this.f5702d);
            } finally {
                this.f5702d.v();
            }
        }

        @Override // j.a
        public final boolean j() {
            return x.this.f.A;
        }

        @Override // j.a
        public final void k(View view) {
            x.this.f.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // j.a
        public final void l(int i10) {
            m(x.this.f5674a.getResources().getString(i10));
        }

        @Override // j.a
        public final void m(CharSequence charSequence) {
            x.this.f.setSubtitle(charSequence);
        }

        @Override // j.a
        public final void n(int i10) {
            o(x.this.f5674a.getResources().getString(i10));
        }

        @Override // j.a
        public final void o(CharSequence charSequence) {
            x.this.f.setTitle(charSequence);
        }

        @Override // j.a
        public final void p(boolean z10) {
            this.f8192b = z10;
            x.this.f.setTitleOptional(z10);
        }
    }

    public x(Activity activity, boolean z10) {
        new ArrayList();
        this.f5685m = new ArrayList<>();
        this.f5687o = 0;
        this.f5688p = true;
        this.t = true;
        this.f5695x = new a();
        this.f5696y = new b();
        this.f5697z = new c();
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z10) {
            return;
        }
        this.f5679g = decorView.findViewById(R.id.content);
    }

    public x(Dialog dialog) {
        new ArrayList();
        this.f5685m = new ArrayList<>();
        this.f5687o = 0;
        this.f5688p = true;
        this.t = true;
        this.f5695x = new a();
        this.f5696y = new b();
        this.f5697z = new c();
        w(dialog.getWindow().getDecorView());
    }

    @Override // g.a
    public final boolean b() {
        h0 h0Var = this.f5678e;
        if (h0Var == null || !h0Var.j()) {
            return false;
        }
        this.f5678e.collapseActionView();
        return true;
    }

    @Override // g.a
    public final void c(boolean z10) {
        if (z10 == this.f5684l) {
            return;
        }
        this.f5684l = z10;
        int size = this.f5685m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5685m.get(i10).a();
        }
    }

    @Override // g.a
    public final int d() {
        return this.f5678e.q();
    }

    @Override // g.a
    public final Context e() {
        if (this.f5675b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5674a.getTheme().resolveAttribute(io.meduza.meduza.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f5675b = new ContextThemeWrapper(this.f5674a, i10);
            } else {
                this.f5675b = this.f5674a;
            }
        }
        return this.f5675b;
    }

    @Override // g.a
    public final void f() {
        if (this.f5689q) {
            return;
        }
        this.f5689q = true;
        y(false);
    }

    @Override // g.a
    public final boolean h() {
        int height = this.f5677d.getHeight();
        return this.t && (height == 0 || this.f5676c.getActionBarHideOffset() < height);
    }

    @Override // g.a
    public final void i() {
        x(this.f5674a.getResources().getBoolean(io.meduza.meduza.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // g.a
    public final boolean k(int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.f5681i;
        if (dVar == null || (fVar = dVar.f5702d) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return fVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // g.a
    public final void n(ColorDrawable colorDrawable) {
        this.f5677d.setPrimaryBackground(colorDrawable);
    }

    @Override // g.a
    public final void o(boolean z10) {
        if (this.f5680h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        int q10 = this.f5678e.q();
        this.f5680h = true;
        this.f5678e.k((i10 & 4) | ((-5) & q10));
    }

    @Override // g.a
    public final void p(boolean z10) {
        this.f5678e.k(((z10 ? 8 : 0) & 8) | ((-9) & this.f5678e.q()));
    }

    @Override // g.a
    public final void q(boolean z10) {
        j.g gVar;
        this.f5693v = z10;
        if (z10 || (gVar = this.f5692u) == null) {
            return;
        }
        gVar.a();
    }

    @Override // g.a
    public final void r(CharSequence charSequence) {
        this.f5678e.setTitle(charSequence);
    }

    @Override // g.a
    public final void s(CharSequence charSequence) {
        this.f5678e.setWindowTitle(charSequence);
    }

    @Override // g.a
    public final void t() {
        if (this.f5689q) {
            this.f5689q = false;
            y(false);
        }
    }

    @Override // g.a
    public final j.a u(g.e eVar) {
        d dVar = this.f5681i;
        if (dVar != null) {
            dVar.c();
        }
        this.f5676c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar2 = new d(this.f.getContext(), eVar);
        dVar2.f5702d.w();
        try {
            if (!dVar2.f5703e.a(dVar2, dVar2.f5702d)) {
                return null;
            }
            this.f5681i = dVar2;
            dVar2.i();
            this.f.f(dVar2);
            v(true);
            return dVar2;
        } finally {
            dVar2.f5702d.v();
        }
    }

    public final void v(boolean z10) {
        o0 o10;
        o0 e10;
        if (z10) {
            if (!this.f5691s) {
                this.f5691s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5676c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f5691s) {
            this.f5691s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5676c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f5677d;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        if (!actionBarContainer.isLaidOut()) {
            if (z10) {
                this.f5678e.p(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.f5678e.p(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            e10 = this.f5678e.o(4, 100L);
            o10 = this.f.e(0, 200L);
        } else {
            o10 = this.f5678e.o(0, 200L);
            e10 = this.f.e(8, 100L);
        }
        j.g gVar = new j.g();
        gVar.f8241a.add(e10);
        View view = e10.f3813a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o10.f3813a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f8241a.add(o10);
        gVar.b();
    }

    public final void w(View view) {
        h0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(io.meduza.meduza.R.id.decor_content_parent);
        this.f5676c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(io.meduza.meduza.R.id.action_bar);
        if (findViewById instanceof h0) {
            wrapper = (h0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder l10 = defpackage.f.l("Can't make a decor toolbar out of ");
                l10.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(l10.toString());
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f5678e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(io.meduza.meduza.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(io.meduza.meduza.R.id.action_bar_container);
        this.f5677d = actionBarContainer;
        h0 h0Var = this.f5678e;
        if (h0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(x.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f5674a = h0Var.getContext();
        if ((this.f5678e.q() & 4) != 0) {
            this.f5680h = true;
        }
        Context context = this.f5674a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f5678e.i();
        x(context.getResources().getBoolean(io.meduza.meduza.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f5674a.obtainStyledAttributes(null, a0.f, io.meduza.meduza.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5676c;
            if (!actionBarOverlayLayout2.f770p) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f5694w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f5677d;
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.d.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void x(boolean z10) {
        this.f5686n = z10;
        if (z10) {
            this.f5677d.setTabContainer(null);
            this.f5678e.l();
        } else {
            this.f5678e.l();
            this.f5677d.setTabContainer(null);
        }
        this.f5678e.n();
        h0 h0Var = this.f5678e;
        boolean z11 = this.f5686n;
        h0Var.t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5676c;
        boolean z12 = this.f5686n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z10) {
        View view;
        View view2;
        View view3;
        if (!(this.f5691s || !(this.f5689q || this.f5690r))) {
            if (this.t) {
                this.t = false;
                j.g gVar = this.f5692u;
                if (gVar != null) {
                    gVar.a();
                }
                if (this.f5687o != 0 || (!this.f5693v && !z10)) {
                    this.f5695x.c();
                    return;
                }
                this.f5677d.setAlpha(1.0f);
                this.f5677d.setTransitioning(true);
                j.g gVar2 = new j.g();
                float f = -this.f5677d.getHeight();
                if (z10) {
                    this.f5677d.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                o0 a10 = d0.a(this.f5677d);
                a10.e(f);
                final c cVar = this.f5697z;
                final View view4 = a10.f3813a.get();
                if (view4 != null) {
                    view4.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener(cVar, view4) { // from class: e0.m0

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ r0 f3811a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) g.x.this.f5677d.getParent()).invalidate();
                        }
                    } : null);
                }
                if (!gVar2.f8245e) {
                    gVar2.f8241a.add(a10);
                }
                if (this.f5688p && (view = this.f5679g) != null) {
                    o0 a11 = d0.a(view);
                    a11.e(f);
                    if (!gVar2.f8245e) {
                        gVar2.f8241a.add(a11);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = A;
                boolean z11 = gVar2.f8245e;
                if (!z11) {
                    gVar2.f8243c = accelerateInterpolator;
                }
                if (!z11) {
                    gVar2.f8242b = 250L;
                }
                a aVar = this.f5695x;
                if (!z11) {
                    gVar2.f8244d = aVar;
                }
                this.f5692u = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.t) {
            return;
        }
        this.t = true;
        j.g gVar3 = this.f5692u;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f5677d.setVisibility(0);
        if (this.f5687o == 0 && (this.f5693v || z10)) {
            this.f5677d.setTranslationY(0.0f);
            float f10 = -this.f5677d.getHeight();
            if (z10) {
                this.f5677d.getLocationInWindow(new int[]{0, 0});
                f10 -= r9[1];
            }
            this.f5677d.setTranslationY(f10);
            j.g gVar4 = new j.g();
            o0 a12 = d0.a(this.f5677d);
            a12.e(0.0f);
            final c cVar2 = this.f5697z;
            final View view5 = a12.f3813a.get();
            if (view5 != null) {
                view5.animate().setUpdateListener(cVar2 != null ? new ValueAnimator.AnimatorUpdateListener(cVar2, view5) { // from class: e0.m0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ r0 f3811a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) g.x.this.f5677d.getParent()).invalidate();
                    }
                } : null);
            }
            if (!gVar4.f8245e) {
                gVar4.f8241a.add(a12);
            }
            if (this.f5688p && (view3 = this.f5679g) != null) {
                view3.setTranslationY(f10);
                o0 a13 = d0.a(this.f5679g);
                a13.e(0.0f);
                if (!gVar4.f8245e) {
                    gVar4.f8241a.add(a13);
                }
            }
            DecelerateInterpolator decelerateInterpolator = B;
            boolean z12 = gVar4.f8245e;
            if (!z12) {
                gVar4.f8243c = decelerateInterpolator;
            }
            if (!z12) {
                gVar4.f8242b = 250L;
            }
            b bVar = this.f5696y;
            if (!z12) {
                gVar4.f8244d = bVar;
            }
            this.f5692u = gVar4;
            gVar4.b();
        } else {
            this.f5677d.setAlpha(1.0f);
            this.f5677d.setTranslationY(0.0f);
            if (this.f5688p && (view2 = this.f5679g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f5696y.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5676c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            d0.c.c(actionBarOverlayLayout);
        }
    }
}
