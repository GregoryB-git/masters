// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import I.s;
import android.util.Log;
import android.text.TextUtils;
import I.u;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;

public class a0 implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    public static a0 x;
    public static a0 y;
    public final View o;
    public final CharSequence p;
    public final int q;
    public final Runnable r;
    public final Runnable s;
    public int t;
    public int u;
    public b0 v;
    public boolean w;
    
    public a0(final View o, final CharSequence p2) {
        this.r = new Runnable() {
            @Override
            public void run() {
                a0.this.g(false);
            }
        };
        this.s = new Runnable() {
            @Override
            public void run() {
                a0.this.c();
            }
        };
        this.o = o;
        this.p = p2;
        this.q = I.u.a(ViewConfiguration.get(o.getContext()));
        this.b();
        o.setOnLongClickListener((View$OnLongClickListener)this);
        o.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static void e(final a0 x) {
        final a0 x2 = a0.x;
        if (x2 != null) {
            x2.a();
        }
        if ((a0.x = x) != null) {
            x.d();
        }
    }
    
    public static void f(final View view, final CharSequence charSequence) {
        final a0 x = a0.x;
        if (x != null && x.o == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            final a0 y = a0.y;
            if (y != null && y.o == view) {
                y.c();
            }
            view.setOnLongClickListener((View$OnLongClickListener)null);
            view.setLongClickable(false);
            view.setOnHoverListener((View$OnHoverListener)null);
            return;
        }
        new a0(view, charSequence);
    }
    
    public final void a() {
        this.o.removeCallbacks(this.r);
    }
    
    public final void b() {
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
    }
    
    public void c() {
        if (a0.y == this) {
            a0.y = null;
            final b0 v = this.v;
            if (v != null) {
                v.c();
                this.v = null;
                this.b();
                this.o.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a0.x == this) {
            e(null);
        }
        this.o.removeCallbacks(this.s);
    }
    
    public final void d() {
        this.o.postDelayed(this.r, (long)ViewConfiguration.getLongPressTimeout());
    }
    
    public void g(final boolean w) {
        if (!I.s.t(this.o)) {
            return;
        }
        e(null);
        final a0 y = a0.y;
        if (y != null) {
            y.c();
        }
        a0.y = this;
        this.w = w;
        (this.v = new b0(this.o.getContext())).e(this.o, this.t, this.u, this.w, this.p);
        this.o.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n;
        if (this.w) {
            n = 2500L;
        }
        else {
            long n2;
            long n3;
            if ((I.s.r(this.o) & 0x1) == 0x1) {
                n2 = ViewConfiguration.getLongPressTimeout();
                n3 = 3000L;
            }
            else {
                n2 = ViewConfiguration.getLongPressTimeout();
                n3 = 15000L;
            }
            n = n3 - n2;
        }
        this.o.removeCallbacks(this.s);
        this.o.postDelayed(this.s, n);
    }
    
    public final boolean h(final MotionEvent motionEvent) {
        final int t = (int)motionEvent.getX();
        final int u = (int)motionEvent.getY();
        if (Math.abs(t - this.t) <= this.q && Math.abs(u - this.u) <= this.q) {
            return false;
        }
        this.t = t;
        this.u = u;
        return true;
    }
    
    public boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.v != null && this.w) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)this.o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action == 7) {
            if (this.o.isEnabled() && this.v == null && this.h(motionEvent)) {
                e(this);
            }
            return false;
        }
        if (action != 10) {
            return false;
        }
        this.b();
        this.c();
        return false;
    }
    
    public boolean onLongClick(final View view) {
        this.t = view.getWidth() / 2;
        this.u = view.getHeight() / 2;
        this.g(true);
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.c();
    }
}
