package J3;

import J3.B;

/* loaded from: classes.dex */
public final class r extends B.e.d.a.b.AbstractC0052e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2987c;

    public static final class b extends B.e.d.a.b.AbstractC0052e.AbstractC0053a {

        /* renamed from: a, reason: collision with root package name */
        public String f2988a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f2989b;

        /* renamed from: c, reason: collision with root package name */
        public C f2990c;

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0053a
        public B.e.d.a.b.AbstractC0052e a() {
            String str = "";
            if (this.f2988a == null) {
                str = " name";
            }
            if (this.f2989b == null) {
                str = str + " importance";
            }
            if (this.f2990c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f2988a, this.f2989b.intValue(), this.f2990c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0053a
        public B.e.d.a.b.AbstractC0052e.AbstractC0053a b(C c7) {
            if (c7 == null) {
                throw new NullPointerException("Null frames");
            }
            this.f2990c = c7;
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0053a
        public B.e.d.a.b.AbstractC0052e.AbstractC0053a c(int i7) {
            this.f2989b = Integer.valueOf(i7);
            return this;
        }

        @Override // J3.B.e.d.a.b.AbstractC0052e.AbstractC0053a
        public B.e.d.a.b.AbstractC0052e.AbstractC0053a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f2988a = str;
            return this;
        }
    }

    public r(String str, int i7, C c7) {
        this.f2985a = str;
        this.f2986b = i7;
        this.f2987c = c7;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e
    public C b() {
        return this.f2987c;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e
    public int c() {
        return this.f2986b;
    }

    @Override // J3.B.e.d.a.b.AbstractC0052e
    public String d() {
        return this.f2985a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a.b.AbstractC0052e)) {
            return false;
        }
        B.e.d.a.b.AbstractC0052e abstractC0052e = (B.e.d.a.b.AbstractC0052e) obj;
        return this.f2985a.equals(abstractC0052e.d()) && this.f2986b == abstractC0052e.c() && this.f2987c.equals(abstractC0052e.b());
    }

    public int hashCode() {
        return ((((this.f2985a.hashCode() ^ 1000003) * 1000003) ^ this.f2986b) * 1000003) ^ this.f2987c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f2985a + ", importance=" + this.f2986b + ", frames=" + this.f2987c + "}";
    }
}
