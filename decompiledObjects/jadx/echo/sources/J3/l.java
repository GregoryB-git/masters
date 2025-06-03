package J3;

import J3.B;

/* loaded from: classes.dex */
public final class l extends B.e.d {

    /* renamed from: a, reason: collision with root package name */
    public final long f2931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2932b;

    /* renamed from: c, reason: collision with root package name */
    public final B.e.d.a f2933c;

    /* renamed from: d, reason: collision with root package name */
    public final B.e.d.c f2934d;

    /* renamed from: e, reason: collision with root package name */
    public final B.e.d.AbstractC0056d f2935e;

    public static final class b extends B.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        public Long f2936a;

        /* renamed from: b, reason: collision with root package name */
        public String f2937b;

        /* renamed from: c, reason: collision with root package name */
        public B.e.d.a f2938c;

        /* renamed from: d, reason: collision with root package name */
        public B.e.d.c f2939d;

        /* renamed from: e, reason: collision with root package name */
        public B.e.d.AbstractC0056d f2940e;

        public b() {
        }

        @Override // J3.B.e.d.b
        public B.e.d a() {
            String str = "";
            if (this.f2936a == null) {
                str = " timestamp";
            }
            if (this.f2937b == null) {
                str = str + " type";
            }
            if (this.f2938c == null) {
                str = str + " app";
            }
            if (this.f2939d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f2936a.longValue(), this.f2937b, this.f2938c, this.f2939d, this.f2940e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.b
        public B.e.d.b b(B.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f2938c = aVar;
            return this;
        }

        @Override // J3.B.e.d.b
        public B.e.d.b c(B.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f2939d = cVar;
            return this;
        }

        @Override // J3.B.e.d.b
        public B.e.d.b d(B.e.d.AbstractC0056d abstractC0056d) {
            this.f2940e = abstractC0056d;
            return this;
        }

        @Override // J3.B.e.d.b
        public B.e.d.b e(long j7) {
            this.f2936a = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.b
        public B.e.d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f2937b = str;
            return this;
        }

        public b(B.e.d dVar) {
            this.f2936a = Long.valueOf(dVar.e());
            this.f2937b = dVar.f();
            this.f2938c = dVar.b();
            this.f2939d = dVar.c();
            this.f2940e = dVar.d();
        }
    }

    public l(long j7, String str, B.e.d.a aVar, B.e.d.c cVar, B.e.d.AbstractC0056d abstractC0056d) {
        this.f2931a = j7;
        this.f2932b = str;
        this.f2933c = aVar;
        this.f2934d = cVar;
        this.f2935e = abstractC0056d;
    }

    @Override // J3.B.e.d
    public B.e.d.a b() {
        return this.f2933c;
    }

    @Override // J3.B.e.d
    public B.e.d.c c() {
        return this.f2934d;
    }

    @Override // J3.B.e.d
    public B.e.d.AbstractC0056d d() {
        return this.f2935e;
    }

    @Override // J3.B.e.d
    public long e() {
        return this.f2931a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d)) {
            return false;
        }
        B.e.d dVar = (B.e.d) obj;
        if (this.f2931a == dVar.e() && this.f2932b.equals(dVar.f()) && this.f2933c.equals(dVar.b()) && this.f2934d.equals(dVar.c())) {
            B.e.d.AbstractC0056d abstractC0056d = this.f2935e;
            B.e.d.AbstractC0056d d7 = dVar.d();
            if (abstractC0056d == null) {
                if (d7 == null) {
                    return true;
                }
            } else if (abstractC0056d.equals(d7)) {
                return true;
            }
        }
        return false;
    }

    @Override // J3.B.e.d
    public String f() {
        return this.f2932b;
    }

    @Override // J3.B.e.d
    public B.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j7 = this.f2931a;
        int hashCode = (((((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f2932b.hashCode()) * 1000003) ^ this.f2933c.hashCode()) * 1000003) ^ this.f2934d.hashCode()) * 1000003;
        B.e.d.AbstractC0056d abstractC0056d = this.f2935e;
        return hashCode ^ (abstractC0056d == null ? 0 : abstractC0056d.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f2931a + ", type=" + this.f2932b + ", app=" + this.f2933c + ", device=" + this.f2934d + ", log=" + this.f2935e + "}";
    }
}
