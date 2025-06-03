package y4;

import m4.InterfaceC1675c;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2275a {

    /* renamed from: p, reason: collision with root package name */
    public static final C2275a f21432p = new C0303a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f21433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21434b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21435c;

    /* renamed from: d, reason: collision with root package name */
    public final c f21436d;

    /* renamed from: e, reason: collision with root package name */
    public final d f21437e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21438f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21439g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21440h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21441i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21442j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21443k;

    /* renamed from: l, reason: collision with root package name */
    public final b f21444l;

    /* renamed from: m, reason: collision with root package name */
    public final String f21445m;

    /* renamed from: n, reason: collision with root package name */
    public final long f21446n;

    /* renamed from: o, reason: collision with root package name */
    public final String f21447o;

    /* renamed from: y4.a$a, reason: collision with other inner class name */
    public static final class C0303a {

        /* renamed from: a, reason: collision with root package name */
        public long f21448a = 0;

        /* renamed from: b, reason: collision with root package name */
        public String f21449b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f21450c = "";

        /* renamed from: d, reason: collision with root package name */
        public c f21451d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        public d f21452e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        public String f21453f = "";

        /* renamed from: g, reason: collision with root package name */
        public String f21454g = "";

        /* renamed from: h, reason: collision with root package name */
        public int f21455h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f21456i = 0;

        /* renamed from: j, reason: collision with root package name */
        public String f21457j = "";

        /* renamed from: k, reason: collision with root package name */
        public long f21458k = 0;

        /* renamed from: l, reason: collision with root package name */
        public b f21459l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        public String f21460m = "";

        /* renamed from: n, reason: collision with root package name */
        public long f21461n = 0;

        /* renamed from: o, reason: collision with root package name */
        public String f21462o = "";

        public C2275a a() {
            return new C2275a(this.f21448a, this.f21449b, this.f21450c, this.f21451d, this.f21452e, this.f21453f, this.f21454g, this.f21455h, this.f21456i, this.f21457j, this.f21458k, this.f21459l, this.f21460m, this.f21461n, this.f21462o);
        }

        public C0303a b(String str) {
            this.f21460m = str;
            return this;
        }

        public C0303a c(String str) {
            this.f21454g = str;
            return this;
        }

        public C0303a d(String str) {
            this.f21462o = str;
            return this;
        }

        public C0303a e(b bVar) {
            this.f21459l = bVar;
            return this;
        }

        public C0303a f(String str) {
            this.f21450c = str;
            return this;
        }

        public C0303a g(String str) {
            this.f21449b = str;
            return this;
        }

        public C0303a h(c cVar) {
            this.f21451d = cVar;
            return this;
        }

        public C0303a i(String str) {
            this.f21453f = str;
            return this;
        }

        public C0303a j(long j7) {
            this.f21448a = j7;
            return this;
        }

        public C0303a k(d dVar) {
            this.f21452e = dVar;
            return this;
        }

        public C0303a l(String str) {
            this.f21457j = str;
            return this;
        }

        public C0303a m(int i7) {
            this.f21456i = i7;
            return this;
        }
    }

    /* renamed from: y4.a$b */
    public enum b implements InterfaceC1675c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: o, reason: collision with root package name */
        public final int f21467o;

        b(int i7) {
            this.f21467o = i7;
        }

        @Override // m4.InterfaceC1675c
        public int g() {
            return this.f21467o;
        }
    }

    /* renamed from: y4.a$c */
    public enum c implements InterfaceC1675c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: o, reason: collision with root package name */
        public final int f21473o;

        c(int i7) {
            this.f21473o = i7;
        }

        @Override // m4.InterfaceC1675c
        public int g() {
            return this.f21473o;
        }
    }

    /* renamed from: y4.a$d */
    public enum d implements InterfaceC1675c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: o, reason: collision with root package name */
        public final int f21479o;

        d(int i7) {
            this.f21479o = i7;
        }

        @Override // m4.InterfaceC1675c
        public int g() {
            return this.f21479o;
        }
    }

    public C2275a(long j7, String str, String str2, c cVar, d dVar, String str3, String str4, int i7, int i8, String str5, long j8, b bVar, String str6, long j9, String str7) {
        this.f21433a = j7;
        this.f21434b = str;
        this.f21435c = str2;
        this.f21436d = cVar;
        this.f21437e = dVar;
        this.f21438f = str3;
        this.f21439g = str4;
        this.f21440h = i7;
        this.f21441i = i8;
        this.f21442j = str5;
        this.f21443k = j8;
        this.f21444l = bVar;
        this.f21445m = str6;
        this.f21446n = j9;
        this.f21447o = str7;
    }

    public static C0303a p() {
        return new C0303a();
    }

    public String a() {
        return this.f21445m;
    }

    public long b() {
        return this.f21443k;
    }

    public long c() {
        return this.f21446n;
    }

    public String d() {
        return this.f21439g;
    }

    public String e() {
        return this.f21447o;
    }

    public b f() {
        return this.f21444l;
    }

    public String g() {
        return this.f21435c;
    }

    public String h() {
        return this.f21434b;
    }

    public c i() {
        return this.f21436d;
    }

    public String j() {
        return this.f21438f;
    }

    public int k() {
        return this.f21440h;
    }

    public long l() {
        return this.f21433a;
    }

    public d m() {
        return this.f21437e;
    }

    public String n() {
        return this.f21442j;
    }

    public int o() {
        return this.f21441i;
    }
}
