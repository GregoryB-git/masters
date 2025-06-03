package J3;

import J3.B;

/* loaded from: classes.dex */
public final class t extends B.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    public final Double f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3002b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3003c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3004d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3005e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3006f;

    public static final class b extends B.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Double f3007a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f3008b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f3009c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f3010d;

        /* renamed from: e, reason: collision with root package name */
        public Long f3011e;

        /* renamed from: f, reason: collision with root package name */
        public Long f3012f;

        @Override // J3.B.e.d.c.a
        public B.e.d.c a() {
            String str = "";
            if (this.f3008b == null) {
                str = " batteryVelocity";
            }
            if (this.f3009c == null) {
                str = str + " proximityOn";
            }
            if (this.f3010d == null) {
                str = str + " orientation";
            }
            if (this.f3011e == null) {
                str = str + " ramUsed";
            }
            if (this.f3012f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f3007a, this.f3008b.intValue(), this.f3009c.booleanValue(), this.f3010d.intValue(), this.f3011e.longValue(), this.f3012f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a b(Double d7) {
            this.f3007a = d7;
            return this;
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a c(int i7) {
            this.f3008b = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a d(long j7) {
            this.f3012f = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a e(int i7) {
            this.f3010d = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a f(boolean z7) {
            this.f3009c = Boolean.valueOf(z7);
            return this;
        }

        @Override // J3.B.e.d.c.a
        public B.e.d.c.a g(long j7) {
            this.f3011e = Long.valueOf(j7);
            return this;
        }
    }

    public t(Double d7, int i7, boolean z7, int i8, long j7, long j8) {
        this.f3001a = d7;
        this.f3002b = i7;
        this.f3003c = z7;
        this.f3004d = i8;
        this.f3005e = j7;
        this.f3006f = j8;
    }

    @Override // J3.B.e.d.c
    public Double b() {
        return this.f3001a;
    }

    @Override // J3.B.e.d.c
    public int c() {
        return this.f3002b;
    }

    @Override // J3.B.e.d.c
    public long d() {
        return this.f3006f;
    }

    @Override // J3.B.e.d.c
    public int e() {
        return this.f3004d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.c)) {
            return false;
        }
        B.e.d.c cVar = (B.e.d.c) obj;
        Double d7 = this.f3001a;
        if (d7 != null ? d7.equals(cVar.b()) : cVar.b() == null) {
            if (this.f3002b == cVar.c() && this.f3003c == cVar.g() && this.f3004d == cVar.e() && this.f3005e == cVar.f() && this.f3006f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // J3.B.e.d.c
    public long f() {
        return this.f3005e;
    }

    @Override // J3.B.e.d.c
    public boolean g() {
        return this.f3003c;
    }

    public int hashCode() {
        Double d7 = this.f3001a;
        int hashCode = ((((((((d7 == null ? 0 : d7.hashCode()) ^ 1000003) * 1000003) ^ this.f3002b) * 1000003) ^ (this.f3003c ? 1231 : 1237)) * 1000003) ^ this.f3004d) * 1000003;
        long j7 = this.f3005e;
        long j8 = this.f3006f;
        return ((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f3001a + ", batteryVelocity=" + this.f3002b + ", proximityOn=" + this.f3003c + ", orientation=" + this.f3004d + ", ramUsed=" + this.f3005e + ", diskUsed=" + this.f3006f + "}";
    }
}
