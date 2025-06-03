package J3;

import J3.B;

/* loaded from: classes.dex */
public final class p extends B.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2970b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2971c;

    /* renamed from: d, reason: collision with root package name */
    public final B.e.d.a.b.c f2972d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2973e;

    public static final class b extends B.e.d.a.b.c.AbstractC0049a {

        /* renamed from: a, reason: collision with root package name */
        public String f2974a;

        /* renamed from: b, reason: collision with root package name */
        public String f2975b;

        /* renamed from: c, reason: collision with root package name */
        public C f2976c;

        /* renamed from: d, reason: collision with root package name */
        public B.e.d.a.b.c f2977d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f2978e;

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c a() {
            String str = "";
            if (this.f2974a == null) {
                str = " type";
            }
            if (this.f2976c == null) {
                str = str + " frames";
            }
            if (this.f2978e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f2974a, this.f2975b, this.f2976c, this.f2977d, this.f2978e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c.AbstractC0049a b(B.e.d.a.b.c cVar) {
            this.f2977d = cVar;
            return this;
        }

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c.AbstractC0049a c(C c7) {
            if (c7 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f2976c = c7;
            return this;
        }

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c.AbstractC0049a d(int i7) {
            this.f2978e = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c.AbstractC0049a e(String str) {
            this.f2975b = str;
            return this;
        }

        @Override // J3.B.e.d.a.b.c.AbstractC0049a
        public B.e.d.a.b.c.AbstractC0049a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f2974a = str;
            return this;
        }
    }

    public p(String str, String str2, C c7, B.e.d.a.b.c cVar, int i7) {
        this.f2969a = str;
        this.f2970b = str2;
        this.f2971c = c7;
        this.f2972d = cVar;
        this.f2973e = i7;
    }

    @Override // J3.B.e.d.a.b.c
    public B.e.d.a.b.c b() {
        return this.f2972d;
    }

    @Override // J3.B.e.d.a.b.c
    public C c() {
        return this.f2971c;
    }

    @Override // J3.B.e.d.a.b.c
    public int d() {
        return this.f2973e;
    }

    @Override // J3.B.e.d.a.b.c
    public String e() {
        return this.f2970b;
    }

    public boolean equals(Object obj) {
        String str;
        B.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.c)) {
            return false;
        }
        B.e.d.a.b.c cVar2 = (B.e.d.a.b.c) obj;
        return this.f2969a.equals(cVar2.f()) && ((str = this.f2970b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f2971c.equals(cVar2.c()) && ((cVar = this.f2972d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f2973e == cVar2.d();
    }

    @Override // J3.B.e.d.a.b.c
    public String f() {
        return this.f2969a;
    }

    public int hashCode() {
        int hashCode = (this.f2969a.hashCode() ^ 1000003) * 1000003;
        String str = this.f2970b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2971c.hashCode()) * 1000003;
        B.e.d.a.b.c cVar = this.f2972d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f2973e;
    }

    public String toString() {
        return "Exception{type=" + this.f2969a + ", reason=" + this.f2970b + ", frames=" + this.f2971c + ", causedBy=" + this.f2972d + ", overflowCount=" + this.f2973e + "}";
    }
}
