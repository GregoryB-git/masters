package I;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: I.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0426x {

    /* renamed from: b, reason: collision with root package name */
    public static final C0426x f2453b;

    /* renamed from: a, reason: collision with root package name */
    public final l f2454a;

    /* renamed from: I.x$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Field f2455a;

        /* renamed from: b, reason: collision with root package name */
        public static Field f2456b;

        /* renamed from: c, reason: collision with root package name */
        public static Field f2457c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f2458d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2455a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2456b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2457c = declaredField3;
                declaredField3.setAccessible(true);
                f2458d = true;
            } catch (ReflectiveOperationException e7) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
            }
        }

        public static C0426x a(View view) {
            if (f2458d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2455a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2456b.get(obj);
                        Rect rect2 = (Rect) f2457c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0426x a7 = new b().b(A.f.c(rect)).c(A.f.c(rect2)).a();
                            a7.p(a7);
                            a7.d(view.getRootView());
                            return a7;
                        }
                    }
                } catch (IllegalAccessException e7) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
                }
            }
            return null;
        }
    }

    /* renamed from: I.x$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f2459a;

        public b() {
            int i7 = Build.VERSION.SDK_INT;
            this.f2459a = i7 >= 30 ? new e() : i7 >= 29 ? new d() : new c();
        }

        public C0426x a() {
            return this.f2459a.b();
        }

        public b b(A.f fVar) {
            this.f2459a.d(fVar);
            return this;
        }

        public b c(A.f fVar) {
            this.f2459a.f(fVar);
            return this;
        }

        public b(C0426x c0426x) {
            int i7 = Build.VERSION.SDK_INT;
            this.f2459a = i7 >= 30 ? new e(c0426x) : i7 >= 29 ? new d(c0426x) : new c(c0426x);
        }
    }

    /* renamed from: I.x$c */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static Field f2460e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f2461f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor f2462g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f2463h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f2464c;

        /* renamed from: d, reason: collision with root package name */
        public A.f f2465d;

        public c() {
            this.f2464c = h();
        }

        private static WindowInsets h() {
            if (!f2461f) {
                try {
                    f2460e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f2461f = true;
            }
            Field field = f2460e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f2463h) {
                try {
                    f2462g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f2463h = true;
            }
            Constructor constructor = f2462g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // I.C0426x.f
        @NonNull
        public C0426x b() {
            a();
            C0426x s7 = C0426x.s(this.f2464c);
            s7.n(this.f2468b);
            s7.q(this.f2465d);
            return s7;
        }

        @Override // I.C0426x.f
        public void d(A.f fVar) {
            this.f2465d = fVar;
        }

        @Override // I.C0426x.f
        public void f(@NonNull A.f fVar) {
            WindowInsets windowInsets = this.f2464c;
            if (windowInsets != null) {
                this.f2464c = windowInsets.replaceSystemWindowInsets(fVar.f2a, fVar.f3b, fVar.f4c, fVar.f5d);
            }
        }

        public c(@NonNull C0426x c0426x) {
            super(c0426x);
            this.f2464c = c0426x.r();
        }
    }

    /* renamed from: I.x$d */
    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f2466c;

        public d() {
            this.f2466c = E.a();
        }

        @Override // I.C0426x.f
        @NonNull
        public C0426x b() {
            WindowInsets build;
            a();
            build = this.f2466c.build();
            C0426x s7 = C0426x.s(build);
            s7.n(this.f2468b);
            return s7;
        }

        @Override // I.C0426x.f
        public void c(@NonNull A.f fVar) {
            this.f2466c.setMandatorySystemGestureInsets(fVar.e());
        }

        @Override // I.C0426x.f
        public void d(@NonNull A.f fVar) {
            this.f2466c.setStableInsets(fVar.e());
        }

        @Override // I.C0426x.f
        public void e(@NonNull A.f fVar) {
            this.f2466c.setSystemGestureInsets(fVar.e());
        }

        @Override // I.C0426x.f
        public void f(@NonNull A.f fVar) {
            this.f2466c.setSystemWindowInsets(fVar.e());
        }

        @Override // I.C0426x.f
        public void g(@NonNull A.f fVar) {
            this.f2466c.setTappableElementInsets(fVar.e());
        }

        public d(@NonNull C0426x c0426x) {
            super(c0426x);
            WindowInsets r7 = c0426x.r();
            this.f2466c = r7 != null ? F.a(r7) : E.a();
        }
    }

    /* renamed from: I.x$e */
    public static class e extends d {
        public e() {
        }

        public e(@NonNull C0426x c0426x) {
            super(c0426x);
        }
    }

    /* renamed from: I.x$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final C0426x f2467a;

        /* renamed from: b, reason: collision with root package name */
        public A.f[] f2468b;

        public f() {
            this(new C0426x((C0426x) null));
        }

        public final void a() {
            A.f[] fVarArr = this.f2468b;
            if (fVarArr != null) {
                A.f fVar = fVarArr[m.a(1)];
                A.f fVar2 = this.f2468b[m.a(2)];
                if (fVar2 == null) {
                    fVar2 = this.f2467a.f(2);
                }
                if (fVar == null) {
                    fVar = this.f2467a.f(1);
                }
                f(A.f.a(fVar, fVar2));
                A.f fVar3 = this.f2468b[m.a(16)];
                if (fVar3 != null) {
                    e(fVar3);
                }
                A.f fVar4 = this.f2468b[m.a(32)];
                if (fVar4 != null) {
                    c(fVar4);
                }
                A.f fVar5 = this.f2468b[m.a(64)];
                if (fVar5 != null) {
                    g(fVar5);
                }
            }
        }

        @NonNull
        public abstract C0426x b();

        public abstract void d(@NonNull A.f fVar);

        public abstract void f(@NonNull A.f fVar);

        public f(@NonNull C0426x c0426x) {
            this.f2467a = c0426x;
        }

        public void c(@NonNull A.f fVar) {
        }

        public void e(@NonNull A.f fVar) {
        }

        public void g(@NonNull A.f fVar) {
        }
    }

    /* renamed from: I.x$g */
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f2469h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f2470i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f2471j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f2472k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f2473l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f2474c;

        /* renamed from: d, reason: collision with root package name */
        public A.f[] f2475d;

        /* renamed from: e, reason: collision with root package name */
        public A.f f2476e;

        /* renamed from: f, reason: collision with root package name */
        public C0426x f2477f;

        /* renamed from: g, reason: collision with root package name */
        public A.f f2478g;

        public g(@NonNull C0426x c0426x, @NonNull g gVar) {
            this(c0426x, new WindowInsets(gVar.f2474c));
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private A.f t(int i7, boolean z7) {
            A.f fVar = A.f.f1e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    fVar = A.f.a(fVar, u(i8, z7));
                }
            }
            return fVar;
        }

        private A.f v() {
            C0426x c0426x = this.f2477f;
            return c0426x != null ? c0426x.g() : A.f.f1e;
        }

        private A.f w(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2469h) {
                x();
            }
            Method method = f2470i;
            if (method != null && f2471j != null && f2472k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2472k.get(f2473l.get(invoke));
                    if (rect != null) {
                        return A.f.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f2470i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2471j = cls;
                f2472k = cls.getDeclaredField("mVisibleInsets");
                f2473l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2472k.setAccessible(true);
                f2473l.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f2469h = true;
        }

        @Override // I.C0426x.l
        public void d(@NonNull View view) {
            A.f w7 = w(view);
            if (w7 == null) {
                w7 = A.f.f1e;
            }
            q(w7);
        }

        @Override // I.C0426x.l
        public void e(@NonNull C0426x c0426x) {
            c0426x.p(this.f2477f);
            c0426x.o(this.f2478g);
        }

        @Override // I.C0426x.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2478g, ((g) obj).f2478g);
            }
            return false;
        }

        @Override // I.C0426x.l
        @NonNull
        public A.f g(int i7) {
            return t(i7, false);
        }

        @Override // I.C0426x.l
        @NonNull
        public final A.f k() {
            if (this.f2476e == null) {
                this.f2476e = A.f.b(this.f2474c.getSystemWindowInsetLeft(), this.f2474c.getSystemWindowInsetTop(), this.f2474c.getSystemWindowInsetRight(), this.f2474c.getSystemWindowInsetBottom());
            }
            return this.f2476e;
        }

        @Override // I.C0426x.l
        @NonNull
        public C0426x m(int i7, int i8, int i9, int i10) {
            b bVar = new b(C0426x.s(this.f2474c));
            bVar.c(C0426x.m(k(), i7, i8, i9, i10));
            bVar.b(C0426x.m(i(), i7, i8, i9, i10));
            return bVar.a();
        }

        @Override // I.C0426x.l
        public boolean o() {
            return this.f2474c.isRound();
        }

        @Override // I.C0426x.l
        public void p(A.f[] fVarArr) {
            this.f2475d = fVarArr;
        }

        @Override // I.C0426x.l
        public void q(@NonNull A.f fVar) {
            this.f2478g = fVar;
        }

        @Override // I.C0426x.l
        public void r(C0426x c0426x) {
            this.f2477f = c0426x;
        }

        @NonNull
        public A.f u(int i7, boolean z7) {
            A.f g7;
            int i8;
            if (i7 == 1) {
                return z7 ? A.f.b(0, Math.max(v().f3b, k().f3b), 0, 0) : A.f.b(0, k().f3b, 0, 0);
            }
            if (i7 == 2) {
                if (z7) {
                    A.f v7 = v();
                    A.f i9 = i();
                    return A.f.b(Math.max(v7.f2a, i9.f2a), 0, Math.max(v7.f4c, i9.f4c), Math.max(v7.f5d, i9.f5d));
                }
                A.f k7 = k();
                C0426x c0426x = this.f2477f;
                g7 = c0426x != null ? c0426x.g() : null;
                int i10 = k7.f5d;
                if (g7 != null) {
                    i10 = Math.min(i10, g7.f5d);
                }
                return A.f.b(k7.f2a, 0, k7.f4c, i10);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return j();
                }
                if (i7 == 32) {
                    return h();
                }
                if (i7 == 64) {
                    return l();
                }
                if (i7 != 128) {
                    return A.f.f1e;
                }
                C0426x c0426x2 = this.f2477f;
                C0407d e7 = c0426x2 != null ? c0426x2.e() : f();
                return e7 != null ? A.f.b(e7.b(), e7.d(), e7.c(), e7.a()) : A.f.f1e;
            }
            A.f[] fVarArr = this.f2475d;
            g7 = fVarArr != null ? fVarArr[m.a(8)] : null;
            if (g7 != null) {
                return g7;
            }
            A.f k8 = k();
            A.f v8 = v();
            int i11 = k8.f5d;
            if (i11 > v8.f5d) {
                return A.f.b(0, 0, 0, i11);
            }
            A.f fVar = this.f2478g;
            return (fVar == null || fVar.equals(A.f.f1e) || (i8 = this.f2478g.f5d) <= v8.f5d) ? A.f.f1e : A.f.b(0, 0, 0, i8);
        }

        public g(@NonNull C0426x c0426x, @NonNull WindowInsets windowInsets) {
            super(c0426x);
            this.f2476e = null;
            this.f2474c = windowInsets;
        }
    }

    /* renamed from: I.x$h */
    public static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        public A.f f2479m;

        public h(@NonNull C0426x c0426x, @NonNull h hVar) {
            super(c0426x, hVar);
            this.f2479m = null;
            this.f2479m = hVar.f2479m;
        }

        @Override // I.C0426x.l
        @NonNull
        public C0426x b() {
            return C0426x.s(this.f2474c.consumeStableInsets());
        }

        @Override // I.C0426x.l
        @NonNull
        public C0426x c() {
            return C0426x.s(this.f2474c.consumeSystemWindowInsets());
        }

        @Override // I.C0426x.l
        @NonNull
        public final A.f i() {
            if (this.f2479m == null) {
                this.f2479m = A.f.b(this.f2474c.getStableInsetLeft(), this.f2474c.getStableInsetTop(), this.f2474c.getStableInsetRight(), this.f2474c.getStableInsetBottom());
            }
            return this.f2479m;
        }

        @Override // I.C0426x.l
        public boolean n() {
            return this.f2474c.isConsumed();
        }

        @Override // I.C0426x.l
        public void s(A.f fVar) {
            this.f2479m = fVar;
        }

        public h(@NonNull C0426x c0426x, @NonNull WindowInsets windowInsets) {
            super(c0426x, windowInsets);
            this.f2479m = null;
        }
    }

    /* renamed from: I.x$i */
    public static class i extends h {
        public i(@NonNull C0426x c0426x, @NonNull i iVar) {
            super(c0426x, iVar);
        }

        @Override // I.C0426x.l
        @NonNull
        public C0426x a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f2474c.consumeDisplayCutout();
            return C0426x.s(consumeDisplayCutout);
        }

        @Override // I.C0426x.g, I.C0426x.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2474c, iVar.f2474c) && Objects.equals(this.f2478g, iVar.f2478g);
        }

        @Override // I.C0426x.l
        public C0407d f() {
            DisplayCutout displayCutout;
            displayCutout = this.f2474c.getDisplayCutout();
            return C0407d.e(displayCutout);
        }

        @Override // I.C0426x.l
        public int hashCode() {
            return this.f2474c.hashCode();
        }

        public i(@NonNull C0426x c0426x, @NonNull WindowInsets windowInsets) {
            super(c0426x, windowInsets);
        }
    }

    /* renamed from: I.x$j */
    public static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        public A.f f2480n;

        /* renamed from: o, reason: collision with root package name */
        public A.f f2481o;

        /* renamed from: p, reason: collision with root package name */
        public A.f f2482p;

        public j(@NonNull C0426x c0426x, @NonNull j jVar) {
            super(c0426x, jVar);
            this.f2480n = null;
            this.f2481o = null;
            this.f2482p = null;
        }

        @Override // I.C0426x.l
        @NonNull
        public A.f h() {
            Insets mandatorySystemGestureInsets;
            if (this.f2481o == null) {
                mandatorySystemGestureInsets = this.f2474c.getMandatorySystemGestureInsets();
                this.f2481o = A.f.d(mandatorySystemGestureInsets);
            }
            return this.f2481o;
        }

        @Override // I.C0426x.l
        @NonNull
        public A.f j() {
            Insets systemGestureInsets;
            if (this.f2480n == null) {
                systemGestureInsets = this.f2474c.getSystemGestureInsets();
                this.f2480n = A.f.d(systemGestureInsets);
            }
            return this.f2480n;
        }

        @Override // I.C0426x.l
        @NonNull
        public A.f l() {
            Insets tappableElementInsets;
            if (this.f2482p == null) {
                tappableElementInsets = this.f2474c.getTappableElementInsets();
                this.f2482p = A.f.d(tappableElementInsets);
            }
            return this.f2482p;
        }

        @Override // I.C0426x.g, I.C0426x.l
        @NonNull
        public C0426x m(int i7, int i8, int i9, int i10) {
            WindowInsets inset;
            inset = this.f2474c.inset(i7, i8, i9, i10);
            return C0426x.s(inset);
        }

        public j(@NonNull C0426x c0426x, @NonNull WindowInsets windowInsets) {
            super(c0426x, windowInsets);
            this.f2480n = null;
            this.f2481o = null;
            this.f2482p = null;
        }

        @Override // I.C0426x.h, I.C0426x.l
        public void s(A.f fVar) {
        }
    }

    /* renamed from: I.x$k */
    public static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        public static final C0426x f2483q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f2483q = C0426x.s(windowInsets);
        }

        public k(@NonNull C0426x c0426x, @NonNull k kVar) {
            super(c0426x, kVar);
        }

        @Override // I.C0426x.g, I.C0426x.l
        @NonNull
        public A.f g(int i7) {
            Insets insets;
            insets = this.f2474c.getInsets(n.a(i7));
            return A.f.d(insets);
        }

        public k(@NonNull C0426x c0426x, @NonNull WindowInsets windowInsets) {
            super(c0426x, windowInsets);
        }

        @Override // I.C0426x.g, I.C0426x.l
        public final void d(@NonNull View view) {
        }
    }

    /* renamed from: I.x$m */
    public static final class m {
        public static int a(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }
    }

    /* renamed from: I.x$n */
    public static final class n {
        public static int a(int i7) {
            int statusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= statusBars;
                }
            }
            return i8;
        }
    }

    static {
        f2453b = Build.VERSION.SDK_INT >= 30 ? k.f2483q : l.f2484b;
    }

    public C0426x(C0426x c0426x) {
        if (c0426x == null) {
            this.f2454a = new l(this);
            return;
        }
        l lVar = c0426x.f2454a;
        int i7 = Build.VERSION.SDK_INT;
        this.f2454a = (i7 < 30 || !(lVar instanceof k)) ? (i7 < 29 || !(lVar instanceof j)) ? (i7 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public static A.f m(A.f fVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, fVar.f2a - i7);
        int max2 = Math.max(0, fVar.f3b - i8);
        int max3 = Math.max(0, fVar.f4c - i9);
        int max4 = Math.max(0, fVar.f5d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? fVar : A.f.b(max, max2, max3, max4);
    }

    public static C0426x s(WindowInsets windowInsets) {
        return t(windowInsets, null);
    }

    public static C0426x t(WindowInsets windowInsets, View view) {
        C0426x c0426x = new C0426x((WindowInsets) H.e.b(windowInsets));
        if (view != null && AbstractC0421s.t(view)) {
            c0426x.p(AbstractC0421s.o(view));
            c0426x.d(view.getRootView());
        }
        return c0426x;
    }

    public C0426x a() {
        return this.f2454a.a();
    }

    public C0426x b() {
        return this.f2454a.b();
    }

    public C0426x c() {
        return this.f2454a.c();
    }

    public void d(View view) {
        this.f2454a.d(view);
    }

    public C0407d e() {
        return this.f2454a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0426x) {
            return H.c.a(this.f2454a, ((C0426x) obj).f2454a);
        }
        return false;
    }

    public A.f f(int i7) {
        return this.f2454a.g(i7);
    }

    public A.f g() {
        return this.f2454a.i();
    }

    public int h() {
        return this.f2454a.k().f5d;
    }

    public int hashCode() {
        l lVar = this.f2454a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2454a.k().f2a;
    }

    public int j() {
        return this.f2454a.k().f4c;
    }

    public int k() {
        return this.f2454a.k().f3b;
    }

    public C0426x l(int i7, int i8, int i9, int i10) {
        return this.f2454a.m(i7, i8, i9, i10);
    }

    public void n(A.f[] fVarArr) {
        this.f2454a.p(fVarArr);
    }

    public void o(A.f fVar) {
        this.f2454a.q(fVar);
    }

    public void p(C0426x c0426x) {
        this.f2454a.r(c0426x);
    }

    public void q(A.f fVar) {
        this.f2454a.s(fVar);
    }

    public WindowInsets r() {
        l lVar = this.f2454a;
        if (lVar instanceof g) {
            return ((g) lVar).f2474c;
        }
        return null;
    }

    public C0426x(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        this.f2454a = i7 >= 30 ? new k(this, windowInsets) : i7 >= 29 ? new j(this, windowInsets) : i7 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    /* renamed from: I.x$l */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        public static final C0426x f2484b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        public final C0426x f2485a;

        public l(@NonNull C0426x c0426x) {
            this.f2485a = c0426x;
        }

        @NonNull
        public C0426x a() {
            return this.f2485a;
        }

        @NonNull
        public C0426x b() {
            return this.f2485a;
        }

        @NonNull
        public C0426x c() {
            return this.f2485a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && H.c.a(k(), lVar.k()) && H.c.a(i(), lVar.i()) && H.c.a(f(), lVar.f());
        }

        public C0407d f() {
            return null;
        }

        @NonNull
        public A.f g(int i7) {
            return A.f.f1e;
        }

        @NonNull
        public A.f h() {
            return k();
        }

        public int hashCode() {
            return H.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        @NonNull
        public A.f i() {
            return A.f.f1e;
        }

        @NonNull
        public A.f j() {
            return k();
        }

        @NonNull
        public A.f k() {
            return A.f.f1e;
        }

        @NonNull
        public A.f l() {
            return k();
        }

        @NonNull
        public C0426x m(int i7, int i8, int i9, int i10) {
            return f2484b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull C0426x c0426x) {
        }

        public void p(A.f[] fVarArr) {
        }

        public void q(@NonNull A.f fVar) {
        }

        public void r(C0426x c0426x) {
        }

        public void s(A.f fVar) {
        }
    }
}
