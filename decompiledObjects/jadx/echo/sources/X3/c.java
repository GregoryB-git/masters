package X3;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f7232a;

    public c(long j7) {
        this.f7232a = j7;
    }

    @Override // X3.a
    public boolean a(long j7, long j8) {
        return j7 > this.f7232a || j8 > 1000;
    }

    @Override // X3.a
    public float b() {
        return 0.2f;
    }

    @Override // X3.a
    public long c() {
        return 1000L;
    }

    @Override // X3.a
    public boolean d(long j7) {
        return j7 > 1000;
    }
}
