package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class q extends f0.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10667b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10668c;

    public q(String str, String str2, long j10) {
        this.f10666a = str;
        this.f10667b = str2;
        this.f10668c = j10;
    }

    @Override // m8.f0.e.d.a.b.c
    public final long a() {
        return this.f10668c;
    }

    @Override // m8.f0.e.d.a.b.c
    public final String b() {
        return this.f10667b;
    }

    @Override // m8.f0.e.d.a.b.c
    public final String c() {
        return this.f10666a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.c)) {
            return false;
        }
        f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
        return this.f10666a.equals(cVar.c()) && this.f10667b.equals(cVar.b()) && this.f10668c == cVar.a();
    }

    public final int hashCode() {
        int hashCode = (((this.f10666a.hashCode() ^ 1000003) * 1000003) ^ this.f10667b.hashCode()) * 1000003;
        long j10 = this.f10668c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Signal{name=");
        l10.append(this.f10666a);
        l10.append(", code=");
        l10.append(this.f10667b);
        l10.append(", address=");
        l10.append(this.f10668c);
        l10.append("}");
        return l10.toString();
    }
}
