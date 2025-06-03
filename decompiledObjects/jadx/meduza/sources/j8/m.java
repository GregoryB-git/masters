package j8;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j8.n;

/* loaded from: classes.dex */
public final class m implements SuccessContinuation<r8.c, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n.a f8592b;

    public m(n.a aVar, String str) {
        this.f8592b = aVar;
        this.f8591a = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Void> then(r8.c cVar) {
        if (cVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = n.a(n.this);
        n.a aVar = this.f8592b;
        n nVar = n.this;
        taskArr[1] = nVar.f8604m.g(nVar.f8597e.f9140a, aVar.f8615e ? this.f8591a : null);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
