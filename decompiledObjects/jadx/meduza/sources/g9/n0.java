package g9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import d9.x0;
import n9.a;

/* loaded from: classes.dex */
public final class n0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public n9.a f6033a;

    /* renamed from: b, reason: collision with root package name */
    public m9.h0 f6034b;

    /* renamed from: c, reason: collision with root package name */
    public n9.i<m0, Task<TResult>> f6035c;

    /* renamed from: d, reason: collision with root package name */
    public int f6036d;

    /* renamed from: e, reason: collision with root package name */
    public n9.g f6037e;
    public TaskCompletionSource<TResult> f = new TaskCompletionSource<>();

    public n0(n9.a aVar, m9.h0 h0Var, x0 x0Var, n9.i<m0, Task<TResult>> iVar) {
        this.f6033a = aVar;
        this.f6034b = h0Var;
        this.f6035c = iVar;
        this.f6036d = x0Var.f3736a;
        this.f6037e = new n9.g(aVar, a.c.RETRY_TRANSACTION, 1000L, 60000L);
    }

    public final void a(Task task) {
        f.a aVar;
        if (this.f6036d > 0) {
            Exception exception = task.getException();
            boolean z10 = false;
            if ((exception instanceof com.google.firebase.firestore.f) && ((aVar = ((com.google.firebase.firestore.f) exception).f3161a) == f.a.ABORTED || aVar == f.a.ALREADY_EXISTS || aVar == f.a.FAILED_PRECONDITION || !m9.j.a(aVar))) {
                z10 = true;
            }
            if (z10) {
                this.f6036d--;
                this.f6037e.a(new b.d(this, 15));
                return;
            }
        }
        this.f.setException(task.getException());
    }
}
