package i2;

import m4.InterfaceC1675c;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1349c f14828c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f14829a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14830b;

    /* renamed from: i2.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f14831a = 0;

        /* renamed from: b, reason: collision with root package name */
        public b f14832b = b.REASON_UNKNOWN;

        public C1349c a() {
            return new C1349c(this.f14831a, this.f14832b);
        }

        public a b(long j7) {
            this.f14831a = j7;
            return this;
        }

        public a c(b bVar) {
            this.f14832b = bVar;
            return this;
        }
    }

    /* renamed from: i2.c$b */
    public enum b implements InterfaceC1675c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: o, reason: collision with root package name */
        public final int f14841o;

        b(int i7) {
            this.f14841o = i7;
        }

        @Override // m4.InterfaceC1675c
        public int g() {
            return this.f14841o;
        }
    }

    public C1349c(long j7, b bVar) {
        this.f14829a = j7;
        this.f14830b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f14829a;
    }

    public b b() {
        return this.f14830b;
    }
}
