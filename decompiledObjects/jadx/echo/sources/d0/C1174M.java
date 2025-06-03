package d0;

/* renamed from: d0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1174M extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final long f12554o;

    public C1174M(Throwable th, long j7) {
        super(th);
        this.f12554o = j7;
    }

    public static C1174M a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static C1174M b(Exception exc, long j7) {
        return exc instanceof C1174M ? (C1174M) exc : new C1174M(exc, j7);
    }
}
