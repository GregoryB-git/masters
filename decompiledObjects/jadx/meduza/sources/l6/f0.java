package l6;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import k6.a;

/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6.b f9677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f9678b;

    public f0(g0 g0Var, j6.b bVar) {
        this.f9678b = g0Var;
        this.f9677a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j6.b bVar;
        IAccountAccessor iAccountAccessor;
        g0 g0Var = this.f9678b;
        d0 d0Var = (d0) g0Var.f.f9652r.get(g0Var.f9681b);
        if (d0Var == null) {
            return;
        }
        if (this.f9677a.D()) {
            g0 g0Var2 = this.f9678b;
            g0Var2.f9684e = true;
            if (g0Var2.f9680a.requiresSignIn()) {
                g0 g0Var3 = this.f9678b;
                if (!g0Var3.f9684e || (iAccountAccessor = g0Var3.f9682c) == null) {
                    return;
                }
                g0Var3.f9680a.getRemoteService(iAccountAccessor, g0Var3.f9683d);
                return;
            }
            try {
                a.f fVar = this.f9678b.f9680a;
                fVar.getRemoteService(null, fVar.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                this.f9678b.f9680a.disconnect("Failed to get service from broker.");
                bVar = new j6.b(10);
            }
        } else {
            bVar = this.f9677a;
        }
        d0Var.o(bVar, null);
    }
}
