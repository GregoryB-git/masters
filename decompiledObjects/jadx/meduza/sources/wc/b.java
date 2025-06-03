package wc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import nc.k;
import nc.l;
import rb.f;

/* loaded from: classes.dex */
public final class b<TResult> implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k<Object> f16488a;

    public b(l lVar) {
        this.f16488a = lVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Object> task) {
        Exception exception = task.getException();
        if (exception != null) {
            this.f16488a.resumeWith(f.a(exception));
        } else if (task.isCanceled()) {
            this.f16488a.cancel(null);
        } else {
            this.f16488a.resumeWith(task.getResult());
        }
    }
}
