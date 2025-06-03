package g9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements n9.j, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f6054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6056d;

    public /* synthetic */ q(Object obj, Serializable serializable, Object obj2, Object obj3) {
        this.f6053a = obj;
        this.f6054b = serializable;
        this.f6055c = obj2;
        this.f6056d = obj3;
    }

    @Override // n9.j
    public final void a(e9.e eVar) {
        u uVar = (u) this.f6053a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6054b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6055c;
        n9.a aVar = (n9.a) this.f6056d;
        uVar.getClass();
        if (!atomicBoolean.compareAndSet(false, true)) {
            aVar.a(new x0.q0(13, uVar, eVar));
        } else {
            x6.b.Z("Already fulfilled first user task", !taskCompletionSource.getTask().isComplete(), new Object[0]);
            taskCompletionSource.setResult(eVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        o9.e eVar = (o9.e) this.f6053a;
        URL url = (URL) this.f6054b;
        Object obj = this.f6055c;
        o9.m mVar = (o9.m) this.f6056d;
        TaskCompletionSource<Void> taskCompletionSource = o9.e.f12090j;
        ec.i.e(eVar, "this$0");
        ec.i.e(url, "$url");
        ec.i.e(mVar, "$options");
        ec.i.e(task, "task");
        if (task.isSuccessful()) {
            return eVar.a(url, obj, (o9.n) task.getResult(), mVar);
        }
        Exception exception = task.getException();
        ec.i.b(exception);
        return Tasks.forException(exception);
    }
}
