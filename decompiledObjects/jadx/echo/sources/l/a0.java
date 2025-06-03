package l;

import I.AbstractC0421s;
import I.AbstractC0423u;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public class a0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public static a0 f16415x;

    /* renamed from: y, reason: collision with root package name */
    public static a0 f16416y;

    /* renamed from: o, reason: collision with root package name */
    public final View f16417o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f16418p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16419q;

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f16420r = new a();

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f16421s = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f16422t;

    /* renamed from: u, reason: collision with root package name */
    public int f16423u;

    /* renamed from: v, reason: collision with root package name */
    public b0 f16424v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16425w;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.g(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.c();
        }
    }

    public a0(View view, CharSequence charSequence) {
        this.f16417o = view;
        this.f16418p = charSequence;
        this.f16419q = AbstractC0423u.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void e(a0 a0Var) {
        a0 a0Var2 = f16415x;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        f16415x = a0Var;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        a0 a0Var = f16415x;
        if (a0Var != null && a0Var.f16417o == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a0(view, charSequence);
            return;
        }
        a0 a0Var2 = f16416y;
        if (a0Var2 != null && a0Var2.f16417o == view) {
            a0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void a() {
        this.f16417o.removeCallbacks(this.f16420r);
    }

    public final void b() {
        this.f16422t = Integer.MAX_VALUE;
        this.f16423u = Integer.MAX_VALUE;
    }

    public void c() {
        if (f16416y == this) {
            f16416y = null;
            b0 b0Var = this.f16424v;
            if (b0Var != null) {
                b0Var.c();
                this.f16424v = null;
                b();
                this.f16417o.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f16415x == this) {
            e(null);
        }
        this.f16417o.removeCallbacks(this.f16421s);
    }

    public final void d() {
        this.f16417o.postDelayed(this.f16420r, ViewConfiguration.getLongPressTimeout());
    }

    public void g(boolean z7) {
        long longPressTimeout;
        long j7;
        long j8;
        if (AbstractC0421s.t(this.f16417o)) {
            e(null);
            a0 a0Var = f16416y;
            if (a0Var != null) {
                a0Var.c();
            }
            f16416y = this;
            this.f16425w = z7;
            b0 b0Var = new b0(this.f16417o.getContext());
            this.f16424v = b0Var;
            b0Var.e(this.f16417o, this.f16422t, this.f16423u, this.f16425w, this.f16418p);
            this.f16417o.addOnAttachStateChangeListener(this);
            if (this.f16425w) {
                j8 = 2500;
            } else {
                if ((AbstractC0421s.r(this.f16417o) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            this.f16417o.removeCallbacks(this.f16421s);
            this.f16417o.postDelayed(this.f16421s, j8);
        }
    }

    public final boolean h(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (Math.abs(x7 - this.f16422t) <= this.f16419q && Math.abs(y7 - this.f16423u) <= this.f16419q) {
            return false;
        }
        this.f16422t = x7;
        this.f16423u = y7;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f16424v != null && this.f16425w) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f16417o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f16417o.isEnabled() && this.f16424v == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f16422t = view.getWidth() / 2;
        this.f16423u = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
