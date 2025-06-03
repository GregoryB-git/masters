package j8;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j8.n;

/* loaded from: classes.dex */
public final class o implements SuccessContinuation<r8.c, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n.b f8618a;

    public o(n.b bVar) {
        this.f8618a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(r8.c cVar) {
        if (cVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
        } else {
            n.a(n.this);
            n nVar = n.this;
            nVar.f8604m.g(nVar.f8597e.f9140a, null);
            n.this.f8609r.trySetResult(null);
        }
        return Tasks.forResult(null);
    }
}
