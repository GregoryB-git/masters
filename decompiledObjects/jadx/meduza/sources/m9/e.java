package m9;

import m9.m0;

/* loaded from: classes.dex */
public final class e extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f10773a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10775c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10777e;

    public e(g gVar, boolean z10, int i10, int i11, int i12) {
        this.f10773a = gVar;
        this.f10774b = z10;
        this.f10775c = i10;
        this.f10776d = i11;
        this.f10777e = i12;
    }

    @Override // m9.m0.a
    public final boolean a() {
        return this.f10774b;
    }

    @Override // m9.m0.a
    public final int b() {
        return this.f10776d;
    }

    @Override // m9.m0.a
    public final g c() {
        return this.f10773a;
    }

    @Override // m9.m0.a
    public final int d() {
        return this.f10775c;
    }

    @Override // m9.m0.a
    public final int e() {
        return this.f10777e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0.a)) {
            return false;
        }
        m0.a aVar = (m0.a) obj;
        g gVar = this.f10773a;
        if (gVar != null ? gVar.equals(aVar.c()) : aVar.c() == null) {
            if (this.f10774b == aVar.a() && this.f10775c == aVar.d() && this.f10776d == aVar.b() && this.f10777e == aVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        g gVar = this.f10773a;
        return (((((((((gVar == null ? 0 : gVar.hashCode()) ^ 1000003) * 1000003) ^ (this.f10774b ? 1231 : 1237)) * 1000003) ^ this.f10775c) * 1000003) ^ this.f10776d) * 1000003) ^ this.f10777e;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExistenceFilterBloomFilterInfo{bloomFilter=");
        l10.append(this.f10773a);
        l10.append(", applied=");
        l10.append(this.f10774b);
        l10.append(", hashCount=");
        l10.append(this.f10775c);
        l10.append(", bitmapLength=");
        l10.append(this.f10776d);
        l10.append(", padding=");
        return a0.j.m(l10, this.f10777e, "}");
    }
}
