// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import java.util.Objects;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import android.view.WindowInsets$Builder;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Field;
import H.c;
import H.e;
import android.view.View;
import A.f;
import android.view.WindowInsets;
import android.os.Build$VERSION;

public class x
{
    public static final x b;
    public final l a;
    
    static {
        x b2;
        if (Build$VERSION.SDK_INT >= 30) {
            b2 = k.q;
        }
        else {
            b2 = l.b;
        }
        b = b2;
    }
    
    public x(final x x) {
        if (x != null) {
            final l a = x.a;
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object a2;
            if (sdk_INT >= 30 && a instanceof k) {
                a2 = new k(this, (k)a);
            }
            else if (sdk_INT >= 29 && a instanceof j) {
                a2 = new j(this, (j)a);
            }
            else if (sdk_INT >= 28 && a instanceof i) {
                a2 = new i(this, (i)a);
            }
            else if (a instanceof h) {
                a2 = new h(this, (h)a);
            }
            else if (a instanceof g) {
                a2 = new g(this, (g)a);
            }
            else {
                a2 = new l(this);
            }
            this.a = (l)a2;
            a.e(this);
            return;
        }
        this.a = new l(this);
    }
    
    public x(final WindowInsets windowInsets) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        g a;
        if (sdk_INT >= 30) {
            a = new k(this, windowInsets);
        }
        else if (sdk_INT >= 29) {
            a = new j(this, windowInsets);
        }
        else if (sdk_INT >= 28) {
            a = new i(this, windowInsets);
        }
        else {
            a = new h(this, windowInsets);
        }
        this.a = (l)a;
    }
    
    public static A.f m(final A.f f, final int n, final int n2, final int n3, final int n4) {
        final int max = Math.max(0, f.a - n);
        final int max2 = Math.max(0, f.b - n2);
        final int max3 = Math.max(0, f.c - n3);
        final int max4 = Math.max(0, f.d - n4);
        if (max == n && max2 == n2 && max3 == n3 && max4 == n4) {
            return f;
        }
        return f.b(max, max2, max3, max4);
    }
    
    public static x s(final WindowInsets windowInsets) {
        return t(windowInsets, null);
    }
    
    public static x t(final WindowInsets windowInsets, final View view) {
        final x x = new x((WindowInsets)H.e.b(windowInsets));
        if (view != null && s.t(view)) {
            x.p(s.o(view));
            x.d(view.getRootView());
        }
        return x;
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
    
    public void d(final View view) {
        this.a.d(view);
    }
    
    public I.d e() {
        return this.a.f();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof x && H.c.a(this.a, ((x)o).a));
    }
    
    public A.f f(final int n) {
        return this.a.g(n);
    }
    
    public A.f g() {
        return this.a.i();
    }
    
    public int h() {
        return this.a.k().d;
    }
    
    @Override
    public int hashCode() {
        final l a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
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
    
    public x l(final int n, final int n2, final int n3, final int n4) {
        return this.a.m(n, n2, n3, n4);
    }
    
    public void n(final A.f[] array) {
        this.a.p(array);
    }
    
    public void o(final A.f f) {
        this.a.q(f);
    }
    
    public void p(final x x) {
        this.a.r(x);
    }
    
    public void q(final A.f f) {
        this.a.s(f);
    }
    
    public WindowInsets r() {
        final l a = this.a;
        if (a instanceof g) {
            return ((g)a).c;
        }
        return null;
    }
    
    public abstract static class a
    {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;
        
        static {
            try {
                (x.a.a = View.class.getDeclaredField("mAttachInfo")).setAccessible(true);
                final Class<?> forName = Class.forName("android.view.View$AttachInfo");
                (x.a.b = forName.getDeclaredField("mStableInsets")).setAccessible(true);
                (x.a.c = forName.getDeclaredField("mContentInsets")).setAccessible(true);
                x.a.d = true;
            }
            catch (ReflectiveOperationException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(ex.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), (Throwable)ex);
            }
        }
        
        public static x a(final View view) {
            if (x.a.d) {
                if (!view.isAttachedToWindow()) {
                    return null;
                }
                final View rootView = view.getRootView();
                try {
                    final Object value = x.a.a.get(rootView);
                    if (value != null) {
                        final Rect rect = (Rect)x.a.b.get(value);
                        final Rect rect2 = (Rect)x.a.c.get(value);
                        if (rect != null && rect2 != null) {
                            final x a = new b().b(A.f.c(rect)).c(A.f.c(rect2)).a();
                            a.p(a);
                            a.d(view.getRootView());
                            return a;
                        }
                    }
                }
                catch (IllegalAccessException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(ex.getMessage());
                    Log.w("WindowInsetsCompat", sb.toString(), (Throwable)ex);
                }
            }
            return null;
        }
    }
    
    public static final class b
    {
        public final f a;
        
        public b() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            f a;
            if (sdk_INT >= 30) {
                a = new e();
            }
            else if (sdk_INT >= 29) {
                a = new d();
            }
            else {
                a = new c();
            }
            this.a = a;
        }
        
        public b(final x x) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            f a;
            if (sdk_INT >= 30) {
                a = new e(x);
            }
            else if (sdk_INT >= 29) {
                a = new d(x);
            }
            else {
                a = new c(x);
            }
            this.a = a;
        }
        
        public x a() {
            return this.a.b();
        }
        
        public b b(final A.f f) {
            this.a.d(f);
            return this;
        }
        
        public b c(final A.f f) {
            this.a.f(f);
            return this;
        }
    }
    
    public static class c extends f
    {
        public static Field e;
        public static boolean f = false;
        public static Constructor g;
        public static boolean h = false;
        public WindowInsets c;
        public A.f d;
        
        public c() {
            this.c = h();
        }
        
        public c(@NonNull final x x) {
            super(x);
            this.c = x.r();
        }
        
        private static WindowInsets h() {
            if (!c.f) {
                try {
                    c.e = WindowInsets.class.getDeclaredField("CONSUMED");
                }
                catch (ReflectiveOperationException ex) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", (Throwable)ex);
                }
                c.f = true;
            }
            final Field e = c.e;
            if (e != null) {
                try {
                    final WindowInsets windowInsets = (WindowInsets)e.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                }
                catch (ReflectiveOperationException ex2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", (Throwable)ex2);
                }
            }
            if (!c.h) {
                try {
                    c.g = WindowInsets.class.getConstructor(Rect.class);
                }
                catch (ReflectiveOperationException ex3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", (Throwable)ex3);
                }
                c.h = true;
            }
            final Constructor g = c.g;
            if (g != null) {
                try {
                    return g.newInstance(new Rect());
                }
                catch (ReflectiveOperationException ex4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", (Throwable)ex4);
                }
            }
            return null;
        }
        
        @NonNull
        @Override
        public x b() {
            ((f)this).a();
            final x s = x.s(this.c);
            s.n(super.b);
            s.q(this.d);
            return s;
        }
        
        @Override
        public void d(final A.f d) {
            this.d = d;
        }
        
        @Override
        public void f(@NonNull final A.f f) {
            final WindowInsets c = this.c;
            if (c != null) {
                this.c = c.replaceSystemWindowInsets(f.a, f.b, f.c, f.d);
            }
        }
    }
    
    public static class d extends f
    {
        public final WindowInsets$Builder c;
        
        public d() {
            this.c = E.a();
        }
        
        public d(@NonNull final x x) {
            super(x);
            final WindowInsets r = x.r();
            WindowInsets$Builder c;
            if (r != null) {
                c = F.a(r);
            }
            else {
                c = E.a();
            }
            this.c = c;
        }
        
        @NonNull
        @Override
        public x b() {
            ((f)this).a();
            final x s = x.s(B.a(this.c));
            s.n(super.b);
            return s;
        }
        
        @Override
        public void c(@NonNull final A.f f) {
            C.a(this.c, f.e());
        }
        
        @Override
        public void d(@NonNull final A.f f) {
            z.a(this.c, f.e());
        }
        
        @Override
        public void e(@NonNull final A.f f) {
            A.a(this.c, f.e());
        }
        
        @Override
        public void f(@NonNull final A.f f) {
            y.a(this.c, f.e());
        }
        
        @Override
        public void g(@NonNull final A.f f) {
            D.a(this.c, f.e());
        }
    }
    
    public static class e extends d
    {
        public e() {
        }
        
        public e(@NonNull final x x) {
            super(x);
        }
    }
    
    public abstract static class f
    {
        public final x a;
        public A.f[] b;
        
        public f() {
            this(new x((x)null));
        }
        
        public f(@NonNull final x a) {
            this.a = a;
        }
        
        public final void a() {
            final A.f[] b = this.b;
            if (b != null) {
                final A.f f = b[m.a(1)];
                A.f f2;
                if ((f2 = this.b[m.a(2)]) == null) {
                    f2 = this.a.f(2);
                }
                A.f f3;
                if ((f3 = f) == null) {
                    f3 = this.a.f(1);
                }
                this.f(A.f.a(f3, f2));
                final A.f f4 = this.b[m.a(16)];
                if (f4 != null) {
                    this.e(f4);
                }
                final A.f f5 = this.b[m.a(32)];
                if (f5 != null) {
                    this.c(f5);
                }
                final A.f f6 = this.b[m.a(64)];
                if (f6 != null) {
                    this.g(f6);
                }
            }
        }
        
        @NonNull
        public abstract x b();
        
        public void c(@NonNull final A.f f) {
        }
        
        public abstract void d(@NonNull final A.f p0);
        
        public void e(@NonNull final A.f f) {
        }
        
        public abstract void f(@NonNull final A.f p0);
        
        public void g(@NonNull final A.f f) {
        }
    }
    
    public static class g extends l
    {
        public static boolean h = false;
        public static Method i;
        public static Class j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public A.f[] d;
        public A.f e;
        public x f;
        public A.f g;
        
        public g(@NonNull final x x, @NonNull final g g) {
            this(x, new WindowInsets(g.c));
        }
        
        public g(@NonNull final x x, @NonNull final WindowInsets c) {
            super(x);
            this.e = null;
            this.c = c;
        }
        
        @SuppressLint({ "WrongConstant" })
        @NonNull
        private A.f t(final int n, final boolean b) {
            A.f f = A.f.e;
            for (int i = 1; i <= 256; i <<= 1) {
                if ((n & i) != 0x0) {
                    f = A.f.a(f, this.u(i, b));
                }
            }
            return f;
        }
        
        private A.f v() {
            final x f = this.f;
            if (f != null) {
                return f.g();
            }
            return A.f.e;
        }
        
        private A.f w(@NonNull final View obj) {
            while (true) {
                Label_0141: {
                    if (Build$VERSION.SDK_INT >= 30) {
                        break Label_0141;
                    }
                    if (!x.g.h) {
                        x();
                    }
                    final Method i = x.g.i;
                    final A.f f = null;
                    Label_0139: {
                        if (i == null || x.g.j == null) {
                            break Label_0139;
                        }
                        if (x.g.k == null) {
                            return null;
                        }
                        try {
                            final Object invoke = i.invoke(obj, new Object[0]);
                            if (invoke == null) {
                                Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)new NullPointerException());
                                return null;
                            }
                            final Rect rect = (Rect)x.g.k.get(x.g.l.get(invoke));
                            A.f c = f;
                            if (rect != null) {
                                c = A.f.c(rect);
                            }
                            return c;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to get visible insets. (Reflection error). ");
                            final ReflectiveOperationException ex;
                            sb.append(ex.getMessage());
                            Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
                            return null;
                            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                        }
                        catch (ReflectiveOperationException ex2) {}
                    }
                }
                final ReflectiveOperationException ex2;
                final ReflectiveOperationException ex = ex2;
                continue;
            }
        }
        
        @SuppressLint({ "PrivateApi" })
        private static void x() {
            try {
                g.i = View.class.getDeclaredMethod("getViewRootImpl", (Class<?>[])new Class[0]);
                g.k = (g.j = Class.forName("android.view.View$AttachInfo")).getDeclaredField("mVisibleInsets");
                g.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                g.k.setAccessible(true);
                g.l.setAccessible(true);
            }
            catch (ReflectiveOperationException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(ex.getMessage());
                Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
            }
            g.h = true;
        }
        
        @Override
        public void d(@NonNull final View view) {
            A.f f;
            if ((f = this.w(view)) == null) {
                f = A.f.e;
            }
            this.q(f);
        }
        
        @Override
        public void e(@NonNull final x x) {
            x.p(this.f);
            x.o(this.g);
        }
        
        @Override
        public boolean equals(final Object o) {
            return super.equals(o) && Objects.equals(this.g, ((g)o).g);
        }
        
        @NonNull
        @Override
        public A.f g(final int n) {
            return this.t(n, false);
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
        public x m(final int n, final int n2, final int n3, final int n4) {
            final b b = new b(x.s(this.c));
            b.c(x.m(this.k(), n, n2, n3, n4));
            b.b(x.m(((l)this).i(), n, n2, n3, n4));
            return b.a();
        }
        
        @Override
        public boolean o() {
            return this.c.isRound();
        }
        
        @Override
        public void p(final A.f[] d) {
            this.d = d;
        }
        
        @Override
        public void q(@NonNull final A.f g) {
            this.g = g;
        }
        
        @Override
        public void r(final x f) {
            this.f = f;
        }
        
        @NonNull
        public A.f u(int n, final boolean b) {
            if (n != 1) {
                A.f g = null;
                final A.f f = null;
                if (n != 2) {
                    if (n != 8) {
                        if (n == 16) {
                            return ((l)this).j();
                        }
                        if (n == 32) {
                            return ((l)this).h();
                        }
                        if (n == 64) {
                            return ((l)this).l();
                        }
                        if (n != 128) {
                            return A.f.e;
                        }
                        final x f2 = this.f;
                        I.d d;
                        if (f2 != null) {
                            d = f2.e();
                        }
                        else {
                            d = ((l)this).f();
                        }
                        if (d != null) {
                            return A.f.b(d.b(), d.d(), d.c(), d.a());
                        }
                        return A.f.e;
                    }
                    else {
                        final A.f[] d2 = this.d;
                        A.f f3 = f;
                        if (d2 != null) {
                            f3 = d2[m.a(8)];
                        }
                        if (f3 != null) {
                            return f3;
                        }
                        final A.f k = this.k();
                        final A.f v = this.v();
                        n = k.d;
                        if (n > v.d) {
                            return A.f.b(0, 0, 0, n);
                        }
                        final A.f g2 = this.g;
                        if (g2 != null && !g2.equals(A.f.e)) {
                            n = this.g.d;
                            if (n > v.d) {
                                return A.f.b(0, 0, 0, n);
                            }
                        }
                        return A.f.e;
                    }
                }
                else {
                    if (b) {
                        final A.f v2 = this.v();
                        final A.f i = ((l)this).i();
                        return A.f.b(Math.max(v2.a, i.a), 0, Math.max(v2.c, i.c), Math.max(v2.d, i.d));
                    }
                    final A.f j = this.k();
                    final x f4 = this.f;
                    if (f4 != null) {
                        g = f4.g();
                    }
                    final int a = n = j.d;
                    if (g != null) {
                        n = Math.min(a, g.d);
                    }
                    return A.f.b(j.a, 0, j.c, n);
                }
            }
            else {
                if (b) {
                    return A.f.b(0, Math.max(this.v().b, this.k().b), 0, 0);
                }
                return A.f.b(0, this.k().b, 0, 0);
            }
        }
    }
    
    public static class h extends g
    {
        public A.f m;
        
        public h(@NonNull final x x, @NonNull final h h) {
            super(x, (g)h);
            this.m = null;
            this.m = h.m;
        }
        
        public h(@NonNull final x x, @NonNull final WindowInsets windowInsets) {
            super(x, windowInsets);
            this.m = null;
        }
        
        @NonNull
        @Override
        public x b() {
            return x.s(super.c.consumeStableInsets());
        }
        
        @NonNull
        @Override
        public x c() {
            return x.s(super.c.consumeSystemWindowInsets());
        }
        
        @NonNull
        @Override
        public final A.f i() {
            if (this.m == null) {
                this.m = f.b(super.c.getStableInsetLeft(), super.c.getStableInsetTop(), super.c.getStableInsetRight(), super.c.getStableInsetBottom());
            }
            return this.m;
        }
        
        @Override
        public boolean n() {
            return super.c.isConsumed();
        }
        
        @Override
        public void s(final A.f m) {
            this.m = m;
        }
    }
    
    public static class i extends h
    {
        public i(@NonNull final x x, @NonNull final i i) {
            super(x, (h)i);
        }
        
        public i(@NonNull final x x, @NonNull final WindowInsets windowInsets) {
            super(x, windowInsets);
        }
        
        @NonNull
        @Override
        public x a() {
            return x.s(H.a(super.c));
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return Objects.equals(super.c, i.c) && Objects.equals(super.g, i.g);
        }
        
        @Override
        public I.d f() {
            return d.e(G.a(super.c));
        }
        
        @Override
        public int hashCode() {
            return super.c.hashCode();
        }
    }
    
    public static class j extends i
    {
        public A.f n;
        public A.f o;
        public A.f p;
        
        public j(@NonNull final x x, @NonNull final j j) {
            super(x, (i)j);
            this.n = null;
            this.o = null;
            this.p = null;
        }
        
        public j(@NonNull final x x, @NonNull final WindowInsets windowInsets) {
            super(x, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }
        
        @NonNull
        @Override
        public A.f h() {
            if (this.o == null) {
                this.o = f.d(K.a(super.c));
            }
            return this.o;
        }
        
        @NonNull
        @Override
        public A.f j() {
            if (this.n == null) {
                this.n = f.d(L.a(super.c));
            }
            return this.n;
        }
        
        @NonNull
        @Override
        public A.f l() {
            if (this.p == null) {
                this.p = f.d(I.a(super.c));
            }
            return this.p;
        }
        
        @NonNull
        @Override
        public x m(final int n, final int n2, final int n3, final int n4) {
            return x.s(J.a(super.c, n, n2, n3, n4));
        }
        
        @Override
        public void s(final A.f f) {
        }
    }
    
    public static class k extends j
    {
        public static final x q;
        
        static {
            q = x.s(N.a());
        }
        
        public k(@NonNull final x x, @NonNull final k k) {
            super(x, (j)k);
        }
        
        public k(@NonNull final x x, @NonNull final WindowInsets windowInsets) {
            super(x, windowInsets);
        }
        
        @Override
        public final void d(@NonNull final View view) {
        }
        
        @NonNull
        @Override
        public A.f g(final int n) {
            return f.d(M.a(super.c, x.n.a(n)));
        }
    }
    
    public static class l
    {
        public static final x b;
        public final x a;
        
        static {
            b = new b().a().a().b().c();
        }
        
        public l(@NonNull final x a) {
            this.a = a;
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
        
        public void d(@NonNull final View view) {
        }
        
        public void e(@NonNull final x x) {
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            return this.o() == l.o() && this.n() == l.n() && H.c.a(this.k(), l.k()) && H.c.a(this.i(), l.i()) && H.c.a(this.f(), l.f());
        }
        
        public I.d f() {
            return null;
        }
        
        @NonNull
        public A.f g(final int n) {
            return A.f.e;
        }
        
        @NonNull
        public A.f h() {
            return this.k();
        }
        
        @Override
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
        public x m(final int n, final int n2, final int n3, final int n4) {
            return l.b;
        }
        
        public boolean n() {
            return false;
        }
        
        public boolean o() {
            return false;
        }
        
        public void p(final A.f[] array) {
        }
        
        public void q(@NonNull final A.f f) {
        }
        
        public void r(final x x) {
        }
        
        public void s(final A.f f) {
        }
    }
    
    public abstract static final class m
    {
        public static int a(final int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("type needs to be >= FIRST and <= LAST, type=");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public abstract static final class n
    {
        public static int a(final int n) {
            int n2 = 0;
            int n3;
            for (int i = 1; i <= 256; i <<= 1, n2 = n3) {
                n3 = n2;
                if ((n & i) != 0x0) {
                    int n4;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 8) {
                                    if (i != 16) {
                                        if (i != 32) {
                                            if (i != 64) {
                                                if (i != 128) {
                                                    n3 = n2;
                                                    continue;
                                                }
                                                n4 = W.a();
                                            }
                                            else {
                                                n4 = V.a();
                                            }
                                        }
                                        else {
                                            n4 = U.a();
                                        }
                                    }
                                    else {
                                        n4 = T.a();
                                    }
                                }
                                else {
                                    n4 = S.a();
                                }
                            }
                            else {
                                n4 = Q.a();
                            }
                        }
                        else {
                            n4 = P.a();
                        }
                    }
                    else {
                        n4 = O.a();
                    }
                    n3 = (n2 | n4);
                }
            }
            return n2;
        }
    }
}
