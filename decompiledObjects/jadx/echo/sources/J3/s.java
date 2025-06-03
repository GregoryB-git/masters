package J3;

import J3.B;

/* loaded from: classes.dex */
public final class s extends B.e.d.a.b.AbstractC0052e.AbstractC0054b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2991a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2992b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2993c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2994d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2995e;

    public static final class b extends B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a {

        /* renamed from: a, reason: collision with root package name */
        public Long f2996a;

        /* renamed from: b, reason: collision with root package name */
        public String f2997b;

        /* renamed from: c, reason: collision with root package name */
        public String f2998c;

        /* renamed from: d, reason: collision with root package name */
        public Long f2999d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f3000e;

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b a() {
            String str = "";
            if (this.f2996a == null) {
                str = " pc";
            }
            if (this.f2997b == null) {
                str = str + " symbol";
            }
            if (this.f2999d == null) {
                str = str + " offset";
            }
            if (this.f3000e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f2996a.longValue(), this.f2997b, this.f2998c, this.f2999d.longValue(), this.f3000e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a b(String str) {
            this.f2998c = str;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a c(int i7) {
            this.f3000e = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a d(long j7) {
            this.f2999d = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a e(long j7) {
            this.f2996a = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a
        public B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f2997b = str;
            return this;
        }
    }

    public s(long j7, String str, String str2, long j8, int i7) {
        this.f2991a = j7;
        this.f2992b = str;
        this.f2993c = str2;
        this.f2994d = j8;
        this.f2995e = i7;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b
    public String b() {
        return this.f2993c;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b
    public int c() {
        return this.f2995e;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b
    public long d() {
        return this.f2994d;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b
    public long e() {
        return this.f2991a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0052e.AbstractC0054b)) {
            return false;
        }
        B.e.d.a.b.AbstractC0052e.AbstractC0054b abstractC0054b = (B.e.d.a.b.AbstractC0052e.AbstractC0054b) obj;
        return this.f2991a == abstractC0054b.e() && this.f2992b.equals(abstractC0054b.f()) && ((str = this.f2993c) != null ? str.equals(abstractC0054b.b()) : abstractC0054b.b() == null) && this.f2994d == abstractC0054b.d() && this.f2995e == abstractC0054b.c();
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0054b
    public String f() {
        return this.f2992b;
    }

    public int hashCode() {
        long j7 = this.f2991a;
        int hashCode = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f2992b.hashCode()) * 1000003;
        String str = this.f2993c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f2994d;
        return ((hashCode2 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f2995e;
    }

    public String toString() {
        return "Frame{pc=" + this.f2991a + ", symbol=" + this.f2992b + ", file=" + this.f2993c + ", offset=" + this.f2994d + ", importance=" + this.f2995e + "}";
    }
}
