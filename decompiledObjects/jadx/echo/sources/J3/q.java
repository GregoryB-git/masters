package J3;

import J3.B;

/* loaded from: classes.dex */
public final class q extends B.e.d.a.b.AbstractC0050d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2981c;

    public static final class b extends B.e.d.a.b.AbstractC0050d.AbstractC0051a {

        /* renamed from: a, reason: collision with root package name */
        public String f2982a;

        /* renamed from: b, reason: collision with root package name */
        public String f2983b;

        /* renamed from: c, reason: collision with root package name */
        public Long f2984c;

        @Override // J3.B.e.d.a.b.AbstractC0050d.AbstractC0051a
        public B.e.d.a.b.AbstractC0050d a() {
            String str = "";
            if (this.f2982a == null) {
                str = " name";
            }
            if (this.f2983b == null) {
                str = str + " code";
            }
            if (this.f2984c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f2982a, this.f2983b, this.f2984c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.AbstractC0050d.AbstractC0051a
        public B.e.d.a.b.AbstractC0050d.AbstractC0051a b(long j7) {
            this.f2984c = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0050d.AbstractC0051a
        public B.e.d.a.b.AbstractC0050d.AbstractC0051a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f2983b = str;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0050d.AbstractC0051a
        public B.e.d.a.b.AbstractC0050d.AbstractC0051a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f2982a = str;
            return this;
        }
    }

    public q(String str, String str2, long j7) {
        this.f2979a = str;
        this.f2980b = str2;
        this.f2981c = j7;
    }

    @Override // J3.B.e.d.a.b.AbstractC0050d
    public long b() {
        return this.f2981c;
    }

    @Override // J3.B.e.d.a.b.AbstractC0050d
    public String c() {
        return this.f2980b;
    }

    @Override // J3.B.e.d.a.b.AbstractC0050d
    public String d() {
        return this.f2979a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0050d)) {
            return false;
        }
        B.e.d.a.b.AbstractC0050d abstractC0050d = (B.e.d.a.b.AbstractC0050d) obj;
        return this.f2979a.equals(abstractC0050d.d()) && this.f2980b.equals(abstractC0050d.c()) && this.f2981c == abstractC0050d.b();
    }

    public int hashCode() {
        int hashCode = (((this.f2979a.hashCode() ^ 1000003) * 1000003) ^ this.f2980b.hashCode()) * 1000003;
        long j7 = this.f2981c;
        return hashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f2979a + ", code=" + this.f2980b + ", address=" + this.f2981c + "}";
    }
}
