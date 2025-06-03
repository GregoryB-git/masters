package J3;

import J3.B;

/* loaded from: classes.dex */
public final class e extends B.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2866b;

    public static final class b extends B.c.a {

        /* renamed from: a, reason: collision with root package name */
        public String f2867a;

        /* renamed from: b, reason: collision with root package name */
        public String f2868b;

        @Override // J3.B.c.a
        public B.c a() {
            String str = "";
            if (this.f2867a == null) {
                str = " key";
            }
            if (this.f2868b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f2867a, this.f2868b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.c.a
        public B.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f2867a = str;
            return this;
        }

        @Override // J3.B.c.a
        public B.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f2868b = str;
            return this;
        }
    }

    public e(String str, String str2) {
        this.f2865a = str;
        this.f2866b = str2;
    }

    @Override // J3.B.c
    public String b() {
        return this.f2865a;
    }

    @Override // J3.B.c
    public String c() {
        return this.f2866b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.c)) {
            return false;
        }
        B.c cVar = (B.c) obj;
        return this.f2865a.equals(cVar.b()) && this.f2866b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f2865a.hashCode() ^ 1000003) * 1000003) ^ this.f2866b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f2865a + ", value=" + this.f2866b + "}";
    }
}
