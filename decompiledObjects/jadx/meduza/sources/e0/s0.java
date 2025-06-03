package e0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import e0.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f3822b;

    /* renamed from: a, reason: collision with root package name */
    public final k f3823a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Field f3824a;

        /* renamed from: b, reason: collision with root package name */
        public static Field f3825b;

        /* renamed from: c, reason: collision with root package name */
        public static Field f3826c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f3827d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3824a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3825b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3826c = declaredField3;
                declaredField3.setAccessible(true);
                f3827d = true;
            } catch (ReflectiveOperationException e10) {
                StringBuilder l10 = defpackage.f.l("Failed to get visible insets from AttachInfo ");
                l10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", l10.toString(), e10);
            }
        }
    }

    public static class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public static Field f3828c = null;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f3829d = false;

        /* renamed from: e, reason: collision with root package name */
        public static Constructor<WindowInsets> f3830e = null;
        public static boolean f = false;

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f3831a;

        /* renamed from: b, reason: collision with root package name */
        public x.b f3832b;

        public b() {
            this.f3831a = e();
        }

        public b(s0 s0Var) {
            super(s0Var);
            this.f3831a = s0Var.b();
        }

        private static WindowInsets e() {
            if (!f3829d) {
                try {
                    f3828c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3829d = true;
            }
            Field field = f3828c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f) {
                try {
                    f3830e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = f3830e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // e0.s0.e
        public s0 b() {
            a();
            s0 c10 = s0.c(this.f3831a, null);
            c10.f3823a.k(null);
            c10.f3823a.m(this.f3832b);
            return c10;
        }

        @Override // e0.s0.e
        public void c(x.b bVar) {
            this.f3832b = bVar;
        }

        @Override // e0.s0.e
        public void d(x.b bVar) {
            WindowInsets windowInsets = this.f3831a;
            if (windowInsets != null) {
                this.f3831a = windowInsets.replaceSystemWindowInsets(bVar.f16491a, bVar.f16492b, bVar.f16493c, bVar.f16494d);
            }
        }
    }

    public static class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsets$Builder f3833a;

        public c() {
            this.f3833a = new WindowInsets$Builder();
        }

        public c(s0 s0Var) {
            super(s0Var);
            WindowInsets b10 = s0Var.b();
            this.f3833a = b10 != null ? new WindowInsets$Builder(b10) : new WindowInsets$Builder();
        }

        @Override // e0.s0.e
        public s0 b() {
            a();
            s0 c10 = s0.c(this.f3833a.build(), null);
            c10.f3823a.k(null);
            return c10;
        }

        @Override // e0.s0.e
        public void c(x.b bVar) {
            this.f3833a.setStableInsets(bVar.b());
        }

        @Override // e0.s0.e
        public void d(x.b bVar) {
            this.f3833a.setSystemWindowInsets(bVar.b());
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(s0 s0Var) {
            super(s0Var);
        }
    }

    public static class e {
        public e() {
            this(new s0());
        }

        public e(s0 s0Var) {
        }

        public final void a() {
        }

        public s0 b() {
            throw null;
        }

        public void c(x.b bVar) {
            throw null;
        }

        public void d(x.b bVar) {
            throw null;
        }
    }

    public static class f extends k {
        public static boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Method f3834g;

        /* renamed from: h, reason: collision with root package name */
        public static Class<?> f3835h;

        /* renamed from: i, reason: collision with root package name */
        public static Field f3836i;

        /* renamed from: j, reason: collision with root package name */
        public static Field f3837j;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f3838c;

        /* renamed from: d, reason: collision with root package name */
        public x.b f3839d;

        /* renamed from: e, reason: collision with root package name */
        public x.b f3840e;

        public f(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f3839d = null;
            this.f3838c = windowInsets;
        }

        private x.b n(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f) {
                o();
            }
            Method method = f3834g;
            if (method != null && f3835h != null && f3836i != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3836i.get(f3837j.get(invoke));
                    if (rect != null) {
                        return x.b.a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    StringBuilder l10 = defpackage.f.l("Failed to get visible insets. (Reflection error). ");
                    l10.append(e10.getMessage());
                    Log.e("WindowInsetsCompat", l10.toString(), e10);
                }
            }
            return null;
        }

        private static void o() {
            try {
                f3834g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3835h = cls;
                f3836i = cls.getDeclaredField("mVisibleInsets");
                f3837j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3836i.setAccessible(true);
                f3837j.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder l10 = defpackage.f.l("Failed to get visible insets. (Reflection error). ");
                l10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", l10.toString(), e10);
            }
            f = true;
        }

        @Override // e0.s0.k
        public void d(View view) {
            x.b n2 = n(view);
            if (n2 == null) {
                n2 = x.b.f16490e;
            }
            p(n2);
        }

        @Override // e0.s0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3840e, ((f) obj).f3840e);
            }
            return false;
        }

        @Override // e0.s0.k
        public final x.b g() {
            if (this.f3839d == null) {
                this.f3839d = x.b.a(this.f3838c.getSystemWindowInsetLeft(), this.f3838c.getSystemWindowInsetTop(), this.f3838c.getSystemWindowInsetRight(), this.f3838c.getSystemWindowInsetBottom());
            }
            return this.f3839d;
        }

        @Override // e0.s0.k
        public s0 h(int i10, int i11, int i12, int i13) {
            s0 c10 = s0.c(this.f3838c, null);
            int i14 = Build.VERSION.SDK_INT;
            e dVar = i14 >= 30 ? new d(c10) : i14 >= 29 ? new c(c10) : new b(c10);
            dVar.d(s0.a(g(), i10, i11, i12, i13));
            dVar.c(s0.a(f(), i10, i11, i12, i13));
            return dVar.b();
        }

        @Override // e0.s0.k
        public boolean j() {
            return this.f3838c.isRound();
        }

        @Override // e0.s0.k
        public void k(x.b[] bVarArr) {
        }

        @Override // e0.s0.k
        public void l(s0 s0Var) {
        }

        public void p(x.b bVar) {
            this.f3840e = bVar;
        }
    }

    public static class g extends f {

        /* renamed from: k, reason: collision with root package name */
        public x.b f3841k;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f3841k = null;
        }

        @Override // e0.s0.k
        public s0 b() {
            return s0.c(this.f3838c.consumeStableInsets(), null);
        }

        @Override // e0.s0.k
        public s0 c() {
            return s0.c(this.f3838c.consumeSystemWindowInsets(), null);
        }

        @Override // e0.s0.k
        public final x.b f() {
            if (this.f3841k == null) {
                this.f3841k = x.b.a(this.f3838c.getStableInsetLeft(), this.f3838c.getStableInsetTop(), this.f3838c.getStableInsetRight(), this.f3838c.getStableInsetBottom());
            }
            return this.f3841k;
        }

        @Override // e0.s0.k
        public boolean i() {
            return this.f3838c.isConsumed();
        }

        @Override // e0.s0.k
        public void m(x.b bVar) {
            this.f3841k = bVar;
        }
    }

    public static class h extends g {
        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // e0.s0.k
        public s0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3838c.consumeDisplayCutout();
            return s0.c(consumeDisplayCutout, null);
        }

        @Override // e0.s0.k
        public e0.h e() {
            DisplayCutout displayCutout;
            displayCutout = this.f3838c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new e0.h(displayCutout);
        }

        @Override // e0.s0.f, e0.s0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f3838c, hVar.f3838c) && Objects.equals(this.f3840e, hVar.f3840e);
        }

        @Override // e0.s0.k
        public int hashCode() {
            return this.f3838c.hashCode();
        }
    }

    public static class i extends h {
        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // e0.s0.f, e0.s0.k
        public s0 h(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f3838c.inset(i10, i11, i12, i13);
            return s0.c(inset, null);
        }

        @Override // e0.s0.g, e0.s0.k
        public void m(x.b bVar) {
        }
    }

    public static class j extends i {

        /* renamed from: l, reason: collision with root package name */
        public static final s0 f3842l = s0.c(WindowInsets.CONSUMED, null);

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // e0.s0.f, e0.s0.k
        public final void d(View view) {
        }
    }

    public static class k {

        /* renamed from: b, reason: collision with root package name */
        public static final s0 f3843b;

        /* renamed from: a, reason: collision with root package name */
        public final s0 f3844a;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f3843b = (i10 >= 30 ? new d() : i10 >= 29 ? new c() : new b()).b().f3823a.a().f3823a.b().f3823a.c();
        }

        public k(s0 s0Var) {
            this.f3844a = s0Var;
        }

        public s0 a() {
            return this.f3844a;
        }

        public s0 b() {
            return this.f3844a;
        }

        public s0 c() {
            return this.f3844a;
        }

        public void d(View view) {
        }

        public e0.h e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return j() == kVar.j() && i() == kVar.i() && Objects.equals(g(), kVar.g()) && Objects.equals(f(), kVar.f()) && Objects.equals(e(), kVar.e());
        }

        public x.b f() {
            return x.b.f16490e;
        }

        public x.b g() {
            return x.b.f16490e;
        }

        public s0 h(int i10, int i11, int i12, int i13) {
            return f3843b;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e());
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(x.b[] bVarArr) {
        }

        public void l(s0 s0Var) {
        }

        public void m(x.b bVar) {
        }
    }

    static {
        f3822b = Build.VERSION.SDK_INT >= 30 ? j.f3842l : k.f3843b;
    }

    public s0() {
        this.f3823a = new k(this);
    }

    public s0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f3823a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static x.b a(x.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f16491a - i10);
        int max2 = Math.max(0, bVar.f16492b - i11);
        int max3 = Math.max(0, bVar.f16493c - i12);
        int max4 = Math.max(0, bVar.f16494d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : x.b.a(max, max2, max3, max4);
    }

    public static s0 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        s0 s0Var = new s0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, o0> weakHashMap = d0.f3766a;
            s0Var.f3823a.l(d0.e.a(view));
            s0Var.f3823a.d(view.getRootView());
        }
        return s0Var;
    }

    public final WindowInsets b() {
        k kVar = this.f3823a;
        if (kVar instanceof f) {
            return ((f) kVar).f3838c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return Objects.equals(this.f3823a, ((s0) obj).f3823a);
        }
        return false;
    }

    public final int hashCode() {
        k kVar = this.f3823a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
