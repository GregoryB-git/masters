package Q3;

import V3.C;
import V3.t;
import d4.C1227b;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final t f4385a;

    /* renamed from: b, reason: collision with root package name */
    public final V3.k f4386b;

    public m(t tVar, V3.k kVar) {
        this.f4385a = tVar;
        this.f4386b = kVar;
        C.g(kVar, c());
    }

    public String a() {
        if (this.f4386b.X() != null) {
            return this.f4386b.X().e();
        }
        return null;
    }

    public d4.n b() {
        return this.f4385a.a(this.f4386b);
    }

    public Object c() {
        return b().getValue();
    }

    public void d(Object obj) {
        C.g(this.f4386b, obj);
        Object b7 = Z3.a.b(obj);
        Y3.n.k(b7);
        this.f4385a.c(this.f4386b, d4.o.a(b7));
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f4385a.equals(mVar.f4385a) && this.f4386b.equals(mVar.f4386b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        C1227b Z6 = this.f4386b.Z();
        StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        sb.append(Z6 != null ? Z6.e() : "<none>");
        sb.append(", value = ");
        sb.append(this.f4385a.b().L(true));
        sb.append(" }");
        return sb.toString();
    }

    public m(d4.n nVar) {
        this(new t(nVar), new V3.k(""));
    }
}
