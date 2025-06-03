package y2;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17379b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f17378a = i10;
        this.f17379b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17378a) {
            case 0:
                g.s sVar = (g.s) this.f17379b;
                ec.i.e(sVar, "this$0");
                return Integer.valueOf(j.a((WorkDatabase) sVar.f5643b, "next_alarm_manager_id"));
            case 1:
                j8.n nVar = ((j8.s) this.f17379b).f8631h;
                nVar.getClass();
                k8.i.a();
                r4.c cVar = nVar.f8595c;
                p8.e eVar = (p8.e) cVar.f13613c;
                String str = (String) cVar.f13612b;
                eVar.getClass();
                boolean exists = new File(eVar.f13042c, str).exists();
                boolean z10 = false;
                boolean z11 = true;
                if (exists) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    r4.c cVar2 = nVar.f8595c;
                    p8.e eVar2 = (p8.e) cVar2.f13613c;
                    String str2 = (String) cVar2.f13612b;
                    eVar2.getClass();
                    new File(eVar2.f13042c, str2).delete();
                } else {
                    String e10 = nVar.e();
                    if (e10 != null && nVar.f8601j.d(e10)) {
                        z10 = true;
                    }
                    z11 = z10;
                }
                return Boolean.valueOf(z11);
            case 2:
                ((Runnable) this.f17379b).run();
                return null;
            default:
                q9.c cVar3 = (q9.c) this.f17379b;
                synchronized (cVar3) {
                    cVar3.f13370a.get().h(cVar3.f13372c.get().a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
