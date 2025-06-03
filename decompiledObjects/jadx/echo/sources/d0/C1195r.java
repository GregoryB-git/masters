package d0;

import g0.AbstractC1297a;

/* renamed from: d0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1195r {

    /* renamed from: a, reason: collision with root package name */
    public final C1185h f12775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12777c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12778d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12779e;

    /* renamed from: d0.r$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public C1185h f12780a;

        /* renamed from: b, reason: collision with root package name */
        public int f12781b;

        /* renamed from: c, reason: collision with root package name */
        public int f12782c;

        /* renamed from: d, reason: collision with root package name */
        public float f12783d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public long f12784e;

        public b(C1185h c1185h, int i7, int i8) {
            this.f12780a = c1185h;
            this.f12781b = i7;
            this.f12782c = i8;
        }

        public C1195r a() {
            return new C1195r(this.f12780a, this.f12781b, this.f12782c, this.f12783d, this.f12784e);
        }

        public b b(float f7) {
            this.f12783d = f7;
            return this;
        }
    }

    public C1195r(C1185h c1185h, int i7, int i8, float f7, long j7) {
        AbstractC1297a.b(i7 > 0, "width must be positive, but is: " + i7);
        AbstractC1297a.b(i8 > 0, "height must be positive, but is: " + i8);
        this.f12775a = c1185h;
        this.f12776b = i7;
        this.f12777c = i8;
        this.f12778d = f7;
        this.f12779e = j7;
    }
}
