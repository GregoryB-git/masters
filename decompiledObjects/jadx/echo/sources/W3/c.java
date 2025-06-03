package W3;

import V3.C0663b;
import V3.k;
import W3.d;
import d4.C1227b;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public final C0663b f6856d;

    public c(e eVar, k kVar, C0663b c0663b) {
        super(d.a.Merge, eVar, kVar);
        this.f6856d = c0663b;
    }

    @Override // W3.d
    public d d(C1227b c1227b) {
        if (!this.f6859c.isEmpty()) {
            if (this.f6859c.Z().equals(c1227b)) {
                return new c(this.f6858b, this.f6859c.c0(), this.f6856d);
            }
            return null;
        }
        C0663b k7 = this.f6856d.k(new k(c1227b));
        if (k7.isEmpty()) {
            return null;
        }
        return k7.X() != null ? new f(this.f6858b, k.Y(), k7.X()) : new c(this.f6858b, k.Y(), k7);
    }

    public C0663b e() {
        return this.f6856d;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", a(), b(), this.f6856d);
    }
}
