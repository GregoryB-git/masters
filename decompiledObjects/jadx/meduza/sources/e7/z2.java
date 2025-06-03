package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class z2 implements Callable<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzig f4796a;

    public z2(zzig zzigVar, f0 f0Var, String str) {
        this.f4796a = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final byte[] call() {
        this.f4796a.f2908a.c0();
        p4 p4Var = this.f4796a.f2908a.f4336p;
        i6.q(p4Var);
        p4Var.l();
        ((j2) p4Var.f3407b).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
