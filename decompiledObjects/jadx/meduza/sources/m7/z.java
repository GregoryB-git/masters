package m7;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class z extends w {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10373o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w f10374p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f10375q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, w wVar) {
        super(taskCompletionSource);
        this.f10375q = eVar;
        this.f10373o = taskCompletionSource2;
        this.f10374p = wVar;
    }

    @Override // m7.w
    public final void b() {
        synchronized (this.f10375q.f) {
            final e eVar = this.f10375q;
            final TaskCompletionSource taskCompletionSource = this.f10373o;
            eVar.f10351e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: m7.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    e eVar2 = e.this;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    synchronized (eVar2.f) {
                        eVar2.f10351e.remove(taskCompletionSource2);
                    }
                }
            });
            if (this.f10375q.f10357l.getAndIncrement() > 0) {
                this.f10375q.f10348b.b("Already connected to the service.", new Object[0]);
            }
            e.b(this.f10375q, this.f10374p);
        }
    }
}
