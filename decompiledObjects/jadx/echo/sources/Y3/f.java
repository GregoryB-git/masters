package Y3;

/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f7548a;

    /* renamed from: b, reason: collision with root package name */
    public long f7549b;

    public f(a aVar, long j7) {
        this.f7548a = aVar;
        this.f7549b = j7;
    }

    @Override // Y3.a
    public long a() {
        return this.f7548a.a() + this.f7549b;
    }

    public void b(long j7) {
        this.f7549b = j7;
    }
}
