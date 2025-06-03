package r3;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final long f13545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13547d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13548e;
    public final int f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f13545b = j10;
        this.f13546c = i10;
        this.f13547d = i11;
        this.f13548e = j11;
        this.f = i12;
    }

    @Override // r3.e
    public final int a() {
        return this.f13547d;
    }

    @Override // r3.e
    public final long b() {
        return this.f13548e;
    }

    @Override // r3.e
    public final int c() {
        return this.f13546c;
    }

    @Override // r3.e
    public final int d() {
        return this.f;
    }

    @Override // r3.e
    public final long e() {
        return this.f13545b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13545b == eVar.e() && this.f13546c == eVar.c() && this.f13547d == eVar.a() && this.f13548e == eVar.b() && this.f == eVar.d();
    }

    public final int hashCode() {
        long j10 = this.f13545b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13546c) * 1000003) ^ this.f13547d) * 1000003;
        long j11 = this.f13548e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("EventStoreConfig{maxStorageSizeInBytes=");
        l10.append(this.f13545b);
        l10.append(", loadBatchSize=");
        l10.append(this.f13546c);
        l10.append(", criticalSectionEnterTimeoutMs=");
        l10.append(this.f13547d);
        l10.append(", eventCleanUpAge=");
        l10.append(this.f13548e);
        l10.append(", maxBlobByteSizePerRow=");
        return a0.j.m(l10, this.f, "}");
    }
}
