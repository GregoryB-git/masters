package j9;

import j9.k;

/* loaded from: classes.dex */
public final class d extends k.c {

    /* renamed from: a, reason: collision with root package name */
    public final l f8675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8676b;

    public d(l lVar, int i10) {
        if (lVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f8675a = lVar;
        if (i10 == 0) {
            throw new NullPointerException("Null kind");
        }
        this.f8676b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k.c)) {
            return false;
        }
        k.c cVar = (k.c) obj;
        return this.f8675a.equals(cVar.f()) && q0.g.b(this.f8676b, cVar.g());
    }

    @Override // j9.k.c
    public final l f() {
        return this.f8675a;
    }

    @Override // j9.k.c
    public final int g() {
        return this.f8676b;
    }

    public final int hashCode() {
        return ((this.f8675a.hashCode() ^ 1000003) * 1000003) ^ q0.g.c(this.f8676b);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Segment{fieldPath=");
        l10.append(this.f8675a);
        l10.append(", kind=");
        l10.append(defpackage.f.r(this.f8676b));
        l10.append("}");
        return l10.toString();
    }
}
