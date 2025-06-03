package d9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import v3.d1;
import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements n9.i, l.a, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3670b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f3669a = i10;
        this.f3670b = obj;
    }

    @Override // n9.i
    public Object apply(Object obj) {
        switch (this.f3669a) {
            case 0:
                return ((g9.u) obj).e((List) this.f3670b);
            default:
                String str = (String) this.f3670b;
                g9.u uVar = (g9.u) obj;
                uVar.d();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                uVar.f6090d.a(new v3.x0(uVar, str, taskCompletionSource, 5));
                return taskCompletionSource.getTask();
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        f1.c cVar = (f1.c) obj;
        cVar.K(this.f3669a, ((d1) this.f3670b).f15316l);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task<String> forResult;
        e9.d dVar = (e9.d) this.f3670b;
        int i10 = this.f3669a;
        synchronized (dVar) {
            if (i10 != dVar.f4852e) {
                p2.m0.w("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                forResult = dVar.s();
            } else {
                forResult = task.isSuccessful() ? Tasks.forResult(((b8.s) task.getResult()).f2137a) : Tasks.forException(task.getException());
            }
        }
        return forResult;
    }
}
