package J3;

import J3.B;

/* loaded from: classes.dex */
public final class m extends B.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    public final B.e.d.a.b f2941a;

    /* renamed from: b, reason: collision with root package name */
    public final C f2942b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2943c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f2944d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2945e;

    public static final class b extends B.e.d.a.AbstractC0045a {

        /* renamed from: a, reason: collision with root package name */
        public B.e.d.a.b f2946a;

        /* renamed from: b, reason: collision with root package name */
        public C f2947b;

        /* renamed from: c, reason: collision with root package name */
        public C f2948c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f2949d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f2950e;

        public b() {
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a a() {
            String str = "";
            if (this.f2946a == null) {
                str = " execution";
            }
            if (this.f2950e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f2946a, this.f2947b, this.f2948c, this.f2949d, this.f2950e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a.AbstractC0045a b(Boolean bool) {
            this.f2949d = bool;
            return this;
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a.AbstractC0045a c(C c7) {
            this.f2947b = c7;
            return this;
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a.AbstractC0045a d(B.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f2946a = bVar;
            return this;
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a.AbstractC0045a e(C c7) {
            this.f2948c = c7;
            return this;
        }

        @Override // J3.B.e.d.a.AbstractC0045a
        public B.e.d.a.AbstractC0045a f(int i7) {
            this.f2950e = Integer.valueOf(i7);
            return this;
        }

        public b(B.e.d.a aVar) {
            this.f2946a = aVar.d();
            this.f2947b = aVar.c();
            this.f2948c = aVar.e();
            this.f2949d = aVar.b();
            this.f2950e = Integer.valueOf(aVar.f());
        }
    }

    public m(B.e.d.a.b bVar, C c7, C c8, Boolean bool, int i7) {
        this.f2941a = bVar;
        this.f2942b = c7;
        this.f2943c = c8;
        this.f2944d = bool;
        this.f2945e = i7;
    }

    @Override // J3.B.e.d.a
    public Boolean b() {
        return this.f2944d;
    }

    @Override // J3.B.e.d.a
    public C c() {
        return this.f2942b;
    }

    @Override // J3.B.e.d.a
    public B.e.d.a.b d() {
        return this.f2941a;
    }

    @Override // J3.B.e.d.a
    public C e() {
        return this.f2943c;
    }

    public boolean equals(Object obj) {
        C c7;
        C c8;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B.e.d.a)) {
            return false;
        }
        B.e.d.a aVar = (B.e.d.a) obj;
        return this.f2941a.equals(aVar.d()) && ((c7 = this.f2942b) != null ? c7.equals(aVar.c()) : aVar.c() == null) && ((c8 = this.f2943c) != null ? c8.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f2944d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f2945e == aVar.f();
    }

    @Override // J3.B.e.d.a
    public int f() {
        return this.f2945e;
    }

    @Override // J3.B.e.d.a
    public B.e.d.a.AbstractC0045a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.f2941a.hashCode() ^ 1000003) * 1000003;
        C c7 = this.f2942b;
        int hashCode2 = (hashCode ^ (c7 == null ? 0 : c7.hashCode())) * 1000003;
        C c8 = this.f2943c;
        int hashCode3 = (hashCode2 ^ (c8 == null ? 0 : c8.hashCode())) * 1000003;
        Boolean bool = this.f2944d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f2945e;
    }

    public String toString() {
        return "Application{execution=" + this.f2941a + ", customAttributes=" + this.f2942b + ", internalKeys=" + this.f2943c + ", background=" + this.f2944d + ", uiOrientation=" + this.f2945e + "}";
    }
}
