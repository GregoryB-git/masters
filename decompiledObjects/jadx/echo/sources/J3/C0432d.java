package J3;

import J3.B;

/* renamed from: J3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432d extends B.a.AbstractC0042a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2860b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2861c;

    /* renamed from: J3.d$b */
    public static final class b extends B.a.AbstractC0042a.AbstractC0043a {

        /* renamed from: a, reason: collision with root package name */
        public String f2862a;

        /* renamed from: b, reason: collision with root package name */
        public String f2863b;

        /* renamed from: c, reason: collision with root package name */
        public String f2864c;

        @Override // J3.B.a.AbstractC0042a.AbstractC0043a
        public B.a.AbstractC0042a a() {
            String str = "";
            if (this.f2862a == null) {
                str = " arch";
            }
            if (this.f2863b == null) {
                str = str + " libraryName";
            }
            if (this.f2864c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C0432d(this.f2862a, this.f2863b, this.f2864c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.a.AbstractC0042a.AbstractC0043a
        public B.a.AbstractC0042a.AbstractC0043a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f2862a = str;
            return this;
        }

        @Override // J3.B.a.AbstractC0042a.AbstractC0043a
        public B.a.AbstractC0042a.AbstractC0043a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f2864c = str;
            return this;
        }

        @Override // J3.B.a.AbstractC0042a.AbstractC0043a
        public B.a.AbstractC0042a.AbstractC0043a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f2863b = str;
            return this;
        }
    }

    public C0432d(String str, String str2, String str3) {
        this.f2859a = str;
        this.f2860b = str2;
        this.f2861c = str3;
    }

    @Override // J3.B.a.AbstractC0042a
    public String b() {
        return this.f2859a;
    }

    @Override // J3.B.a.AbstractC0042a
    public String c() {
        return this.f2861c;
    }

    @Override // J3.B.a.AbstractC0042a
    public String d() {
        return this.f2860b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.a.AbstractC0042a)) {
            return false;
        }
        B.a.AbstractC0042a abstractC0042a = (B.a.AbstractC0042a) obj;
        return this.f2859a.equals(abstractC0042a.b()) && this.f2860b.equals(abstractC0042a.d()) && this.f2861c.equals(abstractC0042a.c());
    }

    public int hashCode() {
        return ((((this.f2859a.hashCode() ^ 1000003) * 1000003) ^ this.f2860b.hashCode()) * 1000003) ^ this.f2861c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f2859a + ", libraryName=" + this.f2860b + ", buildId=" + this.f2861c + "}";
    }
}
