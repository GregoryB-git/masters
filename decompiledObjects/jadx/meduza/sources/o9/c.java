package o9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.googlesignin.Messages;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Continuation, BackgroundTaskRunner.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12089d;

    public /* synthetic */ c(GoogleSignInPlugin.Delegate delegate, Messages.Result result, Boolean bool, String str) {
        this.f12087b = delegate;
        this.f12088c = result;
        this.f12089d = bool;
        this.f12086a = str;
    }

    public /* synthetic */ c(e eVar, String str, Object obj, m mVar) {
        this.f12087b = eVar;
        this.f12086a = str;
        this.f12088c = obj;
        this.f12089d = mVar;
    }

    @Override // io.flutter.plugins.googlesignin.BackgroundTaskRunner.Callback
    public final void run(Future future) {
        ((GoogleSignInPlugin.Delegate) this.f12087b).lambda$getAccessToken$5((Messages.Result) this.f12088c, (Boolean) this.f12089d, this.f12086a, future);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        e eVar = (e) this.f12087b;
        String str = this.f12086a;
        Object obj = this.f12088c;
        m mVar = (m) this.f12089d;
        ec.i.e(eVar, "this$0");
        ec.i.e(str, "$name");
        ec.i.e(mVar, "$options");
        ec.i.e(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            ec.i.b(exception);
            return Tasks.forException(exception);
        }
        n nVar = (n) task.getResult();
        v5.n nVar2 = eVar.f12099i;
        if (nVar2 != null) {
            StringBuilder l10 = defpackage.f.l("http://");
            l10.append((String) nVar2.f15927b);
            l10.append(':');
            eVar.f12098h = a0.j.m(l10, nVar2.f15926a, "/%2$s/%1$s/%3$s");
        }
        String format = String.format(eVar.f12098h, Arrays.copyOf(new Object[]{eVar.f, eVar.f12096e, str}, 3));
        ec.i.d(format, "format(format, *args)");
        if (eVar.f12097g != null && nVar2 == null) {
            format = eVar.f12097g + '/' + str;
        }
        try {
            return eVar.a(new URL(format), obj, nVar, mVar);
        } catch (MalformedURLException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
