package p6;

/* loaded from: classes.dex */
public final class Y extends AbstractC1854j {

    /* renamed from: o, reason: collision with root package name */
    public final X f18517o;

    public Y(X x7) {
        this.f18517o = x7;
    }

    @Override // p6.AbstractC1856k
    public void a(Throwable th) {
        this.f18517o.b();
    }

    @Override // g6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return V5.t.f6803a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f18517o + ']';
    }
}
