package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f9392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9393b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9394c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9395d;

    /* renamed from: e, reason: collision with root package name */
    public a f9396e;
    public b f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9397o;

    /* renamed from: p, reason: collision with root package name */
    public int f9398p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f9399q = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = l0.this.f9395d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l0 l0Var = l0.this;
            l0Var.a();
            View view = l0Var.f9395d;
            if (view.isEnabled() && !view.isLongClickable() && l0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                l0Var.f9397o = true;
            }
        }
    }

    public l0(View view) {
        this.f9395d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9392a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9393b = tapTimeout;
        this.f9394c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f;
        if (bVar != null) {
            this.f9395d.removeCallbacks(bVar);
        }
        a aVar = this.f9396e;
        if (aVar != null) {
            this.f9395d.removeCallbacks(aVar);
        }
    }

    public abstract k.f b();

    public abstract boolean c();

    public boolean d() {
        k.f b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r4 != 3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.l0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9397o = false;
        this.f9398p = -1;
        a aVar = this.f9396e;
        if (aVar != null) {
            this.f9395d.removeCallbacks(aVar);
        }
    }
}
