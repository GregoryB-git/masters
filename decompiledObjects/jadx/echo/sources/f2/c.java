package f2;

import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;
import f2.o;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    public final p f14183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14184b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0820c f14185c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0822e f14186d;

    /* renamed from: e, reason: collision with root package name */
    public final C0819b f14187e;

    public static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        public p f14188a;

        /* renamed from: b, reason: collision with root package name */
        public String f14189b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC0820c f14190c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC0822e f14191d;

        /* renamed from: e, reason: collision with root package name */
        public C0819b f14192e;

        @Override // f2.o.a
        public o a() {
            String str = "";
            if (this.f14188a == null) {
                str = " transportContext";
            }
            if (this.f14189b == null) {
                str = str + " transportName";
            }
            if (this.f14190c == null) {
                str = str + " event";
            }
            if (this.f14191d == null) {
                str = str + " transformer";
            }
            if (this.f14192e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f14188a, this.f14189b, this.f14190c, this.f14191d, this.f14192e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f2.o.a
        public o.a b(C0819b c0819b) {
            if (c0819b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f14192e = c0819b;
            return this;
        }

        @Override // f2.o.a
        public o.a c(AbstractC0820c abstractC0820c) {
            if (abstractC0820c == null) {
                throw new NullPointerException("Null event");
            }
            this.f14190c = abstractC0820c;
            return this;
        }

        @Override // f2.o.a
        public o.a d(InterfaceC0822e interfaceC0822e) {
            if (interfaceC0822e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f14191d = interfaceC0822e;
            return this;
        }

        @Override // f2.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f14188a = pVar;
            return this;
        }

        @Override // f2.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f14189b = str;
            return this;
        }
    }

    public c(p pVar, String str, AbstractC0820c abstractC0820c, InterfaceC0822e interfaceC0822e, C0819b c0819b) {
        this.f14183a = pVar;
        this.f14184b = str;
        this.f14185c = abstractC0820c;
        this.f14186d = interfaceC0822e;
        this.f14187e = c0819b;
    }

    @Override // f2.o
    public C0819b b() {
        return this.f14187e;
    }

    @Override // f2.o
    public AbstractC0820c c() {
        return this.f14185c;
    }

    @Override // f2.o
    public InterfaceC0822e e() {
        return this.f14186d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f14183a.equals(oVar.f()) && this.f14184b.equals(oVar.g()) && this.f14185c.equals(oVar.c()) && this.f14186d.equals(oVar.e()) && this.f14187e.equals(oVar.b());
    }

    @Override // f2.o
    public p f() {
        return this.f14183a;
    }

    @Override // f2.o
    public String g() {
        return this.f14184b;
    }

    public int hashCode() {
        return ((((((((this.f14183a.hashCode() ^ 1000003) * 1000003) ^ this.f14184b.hashCode()) * 1000003) ^ this.f14185c.hashCode()) * 1000003) ^ this.f14186d.hashCode()) * 1000003) ^ this.f14187e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f14183a + ", transportName=" + this.f14184b + ", event=" + this.f14185c + ", transformer=" + this.f14186d + ", encoding=" + this.f14187e + "}";
    }
}
