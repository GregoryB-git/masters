package l3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c8.w;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e7.q5;
import io.meduza.meduza.R;
import java.util.Collections;
import k7.n;
import t8.e;

/* loaded from: classes.dex */
public final class l implements m3.b, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public Object f9559a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9560b;

    public l(int i10) {
        if (i10 != 6) {
            return;
        }
        this.f9559a = new t8.e(Collections.emptyList(), i9.c.f7650c);
        this.f9560b = new t8.e(Collections.emptyList(), i9.c.f7651d);
    }

    public /* synthetic */ l(Context context) {
        m6.j.i(context);
        Resources resources = context.getResources();
        this.f9559a = resources;
        this.f9560b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ l(TaskCompletionSource taskCompletionSource, Context context) {
        this.f9559a = taskCompletionSource;
        this.f9560b = context;
    }

    public /* synthetic */ l(q5 q5Var) {
        this.f9560b = q5Var;
    }

    public /* synthetic */ l(j7.h hVar) {
        this.f9560b = new Handler(Looper.getMainLooper());
        this.f9559a = hVar;
    }

    public /* synthetic */ l(m3.c cVar, j jVar) {
        this.f9559a = cVar;
        this.f9560b = jVar;
    }

    public final boolean a(j9.i iVar) {
        e.a h10 = ((t8.e) this.f9559a).h(new i9.c(0, iVar));
        if (h10.hasNext()) {
            return ((i9.c) h10.next()).f7652a.equals(iVar);
        }
        return false;
    }

    public final String b(String str) {
        int identifier = ((Resources) this.f9559a).getIdentifier(str, "string", (String) this.f9560b);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f9559a).getString(identifier);
    }

    public final t8.e c(int i10) {
        e.a h10 = ((t8.e) this.f9560b).h(new i9.c(i10, j9.i.g()));
        t8.e<j9.i> eVar = j9.i.f8683c;
        while (h10.hasNext()) {
            i9.c cVar = (i9.c) h10.next();
            if (cVar.f7653b != i10) {
                break;
            }
            eVar = eVar.a(cVar.f7652a);
        }
        return eVar;
    }

    public final t8.e d(int i10) {
        e.a h10 = ((t8.e) this.f9560b).h(new i9.c(i10, j9.i.g()));
        t8.e<j9.i> eVar = j9.i.f8683c;
        while (h10.hasNext()) {
            i9.c cVar = (i9.c) h10.next();
            if (cVar.f7653b != i10) {
                break;
            }
            eVar = eVar.a(cVar.f7652a);
            this.f9559a = ((t8.e) this.f9559a).i(cVar);
            this.f9560b = ((t8.e) this.f9560b).i(cVar);
        }
        return eVar;
    }

    public final Task e() {
        j7.h hVar = (j7.h) this.f9559a;
        String str = hVar.f8540b;
        k7.d dVar = j7.h.f8538c;
        dVar.a("requestInAppReview (%s)", str);
        if (hVar.f8539a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k7.d.c(dVar.f9105a, "Play Store app is either not installed or not the official version", objArr));
            }
            return Tasks.forException(new j7.a());
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n nVar = hVar.f8539a;
        j7.f fVar = new j7.f(hVar, taskCompletionSource, taskCompletionSource);
        nVar.getClass();
        nVar.a().post(new k7.h(nVar, taskCompletionSource, taskCompletionSource, fVar));
        return taskCompletionSource.getTask();
    }

    @Override // qb.a
    public final Object get() {
        return new k((Context) ((qb.a) this.f9559a).get(), (i) ((qb.a) this.f9560b).get());
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        ((TaskCompletionSource) this.f9559a).setResult((b8.g) obj);
        w.c((Context) this.f9560b);
    }
}
