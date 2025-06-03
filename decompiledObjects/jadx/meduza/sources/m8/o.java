package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class o extends f0.e.d.a.b.AbstractC0153a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10657a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10659c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10660d;

    public o(long j10, long j11, String str, String str2) {
        this.f10657a = j10;
        this.f10658b = j11;
        this.f10659c = str;
        this.f10660d = str2;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0153a
    public final long a() {
        return this.f10657a;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0153a
    public final String b() {
        return this.f10659c;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0153a
    public final long c() {
        return this.f10658b;
    }

    @Override // m8.f0.e.d.a.b.AbstractC0153a
    public final String d() {
        return this.f10660d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0153a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0153a abstractC0153a = (f0.e.d.a.b.AbstractC0153a) obj;
        if (this.f10657a == abstractC0153a.a() && this.f10658b == abstractC0153a.c() && this.f10659c.equals(abstractC0153a.b())) {
            String str = this.f10660d;
            String d10 = abstractC0153a.d();
            if (str == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (str.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f10657a;
        long j11 = this.f10658b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10659c.hashCode()) * 1000003;
        String str = this.f10660d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BinaryImage{baseAddress=");
        l10.append(this.f10657a);
        l10.append(", size=");
        l10.append(this.f10658b);
        l10.append(", name=");
        l10.append(this.f10659c);
        l10.append(", uuid=");
        return defpackage.g.f(l10, this.f10660d, "}");
    }
}
