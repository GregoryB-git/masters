package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import io.meduza.meduza.R;
import l.j0;
import l.p0;

/* loaded from: classes.dex */
public final class l extends k.d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A;
    public boolean C;

    /* renamed from: b, reason: collision with root package name */
    public final Context f728b;

    /* renamed from: c, reason: collision with root package name */
    public final f f729c;

    /* renamed from: d, reason: collision with root package name */
    public final e f730d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f731e;
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final int f732o;

    /* renamed from: p, reason: collision with root package name */
    public final int f733p;

    /* renamed from: q, reason: collision with root package name */
    public final p0 f734q;
    public PopupWindow.OnDismissListener t;

    /* renamed from: u, reason: collision with root package name */
    public View f737u;

    /* renamed from: v, reason: collision with root package name */
    public View f738v;

    /* renamed from: w, reason: collision with root package name */
    public j.a f739w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f740x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f741y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f742z;

    /* renamed from: r, reason: collision with root package name */
    public final a f735r = new a();

    /* renamed from: s, reason: collision with root package name */
    public final b f736s = new b();
    public int B = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (l.this.a()) {
                l lVar = l.this;
                if (lVar.f734q.F) {
                    return;
                }
                View view = lVar.f738v;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.f734q.show();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f740x;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f740x = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f740x.removeGlobalOnLayoutListener(lVar.f735r);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f728b = context;
        this.f729c = fVar;
        this.f731e = z10;
        this.f730d = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f732o = i10;
        this.f733p = i11;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f737u = view;
        this.f734q = new p0(context, i10, i11);
        fVar.b(this, context);
    }

    @Override // k.f
    public final boolean a() {
        return !this.f741y && this.f734q.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        if (fVar != this.f729c) {
            return;
        }
        dismiss();
        j.a aVar = this.f739w;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.f739w = aVar;
    }

    @Override // k.f
    public final void dismiss() {
        if (a()) {
            this.f734q.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        this.f742z = false;
        e eVar = this.f730d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // k.f
    public final j0 h() {
        return this.f734q.f9410c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f728b
            android.view.View r6 = r9.f738v
            boolean r8 = r9.f731e
            int r3 = r9.f732o
            int r4 = r9.f733p
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f739w
            r0.f723i = r2
            k.d r3 = r0.f724j
            if (r3 == 0) goto L23
            r3.d(r2)
        L23:
            boolean r2 = k.d.t(r10)
            r0.f722h = r2
            k.d r3 = r0.f724j
            if (r3 == 0) goto L30
            r3.n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.t
            r0.f725k = r2
            r2 = 0
            r9.t = r2
            androidx.appcompat.view.menu.f r2 = r9.f729c
            r2.c(r1)
            l.p0 r2 = r9.f734q
            int r3 = r2.f
            int r2 = r2.n()
            int r4 = r9.B
            android.view.View r5 = r9.f737u
            java.util.WeakHashMap<android.view.View, e0.o0> r6 = e0.d0.f3766a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f737u
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.j$a r0 = r9.f739w
            if (r0 == 0) goto L79
            r0.c(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.i(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // k.d
    public final void k(f fVar) {
    }

    @Override // k.d
    public final void m(View view) {
        this.f737u = view;
    }

    @Override // k.d
    public final void n(boolean z10) {
        this.f730d.f661c = z10;
    }

    @Override // k.d
    public final void o(int i10) {
        this.B = i10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f741y = true;
        this.f729c.c(true);
        ViewTreeObserver viewTreeObserver = this.f740x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f740x = this.f738v.getViewTreeObserver();
            }
            this.f740x.removeGlobalOnLayoutListener(this.f735r);
            this.f740x = null;
        }
        this.f738v.removeOnAttachStateChangeListener(this.f736s);
        PopupWindow.OnDismissListener onDismissListener = this.t;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f734q.f = i10;
    }

    @Override // k.d
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.t = onDismissListener;
    }

    @Override // k.d
    public final void r(boolean z10) {
        this.C = z10;
    }

    @Override // k.d
    public final void s(int i10) {
        this.f734q.k(i10);
    }

    @Override // k.f
    public final void show() {
        View view;
        Rect rect;
        boolean z10 = true;
        if (!a()) {
            if (this.f741y || (view = this.f737u) == null) {
                z10 = false;
            } else {
                this.f738v = view;
                this.f734q.G.setOnDismissListener(this);
                p0 p0Var = this.f734q;
                p0Var.f9421x = this;
                p0Var.F = true;
                p0Var.G.setFocusable(true);
                View view2 = this.f738v;
                boolean z11 = this.f740x == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f740x = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f735r);
                }
                view2.addOnAttachStateChangeListener(this.f736s);
                p0 p0Var2 = this.f734q;
                p0Var2.f9420w = view2;
                p0Var2.t = this.B;
                if (!this.f742z) {
                    this.A = k.d.l(this.f730d, this.f728b, this.f);
                    this.f742z = true;
                }
                this.f734q.q(this.A);
                this.f734q.G.setInputMethodMode(2);
                p0 p0Var3 = this.f734q;
                Rect rect2 = this.f8815a;
                if (rect2 != null) {
                    p0Var3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                p0Var3.E = rect;
                this.f734q.show();
                j0 j0Var = this.f734q.f9410c;
                j0Var.setOnKeyListener(this);
                if (this.C && this.f729c.f676m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f728b).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) j0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(this.f729c.f676m);
                    }
                    frameLayout.setEnabled(false);
                    j0Var.addHeaderView(frameLayout, null, false);
                }
                this.f734q.o(this.f730d);
                this.f734q.show();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
