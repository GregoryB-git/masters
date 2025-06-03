package e7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4488a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ AtomicReference f4489b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ k3 f4490c;

    public /* synthetic */ m3(k3 k3Var, AtomicReference atomicReference, int i10) {
        this.f4488a = i10;
        this.f4490c = k3Var;
        this.f4489b = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double doubleValue;
        switch (this.f4488a) {
            case 0:
                k3 k3Var = this.f4490c;
                AtomicReference atomicReference = this.f4489b;
                Bundle a10 = k3Var.j().f4464x.a();
                w4 q10 = k3Var.q();
                q10.l();
                q10.t();
                k6 I = q10.I(false);
                q10.x(q10.h().x(null, h0.f4244e1) ? new o2(q10, atomicReference, I, a10, 2) : new z4(q10, atomicReference, I, a10));
                return;
            case 1:
                synchronized (this.f4489b) {
                    try {
                        AtomicReference atomicReference2 = this.f4489b;
                        h h10 = this.f4490c.h();
                        String v10 = this.f4490c.m().v();
                        h10.getClass();
                        atomicReference2.set(h10.u(v10, h0.W));
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f4489b) {
                    try {
                        AtomicReference atomicReference3 = this.f4489b;
                        h h11 = this.f4490c.h();
                        String v11 = this.f4490c.m().v();
                        m0<Double> m0Var = h0.Z;
                        h11.getClass();
                        if (!TextUtils.isEmpty(v11)) {
                            String b10 = h11.f4229e.b(v11, m0Var.f4477a);
                            if (!TextUtils.isEmpty(b10)) {
                                try {
                                    doubleValue = m0Var.a(Double.valueOf(Double.parseDouble(b10))).doubleValue();
                                } catch (NumberFormatException unused) {
                                }
                                atomicReference3.set(Double.valueOf(doubleValue));
                            }
                        }
                        doubleValue = m0Var.a(null).doubleValue();
                        atomicReference3.set(Double.valueOf(doubleValue));
                    } finally {
                    }
                }
                return;
        }
    }
}
