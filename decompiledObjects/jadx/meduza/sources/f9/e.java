package f9;

import j9.q;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5491b;

    /* renamed from: c, reason: collision with root package name */
    public final q f5492c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5493d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5494e;

    public e(String str, int i10, q qVar, int i11, long j10) {
        this.f5490a = str;
        this.f5491b = i10;
        this.f5492c = qVar;
        this.f5493d = i11;
        this.f5494e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5491b == eVar.f5491b && this.f5493d == eVar.f5493d && this.f5494e == eVar.f5494e && this.f5490a.equals(eVar.f5490a)) {
            return this.f5492c.equals(eVar.f5492c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f5490a.hashCode() * 31) + this.f5491b) * 31) + this.f5493d) * 31;
        long j10 = this.f5494e;
        return this.f5492c.hashCode() + ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
