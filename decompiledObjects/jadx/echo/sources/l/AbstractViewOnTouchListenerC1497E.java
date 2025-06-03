package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1497E implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final float f16287o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16288p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16289q;

    /* renamed from: r, reason: collision with root package name */
    public final View f16290r;

    /* renamed from: s, reason: collision with root package name */
    public Runnable f16291s;

    /* renamed from: t, reason: collision with root package name */
    public Runnable f16292t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16293u;

    /* renamed from: v, reason: collision with root package name */
    public int f16294v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f16295w = new int[2];

    /* renamed from: l.E$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC1497E.this.f16290r.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: l.E$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1497E.this.e();
        }
    }

    public AbstractViewOnTouchListenerC1497E(View view) {
        this.f16290r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f16287o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f16288p = tapTimeout;
        this.f16289q = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    public final void a() {
        Runnable runnable = this.f16292t;
        if (runnable != null) {
            this.f16290r.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f16291s;
        if (runnable2 != null) {
            this.f16290r.removeCallbacks(runnable2);
        }
    }

    public abstract k.c b();

    public abstract boolean c();

    public boolean d() {
        k.c b7 = b();
        if (b7 == null || !b7.i()) {
            return true;
        }
        b7.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f16290r;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f16293u = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        AbstractC1495C abstractC1495C;
        View view = this.f16290r;
        k.c b7 = b();
        if (b7 == null || !b7.i() || (abstractC1495C = (AbstractC1495C) b7.d()) == null || !abstractC1495C.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(abstractC1495C, obtainNoHistory);
        boolean e7 = abstractC1495C.e(obtainNoHistory, this.f16294v);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e7 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f16290r
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f16294v
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f16287o
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f16294v = r6
            java.lang.Runnable r6 = r5.f16291s
            if (r6 != 0) goto L52
            l.E$a r6 = new l.E$a
            r6.<init>()
            r5.f16291s = r6
        L52:
            java.lang.Runnable r6 = r5.f16291s
            int r1 = r5.f16288p
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f16292t
            if (r6 != 0) goto L65
            l.E$b r6 = new l.E$b
            r6.<init>()
            r5.f16292t = r6
        L65:
            java.lang.Runnable r6 = r5.f16292t
            int r1 = r5.f16289q
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC1497E.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f16295w);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f16295w);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.f16293u;
        if (z8) {
            z7 = f(motionEvent) || !d();
        } else {
            z7 = g(motionEvent) && c();
            if (z7) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f16290r.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f16293u = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f16293u = false;
        this.f16294v = -1;
        Runnable runnable = this.f16291s;
        if (runnable != null) {
            this.f16290r.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
