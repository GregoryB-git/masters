package r3;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i9.m1;
import i9.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.t;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements t.a, Continuation, n9.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13572c;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.f13570a = obj;
        this.f13571b = obj2;
        this.f13572c = obj3;
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        t tVar = (t) this.f13570a;
        String str = (String) this.f13571b;
        String str2 = (String) this.f13572c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        tVar.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        t.k0(sQLiteDatabase.rawQuery(str2, null), new p(tVar, 1));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // n9.l
    public final Object get() {
        i9.n nVar = (i9.n) this.f13570a;
        t8.c cVar = (t8.c) this.f13571b;
        m1 m1Var = (m1) this.f13572c;
        int i10 = i9.n.f7742o;
        nVar.getClass();
        t8.e<j9.i> eVar = j9.i.f8683c;
        HashMap hashMap = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j9.i iVar = (j9.i) entry.getKey();
            j9.m mVar = (j9.m) entry.getValue();
            if (mVar.b()) {
                eVar = eVar.a(iVar);
            }
            hashMap.put(iVar, mVar);
        }
        nVar.f7750i.i(m1Var.f7735b);
        nVar.f7750i.b(eVar, m1Var.f7735b);
        n.b d10 = nVar.d(hashMap);
        return nVar.f.e(d10.f7757a, d10.f7758b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13570a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f13571b;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f13572c;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }
}
