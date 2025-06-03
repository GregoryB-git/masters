package J3;

import J3.B;

/* loaded from: classes.dex */
public final class k extends B.e.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2915c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2916d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2917e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2919g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2920h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2921i;

    public static final class b extends B.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f2922a;

        /* renamed from: b, reason: collision with root package name */
        public String f2923b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f2924c;

        /* renamed from: d, reason: collision with root package name */
        public Long f2925d;

        /* renamed from: e, reason: collision with root package name */
        public Long f2926e;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f2927f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f2928g;

        /* renamed from: h, reason: collision with root package name */
        public String f2929h;

        /* renamed from: i, reason: collision with root package name */
        public String f2930i;

        @Override // J3.B.e.c.a
        public B.e.c a() {
            String str = "";
            if (this.f2922a == null) {
                str = " arch";
            }
            if (this.f2923b == null) {
                str = str + " model";
            }
            if (this.f2924c == null) {
                str = str + " cores";
            }
            if (this.f2925d == null) {
                str = str + " ram";
            }
            if (this.f2926e == null) {
                str = str + " diskSpace";
            }
            if (this.f2927f == null) {
                str = str + " simulator";
            }
            if (this.f2928g == null) {
                str = str + " state";
            }
            if (this.f2929h == null) {
                str = str + " manufacturer";
            }
            if (this.f2930i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f2922a.intValue(), this.f2923b, this.f2924c.intValue(), this.f2925d.longValue(), this.f2926e.longValue(), this.f2927f.booleanValue(), this.f2928g.intValue(), this.f2929h, this.f2930i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.c.a
        public B.e.c.a b(int i7) {
            this.f2922a = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a c(int i7) {
            this.f2924c = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a d(long j7) {
            this.f2926e = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f2929h = str;
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f2923b = str;
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f2930i = str;
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a h(long j7) {
            this.f2925d = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a i(boolean z7) {
            this.f2927f = Boolean.valueOf(z7);
            return this;
        }

        @Override // J3.B.e.c.a
        public B.e.c.a j(int i7) {
            this.f2928g = Integer.valueOf(i7);
            return this;
        }
    }

    public k(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f2913a = i7;
        this.f2914b = str;
        this.f2915c = i8;
        this.f2916d = j7;
        this.f2917e = j8;
        this.f2918f = z7;
        this.f2919g = i9;
        this.f2920h = str2;
        this.f2921i = str3;
    }

    @Override // J3.B.e.c
    public int b() {
        return this.f2913a;
    }

    @Override // J3.B.e.c
    public int c() {
        return this.f2915c;
    }

    @Override // J3.B.e.c
    public long d() {
        return this.f2917e;
    }

    @Override // J3.B.e.c
    public String e() {
        return this.f2920h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.c)) {
            return false;
        }
        B.e.c cVar = (B.e.c) obj;
        return this.f2913a == cVar.b() && this.f2914b.equals(cVar.f()) && this.f2915c == cVar.c() && this.f2916d == cVar.h() && this.f2917e == cVar.d() && this.f2918f == cVar.j() && this.f2919g == cVar.i() && this.f2920h.equals(cVar.e()) && this.f2921i.equals(cVar.g());
    }

    @Override // J3.B.e.c
    public String f() {
        return this.f2914b;
    }

    @Override // J3.B.e.c
    public String g() {
        return this.f2921i;
    }

    @Override // J3.B.e.c
    public long h() {
        return this.f2916d;
    }

    public int hashCode() {
        int hashCode = (((((this.f2913a ^ 1000003) * 1000003) ^ this.f2914b.hashCode()) * 1000003) ^ this.f2915c) * 1000003;
        long j7 = this.f2916d;
        int i7 = (hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f2917e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f2918f ? 1231 : 1237)) * 1000003) ^ this.f2919g) * 1000003) ^ this.f2920h.hashCode()) * 1000003) ^ this.f2921i.hashCode();
    }

    @Override // J3.B.e.c
    public int i() {
        return this.f2919g;
    }

    @Override // J3.B.e.c
    public boolean j() {
        return this.f2918f;
    }

    public String toString() {
        return "Device{arch=" + this.f2913a + ", model=" + this.f2914b + ", cores=" + this.f2915c + ", ram=" + this.f2916d + ", diskSpace=" + this.f2917e + ", simulator=" + this.f2918f + ", state=" + this.f2919g + ", manufacturer=" + this.f2920h + ", modelClass=" + this.f2921i + "}";
    }
}
