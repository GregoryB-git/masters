package k0;

import android.util.Pair;
import d0.AbstractC1170I;
import g0.AbstractC1297a;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1399a extends AbstractC1170I {

    /* renamed from: e, reason: collision with root package name */
    public final int f15679e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.T f15680f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15681g;

    public AbstractC1399a(boolean z7, x0.T t7) {
        this.f15681g = z7;
        this.f15680f = t7;
        this.f15679e = t7.a();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i7);

    public final int B(int i7, boolean z7) {
        if (z7) {
            return this.f15680f.c(i7);
        }
        if (i7 < this.f15679e - 1) {
            return i7 + 1;
        }
        return -1;
    }

    public final int C(int i7, boolean z7) {
        if (z7) {
            return this.f15680f.f(i7);
        }
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    public abstract AbstractC1170I D(int i7);

    @Override // d0.AbstractC1170I
    public int a(boolean z7) {
        if (this.f15679e == 0) {
            return -1;
        }
        if (this.f15681g) {
            z7 = false;
        }
        int e7 = z7 ? this.f15680f.e() : 0;
        while (D(e7).q()) {
            e7 = B(e7, z7);
            if (e7 == -1) {
                return -1;
            }
        }
        return A(e7) + D(e7).a(z7);
    }

    @Override // d0.AbstractC1170I
    public final int b(Object obj) {
        int b7;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w7 = w(obj);
        Object v7 = v(obj);
        int s7 = s(w7);
        if (s7 == -1 || (b7 = D(s7).b(v7)) == -1) {
            return -1;
        }
        return z(s7) + b7;
    }

    @Override // d0.AbstractC1170I
    public int c(boolean z7) {
        int i7 = this.f15679e;
        if (i7 == 0) {
            return -1;
        }
        if (this.f15681g) {
            z7 = false;
        }
        int g7 = z7 ? this.f15680f.g() : i7 - 1;
        while (D(g7).q()) {
            g7 = C(g7, z7);
            if (g7 == -1) {
                return -1;
            }
        }
        return A(g7) + D(g7).c(z7);
    }

    @Override // d0.AbstractC1170I
    public int e(int i7, int i8, boolean z7) {
        if (this.f15681g) {
            if (i8 == 1) {
                i8 = 2;
            }
            z7 = false;
        }
        int u7 = u(i7);
        int A7 = A(u7);
        int e7 = D(u7).e(i7 - A7, i8 != 2 ? i8 : 0, z7);
        if (e7 != -1) {
            return A7 + e7;
        }
        int B7 = B(u7, z7);
        while (B7 != -1 && D(B7).q()) {
            B7 = B(B7, z7);
        }
        if (B7 != -1) {
            return A(B7) + D(B7).a(z7);
        }
        if (i8 == 2) {
            return a(z7);
        }
        return -1;
    }

    @Override // d0.AbstractC1170I
    public final AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
        int t7 = t(i7);
        int A7 = A(t7);
        D(t7).g(i7 - z(t7), bVar, z7);
        bVar.f12399c += A7;
        if (z7) {
            bVar.f12398b = y(x(t7), AbstractC1297a.e(bVar.f12398b));
        }
        return bVar;
    }

    @Override // d0.AbstractC1170I
    public final AbstractC1170I.b h(Object obj, AbstractC1170I.b bVar) {
        Object w7 = w(obj);
        Object v7 = v(obj);
        int s7 = s(w7);
        int A7 = A(s7);
        D(s7).h(v7, bVar);
        bVar.f12399c += A7;
        bVar.f12398b = obj;
        return bVar;
    }

    @Override // d0.AbstractC1170I
    public int l(int i7, int i8, boolean z7) {
        if (this.f15681g) {
            if (i8 == 1) {
                i8 = 2;
            }
            z7 = false;
        }
        int u7 = u(i7);
        int A7 = A(u7);
        int l7 = D(u7).l(i7 - A7, i8 != 2 ? i8 : 0, z7);
        if (l7 != -1) {
            return A7 + l7;
        }
        int C7 = C(u7, z7);
        while (C7 != -1 && D(C7).q()) {
            C7 = C(C7, z7);
        }
        if (C7 != -1) {
            return A(C7) + D(C7).c(z7);
        }
        if (i8 == 2) {
            return c(z7);
        }
        return -1;
    }

    @Override // d0.AbstractC1170I
    public final Object m(int i7) {
        int t7 = t(i7);
        return y(x(t7), D(t7).m(i7 - z(t7)));
    }

    @Override // d0.AbstractC1170I
    public final AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
        int u7 = u(i7);
        int A7 = A(u7);
        int z7 = z(u7);
        D(u7).o(i7 - A7, cVar, j7);
        Object x7 = x(u7);
        if (!AbstractC1170I.c.f12410q.equals(cVar.f12420a)) {
            x7 = y(x7, cVar.f12420a);
        }
        cVar.f12420a = x7;
        cVar.f12433n += z7;
        cVar.f12434o += z7;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i7);

    public abstract int u(int i7);

    public abstract Object x(int i7);

    public abstract int z(int i7);
}
