package d4;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class h implements Comparator {
    public static h b(String str) {
        if (str.equals(".value")) {
            return u.j();
        }
        if (str.equals(".key")) {
            return j.j();
        }
        if (str.equals(".priority")) {
            throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
        }
        return new p(new V3.k(str));
    }

    public int a(m mVar, m mVar2, boolean z7) {
        return z7 ? compare(mVar2, mVar) : compare(mVar, mVar2);
    }

    public abstract String c();

    public boolean d(n nVar, n nVar2) {
        return compare(new m(C1227b.n(), nVar), new m(C1227b.n(), nVar2)) != 0;
    }

    public abstract boolean e(n nVar);

    public abstract m f(C1227b c1227b, n nVar);

    public abstract m g();

    public m h() {
        return m.b();
    }
}
