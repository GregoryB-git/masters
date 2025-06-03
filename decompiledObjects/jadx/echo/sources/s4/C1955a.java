package s4;

import s4.n;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f19266a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19267b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19268c;

    /* renamed from: s4.a$b */
    public static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        public String f19269a;

        /* renamed from: b, reason: collision with root package name */
        public Long f19270b;

        /* renamed from: c, reason: collision with root package name */
        public Long f19271c;

        @Override // s4.n.a
        public n a() {
            String str = "";
            if (this.f19269a == null) {
                str = " token";
            }
            if (this.f19270b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f19271c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C1955a(this.f19269a, this.f19270b.longValue(), this.f19271c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s4.n.a
        public n.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f19269a = str;
            return this;
        }

        @Override // s4.n.a
        public n.a c(long j7) {
            this.f19271c = Long.valueOf(j7);
            return this;
        }

        @Override // s4.n.a
        public n.a d(long j7) {
            this.f19270b = Long.valueOf(j7);
            return this;
        }
    }

    public C1955a(String str, long j7, long j8) {
        this.f19266a = str;
        this.f19267b = j7;
        this.f19268c = j8;
    }

    @Override // s4.n
    public String b() {
        return this.f19266a;
    }

    @Override // s4.n
    public long c() {
        return this.f19268c;
    }

    @Override // s4.n
    public long d() {
        return this.f19267b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f19266a.equals(nVar.b()) && this.f19267b == nVar.d() && this.f19268c == nVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f19266a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f19267b;
        long j8 = this.f19268c;
        return ((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f19266a + ", tokenExpirationTimestamp=" + this.f19267b + ", tokenCreationTimestamp=" + this.f19268c + "}";
    }
}
