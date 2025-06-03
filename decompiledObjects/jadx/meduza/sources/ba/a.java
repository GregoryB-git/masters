package ba;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2167c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2168d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2169e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2170g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2171h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2172i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2173j;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0031a f2175l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2176m;

    /* renamed from: o, reason: collision with root package name */
    public final String f2178o;

    /* renamed from: k, reason: collision with root package name */
    public final long f2174k = 0;

    /* renamed from: n, reason: collision with root package name */
    public final long f2177n = 0;

    /* renamed from: ba.a$a, reason: collision with other inner class name */
    public enum EnumC0031a implements b9.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f2181a;

        EnumC0031a(int i10) {
            this.f2181a = i10;
        }

        @Override // b9.c
        public final int a() {
            return this.f2181a;
        }
    }

    public enum b implements b9.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f2185a;

        b(int i10) {
            this.f2185a = i10;
        }

        @Override // b9.c
        public final int a() {
            return this.f2185a;
        }
    }

    public enum c implements b9.c {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f2188a;

        c(int i10) {
            this.f2188a = i10;
        }

        @Override // b9.c
        public final int a() {
            return this.f2188a;
        }
    }

    public a(long j10, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, int i11, String str5, EnumC0031a enumC0031a, String str6, String str7) {
        this.f2165a = j10;
        this.f2166b = str;
        this.f2167c = str2;
        this.f2168d = bVar;
        this.f2169e = cVar;
        this.f = str3;
        this.f2170g = str4;
        this.f2171h = i10;
        this.f2172i = i11;
        this.f2173j = str5;
        this.f2175l = enumC0031a;
        this.f2176m = str6;
        this.f2178o = str7;
    }
}
