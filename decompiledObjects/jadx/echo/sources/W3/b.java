package W3;

import V3.k;
import W3.d;
import Y3.m;
import d4.C1227b;

/* loaded from: classes.dex */
public class b extends d {
    public b(e eVar, k kVar) {
        super(d.a.ListenComplete, eVar, kVar);
        m.g(!eVar.d(), "Can't have a listen complete from a user source");
    }

    @Override // W3.d
    public d d(C1227b c1227b) {
        return this.f6859c.isEmpty() ? new b(this.f6858b, k.Y()) : new b(this.f6858b, this.f6859c.c0());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", a(), b());
    }
}
