package J3;

import J3.B;

/* renamed from: J3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431c extends B.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2844d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2845e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2846f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2847g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2848h;

    /* renamed from: i, reason: collision with root package name */
    public final C f2849i;

    /* renamed from: J3.c$b */
    public static final class b extends B.a.b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f2850a;

        /* renamed from: b, reason: collision with root package name */
        public String f2851b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f2852c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f2853d;

        /* renamed from: e, reason: collision with root package name */
        public Long f2854e;

        /* renamed from: f, reason: collision with root package name */
        public Long f2855f;

        /* renamed from: g, reason: collision with root package name */
        public Long f2856g;

        /* renamed from: h, reason: collision with root package name */
        public String f2857h;

        /* renamed from: i, reason: collision with root package name */
        public C f2858i;

        @Override // J3.B.a.b
        public B.a a() {
            String str = "";
            if (this.f2850a == null) {
                str = " pid";
            }
            if (this.f2851b == null) {
                str = str + " processName";
            }
            if (this.f2852c == null) {
                str = str + " reasonCode";
            }
            if (this.f2853d == null) {
                str = str + " importance";
            }
            if (this.f2854e == null) {
                str = str + " pss";
            }
            if (this.f2855f == null) {
                str = str + " rss";
            }
            if (this.f2856g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C0431c(this.f2850a.intValue(), this.f2851b, this.f2852c.intValue(), this.f2853d.intValue(), this.f2854e.longValue(), this.f2855f.longValue(), this.f2856g.longValue(), this.f2857h, this.f2858i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.a.b
        public B.a.b b(C c7) {
            this.f2858i = c7;
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b c(int i7) {
            this.f2853d = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b d(int i7) {
            this.f2850a = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f2851b = str;
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b f(long j7) {
            this.f2854e = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b g(int i7) {
            this.f2852c = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b h(long j7) {
            this.f2855f = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b i(long j7) {
            this.f2856g = Long.valueOf(j7);
            return this;
        }

        @Override // J3.B.a.b
        public B.a.b j(String str) {
            this.f2857h = str;
            return this;
        }
    }

    public C0431c(int i7, String str, int i8, int i9, long j7, long j8, long j9, String str2, C c7) {
        this.f2841a = i7;
        this.f2842b = str;
        this.f2843c = i8;
        this.f2844d = i9;
        this.f2845e = j7;
        this.f2846f = j8;
        this.f2847g = j9;
        this.f2848h = str2;
        this.f2849i = c7;
    }

    @Override // J3.B.a
    public C b() {
        return this.f2849i;
    }

    @Override // J3.B.a
    public int c() {
        return this.f2844d;
    }

    @Override // J3.B.a
    public int d() {
        return this.f2841a;
    }

    @Override // J3.B.a
    public String e() {
        return this.f2842b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a)) {
            return false;
        }
        B.a aVar = (B.a) obj;
        if (this.f2841a == aVar.d() && this.f2842b.equals(aVar.e()) && this.f2843c == aVar.g() && this.f2844d == aVar.c() && this.f2845e == aVar.f() && this.f2846f == aVar.h() && this.f2847g == aVar.i() && ((str = this.f2848h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            C c7 = this.f2849i;
            C b7 = aVar.b();
            if (c7 == null) {
                if (b7 == null) {
                    return true;
                }
            } else if (c7.equals(b7)) {
                return true;
            }
        }
        return false;
    }

    @Override // J3.B.a
    public long f() {
        return this.f2845e;
    }

    @Override // J3.B.a
    public int g() {
        return this.f2843c;
    }

    @Override // J3.B.a
    public long h() {
        return this.f2846f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f2841a ^ 1000003) * 1000003) ^ this.f2842b.hashCode()) * 1000003) ^ this.f2843c) * 1000003) ^ this.f2844d) * 1000003;
        long j7 = this.f2845e;
        int i7 = (hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f2846f;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f2847g;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str = this.f2848h;
        int hashCode2 = (i9 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        C c7 = this.f2849i;
        return hashCode2 ^ (c7 != null ? c7.hashCode() : 0);
    }

    @Override // J3.B.a
    public long i() {
        return this.f2847g;
    }

    @Override // J3.B.a
    public String j() {
        return this.f2848h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f2841a + ", processName=" + this.f2842b + ", reasonCode=" + this.f2843c + ", importance=" + this.f2844d + ", pss=" + this.f2845e + ", rss=" + this.f2846f + ", timestamp=" + this.f2847g + ", traceFile=" + this.f2848h + ", buildIdMappingForArch=" + this.f2849i + "}";
    }
}
