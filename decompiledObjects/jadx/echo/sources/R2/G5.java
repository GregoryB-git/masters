package R2;

/* loaded from: classes.dex */
public final class G5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P5 f4691o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D5 f4692p;

    public G5(D5 d52, P5 p52) {
        this.f4692p = d52;
        this.f4691o = p52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D5.t(this.f4692p, this.f4691o);
        this.f4692p.s0();
    }
}
