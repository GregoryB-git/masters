package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ec.i;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "context");
        i.e(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final d.a j() {
        return new d.a.c(this.f1458b.f1436b);
    }
}
