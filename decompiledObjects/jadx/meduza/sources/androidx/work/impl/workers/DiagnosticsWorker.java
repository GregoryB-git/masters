package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import b3.b;
import ec.i;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p2.k0;
import x2.j;
import x2.n;
import x2.t;
import x2.x;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, Constants.PARAMETERS);
    }

    @Override // androidx.work.Worker
    public final d.a j() {
        k0 d10 = k0.d(this.f1457a);
        i.d(d10, "getInstance(applicationContext)");
        WorkDatabase workDatabase = d10.f12879c;
        i.d(workDatabase, "workManager.workDatabase");
        t u10 = workDatabase.u();
        n s10 = workDatabase.s();
        x v10 = workDatabase.v();
        j r10 = workDatabase.r();
        d10.f12878b.f1444c.getClass();
        ArrayList h10 = u10.h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList n2 = u10.n();
        ArrayList c10 = u10.c();
        if (!h10.isEmpty()) {
            o2.j d11 = o2.j.d();
            String str = b.f1822a;
            d11.e(str, "Recently completed work:\n\n");
            o2.j.d().e(str, b.a(s10, v10, r10, h10));
        }
        if (!n2.isEmpty()) {
            o2.j d12 = o2.j.d();
            String str2 = b.f1822a;
            d12.e(str2, "Running work:\n\n");
            o2.j.d().e(str2, b.a(s10, v10, r10, n2));
        }
        if (!c10.isEmpty()) {
            o2.j d13 = o2.j.d();
            String str3 = b.f1822a;
            d13.e(str3, "Enqueued work:\n\n");
            o2.j.d().e(str3, b.a(s10, v10, r10, c10));
        }
        return new d.a.c();
    }
}
