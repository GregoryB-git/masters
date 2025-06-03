package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import h.d;
import y.a;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f7017u = 0;

    /* renamed from: a, reason: collision with root package name */
    public c f7018a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f7019b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f7020c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f7021d;
    public boolean f;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7024p;

    /* renamed from: q, reason: collision with root package name */
    public a f7025q;

    /* renamed from: r, reason: collision with root package name */
    public long f7026r;

    /* renamed from: s, reason: collision with root package name */
    public long f7027s;
    public C0104b t;

    /* renamed from: e, reason: collision with root package name */
    public int f7022e = 255;

    /* renamed from: o, reason: collision with root package name */
    public int f7023o = -1;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f7028a;

        public a(d dVar) {
            this.f7028a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7028a.a(true);
            this.f7028a.invalidateSelf();
        }
    }

    /* renamed from: h.b$b, reason: collision with other inner class name */
    public static class C0104b implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        public Drawable.Callback f7029a;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f7029a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f7029a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a, reason: collision with root package name */
        public final b f7030a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f7031b;

        /* renamed from: c, reason: collision with root package name */
        public int f7032c;

        /* renamed from: d, reason: collision with root package name */
        public int f7033d;

        /* renamed from: e, reason: collision with root package name */
        public int f7034e;
        public SparseArray<Drawable.ConstantState> f;

        /* renamed from: g, reason: collision with root package name */
        public Drawable[] f7035g;

        /* renamed from: h, reason: collision with root package name */
        public int f7036h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f7037i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f7038j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f7039k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7040l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f7041m;

        /* renamed from: n, reason: collision with root package name */
        public int f7042n;

        /* renamed from: o, reason: collision with root package name */
        public int f7043o;

        /* renamed from: p, reason: collision with root package name */
        public int f7044p;

        /* renamed from: q, reason: collision with root package name */
        public int f7045q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f7046r;

        /* renamed from: s, reason: collision with root package name */
        public int f7047s;
        public boolean t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f7048u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f7049v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f7050w;

        /* renamed from: x, reason: collision with root package name */
        public int f7051x;

        /* renamed from: y, reason: collision with root package name */
        public int f7052y;

        /* renamed from: z, reason: collision with root package name */
        public int f7053z;

        public c(c cVar, b bVar, Resources resources) {
            this.f7037i = false;
            this.f7040l = false;
            this.f7050w = true;
            this.f7052y = 0;
            this.f7053z = 0;
            this.f7030a = bVar;
            this.f7031b = resources != null ? resources : cVar != null ? cVar.f7031b : null;
            int i10 = cVar != null ? cVar.f7032c : 0;
            int i11 = b.f7017u;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f7032c = i10;
            if (cVar == null) {
                this.f7035g = new Drawable[10];
                this.f7036h = 0;
                return;
            }
            this.f7033d = cVar.f7033d;
            this.f7034e = cVar.f7034e;
            this.f7048u = true;
            this.f7049v = true;
            this.f7037i = cVar.f7037i;
            this.f7040l = cVar.f7040l;
            this.f7050w = cVar.f7050w;
            this.f7051x = cVar.f7051x;
            this.f7052y = cVar.f7052y;
            this.f7053z = cVar.f7053z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            if (cVar.f7032c == i10) {
                if (cVar.f7038j) {
                    this.f7039k = cVar.f7039k != null ? new Rect(cVar.f7039k) : null;
                    this.f7038j = true;
                }
                if (cVar.f7041m) {
                    this.f7042n = cVar.f7042n;
                    this.f7043o = cVar.f7043o;
                    this.f7044p = cVar.f7044p;
                    this.f7045q = cVar.f7045q;
                    this.f7041m = true;
                }
            }
            if (cVar.f7046r) {
                this.f7047s = cVar.f7047s;
                this.f7046r = true;
            }
            if (cVar.t) {
                this.t = true;
            }
            Drawable[] drawableArr = cVar.f7035g;
            this.f7035g = new Drawable[drawableArr.length];
            this.f7036h = cVar.f7036h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f;
            this.f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f7036h);
            int i12 = this.f7036h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i13, constantState);
                    } else {
                        this.f7035g[i13] = drawableArr[i13];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f7036h;
            if (i10 >= this.f7035g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f7035g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f7035g = drawableArr;
                int[][] iArr = new int[i11][];
                System.arraycopy(aVar.H, 0, iArr, 0, i10);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f7030a);
            this.f7035g[i10] = drawable;
            this.f7036h++;
            this.f7034e = drawable.getChangingConfigurations() | this.f7034e;
            this.f7046r = false;
            this.t = false;
            this.f7039k = null;
            this.f7038j = false;
            this.f7041m = false;
            this.f7048u = false;
            return i10;
        }

        public final void b() {
            this.f7041m = true;
            c();
            int i10 = this.f7036h;
            Drawable[] drawableArr = this.f7035g;
            this.f7043o = -1;
            this.f7042n = -1;
            this.f7045q = 0;
            this.f7044p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f7042n) {
                    this.f7042n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f7043o) {
                    this.f7043o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f7044p) {
                    this.f7044p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f7045q) {
                    this.f7045q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f.keyAt(i10);
                    Drawable.ConstantState valueAt = this.f.valueAt(i10);
                    Drawable[] drawableArr = this.f7035g;
                    Drawable newDrawable = valueAt.newDrawable(this.f7031b);
                    a.b.b(newDrawable, this.f7051x);
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f7030a);
                    drawableArr[keyAt] = mutate;
                }
                this.f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i10 = this.f7036h;
            Drawable[] drawableArr = this.f7035g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (a.C0261a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f7035g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f.valueAt(indexOfKey).newDrawable(this.f7031b);
            a.b.b(newDrawable, this.f7051x);
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f7030a);
            this.f7035g[i10] = mutate;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f7033d | this.f7034e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f7020c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f7026r
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f7022e
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$c r10 = r13.f7018a
            int r10 = r10.f7052y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f7022e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f7026r = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f7021d
            if (r9 == 0) goto L5d
            long r10 = r13.f7027s
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f7021d = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$c r4 = r13.f7018a
            int r4 = r4.f7053z
            int r3 = r3 / r4
            int r4 = r13.f7022e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f7027s = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            h.b$a r14 = r13.f7025q
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f7018a;
        if (theme == null) {
            cVar.getClass();
            return;
        }
        cVar.c();
        int i10 = cVar.f7036h;
        Drawable[] drawableArr = cVar.f7035g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && a.C0261a.b(drawable)) {
                a.C0261a.a(drawableArr[i11], theme);
                cVar.f7034e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            cVar.f7031b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = cVar.f7032c;
            cVar.f7032c = i12;
            if (i13 != i12) {
                cVar.f7041m = false;
                cVar.f7038j = false;
            }
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.t == null) {
            this.t = new C0104b();
        }
        C0104b c0104b = this.t;
        c0104b.f7029a = drawable.getCallback();
        drawable.setCallback(c0104b);
        try {
            if (this.f7018a.f7052y <= 0 && this.f) {
                drawable.setAlpha(this.f7022e);
            }
            c cVar = this.f7018a;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.C0261a.h(drawable, cVar.D);
                }
                c cVar2 = this.f7018a;
                if (cVar2.G) {
                    a.C0261a.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7018a.f7050w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            a.b.b(drawable, a.b.a(this));
            drawable.setAutoMirrored(this.f7018a.A);
            Rect rect = this.f7019b;
            if (rect != null) {
                a.C0261a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0104b c0104b2 = this.t;
            Drawable.Callback callback = c0104b2.f7029a;
            c0104b2.f7029a = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f7018a.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f7023o
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$c r0 = r9.f7018a
            int r0 = r0.f7053z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f7021d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f7020c
            if (r0 == 0) goto L29
            r9.f7021d = r0
            h.b$c r0 = r9.f7018a
            int r0 = r0.f7053z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f7027s = r0
            goto L35
        L29:
            r9.f7021d = r4
            r9.f7027s = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f7020c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$c r0 = r9.f7018a
            int r1 = r0.f7036h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f7020c = r0
            r9.f7023o = r10
            if (r0 == 0) goto L5a
            h.b$c r10 = r9.f7018a
            int r10 = r10.f7052y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f7026r = r2
        L51:
            r9.c(r0)
            goto L5a
        L55:
            r9.f7020c = r4
            r10 = -1
            r9.f7023o = r10
        L5a:
            long r0 = r9.f7026r
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f7027s
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            h.b$a r10 = r9.f7025q
            if (r10 != 0) goto L76
            h.b$a r10 = new h.b$a
            r1 = r9
            h.d r1 = (h.d) r1
            r10.<init>(r1)
            r9.f7025q = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f7021d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7022e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f7018a;
        return changingConfigurations | cVar.f7034e | cVar.f7033d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f7018a;
        boolean z10 = true;
        if (!cVar.f7048u) {
            cVar.c();
            cVar.f7048u = true;
            int i10 = cVar.f7036h;
            Drawable[] drawableArr = cVar.f7035g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    cVar.f7049v = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    cVar.f7049v = false;
                    z10 = false;
                    break;
                }
                i11++;
            }
        } else {
            z10 = cVar.f7049v;
        }
        if (!z10) {
            return null;
        }
        this.f7018a.f7033d = getChangingConfigurations();
        return this.f7018a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f7020c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7019b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f7018a;
        if (cVar.f7040l) {
            if (!cVar.f7041m) {
                cVar.b();
            }
            return cVar.f7043o;
        }
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f7018a;
        if (cVar.f7040l) {
            if (!cVar.f7041m) {
                cVar.b();
            }
            return cVar.f7042n;
        }
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f7018a;
        if (cVar.f7040l) {
            if (!cVar.f7041m) {
                cVar.b();
            }
            return cVar.f7045q;
        }
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f7018a;
        if (cVar.f7040l) {
            if (!cVar.f7041m) {
                cVar.b();
            }
            return cVar.f7044p;
        }
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7020c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f7018a;
        if (cVar.f7046r) {
            return cVar.f7047s;
        }
        cVar.c();
        int i10 = cVar.f7036h;
        Drawable[] drawableArr = cVar.f7035g;
        int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i11 = 1; i11 < i10; i11++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
        }
        cVar.f7047s = opacity;
        cVar.f7046r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f7018a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!cVar.f7037i) {
            Rect rect3 = cVar.f7039k;
            if (rect3 != null || cVar.f7038j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f7036h;
                Drawable[] drawableArr = cVar.f7035g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f7038j = true;
                cVar.f7039k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f7020c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f7018a.A && a.b.a(this) == 1) {
            z10 = true;
        }
        if (z10) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f7018a;
        if (cVar != null) {
            cVar.f7046r = false;
            cVar.t = false;
        }
        if (drawable != this.f7020c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f7018a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f7021d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f7021d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f7020c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.f7020c.setAlpha(this.f7022e);
            }
        }
        if (this.f7027s != 0) {
            this.f7027s = 0L;
            z10 = true;
        }
        if (this.f7026r != 0) {
            this.f7026r = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7024p && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f7024p = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7021d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7020c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f7018a;
        int i11 = this.f7023o;
        int i12 = cVar.f7036h;
        Drawable[] drawableArr = cVar.f7035g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = a.b.b(drawable, i10);
                if (i13 == i11) {
                    z10 = b10;
                }
            }
        }
        cVar.f7051x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f7021d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f7020c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7021d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f7020c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f7020c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f && this.f7022e == i10) {
            return;
        }
        this.f = true;
        this.f7022e = i10;
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            if (this.f7026r == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f7018a;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f7020c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f7018a;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f7020c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f7018a;
        if (cVar.f7050w != z10) {
            cVar.f7050w = z10;
            Drawable drawable = this.f7020c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f10) {
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            a.C0261a.e(drawable, f, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f7019b;
        if (rect == null) {
            this.f7019b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f7020c;
        if (drawable != null) {
            a.C0261a.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f7018a;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            y.a.b(this.f7020c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f7018a;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            y.a.c(this.f7020c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f7021d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f7020c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f7020c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
