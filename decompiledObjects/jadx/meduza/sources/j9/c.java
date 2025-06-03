package j9;

import j9.k;

/* loaded from: classes.dex */
public final class c extends k.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8673a;

    /* renamed from: b, reason: collision with root package name */
    public final k.a f8674b;

    public c(long j10, b bVar) {
        this.f8673a = j10;
        if (bVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f8674b = bVar;
    }

    @Override // j9.k.b
    public final k.a a() {
        return this.f8674b;
    }

    @Override // j9.k.b
    public final long b() {
        return this.f8673a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k.b)) {
            return false;
        }
        k.b bVar = (k.b) obj;
        return this.f8673a == bVar.b() && this.f8674b.equals(bVar.a());
    }

    public final int hashCode() {
        long j10 = this.f8673a;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8674b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("IndexState{sequenceNumber=");
        l10.append(this.f8673a);
        l10.append(", offset=");
        l10.append(this.f8674b);
        l10.append("}");
        return l10.toString();
    }
}
