package u9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f15123a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<h> f15124b;

    public f(k kVar, TaskCompletionSource<h> taskCompletionSource) {
        this.f15123a = kVar;
        this.f15124b = taskCompletionSource;
    }

    @Override // u9.j
    public final boolean a(Exception exc) {
        this.f15124b.trySetException(exc);
        return true;
    }

    @Override // u9.j
    public final boolean b(w9.a aVar) {
        if (!(aVar.f() == 4) || this.f15123a.b(aVar)) {
            return false;
        }
        TaskCompletionSource<h> taskCompletionSource = this.f15124b;
        String str = aVar.f16453d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        Long valueOf = Long.valueOf(aVar.f);
        Long valueOf2 = Long.valueOf(aVar.f16455g);
        String str2 = valueOf == null ? " tokenExpirationTimestamp" : "";
        if (valueOf2 == null) {
            str2 = defpackage.g.d(str2, " tokenCreationTimestamp");
        }
        if (!str2.isEmpty()) {
            throw new IllegalStateException(defpackage.g.d("Missing required properties:", str2));
        }
        taskCompletionSource.setResult(new a(str, valueOf.longValue(), valueOf2.longValue()));
        return true;
    }
}
