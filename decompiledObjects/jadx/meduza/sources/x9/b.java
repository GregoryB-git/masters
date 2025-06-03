package x9;

import defpackage.g;
import x9.f;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f17215a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17217c;

    public static final class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f17218a;

        /* renamed from: b, reason: collision with root package name */
        public int f17219b;

        public final b a() {
            String str = this.f17218a == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(null, this.f17218a.longValue(), this.f17219b);
            }
            throw new IllegalStateException(g.d("Missing required properties:", str));
        }
    }

    public b(String str, long j10, int i10) {
        this.f17215a = str;
        this.f17216b = j10;
        this.f17217c = i10;
    }

    @Override // x9.f
    public final int a() {
        return this.f17217c;
    }

    @Override // x9.f
    public final String b() {
        return this.f17215a;
    }

    @Override // x9.f
    public final long c() {
        return this.f17216b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f17215a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f17216b == fVar.c()) {
                int i10 = this.f17217c;
                int a10 = fVar.a();
                if (i10 == 0) {
                    if (a10 == 0) {
                        return true;
                    }
                } else if (q0.g.b(i10, a10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17215a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f17216b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f17217c;
        return i10 ^ (i11 != 0 ? q0.g.c(i11) : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("TokenResult{token=");
        l10.append(this.f17215a);
        l10.append(", tokenExpirationTimestamp=");
        l10.append(this.f17216b);
        l10.append(", responseCode=");
        l10.append(g.u(this.f17217c));
        l10.append("}");
        return l10.toString();
    }
}
