package o9;

import aa.m0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r3.r;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final t9.b<c8.b> f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.b<s9.a> f12082b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12083c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12084d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<a8.a> f12085e;

    public b(t9.b<c8.b> bVar, t9.b<s9.a> bVar2, t9.a<a8.a> aVar, @y7.c Executor executor) {
        ec.i.e(bVar, "tokenProvider");
        ec.i.e(bVar2, "instanceId");
        ec.i.e(aVar, "appCheckDeferred");
        ec.i.e(executor, "executor");
        this.f12081a = bVar;
        this.f12082b = bVar2;
        this.f12083c = executor;
        this.f12084d = "FirebaseContextProvider";
        this.f12085e = new AtomicReference<>();
        aVar.a(new m0(this, 12));
    }

    @Override // o9.a
    public final Task<n> a(boolean z10) {
        Task continueWith;
        String str;
        Task onSuccessTask;
        c8.b bVar = this.f12081a.get();
        String str2 = "forResult(null)";
        if (bVar == null) {
            continueWith = Tasks.forResult(null);
            str = "forResult(null)";
        } else {
            continueWith = bVar.d(false).continueWith(this.f12083c, new e0.d(28));
            str = "auth.getAccessToken(fals…  }\n      authToken\n    }";
        }
        ec.i.d(continueWith, str);
        a8.a aVar = this.f12085e.get();
        if (aVar == null) {
            onSuccessTask = Tasks.forResult(null);
        } else {
            Task<z7.a> b10 = z10 ? aVar.b() : aVar.a();
            ec.i.d(b10, "if (getLimitedUseAppChec… appCheck.getToken(false)");
            onSuccessTask = b10.onSuccessTask(this.f12083c, new defpackage.d(this, 12));
            str2 = "tokenTask.onSuccessTask(…esult(result.token)\n    }";
        }
        ec.i.d(onSuccessTask, str2);
        return Tasks.whenAll((Task<?>[]) new Task[]{continueWith, onSuccessTask}).onSuccessTask(this.f12083c, new r(continueWith, this, onSuccessTask, 2));
    }
}
