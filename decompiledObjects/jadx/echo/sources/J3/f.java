package J3;

import J3.B;

/* loaded from: classes.dex */
public final class f extends B.d {

    /* renamed from: a, reason: collision with root package name */
    public final C f2869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2870b;

    public static final class b extends B.d.a {

        /* renamed from: a, reason: collision with root package name */
        public C f2871a;

        /* renamed from: b, reason: collision with root package name */
        public String f2872b;

        @Override // J3.B.d.a
        public B.d a() {
            String str = "";
            if (this.f2871a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f2871a, this.f2872b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.d.a
        public B.d.a b(C c7) {
            if (c7 == null) {
                throw new NullPointerException("Null files");
            }
            this.f2871a = c7;
            return this;
        }

        @Override // J3.B.d.a
        public B.d.a c(String str) {
            this.f2872b = str;
            return this;
        }
    }

    public f(C c7, String str) {
        this.f2869a = c7;
        this.f2870b = str;
    }

    @Override // J3.B.d
    public C b() {
        return this.f2869a;
    }

    @Override // J3.B.d
    public String c() {
        return this.f2870b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.d)) {
            return false;
        }
        B.d dVar = (B.d) obj;
        if (this.f2869a.equals(dVar.b())) {
            String str = this.f2870b;
            String c7 = dVar.c();
            if (str == null) {
                if (c7 == null) {
                    return true;
                }
            } else if (str.equals(c7)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f2869a.hashCode() ^ 1000003) * 1000003;
        String str = this.f2870b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f2869a + ", orgId=" + this.f2870b + "}";
    }
}
