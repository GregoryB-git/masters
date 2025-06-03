package J3;

import J3.B;

/* loaded from: classes.dex */
public final class i extends B.e.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2903c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2904d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2905e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2906f;

    public static final class b extends B.e.a.AbstractC0044a {

        /* renamed from: a, reason: collision with root package name */
        public String f2907a;

        /* renamed from: b, reason: collision with root package name */
        public String f2908b;

        /* renamed from: c, reason: collision with root package name */
        public String f2909c;

        /* renamed from: d, reason: collision with root package name */
        public String f2910d;

        /* renamed from: e, reason: collision with root package name */
        public String f2911e;

        /* renamed from: f, reason: collision with root package name */
        public String f2912f;

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a a() {
            String str = "";
            if (this.f2907a == null) {
                str = " identifier";
            }
            if (this.f2908b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f2907a, this.f2908b, this.f2909c, null, this.f2910d, this.f2911e, this.f2912f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a b(String str) {
            this.f2911e = str;
            return this;
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a c(String str) {
            this.f2912f = str;
            return this;
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a d(String str) {
            this.f2909c = str;
            return this;
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f2907a = str;
            return this;
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a f(String str) {
            this.f2910d = str;
            return this;
        }

        @Override // J3.B.e.a.AbstractC0044a
        public B.e.a.AbstractC0044a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f2908b = str;
            return this;
        }
    }

    public i(String str, String str2, String str3, B.e.a.b bVar, String str4, String str5, String str6) {
        this.f2901a = str;
        this.f2902b = str2;
        this.f2903c = str3;
        this.f2904d = str4;
        this.f2905e = str5;
        this.f2906f = str6;
    }

    @Override // J3.B.e.a
    public String b() {
        return this.f2905e;
    }

    @Override // J3.B.e.a
    public String c() {
        return this.f2906f;
    }

    @Override // J3.B.e.a
    public String d() {
        return this.f2903c;
    }

    @Override // J3.B.e.a
    public String e() {
        return this.f2901a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.a)) {
            return false;
        }
        B.e.a aVar = (B.e.a) obj;
        if (this.f2901a.equals(aVar.e()) && this.f2902b.equals(aVar.h()) && ((str = this.f2903c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f2904d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f2905e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f2906f;
                    String c7 = aVar.c();
                    if (str4 == null) {
                        if (c7 == null) {
                            return true;
                        }
                    } else if (str4.equals(c7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // J3.B.e.a
    public String f() {
        return this.f2904d;
    }

    @Override // J3.B.e.a
    public B.e.a.b g() {
        return null;
    }

    @Override // J3.B.e.a
    public String h() {
        return this.f2902b;
    }

    public int hashCode() {
        int hashCode = (((this.f2901a.hashCode() ^ 1000003) * 1000003) ^ this.f2902b.hashCode()) * 1000003;
        String str = this.f2903c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f2904d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2905e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2906f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f2901a + ", version=" + this.f2902b + ", displayVersion=" + this.f2903c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f2904d + ", developmentPlatform=" + this.f2905e + ", developmentPlatformVersion=" + this.f2906f + "}";
    }
}
