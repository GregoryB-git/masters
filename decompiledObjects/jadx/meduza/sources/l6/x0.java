package l6;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x0 extends a1 {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a f9740b;

    public x0(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        if (aVar == null) {
            throw new NullPointerException("Null methods are not runnable.");
        }
        this.f9740b = aVar;
    }

    @Override // l6.a1
    public final void a(Status status) {
        try {
            this.f9740b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // l6.a1
    public final void b(RuntimeException runtimeException) {
        try {
            this.f9740b.setFailedResult(new Status(10, defpackage.g.e(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // l6.a1
    public final void c(d0 d0Var) {
        try {
            this.f9740b.run(d0Var.f9658b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // l6.a1
    public final void d(u uVar, boolean z10) {
        com.google.android.gms.common.api.internal.a aVar = this.f9740b;
        uVar.f9728a.put(aVar, Boolean.valueOf(z10));
        aVar.addStatusListener(new s(uVar, aVar));
    }
}
