/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.ReflectiveOperationException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.util.Objects
 */
package I;

import I.A;
import I.B;
import I.C;
import I.D;
import I.E;
import I.F;
import I.G;
import I.H;
import I.I;
import I.J;
import I.K;
import I.L;
import I.M;
import I.N;
import I.O;
import I.P;
import I.Q;
import I.S;
import I.T;
import I.U;
import I.V;
import I.W;
import I.s;
import I.y;
import I.z;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class x {
    public static final x b;
    public final l a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        x x8 = Build.VERSION.SDK_INT >= 30 ? k.q : l.b;
        b = x8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public x(x object) {
        if (object == null) {
            this.a = new l(this);
            return;
        }
        l l8 = object.a;
        int n8 = Build.VERSION.SDK_INT;
        object = n8 >= 30 && l8 instanceof k ? new k(this, (k)l8) : (n8 >= 29 && l8 instanceof j ? new j(this, (j)l8) : (n8 >= 28 && l8 instanceof i ? new i(this, (i)l8) : (l8 instanceof h ? new h(this, (h)l8) : (l8 instanceof g ? new g(this, (g)l8) : new l(this)))));
        this.a = object;
        l8.e(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public x(WindowInsets object) {
        int n8 = Build.VERSION.SDK_INT;
        object = n8 >= 30 ? new k(this, (WindowInsets)object) : (n8 >= 29 ? new j(this, (WindowInsets)object) : (n8 >= 28 ? new i(this, (WindowInsets)object) : new h(this, (WindowInsets)object)));
        this.a = object;
    }

    public static A.f m(A.f f8, int n8, int n9, int n10, int n11) {
        int n12 = Math.max((int)0, (int)(f8.a - n8));
        int n13 = Math.max((int)0, (int)(f8.b - n9));
        int n14 = Math.max((int)0, (int)(f8.c - n10));
        int n15 = Math.max((int)0, (int)(f8.d - n11));
        if (n12 == n8 && n13 == n9 && n14 == n10 && n15 == n11) {
            return f8;
        }
        return A.f.b(n12, n13, n14, n15);
    }

    public static x s(WindowInsets windowInsets) {
        return x.t(windowInsets, null);
    }

    public static x t(WindowInsets object, View view) {
        object = new x((WindowInsets)H.e.b(object));
        if (view != null && s.t(view)) {
            object.p(s.o(view));
            object.d(view.getRootView());
        }
        return object;
    }

    public x a() {
        return this.a.a();
    }

    public x b() {
        return this.a.b();
    }

    public x c() {
        return this.a.c();
    }

    public void d(View view) {
        this.a.d(view);
    }

    public I.d e() {
        return this.a.f();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x)) {
            return false;
        }
        object = (x)object;
        return H.c.a(this.a, object.a);
    }

    public A.f f(int n8) {
        return this.a.g(n8);
    }

    public A.f g() {
        return this.a.i();
    }

    public int h() {
        return this.a.k().d;
    }

    public int hashCode() {
        l l8 = this.a;
        if (l8 == null) {
            return 0;
        }
        return l8.hashCode();
    }

    public int i() {
        return this.a.k().a;
    }

    public int j() {
        return this.a.k().c;
    }

    public int k() {
        return this.a.k().b;
    }

    public x l(int n8, int n9, int n10, int n11) {
        return this.a.m(n8, n9, n10, n11);
    }

    public void n(A.f[] arrf) {
        this.a.p(arrf);
    }

    public void o(A.f f8) {
        this.a.q(f8);
    }

    public void p(x x8) {
        this.a.r(x8);
    }

    public void q(A.f f8) {
        this.a.s(f8);
    }

    public WindowInsets r() {
        l l8 = this.a;
        if (l8 instanceof g) {
            return ((g)l8).c;
        }
        return null;
    }

    public static abstract class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field field;
                Field field2;
                a = field2 = View.class.getDeclaredField("mAttachInfo");
                field2.setAccessible(true);
                field2 = Class.forName((String)"android.view.View$AttachInfo");
                b = field = field2.getDeclaredField("mStableInsets");
                field.setAccessible(true);
                c = field2 = field2.getDeclaredField("mContentInsets");
                field2.setAccessible(true);
                d = true;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get visible insets from AttachInfo ");
                stringBuilder.append(reflectiveOperationException.getMessage());
                Log.w((String)"WindowInsetsCompat", (String)stringBuilder.toString(), (Throwable)reflectiveOperationException);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static x a(View view) {
            if (!d) return null;
            if (!view.isAttachedToWindow()) {
                return null;
            }
            Object object = view.getRootView();
            Object object2 = a.get(object);
            if (object2 == null) return null;
            object = (Rect)b.get(object2);
            object2 = (Rect)c.get(object2);
            if (object == null || object2 == null) return null;
            try {
                object = new b().b(A.f.c((Rect)object)).c(A.f.c((Rect)object2)).a();
                object.p((x)object);
                object.d(view.getRootView());
                return object;
            }
            catch (IllegalAccessException illegalAccessException) {
                object = new StringBuilder();
                object.append("Failed to get insets from AttachInfo. ");
                object.append(illegalAccessException.getMessage());
                Log.w((String)"WindowInsetsCompat", (String)object.toString(), (Throwable)illegalAccessException);
            }
            return null;
        }
    }

    public static final class b {
        public final f a;

        /*
         * Enabled aggressive block sorting
         */
        public b() {
            void var2_3;
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 30) {
                e e8 = new e();
            } else if (n8 >= 29) {
                d d8 = new d();
            } else {
                c c8 = new c();
            }
            this.a = var2_3;
        }

        /*
         * Enabled aggressive block sorting
         */
        public b(x object) {
            int n8 = Build.VERSION.SDK_INT;
            object = n8 >= 30 ? new e((x)object) : (n8 >= 29 ? new d((x)object) : new c((x)object));
            this.a = object;
        }

        public x a() {
            return this.a.b();
        }

        public b b(A.f f8) {
            this.a.d(f8);
            return this;
        }

        public b c(A.f f8) {
            this.a.f(f8);
            return this;
        }
    }

    public static class c
    extends f {
        public static Field e;
        public static boolean f = false;
        public static Constructor g;
        public static boolean h = false;
        public WindowInsets c;
        public A.f d;

        public c() {
            this.c = c.h();
        }

        public c(@NonNull x x8) {
            super(x8);
            this.c = x8.r();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static WindowInsets h() {
            Field field;
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                }
                f = true;
            }
            if ((field = e) != null) {
                try {
                    field = (WindowInsets)field.get((Object)null);
                    if (field != null) {
                        return new WindowInsets((WindowInsets)field);
                    }
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not get value from WindowInsets.CONSUMED field", (Throwable)reflectiveOperationException);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Log.i((String)"WindowInsetsCompat", (String)"Could not retrieve WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
                }
                h = true;
            }
            if ((field = g) == null) return null;
            try {
                return (WindowInsets)field.newInstance(new Object[]{new Rect()});
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                Log.i((String)"WindowInsetsCompat", (String)"Could not invoke WindowInsets(Rect) constructor", (Throwable)reflectiveOperationException);
            }
            return null;
        }

        @NonNull
        @Override
        public x b() {
            this.a();
            x x8 = x.s(this.c);
            x8.n(this.b);
            x8.q(this.d);
            return x8;
        }

        @Override
        public void d(A.f f8) {
            this.d = f8;
        }

        @Override
        public void f(@NonNull A.f f8) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(f8.a, f8.b, f8.c, f8.d);
            }
        }
    }

    public static class d
    extends f {
        public final WindowInsets.Builder c;

        public d() {
            this.c = E.a();
        }

        public d(@NonNull x x8) {
            super(x8);
            x8 = x8.r();
            x8 = x8 != null ? F.a((WindowInsets)x8) : E.a();
            this.c = x8;
        }

        @NonNull
        @Override
        public x b() {
            this.a();
            x x8 = x.s(B.a(this.c));
            x8.n(this.b);
            return x8;
        }

        @Override
        public void c(@NonNull A.f f8) {
            C.a(this.c, f8.e());
        }

        @Override
        public void d(@NonNull A.f f8) {
            z.a(this.c, f8.e());
        }

        @Override
        public void e(@NonNull A.f f8) {
            A.a(this.c, f8.e());
        }

        @Override
        public void f(@NonNull A.f f8) {
            y.a(this.c, f8.e());
        }

        @Override
        public void g(@NonNull A.f f8) {
            D.a(this.c, f8.e());
        }
    }

    public static class e
    extends d {
        public e() {
        }

        public e(@NonNull x x8) {
            super(x8);
        }
    }

    public static abstract class f {
        public final x a;
        public A.f[] b;

        public f() {
            this(new x(null));
        }

        public f(@NonNull x x8) {
            this.a = x8;
        }

        public final void a() {
            A.f[] arrf = this.b;
            if (arrf != null) {
                A.f f8 = arrf[m.a(1)];
                A.f f9 = this.b[m.a(2)];
                arrf = f9;
                if (f9 == null) {
                    arrf = this.a.f(2);
                }
                f9 = f8;
                if (f8 == null) {
                    f9 = this.a.f(1);
                }
                this.f(A.f.a(f9, (A.f)arrf));
                arrf = this.b[m.a(16)];
                if (arrf != null) {
                    this.e((A.f)arrf);
                }
                if ((arrf = this.b[m.a(32)]) != null) {
                    this.c((A.f)arrf);
                }
                if ((arrf = this.b[m.a(64)]) != null) {
                    this.g((A.f)arrf);
                }
            }
        }

        @NonNull
        public abstract x b();

        public void c(@NonNull A.f f8) {
        }

        public abstract void d(@NonNull A.f var1);

        public void e(@NonNull A.f f8) {
        }

        public abstract void f(@NonNull A.f var1);

        public void g(@NonNull A.f f8) {
        }
    }

    public static class g
    extends l {
        public static boolean h = false;
        public static Method i;
        public static Class j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public A.f[] d;
        public A.f e = null;
        public x f;
        public A.f g;

        public g(@NonNull x x8, @NonNull g g8) {
            this(x8, new WindowInsets(g8.c));
        }

        public g(@NonNull x x8, @NonNull WindowInsets windowInsets) {
            super(x8);
            this.c = windowInsets;
        }

        @SuppressLint(value={"WrongConstant"})
        @NonNull
        private A.f t(int n8, boolean bl) {
            A.f f8 = A.f.e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) continue;
                f8 = A.f.a(f8, this.u(i8, bl));
            }
            return f8;
        }

        private A.f v() {
            x x8 = this.f;
            if (x8 != null) {
                return x8.g();
            }
            return A.f.e;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private A.f w(@NonNull View object) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                g.x();
            }
            Method method = i;
            Object var2_3 = null;
            if (method == null) return null;
            if (j == null) return null;
            if (k == null) {
                return null;
            }
            try {
                object = method.invoke(object, new Object[0]);
                if (object == null) {
                    Log.w((String)"WindowInsetsCompat", (String)"Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)new NullPointerException());
                    return null;
                }
                object = l.get(object);
                method = (Rect)k.get(object);
                object = var2_3;
                if (method == null) return object;
                return A.f.c((Rect)method);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
            object = new StringBuilder();
            object.append("Failed to get visible insets. (Reflection error). ");
            object.append(reflectiveOperationException.getMessage());
            Log.e((String)"WindowInsetsCompat", (String)object.toString(), (Throwable)reflectiveOperationException);
            return null;
        }

        @SuppressLint(value={"PrivateApi"})
        private static void x() {
            try {
                Class class_;
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                j = class_ = Class.forName((String)"android.view.View$AttachInfo");
                k = class_.getDeclaredField("mVisibleInsets");
                l = Class.forName((String)"android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get visible insets. (Reflection error). ");
                stringBuilder.append(reflectiveOperationException.getMessage());
                Log.e((String)"WindowInsetsCompat", (String)stringBuilder.toString(), (Throwable)reflectiveOperationException);
            }
            h = true;
        }

        @Override
        public void d(@NonNull View object) {
            A.f f8 = this.w((View)object);
            object = f8;
            if (f8 == null) {
                object = A.f.e;
            }
            this.q((A.f)object);
        }

        @Override
        public void e(@NonNull x x8) {
            x8.p(this.f);
            x8.o(this.g);
        }

        @Override
        public boolean equals(Object object) {
            if (!super.equals(object)) {
                return false;
            }
            object = (g)object;
            return Objects.equals((Object)this.g, (Object)object.g);
        }

        @NonNull
        @Override
        public A.f g(int n8) {
            return this.t(n8, false);
        }

        @NonNull
        @Override
        public final A.f k() {
            if (this.e == null) {
                this.e = A.f.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @NonNull
        @Override
        public x m(int n8, int n9, int n10, int n11) {
            b b8 = new b(x.s(this.c));
            b8.c(x.m(this.k(), n8, n9, n10, n11));
            b8.b(x.m(this.i(), n8, n9, n10, n11));
            return b8.a();
        }

        @Override
        public boolean o() {
            return this.c.isRound();
        }

        @Override
        public void p(A.f[] arrf) {
            this.d = arrf;
        }

        @Override
        public void q(@NonNull A.f f8) {
            this.g = f8;
        }

        @Override
        public void r(x x8) {
            this.f = x8;
        }

        @NonNull
        public A.f u(int n8, boolean bl) {
            if (n8 != 1) {
                int n9;
                Object object = null;
                A.f f8 = null;
                if (n8 != 2) {
                    if (n8 != 8) {
                        if (n8 != 16) {
                            if (n8 != 32) {
                                if (n8 != 64) {
                                    if (n8 != 128) {
                                        return A.f.e;
                                    }
                                    object = this.f;
                                    object = object != null ? object.e() : this.f();
                                    if (object != null) {
                                        return A.f.b(object.b(), object.d(), object.c(), object.a());
                                    }
                                    return A.f.e;
                                }
                                return this.l();
                            }
                            return this.h();
                        }
                        return this.j();
                    }
                    A.f[] arrf = this.d;
                    object = f8;
                    if (arrf != null) {
                        object = arrf[m.a(8)];
                    }
                    if (object != null) {
                        return object;
                    }
                    f8 = this.k();
                    object = this.v();
                    n8 = f8.d;
                    if (n8 > object.d) {
                        return A.f.b(0, 0, 0, n8);
                    }
                    f8 = this.g;
                    if (f8 != null && !f8.equals(A.f.e) && (n8 = this.g.d) > object.d) {
                        return A.f.b(0, 0, 0, n8);
                    }
                    return A.f.e;
                }
                if (bl) {
                    object = this.v();
                    f8 = this.i();
                    return A.f.b(Math.max((int)object.a, (int)f8.a), 0, Math.max((int)object.c, (int)f8.c), Math.max((int)object.d, (int)f8.d));
                }
                f8 = this.k();
                x x8 = this.f;
                if (x8 != null) {
                    object = x8.g();
                }
                n8 = n9 = f8.d;
                if (object != null) {
                    n8 = Math.min((int)n9, (int)object.d);
                }
                return A.f.b(f8.a, 0, f8.c, n8);
            }
            if (bl) {
                return A.f.b(0, Math.max((int)this.v().b, (int)this.k().b), 0, 0);
            }
            return A.f.b(0, this.k().b, 0, 0);
        }
    }

    public static class h
    extends g {
        public A.f m = null;

        public h(@NonNull x x8, @NonNull h h8) {
            super(x8, h8);
            this.m = h8.m;
        }

        public h(@NonNull x x8, @NonNull WindowInsets windowInsets) {
            super(x8, windowInsets);
        }

        @NonNull
        @Override
        public x b() {
            return x.s(this.c.consumeStableInsets());
        }

        @NonNull
        @Override
        public x c() {
            return x.s(this.c.consumeSystemWindowInsets());
        }

        @NonNull
        @Override
        public final A.f i() {
            if (this.m == null) {
                this.m = A.f.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override
        public boolean n() {
            return this.c.isConsumed();
        }

        @Override
        public void s(A.f f8) {
            this.m = f8;
        }
    }

    public static class i
    extends h {
        public i(@NonNull x x8, @NonNull i i8) {
            super(x8, i8);
        }

        public i(@NonNull x x8, @NonNull WindowInsets windowInsets) {
            super(x8, windowInsets);
        }

        @NonNull
        @Override
        public x a() {
            return x.s(H.a(this.c));
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof i)) {
                return false;
            }
            object = (i)object;
            if (Objects.equals((Object)this.c, (Object)object.c) && Objects.equals((Object)this.g, (Object)object.g)) {
                return true;
            }
            return false;
        }

        @Override
        public I.d f() {
            return I.d.e(G.a(this.c));
        }

        @Override
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    public static class j
    extends i {
        public A.f n = null;
        public A.f o = null;
        public A.f p = null;

        public j(@NonNull x x8, @NonNull j j8) {
            super(x8, j8);
        }

        public j(@NonNull x x8, @NonNull WindowInsets windowInsets) {
            super(x8, windowInsets);
        }

        @NonNull
        @Override
        public A.f h() {
            if (this.o == null) {
                this.o = A.f.d(K.a(this.c));
            }
            return this.o;
        }

        @NonNull
        @Override
        public A.f j() {
            if (this.n == null) {
                this.n = A.f.d(L.a(this.c));
            }
            return this.n;
        }

        @NonNull
        @Override
        public A.f l() {
            if (this.p == null) {
                this.p = A.f.d(I.a(this.c));
            }
            return this.p;
        }

        @NonNull
        @Override
        public x m(int n8, int n9, int n10, int n11) {
            return x.s(J.a(this.c, n8, n9, n10, n11));
        }

        @Override
        public void s(A.f f8) {
        }
    }

    public static class k
    extends j {
        public static final x q = x.s(N.a());

        public k(@NonNull x x8, @NonNull k k8) {
            super(x8, k8);
        }

        public k(@NonNull x x8, @NonNull WindowInsets windowInsets) {
            super(x8, windowInsets);
        }

        @Override
        public final void d(@NonNull View view) {
        }

        @NonNull
        @Override
        public A.f g(int n8) {
            return A.f.d(M.a(this.c, n.a(n8)));
        }
    }

    public static class l {
        public static final x b = new b().a().a().b().c();
        public final x a;

        public l(@NonNull x x8) {
            this.a = x8;
        }

        @NonNull
        public x a() {
            return this.a;
        }

        @NonNull
        public x b() {
            return this.a;
        }

        @NonNull
        public x c() {
            return this.a;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull x x8) {
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof l)) {
                return false;
            }
            object = (l)object;
            if (this.o() == object.o() && this.n() == object.n() && H.c.a(this.k(), object.k()) && H.c.a(this.i(), object.i()) && H.c.a(this.f(), object.f())) {
                return true;
            }
            return false;
        }

        public I.d f() {
            return null;
        }

        @NonNull
        public A.f g(int n8) {
            return A.f.e;
        }

        @NonNull
        public A.f h() {
            return this.k();
        }

        public int hashCode() {
            return H.c.b(this.o(), this.n(), this.k(), this.i(), this.f());
        }

        @NonNull
        public A.f i() {
            return A.f.e;
        }

        @NonNull
        public A.f j() {
            return this.k();
        }

        @NonNull
        public A.f k() {
            return A.f.e;
        }

        @NonNull
        public A.f l() {
            return this.k();
        }

        @NonNull
        public x m(int n8, int n9, int n10, int n11) {
            return b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(A.f[] arrf) {
        }

        public void q(@NonNull A.f f8) {
        }

        public void r(x x8) {
        }

        public void s(A.f f8) {
        }
    }

    public static final abstract class m {
        public static int a(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 4) {
                        if (n8 != 8) {
                            if (n8 != 16) {
                                if (n8 != 32) {
                                    if (n8 != 64) {
                                        if (n8 != 128) {
                                            if (n8 == 256) {
                                                return 8;
                                            }
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                                            stringBuilder.append(n8);
                                            throw new IllegalArgumentException(stringBuilder.toString());
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    public static final abstract class n {
        /*
         * Enabled aggressive block sorting
         */
        public static int a(int n8) {
            int n9 = 0;
            int n10 = 1;
            while (n10 <= 256) {
                int n11;
                block1 : {
                    block10 : {
                        block2 : {
                            block3 : {
                                block4 : {
                                    block5 : {
                                        block6 : {
                                            block7 : {
                                                block8 : {
                                                    block9 : {
                                                        n11 = n9;
                                                        if ((n8 & n10) == 0) break block1;
                                                        if (n10 == 1) break block2;
                                                        if (n10 == 2) break block3;
                                                        if (n10 == 4) break block4;
                                                        if (n10 == 8) break block5;
                                                        if (n10 == 16) break block6;
                                                        if (n10 == 32) break block7;
                                                        if (n10 == 64) break block8;
                                                        if (n10 == 128) break block9;
                                                        n11 = n9;
                                                        break block1;
                                                    }
                                                    n11 = W.a();
                                                    break block10;
                                                }
                                                n11 = V.a();
                                                break block10;
                                            }
                                            n11 = U.a();
                                            break block10;
                                        }
                                        n11 = T.a();
                                        break block10;
                                    }
                                    n11 = S.a();
                                    break block10;
                                }
                                n11 = Q.a();
                                break block10;
                            }
                            n11 = P.a();
                            break block10;
                        }
                        n11 = O.a();
                    }
                    n11 = n9 | n11;
                }
                n10 <<= 1;
                n9 = n11;
            }
            return n9;
        }
    }

}

