/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnHoverListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewConfiguration
 *  android.view.accessibility.AccessibilityManager
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package l;

import I.s;
import I.u;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import l.b0;

public class a0
implements View.OnLongClickListener,
View.OnHoverListener,
View.OnAttachStateChangeListener {
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

    public a0(View view, CharSequence charSequence) {
        this.r = new Runnable(){

            public void run() {
                a0.this.g(false);
            }
        };
        this.s = new Runnable(){

            public void run() {
                a0.this.c();
            }
        };
        this.o = view;
        this.p = charSequence;
        this.q = u.a(ViewConfiguration.get((Context)view.getContext()));
        this.b();
        view.setOnLongClickListener((View.OnLongClickListener)this);
        view.setOnHoverListener((View.OnHoverListener)this);
    }

    public static void e(a0 a02) {
        a0 a03 = x;
        if (a03 != null) {
            a03.a();
        }
        x = a02;
        if (a02 != null) {
            a02.d();
        }
    }

    public static void f(View view, CharSequence object) {
        a0 a02 = x;
        if (a02 != null && a02.o == view) {
            a0.e(null);
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = y;
            if (object != null && object.o == view) {
                object.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a0(view, (CharSequence)object);
    }

    public final void a() {
        this.o.removeCallbacks(this.r);
    }

    public final void b() {
        this.t = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
    }

    public void c() {
        if (y == this) {
            y = null;
            b0 b02 = this.v;
            if (b02 != null) {
                b02.c();
                this.v = null;
                this.b();
                this.o.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            } else {
                Log.e((String)"TooltipCompatHandler", (String)"sActiveHandler.mPopup == null");
            }
        }
        if (x == this) {
            a0.e(null);
        }
        this.o.removeCallbacks(this.s);
    }

    public final void d() {
        this.o.postDelayed(this.r, (long)ViewConfiguration.getLongPressTimeout());
    }

    /*
     * Enabled aggressive block sorting
     */
    public void g(boolean bl) {
        long l8;
        if (!s.t(this.o)) {
            return;
        }
        a0.e(null);
        Object object = y;
        if (object != null) {
            object.c();
        }
        y = this;
        this.w = bl;
        this.v = object = new b0(this.o.getContext());
        object.e(this.o, this.t, this.u, this.w, this.p);
        this.o.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        if (this.w) {
            l8 = 2500L;
        } else {
            long l9;
            if ((s.r(this.o) & 1) == 1) {
                l8 = ViewConfiguration.getLongPressTimeout();
                l9 = 3000L;
            } else {
                l8 = ViewConfiguration.getLongPressTimeout();
                l9 = 15000L;
            }
            l8 = l9 - l8;
        }
        this.o.removeCallbacks(this.s);
        this.o.postDelayed(this.s, l8);
    }

    public final boolean h(MotionEvent motionEvent) {
        int n8 = (int)motionEvent.getX();
        int n9 = (int)motionEvent.getY();
        if (Math.abs((int)(n8 - this.t)) <= this.q && Math.abs((int)(n9 - this.u)) <= this.q) {
            return false;
        }
        this.t = n8;
        this.u = n9;
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.v != null && this.w) {
            return false;
        }
        view = (AccessibilityManager)this.o.getContext().getSystemService("accessibility");
        if (view.isEnabled() && view.isTouchExplorationEnabled()) {
            return false;
        }
        int n8 = motionEvent.getAction();
        if (n8 != 7) {
            if (n8 != 10) {
                return false;
            }
            this.b();
            this.c();
            return false;
        }
        if (this.o.isEnabled() && this.v == null && this.h(motionEvent)) {
            a0.e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.t = view.getWidth() / 2;
        this.u = view.getHeight() / 2;
        this.g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.c();
    }

}

