/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewParent
 *  android.widget.ListView
 *  java.lang.Object
 *  java.lang.Runnable
 */
package l;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ListView;
import k.c;
import l.C;

public abstract class E
implements View.OnTouchListener,
View.OnAttachStateChangeListener {
    public final float o;
    public final int p;
    public final int q;
    public final View r;
    public Runnable s;
    public Runnable t;
    public boolean u;
    public int v;
    public final int[] w = new int[2];

    public E(View view) {
        int n8;
        this.r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.o = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.p = n8 = ViewConfiguration.getTapTimeout();
        this.q = (n8 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f8, float f9, float f10) {
        float f11 = - f10;
        if (f8 >= f11 && f9 >= f11 && f8 < (float)(view.getRight() - view.getLeft()) + f10 && f9 < (float)(view.getBottom() - view.getTop()) + f10) {
            return true;
        }
        return false;
    }

    public final void a() {
        Runnable runnable = this.t;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        if ((runnable = this.s) != null) {
            this.r.removeCallbacks(runnable);
        }
    }

    public abstract c b();

    public abstract boolean c();

    public boolean d() {
        c c8 = this.b();
        if (c8 != null && c8.i()) {
            c8.dismiss();
        }
        return true;
    }

    public void e() {
        this.a();
        View view = this.r;
        if (view.isEnabled()) {
            if (view.isLongClickable()) {
                return;
            }
            if (!this.c()) {
                return;
            }
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long l8 = SystemClock.uptimeMillis();
            MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
            view.onTouchEvent(motionEvent);
            motionEvent.recycle();
            this.u = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        boolean bl;
        View view = this.r;
        Object object = this.b();
        boolean bl2 = bl = false;
        if (object != null) {
            if (!object.i()) {
                return false;
            }
            object = (C)object.d();
            bl2 = bl;
            if (object != null) {
                if (!object.isShown()) {
                    return false;
                }
                MotionEvent motionEvent2 = MotionEvent.obtainNoHistory((MotionEvent)motionEvent);
                this.i(view, motionEvent2);
                this.j((View)object, motionEvent2);
                boolean bl3 = object.e(motionEvent2, this.v);
                motionEvent2.recycle();
                int n8 = motionEvent.getActionMasked();
                n8 = n8 != 1 && n8 != 3 ? 1 : 0;
                bl2 = bl;
                if (bl3) {
                    bl2 = bl;
                    if (n8 != 0) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.r;
        if (!view.isEnabled()) {
            return false;
        }
        int n8 = motionEvent.getActionMasked();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return false;
                    }
                } else {
                    n8 = motionEvent.findPointerIndex(this.v);
                    if (n8 < 0 || E.h(view, motionEvent.getX(n8), motionEvent.getY(n8), this.o)) return false;
                    this.a();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            this.a();
            return false;
        }
        this.v = motionEvent.getPointerId(0);
        if (this.s == null) {
            this.s = new a();
        }
        view.postDelayed(this.s, (long)this.p);
        if (this.t == null) {
            this.t = new b();
        }
        view.postDelayed(this.t, (long)this.q);
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] arrn = this.w;
        view.getLocationOnScreen(arrn);
        motionEvent.offsetLocation((float)arrn[0], (float)arrn[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] arrn = this.w;
        view.getLocationOnScreen(arrn);
        motionEvent.offsetLocation((float)(- arrn[0]), (float)(- arrn[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl;
        boolean bl2;
        boolean bl3 = this.u;
        boolean bl4 = true;
        if (bl3) {
            bl = this.f(motionEvent) || !this.d();
        } else {
            bl2 = this.g(motionEvent) && this.c();
            bl = bl2;
            if (bl2) {
                long l8 = SystemClock.uptimeMillis();
                view = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
                this.r.onTouchEvent((MotionEvent)view);
                view.recycle();
                bl = bl2;
            }
        }
        this.u = bl;
        bl2 = bl4;
        if (!bl) {
            if (bl3) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.u = false;
        this.v = -1;
        view = this.s;
        if (view != null) {
            this.r.removeCallbacks((Runnable)view);
        }
    }

    public class a
    implements Runnable {
        public void run() {
            ViewParent viewParent = E.this.r.getParent();
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b
    implements Runnable {
        public void run() {
            E.this.e();
        }
    }

}

