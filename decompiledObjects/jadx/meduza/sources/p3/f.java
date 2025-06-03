package p3;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import ec.i;
import g9.q;
import java.net.URL;
import java.util.concurrent.Executor;
import o9.l;
import o9.m;

/* loaded from: classes.dex */
public final class f implements m3.b, p9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12991a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12992b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12993c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12994d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12995e;

    public f(o9.e eVar, String str, m mVar) {
        this.f12991a = 2;
        this.f12992b = eVar;
        this.f12993c = str;
        this.f12994d = null;
        this.f12995e = mVar;
    }

    public final Task a(Object obj) {
        Object obj2 = this.f12993c;
        if (((String) obj2) != null) {
            o9.e eVar = (o9.e) this.f12992b;
            String str = (String) obj2;
            m mVar = (m) this.f12995e;
            eVar.getClass();
            i.e(str, "name");
            i.e(mVar, "options");
            Task continueWithTask = o9.e.f12090j.getTask().continueWithTask(eVar.f12092a, new k1.a(11, eVar, mVar)).continueWithTask(eVar.f12092a, new o9.c(eVar, str, obj, mVar));
            i.d(continueWithTask, "providerInstalled.task\n …context, options)\n      }");
            return continueWithTask;
        }
        o9.e eVar2 = (o9.e) this.f12992b;
        URL url = (URL) this.f12994d;
        i.b(url);
        m mVar2 = (m) this.f12995e;
        eVar2.getClass();
        i.e(mVar2, "options");
        Task continueWithTask2 = o9.e.f12090j.getTask().continueWithTask(eVar2.f12092a, new l(7, eVar2, mVar2)).continueWithTask(eVar2.f12092a, new q(eVar2, url, obj, mVar2));
        i.d(continueWithTask2, "providerInstalled.task\n …context, options)\n      }");
        return continueWithTask2;
    }

    @Override // qb.a
    public final Object get() {
        switch (this.f12991a) {
            case 0:
                Context context = (Context) ((qb.a) this.f12992b).get();
                r3.d dVar = (r3.d) ((qb.a) this.f12993c).get();
                q3.e eVar = (q3.e) ((qb.a) this.f12994d).get();
                return new q3.d(context, dVar, eVar);
            default:
                return new o9.b((t9.b) ((qb.a) this.f12992b).get(), (t9.b) ((qb.a) this.f12993c).get(), (t9.a) ((qb.a) this.f12994d).get(), (Executor) ((qb.a) this.f12995e).get());
        }
    }

    public f(o9.e eVar, URL url, m mVar) {
        this.f12991a = 2;
        this.f12992b = eVar;
        this.f12993c = null;
        this.f12994d = url;
        this.f12995e = mVar;
    }

    public /* synthetic */ f(qb.a aVar, qb.a aVar2, qb.a aVar3, qb.a aVar4, int i10) {
        this.f12991a = i10;
        this.f12992b = aVar;
        this.f12993c = aVar2;
        this.f12994d = aVar3;
        this.f12995e = aVar4;
    }
}
