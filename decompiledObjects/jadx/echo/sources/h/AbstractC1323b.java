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

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1323b extends Drawable implements Drawable.Callback {

    /* renamed from: o, reason: collision with root package name */
    public c f14462o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f14463p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f14464q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f14465r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14467t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14469v;

    /* renamed from: w, reason: collision with root package name */
    public Runnable f14470w;

    /* renamed from: x, reason: collision with root package name */
    public long f14471x;

    /* renamed from: y, reason: collision with root package name */
    public long f14472y;

    /* renamed from: z, reason: collision with root package name */
    public C0211b f14473z;

    /* renamed from: s, reason: collision with root package name */
    public int f14466s = 255;

    /* renamed from: u, reason: collision with root package name */
    public int f14468u = -1;

    /* renamed from: h.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1323b.this.a(true);
            AbstractC1323b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A, reason: collision with root package name */
        public int f14476A;

        /* renamed from: B, reason: collision with root package name */
        public int f14477B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f14478C;

        /* renamed from: D, reason: collision with root package name */
        public ColorFilter f14479D;

        /* renamed from: E, reason: collision with root package name */
        public boolean f14480E;

        /* renamed from: F, reason: collision with root package name */
        public ColorStateList f14481F;

        /* renamed from: G, reason: collision with root package name */
        public PorterDuff.Mode f14482G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f14483H;

        /* renamed from: I, reason: collision with root package name */
        public boolean f14484I;

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1323b f14485a;

        /* renamed from: b, reason: collision with root package name */
        public Resources f14486b;

        /* renamed from: c, reason: collision with root package name */
        public int f14487c;

        /* renamed from: d, reason: collision with root package name */
        public int f14488d;

        /* renamed from: e, reason: collision with root package name */
        public int f14489e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f14490f;

        /* renamed from: g, reason: collision with root package name */
        public Drawable[] f14491g;

        /* renamed from: h, reason: collision with root package name */
        public int f14492h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f14493i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f14494j;

        /* renamed from: k, reason: collision with root package name */
        public Rect f14495k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f14496l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f14497m;

        /* renamed from: n, reason: collision with root package name */
        public int f14498n;

        /* renamed from: o, reason: collision with root package name */
        public int f14499o;

        /* renamed from: p, reason: collision with root package name */
        public int f14500p;

        /* renamed from: q, reason: collision with root package name */
        public int f14501q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f14502r;

        /* renamed from: s, reason: collision with root package name */
        public int f14503s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f14504t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f14505u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f14506v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f14507w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f14508x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f14509y;

        /* renamed from: z, reason: collision with root package name */
        public int f14510z;

        public c(c cVar, AbstractC1323b abstractC1323b, Resources resources) {
            this.f14487c = 160;
            this.f14493i = false;
            this.f14496l = false;
            this.f14508x = true;
            this.f14476A = 0;
            this.f14477B = 0;
            this.f14485a = abstractC1323b;
            this.f14486b = resources != null ? resources : cVar != null ? cVar.f14486b : null;
            int f7 = AbstractC1323b.f(resources, cVar != null ? cVar.f14487c : 0);
            this.f14487c = f7;
            if (cVar == null) {
                this.f14491g = new Drawable[10];
                this.f14492h = 0;
                return;
            }
            this.f14488d = cVar.f14488d;
            this.f14489e = cVar.f14489e;
            this.f14506v = true;
            this.f14507w = true;
            this.f14493i = cVar.f14493i;
            this.f14496l = cVar.f14496l;
            this.f14508x = cVar.f14508x;
            this.f14509y = cVar.f14509y;
            this.f14510z = cVar.f14510z;
            this.f14476A = cVar.f14476A;
            this.f14477B = cVar.f14477B;
            this.f14478C = cVar.f14478C;
            this.f14479D = cVar.f14479D;
            this.f14480E = cVar.f14480E;
            this.f14481F = cVar.f14481F;
            this.f14482G = cVar.f14482G;
            this.f14483H = cVar.f14483H;
            this.f14484I = cVar.f14484I;
            if (cVar.f14487c == f7) {
                if (cVar.f14494j) {
                    this.f14495k = new Rect(cVar.f14495k);
                    this.f14494j = true;
                }
                if (cVar.f14497m) {
                    this.f14498n = cVar.f14498n;
                    this.f14499o = cVar.f14499o;
                    this.f14500p = cVar.f14500p;
                    this.f14501q = cVar.f14501q;
                    this.f14497m = true;
                }
            }
            if (cVar.f14502r) {
                this.f14503s = cVar.f14503s;
                this.f14502r = true;
            }
            if (cVar.f14504t) {
                this.f14505u = cVar.f14505u;
                this.f14504t = true;
            }
            Drawable[] drawableArr = cVar.f14491g;
            this.f14491g = new Drawable[drawableArr.length];
            this.f14492h = cVar.f14492h;
            SparseArray sparseArray = cVar.f14490f;
            this.f14490f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f14492h);
            int i7 = this.f14492h;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f14490f.put(i8, constantState);
                    } else {
                        this.f14491g[i8] = drawableArr[i8];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i7 = this.f14492h;
            if (i7 >= this.f14491g.length) {
                o(i7, i7 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f14485a);
            this.f14491g[i7] = drawable;
            this.f14492h++;
            this.f14489e = drawable.getChangingConfigurations() | this.f14489e;
            p();
            this.f14495k = null;
            this.f14494j = false;
            this.f14497m = false;
            this.f14506v = false;
            return i7;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i7 = this.f14492h;
                Drawable[] drawableArr = this.f14491g;
                for (int i8 = 0; i8 < i7; i8++) {
                    Drawable drawable = drawableArr[i8];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i8].applyTheme(theme);
                        this.f14489e |= drawableArr[i8].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f14506v) {
                return this.f14507w;
            }
            e();
            this.f14506v = true;
            int i7 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getConstantState() == null) {
                    this.f14507w = false;
                    return false;
                }
            }
            this.f14507w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i7 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f14490f.get(i8);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f14497m = true;
            e();
            int i7 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            this.f14499o = -1;
            this.f14498n = -1;
            this.f14501q = 0;
            this.f14500p = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f14498n) {
                    this.f14498n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f14499o) {
                    this.f14499o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f14500p) {
                    this.f14500p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f14501q) {
                    this.f14501q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray sparseArray = this.f14490f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f14491g[this.f14490f.keyAt(i7)] = s(((Drawable.ConstantState) this.f14490f.valueAt(i7)).newDrawable(this.f14486b));
                }
                this.f14490f = null;
            }
        }

        public final int f() {
            return this.f14491g.length;
        }

        public final Drawable g(int i7) {
            int indexOfKey;
            Drawable drawable = this.f14491g[i7];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f14490f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
                return null;
            }
            Drawable s7 = s(((Drawable.ConstantState) this.f14490f.valueAt(indexOfKey)).newDrawable(this.f14486b));
            this.f14491g[i7] = s7;
            this.f14490f.removeAt(indexOfKey);
            if (this.f14490f.size() == 0) {
                this.f14490f = null;
            }
            return s7;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14488d | this.f14489e;
        }

        public final int h() {
            return this.f14492h;
        }

        public final int i() {
            if (!this.f14497m) {
                d();
            }
            return this.f14499o;
        }

        public final int j() {
            if (!this.f14497m) {
                d();
            }
            return this.f14501q;
        }

        public final int k() {
            if (!this.f14497m) {
                d();
            }
            return this.f14500p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f14493i) {
                return null;
            }
            Rect rect2 = this.f14495k;
            if (rect2 != null || this.f14494j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i7 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i9 = rect3.left;
                    if (i9 > rect.left) {
                        rect.left = i9;
                    }
                    int i10 = rect3.top;
                    if (i10 > rect.top) {
                        rect.top = i10;
                    }
                    int i11 = rect3.right;
                    if (i11 > rect.right) {
                        rect.right = i11;
                    }
                    int i12 = rect3.bottom;
                    if (i12 > rect.bottom) {
                        rect.bottom = i12;
                    }
                }
            }
            this.f14494j = true;
            this.f14495k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f14497m) {
                d();
            }
            return this.f14498n;
        }

        public final int n() {
            if (this.f14502r) {
                return this.f14503s;
            }
            e();
            int i7 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            int opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i8 = 1; i8 < i7; i8++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
            }
            this.f14503s = opacity;
            this.f14502r = true;
            return opacity;
        }

        public void o(int i7, int i8) {
            Drawable[] drawableArr = new Drawable[i8];
            System.arraycopy(this.f14491g, 0, drawableArr, 0, i7);
            this.f14491g = drawableArr;
        }

        public void p() {
            this.f14502r = false;
            this.f14504t = false;
        }

        public final boolean q() {
            return this.f14496l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            drawable.setLayoutDirection(this.f14510z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f14485a);
            return mutate;
        }

        public final void t(boolean z7) {
            this.f14496l = z7;
        }

        public final void u(int i7) {
            this.f14476A = i7;
        }

        public final void v(int i7) {
            this.f14477B = i7;
        }

        public final boolean w(int i7, int i8) {
            int i9 = this.f14492h;
            Drawable[] drawableArr = this.f14491g;
            boolean z7 = false;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    boolean layoutDirection = drawable.setLayoutDirection(i7);
                    if (i10 == i8) {
                        z7 = layoutDirection;
                    }
                }
            }
            this.f14510z = i7;
            return z7;
        }

        public final void x(boolean z7) {
            this.f14493i = z7;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f14486b = resources;
                int f7 = AbstractC1323b.f(resources, this.f14487c);
                int i7 = this.f14487c;
                this.f14487c = f7;
                if (i7 != f7) {
                    this.f14497m = false;
                    this.f14494j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i7) {
        if (resources != null) {
            i7 = resources.getDisplayMetrics().densityDpi;
        }
        if (i7 == 0) {
            return 160;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f14467t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f14464q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L1f
            long r9 = r13.f14471x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f14466s
            r3.setAlpha(r9)
        L1f:
            r13.f14471x = r6
            goto L36
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$c r10 = r13.f14462o
            int r10 = r10.f14476A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f14466s
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L36:
            r3 = r8
        L37:
            android.graphics.drawable.Drawable r9 = r13.f14465r
            if (r9 == 0) goto L4b
            long r10 = r13.f14472y
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f14465r = r0
        L4b:
            r13.f14472y = r6
            goto L5f
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$c r4 = r13.f14462o
            int r4 = r4.f14477B
            int r3 = r3 / r4
            int r4 = r13.f14466s
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.f14470w
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractC1323b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f14462o.b(theme);
    }

    public abstract c b();

    public int c() {
        return this.f14468u;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f14462o.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f14473z == null) {
            this.f14473z = new C0211b();
        }
        drawable.setCallback(this.f14473z.b(drawable.getCallback()));
        try {
            if (this.f14462o.f14476A <= 0 && this.f14467t) {
                drawable.setAlpha(this.f14466s);
            }
            c cVar = this.f14462o;
            if (cVar.f14480E) {
                drawable.setColorFilter(cVar.f14479D);
            } else {
                if (cVar.f14483H) {
                    B.a.m(drawable, cVar.f14481F);
                }
                c cVar2 = this.f14462o;
                if (cVar2.f14484I) {
                    B.a.n(drawable, cVar2.f14482G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14462o.f14508x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f14462o.f14478C);
            Rect rect = this.f14463p;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f14473z.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f14473z.a());
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f14465r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && B.a.e(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f14468u
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$c r0 = r9.f14462o
            int r0 = r0.f14477B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f14465r
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f14464q
            if (r0 == 0) goto L29
            r9.f14465r = r0
            h.b$c r0 = r9.f14462o
            int r0 = r0.f14477B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f14472y = r0
            goto L35
        L29:
            r9.f14465r = r4
            r9.f14472y = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f14464q
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$c r0 = r9.f14462o
            int r1 = r0.f14492h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f14464q = r0
            r9.f14468u = r10
            if (r0 == 0) goto L5a
            h.b$c r10 = r9.f14462o
            int r10 = r10.f14476A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f14471x = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f14464q = r4
            r10 = -1
            r9.f14468u = r10
        L5a:
            long r0 = r9.f14471x
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f14472y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f14470w
            if (r10 != 0) goto L73
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.f14470w = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractC1323b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14466s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14462o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f14462o.c()) {
            return null;
        }
        this.f14462o.f14488d = getChangingConfigurations();
        return this.f14462o;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f14464q;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14463p;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f14462o.q()) {
            return this.f14462o.i();
        }
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f14462o.q()) {
            return this.f14462o.m();
        }
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f14462o.q()) {
            return this.f14462o.j();
        }
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f14462o.q()) {
            return this.f14462o.k();
        }
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14464q;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f14462o.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l7 = this.f14462o.l();
        if (l7 != null) {
            rect.set(l7);
            padding = (l7.right | ((l7.left | l7.top) | l7.bottom)) != 0;
        } else {
            Drawable drawable = this.f14464q;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    public void h(c cVar) {
        this.f14462o = cVar;
        int i7 = this.f14468u;
        if (i7 >= 0) {
            Drawable g7 = cVar.g(i7);
            this.f14464q = g7;
            if (g7 != null) {
                d(g7);
            }
        }
        this.f14465r = null;
    }

    public final void i(Resources resources) {
        this.f14462o.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f14462o;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f14464q || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f14462o.f14478C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z7;
        Drawable drawable = this.f14465r;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f14465r = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f14464q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14467t) {
                this.f14464q.setAlpha(this.f14466s);
            }
        }
        if (this.f14472y != 0) {
            this.f14472y = 0L;
        } else {
            z8 = z7;
        }
        if (this.f14471x != 0) {
            this.f14471x = 0L;
        } else if (!z8) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f14469v && super.mutate() == this) {
            c b7 = b();
            b7.r();
            h(b7);
            this.f14469v = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14465r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14464q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        return this.f14462o.w(i7, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f14465r;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f14464q;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable != this.f14464q || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f14467t && this.f14466s == i7) {
            return;
        }
        this.f14467t = true;
        this.f14466s = i7;
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            if (this.f14471x == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        c cVar = this.f14462o;
        if (cVar.f14478C != z7) {
            cVar.f14478C = z7;
            Drawable drawable = this.f14464q;
            if (drawable != null) {
                B.a.i(drawable, z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f14462o;
        cVar.f14480E = true;
        if (cVar.f14479D != colorFilter) {
            cVar.f14479D = colorFilter;
            Drawable drawable = this.f14464q;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        c cVar = this.f14462o;
        if (cVar.f14508x != z7) {
            cVar.f14508x = z7;
            Drawable drawable = this.f14464q;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            B.a.j(drawable, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f14463p;
        if (rect == null) {
            this.f14463p = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f14464q;
        if (drawable != null) {
            B.a.k(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f14462o;
        cVar.f14483H = true;
        if (cVar.f14481F != colorStateList) {
            cVar.f14481F = colorStateList;
            B.a.m(this.f14464q, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f14462o;
        cVar.f14484I = true;
        if (cVar.f14482G != mode) {
            cVar.f14482G = mode;
            B.a.n(this.f14464q, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f14465r;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f14464q;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f14464q || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* renamed from: h.b$b, reason: collision with other inner class name */
    public static class C0211b implements Drawable.Callback {

        /* renamed from: o, reason: collision with root package name */
        public Drawable.Callback f14475o;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f14475o;
            this.f14475o = null;
            return callback;
        }

        public C0211b b(Drawable.Callback callback) {
            this.f14475o = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            Drawable.Callback callback = this.f14475o;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j7);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f14475o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
