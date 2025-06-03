package v4;

import v4.AbstractC2059d;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056a extends AbstractC2059d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20142c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2061f f20143d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2059d.b f20144e;

    /* renamed from: v4.a$b */
    public static final class b extends AbstractC2059d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f20145a;

        /* renamed from: b, reason: collision with root package name */
        public String f20146b;

        /* renamed from: c, reason: collision with root package name */
        public String f20147c;

        /* renamed from: d, reason: collision with root package name */
        public AbstractC2061f f20148d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC2059d.b f20149e;

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d a() {
            return new C2056a(this.f20145a, this.f20146b, this.f20147c, this.f20148d, this.f20149e);
        }

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d.a b(AbstractC2061f abstractC2061f) {
            this.f20148d = abstractC2061f;
            return this;
        }

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d.a c(String str) {
            this.f20146b = str;
            return this;
        }

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d.a d(String str) {
            this.f20147c = str;
            return this;
        }

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d.a e(AbstractC2059d.b bVar) {
            this.f20149e = bVar;
            return this;
        }

        @Override // v4.AbstractC2059d.a
        public AbstractC2059d.a f(String str) {
            this.f20145a = str;
            return this;
        }
    }

    public C2056a(String str, String str2, String str3, AbstractC2061f abstractC2061f, AbstractC2059d.b bVar) {
        this.f20140a = str;
        this.f20141b = str2;
        this.f20142c = str3;
        this.f20143d = abstractC2061f;
        this.f20144e = bVar;
    }

    @Override // v4.AbstractC2059d
    public AbstractC2061f b() {
        return this.f20143d;
    }

    @Override // v4.AbstractC2059d
    public String c() {
        return this.f20141b;
    }

    @Override // v4.AbstractC2059d
    public String d() {
        return this.f20142c;
    }

    @Override // v4.AbstractC2059d
    public AbstractC2059d.b e() {
        return this.f20144e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2059d)) {
            return false;
        }
        AbstractC2059d abstractC2059d = (AbstractC2059d) obj;
        String str = this.f20140a;
        if (str != null ? str.equals(abstractC2059d.f()) : abstractC2059d.f() == null) {
            String str2 = this.f20141b;
            if (str2 != null ? str2.equals(abstractC2059d.c()) : abstractC2059d.c() == null) {
                String str3 = this.f20142c;
                if (str3 != null ? str3.equals(abstractC2059d.d()) : abstractC2059d.d() == null) {
                    AbstractC2061f abstractC2061f = this.f20143d;
                    if (abstractC2061f != null ? abstractC2061f.equals(abstractC2059d.b()) : abstractC2059d.b() == null) {
                        AbstractC2059d.b bVar = this.f20144e;
                        AbstractC2059d.b e7 = abstractC2059d.e();
                        if (bVar == null) {
                            if (e7 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e7)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // v4.AbstractC2059d
    public String f() {
        return this.f20140a;
    }

    public int hashCode() {
        String str = this.f20140a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20141b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20142c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC2061f abstractC2061f = this.f20143d;
        int hashCode4 = (hashCode3 ^ (abstractC2061f == null ? 0 : abstractC2061f.hashCode())) * 1000003;
        AbstractC2059d.b bVar = this.f20144e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f20140a + ", fid=" + this.f20141b + ", refreshToken=" + this.f20142c + ", authToken=" + this.f20143d + ", responseCode=" + this.f20144e + "}";
    }
}
