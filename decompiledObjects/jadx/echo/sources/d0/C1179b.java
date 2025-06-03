package d0;

import android.media.AudioAttributes;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179b {

    /* renamed from: g, reason: collision with root package name */
    public static final C1179b f12594g = new e().a();

    /* renamed from: h, reason: collision with root package name */
    public static final String f12595h = g0.M.w0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f12596i = g0.M.w0(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f12597j = g0.M.w0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12598k = g0.M.w0(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12599l = g0.M.w0(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f12600a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12602c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12603d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12604e;

    /* renamed from: f, reason: collision with root package name */
    public d f12605f;

    /* renamed from: d0.b$b, reason: collision with other inner class name */
    public static final class C0187b {
        public static void a(AudioAttributes.Builder builder, int i7) {
            builder.setAllowedCapturePolicy(i7);
        }
    }

    /* renamed from: d0.b$c */
    public static final class c {
        public static void a(AudioAttributes.Builder builder, int i7) {
            builder.setSpatializationBehavior(i7);
        }
    }

    /* renamed from: d0.b$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f12606a;

        public d(C1179b c1179b) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1179b.f12600a).setFlags(c1179b.f12601b).setUsage(c1179b.f12602c);
            int i7 = g0.M.f14261a;
            if (i7 >= 29) {
                C0187b.a(usage, c1179b.f12603d);
            }
            if (i7 >= 32) {
                c.a(usage, c1179b.f12604e);
            }
            this.f12606a = usage.build();
        }
    }

    /* renamed from: d0.b$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f12607a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f12608b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f12609c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f12610d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f12611e = 0;

        public C1179b a() {
            return new C1179b(this.f12607a, this.f12608b, this.f12609c, this.f12610d, this.f12611e);
        }

        public e b(int i7) {
            this.f12607a = i7;
            return this;
        }

        public e c(int i7) {
            this.f12608b = i7;
            return this;
        }

        public e d(int i7) {
            this.f12609c = i7;
            return this;
        }
    }

    public C1179b(int i7, int i8, int i9, int i10, int i11) {
        this.f12600a = i7;
        this.f12601b = i8;
        this.f12602c = i9;
        this.f12603d = i10;
        this.f12604e = i11;
    }

    public d a() {
        if (this.f12605f == null) {
            this.f12605f = new d();
        }
        return this.f12605f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1179b.class != obj.getClass()) {
            return false;
        }
        C1179b c1179b = (C1179b) obj;
        return this.f12600a == c1179b.f12600a && this.f12601b == c1179b.f12601b && this.f12602c == c1179b.f12602c && this.f12603d == c1179b.f12603d && this.f12604e == c1179b.f12604e;
    }

    public int hashCode() {
        return ((((((((527 + this.f12600a) * 31) + this.f12601b) * 31) + this.f12602c) * 31) + this.f12603d) * 31) + this.f12604e;
    }
}
