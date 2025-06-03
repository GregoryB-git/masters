package W3;

import V3.k;
import W3.d;
import d4.C1227b;
import d4.n;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public final n f6873d;

    public f(e eVar, k kVar, n nVar) {
        super(d.a.Overwrite, eVar, kVar);
        this.f6873d = nVar;
    }

    @Override // W3.d
    public d d(C1227b c1227b) {
        return this.f6859c.isEmpty() ? new f(this.f6858b, k.Y(), this.f6873d.v(c1227b)) : new f(this.f6858b, this.f6859c.c0(), this.f6873d);
    }

    public n e() {
        return this.f6873d;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", a(), b(), this.f6873d);
    }
}
