// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.os.SystemClock;
import k.c;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnTouchListener;

public abstract class E implements View$OnTouchListener, View$OnAttachStateChangeListener
{
    public final float o;
    public final int p;
    public final int q;
    public final View r;
    public Runnable s;
    public Runnable t;
    public boolean u;
    public int v;
    public final int[] w;
    
    public E(final View r) {
        this.w = new int[2];
        (this.r = r).setLongClickable(true);
        r.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.o = (float)ViewConfiguration.get(r.getContext()).getScaledTouchSlop();
        final int tapTimeout = ViewConfiguration.getTapTimeout();
        this.p = tapTimeout;
        this.q = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    public static boolean h(final View view, final float n, final float n2, final float n3) {
        final float n4 = -n3;
        return n >= n4 && n2 >= n4 && n < view.getRight() - view.getLeft() + n3 && n2 < view.getBottom() - view.getTop() + n3;
    }
    
    public final void a() {
        final Runnable t = this.t;
        if (t != null) {
            this.r.removeCallbacks(t);
        }
        final Runnable s = this.s;
        if (s != null) {
            this.r.removeCallbacks(s);
        }
    }
    
    public abstract c b();
    
    public abstract boolean c();
    
    public boolean d() {
        final c b = this.b();
        if (b != null && b.i()) {
            b.dismiss();
        }
        return true;
    }
    
    public void e() {
        this.a();
        final View r = this.r;
        if (r.isEnabled()) {
            if (r.isLongClickable()) {
                return;
            }
            if (!this.c()) {
                return;
            }
            r.getParent().requestDisallowInterceptTouchEvent(true);
            final long uptimeMillis = SystemClock.uptimeMillis();
            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            r.onTouchEvent(obtain);
            obtain.recycle();
            this.u = true;
        }
    }
    
    public final boolean f(final MotionEvent motionEvent) {
        final View r = this.r;
        final c b = this.b();
        boolean b3;
        final boolean b2 = b3 = false;
        if (b != null) {
            if (!b.i()) {
                return false;
            }
            final C c = (C)b.d();
            b3 = b2;
            if (c != null) {
                if (!((View)c).isShown()) {
                    return false;
                }
                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                this.i(r, obtainNoHistory);
                this.j((View)c, obtainNoHistory);
                final boolean e = c.e(obtainNoHistory, this.v);
                obtainNoHistory.recycle();
                final int actionMasked = motionEvent.getActionMasked();
                final boolean b4 = actionMasked != 1 && actionMasked != 3;
                b3 = b2;
                if (e) {
                    b3 = b2;
                    if (b4) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public final boolean g(final MotionEvent motionEvent) {
        final View r = this.r;
        if (!r.isEnabled()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.v);
                    if (pointerIndex >= 0 && !h(r, motionEvent.getX(pointerIndex), motionEvent.getY(pointerIndex), this.o)) {
                        this.a();
                        r.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    return false;
                }
            }
            this.a();
            return false;
        }
        this.v = motionEvent.getPointerId(0);
        if (this.s == null) {
            this.s = new a();
        }
        r.postDelayed(this.s, (long)this.p);
        if (this.t == null) {
            this.t = new b();
        }
        r.postDelayed(this.t, (long)this.q);
        return false;
    }
    
    public final boolean i(final View view, final MotionEvent motionEvent) {
        final int[] w = this.w;
        view.getLocationOnScreen(w);
        motionEvent.offsetLocation((float)w[0], (float)w[1]);
        return true;
    }
    
    public final boolean j(final View view, final MotionEvent motionEvent) {
        final int[] w = this.w;
        view.getLocationOnScreen(w);
        motionEvent.offsetLocation((float)(-w[0]), (float)(-w[1]));
        return true;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean u = this.u;
        final boolean b = true;
        boolean u2;
        if (u) {
            u2 = (this.f(motionEvent) || !this.d());
        }
        else {
            final boolean b2 = u2 = (this.g(motionEvent) && this.c());
            if (b2) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.r.onTouchEvent(obtain);
                obtain.recycle();
                u2 = b2;
            }
        }
        this.u = u2;
        boolean b3 = b;
        if (!u2) {
            if (u) {
                return true;
            }
            b3 = false;
        }
        return b3;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.u = false;
        this.v = -1;
        final Runnable s = this.s;
        if (s != null) {
            this.r.removeCallbacks(s);
        }
    }
    
    public class a implements Runnable
    {
        @Override
        public void run() {
            final ViewParent parent = E.this.r.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    public class b implements Runnable
    {
        @Override
        public void run() {
            E.this.e();
        }
    }
}
