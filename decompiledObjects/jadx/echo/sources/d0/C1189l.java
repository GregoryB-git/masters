package d0;

import g0.AbstractC1297a;

/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189l {

    /* renamed from: e, reason: collision with root package name */
    public static final C1189l f12642e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    public static final String f12643f = g0.M.w0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f12644g = g0.M.w0(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f12645h = g0.M.w0(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f12646i = g0.M.w0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f12647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12649c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12650d;

    /* renamed from: d0.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f12651a;

        /* renamed from: b, reason: collision with root package name */
        public int f12652b;

        /* renamed from: c, reason: collision with root package name */
        public int f12653c;

        /* renamed from: d, reason: collision with root package name */
        public String f12654d;

        public b(int i7) {
            this.f12651a = i7;
        }

        public C1189l e() {
            AbstractC1297a.a(this.f12652b <= this.f12653c);
            return new C1189l(this);
        }

        public b f(int i7) {
            this.f12653c = i7;
            return this;
        }

        public b g(int i7) {
            this.f12652b = i7;
            return this;
        }
    }

    public C1189l(b bVar) {
        this.f12647a = bVar.f12651a;
        this.f12648b = bVar.f12652b;
        this.f12649c = bVar.f12653c;
        this.f12650d = bVar.f12654d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189l)) {
            return false;
        }
        C1189l c1189l = (C1189l) obj;
        return this.f12647a == c1189l.f12647a && this.f12648b == c1189l.f12648b && this.f12649c == c1189l.f12649c && g0.M.c(this.f12650d, c1189l.f12650d);
    }

    public int hashCode() {
        int i7 = (((((527 + this.f12647a) * 31) + this.f12648b) * 31) + this.f12649c) * 31;
        String str = this.f12650d;
        return i7 + (str == null ? 0 : str.hashCode());
    }
}
