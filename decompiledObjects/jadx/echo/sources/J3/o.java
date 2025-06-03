package J3;

import J3.B;

/* loaded from: classes.dex */
public final class o extends B.e.d.a.b.AbstractC0046a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2963c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2964d;

    public static final class b extends B.e.d.a.b.AbstractC0046a.AbstractC0047a {

        /* renamed from: a, reason: collision with root package name */
        public Long f2965a;

        /* renamed from: b, reason: collision with root package name */
        public Long f2966b;

        /* renamed from: c, reason: collision with root package name */
        public String f2967c;

        /* renamed from: d, reason: collision with root package name */
        public String f2968d;

        @Override // J3.B.e.d.a.b.AbstractC0046a.AbstractC0047a
        public B.e.d.a.b.AbstractC0046a a() {
            String str = "";
            if (this.f2965a == null) {
                str = " baseAddress";
            }
            if (this.f2966b == null) {
                str = str + " size";
            }
            if (this.f2967c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f2965a.longValue(), this.f2966b.longValue(), this.f2967c, this.f2968d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.AbstractC0046a.AbstractC0047a
        public B.e.d.a.b.AbstractC0046a.AbstractC0047a b(long j7) {
            this.f2965a = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0046a.AbstractC0047a
        public B.e.d.a.b.AbstractC0046a.AbstractC0047a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f2967c = str;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0046a.AbstractC0047a
        public B.e.d.a.b.AbstractC0046a.AbstractC0047a d(long j7) {
            this.f2966b = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0046a.AbstractC0047a
        public B.e.d.a.b.AbstractC0046a.AbstractC0047a e(String str) {
            this.f2968d = str;
            return this;
        }
    }

    public o(long j7, long j8, String str, String str2) {
        this.f2961a = j7;
        this.f2962b = j8;
        this.f2963c = str;
        this.f2964d = str2;
    }

    @Override // J3.B.e.d.a.b.AbstractC0046a
    public long b() {
        return this.f2961a;
    }

    @Override // J3.B.e.d.a.b.AbstractC0046a
    public String c() {
        return this.f2963c;
    }

    @Override // J3.B.e.d.a.b.AbstractC0046a
    public long d() {
        return this.f2962b;
    }

    @Override // J3.B.e.d.a.b.AbstractC0046a
    public String e() {
        return this.f2964d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0046a)) {
            return false;
        }
        B.e.d.a.b.AbstractC0046a abstractC0046a = (B.e.d.a.b.AbstractC0046a) obj;
        if (this.f2961a == abstractC0046a.b() && this.f2962b == abstractC0046a.d() && this.f2963c.equals(abstractC0046a.c())) {
            String str = this.f2964d;
            String e7 = abstractC0046a.e();
            if (str == null) {
                if (e7 == null) {
                    return true;
                }
            } else if (str.equals(e7)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f2961a;
        long j8 = this.f2962b;
        int hashCode = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f2963c.hashCode()) * 1000003;
        String str = this.f2964d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f2961a + ", size=" + this.f2962b + ", name=" + this.f2963c + ", uuid=" + this.f2964d + "}";
    }
}
