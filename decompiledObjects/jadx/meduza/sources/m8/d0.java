package m8;

import m8.g0;

/* loaded from: classes.dex */
public final class d0 extends g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10566c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10567d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10568e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10569g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10570h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10571i;

    public d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f10564a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f10565b = str;
        this.f10566c = i11;
        this.f10567d = j10;
        this.f10568e = j11;
        this.f = z10;
        this.f10569g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f10570h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f10571i = str3;
    }

    @Override // m8.g0.b
    public final int a() {
        return this.f10564a;
    }

    @Override // m8.g0.b
    public final int b() {
        return this.f10566c;
    }

    @Override // m8.g0.b
    public final long c() {
        return this.f10568e;
    }

    @Override // m8.g0.b
    public final boolean d() {
        return this.f;
    }

    @Override // m8.g0.b
    public final String e() {
        return this.f10570h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f10564a == bVar.a() && this.f10565b.equals(bVar.f()) && this.f10566c == bVar.b() && this.f10567d == bVar.i() && this.f10568e == bVar.c() && this.f == bVar.d() && this.f10569g == bVar.h() && this.f10570h.equals(bVar.e()) && this.f10571i.equals(bVar.g());
    }

    @Override // m8.g0.b
    public final String f() {
        return this.f10565b;
    }

    @Override // m8.g0.b
    public final String g() {
        return this.f10571i;
    }

    @Override // m8.g0.b
    public final int h() {
        return this.f10569g;
    }

    public final int hashCode() {
        int hashCode = (((((this.f10564a ^ 1000003) * 1000003) ^ this.f10565b.hashCode()) * 1000003) ^ this.f10566c) * 1000003;
        long j10 = this.f10567d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f10568e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f10569g) * 1000003) ^ this.f10570h.hashCode()) * 1000003) ^ this.f10571i.hashCode();
    }

    @Override // m8.g0.b
    public final long i() {
        return this.f10567d;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DeviceData{arch=");
        l10.append(this.f10564a);
        l10.append(", model=");
        l10.append(this.f10565b);
        l10.append(", availableProcessors=");
        l10.append(this.f10566c);
        l10.append(", totalRam=");
        l10.append(this.f10567d);
        l10.append(", diskSpace=");
        l10.append(this.f10568e);
        l10.append(", isEmulator=");
        l10.append(this.f);
        l10.append(", state=");
        l10.append(this.f10569g);
        l10.append(", manufacturer=");
        l10.append(this.f10570h);
        l10.append(", modelClass=");
        return defpackage.g.f(l10, this.f10571i, "}");
    }
}
