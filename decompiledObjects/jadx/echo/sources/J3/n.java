package J3;

import J3.B;

/* loaded from: classes.dex */
public final class n extends B.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final C f2951a;

    /* renamed from: b, reason: collision with root package name */
    public final B.e.d.a.b.c f2952b;

    /* renamed from: c, reason: collision with root package name */
    public final B.a f2953c;

    /* renamed from: d, reason: collision with root package name */
    public final B.e.d.a.b.AbstractC0050d f2954d;

    /* renamed from: e, reason: collision with root package name */
    public final C f2955e;

    public static final class b extends B.e.d.a.b.AbstractC0048b {

        /* renamed from: a, reason: collision with root package name */
        public C f2956a;

        /* renamed from: b, reason: collision with root package name */
        public B.e.d.a.b.c f2957b;

        /* renamed from: c, reason: collision with root package name */
        public B.a f2958c;

        /* renamed from: d, reason: collision with root package name */
        public B.e.d.a.b.AbstractC0050d f2959d;

        /* renamed from: e, reason: collision with root package name */
        public C f2960e;

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b a() {
            String str = "";
            if (this.f2959d == null) {
                str = " signal";
            }
            if (this.f2960e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f2956a, this.f2957b, this.f2958c, this.f2959d, this.f2960e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b.AbstractC0048b b(B.a aVar) {
            this.f2958c = aVar;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b.AbstractC0048b c(C c7) {
            if (c7 == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f2960e = c7;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b.AbstractC0048b d(B.e.d.a.b.c cVar) {
            this.f2957b = cVar;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b.AbstractC0048b e(B.e.d.a.b.AbstractC0050d abstractC0050d) {
            if (abstractC0050d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f2959d = abstractC0050d;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0048b
        public B.e.d.a.b.AbstractC0048b f(C c7) {
            this.f2956a = c7;
            return this;
        }
    }

    public n(C c7, B.e.d.a.b.c cVar, B.a aVar, B.e.d.a.b.AbstractC0050d abstractC0050d, C c8) {
        this.f2951a = c7;
        this.f2952b = cVar;
        this.f2953c = aVar;
        this.f2954d = abstractC0050d;
        this.f2955e = c8;
    }

    @Override // J3.B.e.d.a.b
    public B.a b() {
        return this.f2953c;
    }

    @Override // J3.B.e.d.a.b
    public C c() {
        return this.f2955e;
    }

    @Override // J3.B.e.d.a.b
    public B.e.d.a.b.c d() {
        return this.f2952b;
    }

    @Override // J3.B.e.d.a.b
    public B.e.d.a.b.AbstractC0050d e() {
        return this.f2954d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b)) {
            return false;
        }
        B.e.d.a.b bVar = (B.e.d.a.b) obj;
        C c7 = this.f2951a;
        if (c7 != null ? c7.equals(bVar.f()) : bVar.f() == null) {
            B.e.d.a.b.c cVar = this.f2952b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                B.a aVar = this.f2953c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f2954d.equals(bVar.e()) && this.f2955e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // J3.B.e.d.a.b
    public C f() {
        return this.f2951a;
    }

    public int hashCode() {
        C c7 = this.f2951a;
        int hashCode = ((c7 == null ? 0 : c7.hashCode()) ^ 1000003) * 1000003;
        B.e.d.a.b.c cVar = this.f2952b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        B.a aVar = this.f2953c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f2954d.hashCode()) * 1000003) ^ this.f2955e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f2951a + ", exception=" + this.f2952b + ", appExitInfo=" + this.f2953c + ", signal=" + this.f2954d + ", binaries=" + this.f2955e + "}";
    }
}
