package j9;

import j9.k;

/* loaded from: classes.dex */
public final class b extends k.a {

    /* renamed from: c, reason: collision with root package name */
    public final q f8670c;

    /* renamed from: d, reason: collision with root package name */
    public final i f8671d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8672e;

    public b(q qVar, i iVar, int i10) {
        if (qVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f8670c = qVar;
        if (iVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f8671d = iVar;
        this.f8672e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k.a)) {
            return false;
        }
        k.a aVar = (k.a) obj;
        return this.f8670c.equals(aVar.l()) && this.f8671d.equals(aVar.h()) && this.f8672e == aVar.i();
    }

    @Override // j9.k.a
    public final i h() {
        return this.f8671d;
    }

    public final int hashCode() {
        return ((((this.f8670c.hashCode() ^ 1000003) * 1000003) ^ this.f8671d.hashCode()) * 1000003) ^ this.f8672e;
    }

    @Override // j9.k.a
    public final int i() {
        return this.f8672e;
    }

    @Override // j9.k.a
    public final q l() {
        return this.f8670c;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("IndexOffset{readTime=");
        l10.append(this.f8670c);
        l10.append(", documentKey=");
        l10.append(this.f8671d);
        l10.append(", largestBatchId=");
        return a0.j.m(l10, this.f8672e, "}");
    }
}
