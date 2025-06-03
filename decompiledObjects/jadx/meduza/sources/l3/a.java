package l3;

import java.util.Arrays;
import k3.n;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<n> f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9541b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f9540a = iterable;
        this.f9541b = bArr;
    }

    @Override // l3.f
    public final Iterable<n> a() {
        return this.f9540a;
    }

    @Override // l3.f
    public final byte[] b() {
        return this.f9541b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f9540a.equals(fVar.a())) {
            if (Arrays.equals(this.f9541b, fVar instanceof a ? ((a) fVar).f9541b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9540a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9541b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BackendRequest{events=");
        l10.append(this.f9540a);
        l10.append(", extras=");
        l10.append(Arrays.toString(this.f9541b));
        l10.append("}");
        return l10.toString();
    }
}
