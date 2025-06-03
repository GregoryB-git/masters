package e7;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f4675c;

    public /* synthetic */ t3(k3 k3Var, AtomicReference atomicReference, int i10) {
        this.f4673a = i10;
        this.f4674b = atomicReference;
        this.f4675c = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4673a) {
            case 0:
                synchronized (this.f4674b) {
                    try {
                        AtomicReference atomicReference = this.f4674b;
                        h h10 = this.f4675c.h();
                        String v10 = this.f4675c.m().v();
                        h10.getClass();
                        atomicReference.set(Boolean.valueOf(h10.x(v10, h0.V)));
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f4674b) {
                    try {
                        this.f4674b.set(Integer.valueOf(this.f4675c.h().q(this.f4675c.m().v(), h0.Y)));
                    } finally {
                    }
                }
                return;
        }
    }
}
