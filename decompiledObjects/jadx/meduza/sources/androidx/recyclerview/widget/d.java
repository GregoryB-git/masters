package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e0.d0;
import e0.o0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d extends RecyclerView.i implements RecyclerView.m {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1315x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1316y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1318b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f1319c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1321e;
    public final StateListDrawable f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f1322g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1323h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1324i;

    /* renamed from: j, reason: collision with root package name */
    public float f1325j;

    /* renamed from: k, reason: collision with root package name */
    public float f1326k;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f1329n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1335u;

    /* renamed from: v, reason: collision with root package name */
    public int f1336v;

    /* renamed from: w, reason: collision with root package name */
    public final a f1337w;

    /* renamed from: l, reason: collision with root package name */
    public int f1327l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1328m = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1330o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1331p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f1332q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1333r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1334s = new int[2];
    public final int[] t = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            int i10 = dVar.f1336v;
            if (i10 == 1) {
                dVar.f1335u.cancel();
            } else if (i10 != 2) {
                return;
            }
            dVar.f1336v = 3;
            ValueAnimator valueAnimator = dVar.f1335u;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            dVar.f1335u.setDuration(500);
            dVar.f1335u.start();
        }
    }

    public class b extends RecyclerView.n {
        public b(d dVar) {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1339a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f1339a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f1339a) {
                this.f1339a = false;
                return;
            }
            if (((Float) d.this.f1335u.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f1336v = 0;
                dVar.h(0);
            } else {
                d dVar2 = d.this;
                dVar2.f1336v = 2;
                dVar2.f1329n.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public class C0020d implements ValueAnimator.AnimatorUpdateListener {
        public C0020d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f1318b.setAlpha(floatValue);
            d.this.f1319c.setAlpha(floatValue);
            d.this.f1329n.invalidate();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1335u = ofFloat;
        this.f1336v = 0;
        a aVar = new a();
        this.f1337w = aVar;
        b bVar = new b(this);
        this.f1318b = stateListDrawable;
        this.f1319c = drawable;
        this.f = stateListDrawable2;
        this.f1322g = drawable2;
        this.f1320d = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f1321e = Math.max(i10, drawable.getIntrinsicWidth());
        this.f1323h = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f1324i = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f1317a = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0020d());
        RecyclerView recyclerView2 = this.f1329n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.j jVar = recyclerView2.f1196q;
            if (jVar != null) {
                jVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.t.remove(this);
            if (recyclerView2.t.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1329n;
            recyclerView3.f1201u.remove(this);
            if (recyclerView3.f1202v == this) {
                recyclerView3.f1202v = null;
            }
            ArrayList arrayList = this.f1329n.f1187j0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
            this.f1329n.removeCallbacks(aVar);
        }
        this.f1329n = recyclerView;
        if (recyclerView != null) {
            RecyclerView.j jVar2 = recyclerView.f1196q;
            if (jVar2 != null) {
                jVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            if (recyclerView.t.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            recyclerView.t.add(this);
            recyclerView.q();
            recyclerView.requestLayout();
            this.f1329n.f1201u.add(this);
            RecyclerView recyclerView4 = this.f1329n;
            if (recyclerView4.f1187j0 == null) {
                recyclerView4.f1187j0 = new ArrayList();
            }
            recyclerView4.f1187j0.add(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r8 >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (r5 >= 0) goto L53;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.a(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean c(MotionEvent motionEvent) {
        int i10 = this.f1332q;
        if (i10 == 1) {
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            boolean e10 = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (f || e10)) {
                if (e10) {
                    this.f1333r = 1;
                    this.f1326k = (int) motionEvent.getX();
                } else if (f) {
                    this.f1333r = 2;
                    this.f1325j = (int) motionEvent.getY();
                }
                h(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(Canvas canvas) {
        if (this.f1327l != this.f1329n.getWidth() || this.f1328m != this.f1329n.getHeight()) {
            this.f1327l = this.f1329n.getWidth();
            this.f1328m = this.f1329n.getHeight();
            h(0);
            return;
        }
        if (this.f1336v != 0) {
            if (this.f1330o) {
                int i10 = this.f1327l;
                int i11 = this.f1320d;
                int i12 = i10 - i11;
                int i13 = 0 - (0 / 2);
                this.f1318b.setBounds(0, 0, i11, 0);
                this.f1319c.setBounds(0, 0, this.f1321e, this.f1328m);
                RecyclerView recyclerView = this.f1329n;
                WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                if (recyclerView.getLayoutDirection() == 1) {
                    this.f1319c.draw(canvas);
                    canvas.translate(this.f1320d, i13);
                    canvas.scale(-1.0f, 1.0f);
                    this.f1318b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i12 = this.f1320d;
                } else {
                    canvas.translate(i12, 0.0f);
                    this.f1319c.draw(canvas);
                    canvas.translate(0.0f, i13);
                    this.f1318b.draw(canvas);
                }
                canvas.translate(-i12, -i13);
            }
            if (this.f1331p) {
                int i14 = this.f1328m;
                int i15 = this.f1323h;
                this.f.setBounds(0, 0, 0, i15);
                this.f1322g.setBounds(0, 0, this.f1327l, this.f1324i);
                canvas.translate(0.0f, i14 - i15);
                this.f1322g.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                this.f.draw(canvas);
                canvas.translate(-r5, -r0);
            }
        }
    }

    public final boolean e(float f, float f10) {
        return f10 >= ((float) (this.f1328m - this.f1323h)) && f >= ((float) (0 - (0 / 2))) && f <= ((float) ((0 / 2) + 0));
    }

    public final boolean f(float f, float f10) {
        RecyclerView recyclerView = this.f1329n;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f > this.f1320d) {
                return false;
            }
        } else if (f < this.f1327l - this.f1320d) {
            return false;
        }
        int i10 = 0 / 2;
        return f10 >= ((float) (0 - i10)) && f10 <= ((float) (i10 + 0));
    }

    public final void g(int i10) {
        this.f1329n.removeCallbacks(this.f1337w);
        this.f1329n.postDelayed(this.f1337w, i10);
    }

    public final void h(int i10) {
        int i11;
        if (i10 == 2 && this.f1332q != 2) {
            this.f1318b.setState(f1315x);
            this.f1329n.removeCallbacks(this.f1337w);
        }
        if (i10 == 0) {
            this.f1329n.invalidate();
        } else {
            i();
        }
        if (this.f1332q != 2 || i10 == 2) {
            i11 = i10 == 1 ? 1500 : 1200;
            this.f1332q = i10;
        }
        this.f1318b.setState(f1316y);
        g(i11);
        this.f1332q = i10;
    }

    public final void i() {
        int i10 = this.f1336v;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f1335u.cancel();
            }
        }
        this.f1336v = 1;
        ValueAnimator valueAnimator = this.f1335u;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f1335u.setDuration(500L);
        this.f1335u.setStartDelay(0L);
        this.f1335u.start();
    }
}
