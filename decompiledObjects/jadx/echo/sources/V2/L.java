package V2;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class L implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ K f6439o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Callable f6440p;

    public L(K k7, Callable callable) {
        this.f6439o = k7;
        this.f6440p = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6439o.r(this.f6440p.call());
        } catch (Exception e7) {
            this.f6439o.q(e7);
        } catch (Throwable th) {
            this.f6439o.q(new RuntimeException(th));
        }
    }
}
