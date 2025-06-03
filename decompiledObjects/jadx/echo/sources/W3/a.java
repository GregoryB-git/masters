package W3;

import V3.k;
import W3.d;
import Y3.m;
import d4.C1227b;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6854d;

    /* renamed from: e, reason: collision with root package name */
    public final Y3.d f6855e;

    public a(k kVar, Y3.d dVar, boolean z7) {
        super(d.a.AckUserWrite, e.f6865d, kVar);
        this.f6855e = dVar;
        this.f6854d = z7;
    }

    @Override // W3.d
    public d d(C1227b c1227b) {
        if (!this.f6859c.isEmpty()) {
            m.g(this.f6859c.Z().equals(c1227b), "operationForChild called for unrelated child.");
            return new a(this.f6859c.c0(), this.f6855e, this.f6854d);
        }
        if (this.f6855e.getValue() == null) {
            return new a(k.Y(), this.f6855e.Y(new k(c1227b)), this.f6854d);
        }
        m.g(this.f6855e.M().isEmpty(), "affectedTree should not have overlapping affected paths.");
        return this;
    }

    public Y3.d e() {
        return this.f6855e;
    }

    public boolean f() {
        return this.f6854d;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", a(), Boolean.valueOf(this.f6854d), this.f6855e);
    }
}
