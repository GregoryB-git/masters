package H0;

import X2.AbstractC0703v;
import X2.g0;
import g0.z;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0703v f2159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2160b;

    public f(int i7, AbstractC0703v abstractC0703v) {
        this.f2160b = i7;
        this.f2159a = abstractC0703v;
    }

    public static a b(int i7, int i8, z zVar) {
        switch (i7) {
            case 1718776947:
                return g.e(i8, zVar);
            case 1751742049:
                return c.c(zVar);
            case 1752331379:
                return d.d(zVar);
            case 1852994675:
                return h.b(zVar);
            default:
                return null;
        }
    }

    public static f d(int i7, z zVar) {
        AbstractC0703v.a aVar = new AbstractC0703v.a();
        int g7 = zVar.g();
        int i8 = -2;
        while (zVar.a() > 8) {
            int t7 = zVar.t();
            int f7 = zVar.f() + zVar.t();
            zVar.S(f7);
            a d7 = t7 == 1414744396 ? d(zVar.t(), zVar) : b(t7, i8, zVar);
            if (d7 != null) {
                if (d7.a() == 1752331379) {
                    i8 = ((d) d7).c();
                }
                aVar.a(d7);
            }
            zVar.T(f7);
            zVar.S(g7);
        }
        return new f(i7, aVar.k());
    }

    @Override // H0.a
    public int a() {
        return this.f2160b;
    }

    public a c(Class cls) {
        g0 it = this.f2159a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
