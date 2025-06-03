package J3;

import J3.B;

/* loaded from: classes.dex */
public final class v extends B.e.AbstractC0057e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3017c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3018d;

    public static final class b extends B.e.AbstractC0057e.a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f3019a;

        /* renamed from: b, reason: collision with root package name */
        public String f3020b;

        /* renamed from: c, reason: collision with root package name */
        public String f3021c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f3022d;

        @Override // J3.B.e.AbstractC0057e.a
        public B.e.AbstractC0057e a() {
            String str = "";
            if (this.f3019a == null) {
                str = " platform";
            }
            if (this.f3020b == null) {
                str = str + " version";
            }
            if (this.f3021c == null) {
                str = str + " buildVersion";
            }
            if (this.f3022d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f3019a.intValue(), this.f3020b, this.f3021c, this.f3022d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.AbstractC0057e.a
        public B.e.AbstractC0057e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f3021c = str;
            return this;
        }

        @Override // J3.B.e.AbstractC0057e.a
        public B.e.AbstractC0057e.a c(boolean z7) {
            this.f3022d = Boolean.valueOf(z7);
            return this;
        }

        @Override // J3.B.e.AbstractC0057e.a
        public B.e.AbstractC0057e.a d(int i7) {
            this.f3019a = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.AbstractC0057e.a
        public B.e.AbstractC0057e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f3020b = str;
            return this;
        }
    }

    public v(int i7, String str, String str2, boolean z7) {
        this.f3015a = i7;
        this.f3016b = str;
        this.f3017c = str2;
        this.f3018d = z7;
    }

    @Override // J3.B.e.AbstractC0057e
    public String b() {
        return this.f3017c;
    }

    @Override // J3.B.e.AbstractC0057e
    public int c() {
        return this.f3015a;
    }

    @Override // J3.B.e.AbstractC0057e
    public String d() {
        return this.f3016b;
    }

    @Override // J3.B.e.AbstractC0057e
    public boolean e() {
        return this.f3018d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.AbstractC0057e)) {
            return false;
        }
        B.e.AbstractC0057e abstractC0057e = (B.e.AbstractC0057e) obj;
        return this.f3015a == abstractC0057e.c() && this.f3016b.equals(abstractC0057e.d()) && this.f3017c.equals(abstractC0057e.b()) && this.f3018d == abstractC0057e.e();
    }

    public int hashCode() {
        return ((((((this.f3015a ^ 1000003) * 1000003) ^ this.f3016b.hashCode()) * 1000003) ^ this.f3017c.hashCode()) * 1000003) ^ (this.f3018d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f3015a + ", version=" + this.f3016b + ", buildVersion=" + this.f3017c + ", jailbroken=" + this.f3018d + "}";
    }
}
