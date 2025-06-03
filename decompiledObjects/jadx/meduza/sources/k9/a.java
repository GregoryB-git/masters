package k9;

import j9.s;
import java.util.Collections;
import java.util.List;
import ka.b;
import ka.d0;

/* loaded from: classes.dex */
public abstract class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final List<d0> f9143a;

    /* renamed from: k9.a$a, reason: collision with other inner class name */
    public static class C0132a extends a {
        public C0132a(List<d0> list) {
            super(list);
        }

        @Override // k9.a
        public final d0 d(d0 d0Var) {
            b.a a10 = s.h(d0Var) ? d0Var.R().a() : ka.b.M();
            for (d0 d0Var2 : this.f9143a) {
                int i10 = 0;
                while (i10 < ((ka.b) a10.f11120b).L()) {
                    if (s.g(((ka.b) a10.f11120b).K(i10), d0Var2)) {
                        a10.m();
                        ka.b.I((ka.b) a10.f11120b, i10);
                    } else {
                        i10++;
                    }
                }
            }
            d0.a d02 = d0.d0();
            d02.p(a10);
            return d02.k();
        }
    }

    public static class b extends a {
        public b(List<d0> list) {
            super(list);
        }

        @Override // k9.a
        public final d0 d(d0 d0Var) {
            b.a a10 = s.h(d0Var) ? d0Var.R().a() : ka.b.M();
            for (d0 d0Var2 : this.f9143a) {
                if (!s.f(a10, d0Var2)) {
                    a10.m();
                    ka.b.G((ka.b) a10.f11120b, d0Var2);
                }
            }
            d0.a d02 = d0.d0();
            d02.p(a10);
            return d02.k();
        }
    }

    public a(List<d0> list) {
        this.f9143a = Collections.unmodifiableList(list);
    }

    @Override // k9.p
    public final d0 a(d0 d0Var, d0 d0Var2) {
        return d(d0Var);
    }

    @Override // k9.p
    public final d0 b(u7.m mVar, d0 d0Var) {
        return d(d0Var);
    }

    @Override // k9.p
    public final d0 c(d0 d0Var) {
        return null;
    }

    public abstract d0 d(d0 d0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9143a.equals(((a) obj).f9143a);
    }

    public final int hashCode() {
        return this.f9143a.hashCode() + (getClass().hashCode() * 31);
    }
}
