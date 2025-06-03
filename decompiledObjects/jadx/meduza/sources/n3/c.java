package n3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f11213a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11214b;

    public enum a implements b9.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f11222a;

        a(int i10) {
            this.f11222a = i10;
        }

        @Override // b9.c
        public final int a() {
            return this.f11222a;
        }
    }

    public c(long j10, a aVar) {
        this.f11213a = j10;
        this.f11214b = aVar;
    }
}
