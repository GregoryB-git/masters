package gb;

import gb.r1;

/* loaded from: classes.dex */
public final class c2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.m f6208a;

    public c2(r1.m mVar) {
        this.f6208a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r1.m mVar = this.f6208a;
        if (r1.this.C == null) {
            if (mVar.f6765b.get() == r1.f6708k0) {
                this.f6208a.f6765b.set(null);
            }
            r1.this.G.a(r1.f6705h0);
        }
    }
}
