package k7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f9112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j7.f fVar) {
        super(taskCompletionSource);
        this.f9110b = taskCompletionSource2;
        this.f9111c = fVar;
        this.f9112d = nVar;
    }

    @Override // k7.e
    public final void a() {
        synchronized (this.f9112d.f) {
            final n nVar = this.f9112d;
            final TaskCompletionSource taskCompletionSource = this.f9110b;
            nVar.f9123e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: k7.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    n nVar2 = n.this;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    synchronized (nVar2.f) {
                        nVar2.f9123e.remove(taskCompletionSource2);
                    }
                }
            });
            if (this.f9112d.f9128k.getAndIncrement() > 0) {
                this.f9112d.f9120b.a("Already connected to the service.", new Object[0]);
            }
            n.b(this.f9112d, this.f9111c);
        }
    }
}
