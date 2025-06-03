package e7;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4586a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AtomicReference f4587b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ k3 f4588c;

    public /* synthetic */ q3(k3 k3Var, AtomicReference atomicReference, int i10) {
        this.f4586a = i10;
        this.f4588c = k3Var;
        this.f4587b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4586a) {
            case 0:
                k3 k3Var = this.f4588c;
                AtomicReference atomicReference = this.f4587b;
                w4 q10 = k3Var.q();
                d6 D = d6.D(4);
                q10.l();
                q10.t();
                q10.x(new y4(q10, atomicReference, q10.I(false), D));
                return;
            default:
                synchronized (this.f4587b) {
                    try {
                        this.f4587b.set(Long.valueOf(this.f4588c.h().s(this.f4588c.m().v(), h0.X)));
                    } finally {
                        this.f4587b.notify();
                    }
                }
                return;
        }
    }
}
