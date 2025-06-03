package u9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f15125a;

    public g(TaskCompletionSource<String> taskCompletionSource) {
        this.f15125a = taskCompletionSource;
    }

    @Override // u9.j
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // u9.j
    public final boolean b(w9.a aVar) {
        if (!(aVar.f() == 3)) {
            if (!(aVar.f() == 4)) {
                if (!(aVar.f() == 5)) {
                    return false;
                }
            }
        }
        this.f15125a.trySetResult(aVar.f16451b);
        return true;
    }
}
