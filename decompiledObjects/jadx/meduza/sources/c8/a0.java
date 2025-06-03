package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f2405a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<String> f2406b;

    public a0(w wVar, Activity activity, TaskCompletionSource<String> taskCompletionSource) {
        this.f2405a = new WeakReference<>(activity);
        this.f2406b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2405a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f2406b.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            w.c(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f2406b.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                w.c(context);
                return;
            }
            this.f2406b.setException(zzadr.zza(p.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            return;
        }
        HashMap hashMap = v0.f2529a;
        if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
            m6.j.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            this.f2406b.setException(zzadr.zza((Status) n6.d.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR)));
            w.c(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f2406b.setException(zzadr.zza(p.a("WEB_CONTEXT_CANCELED")));
            w.c(context);
        }
    }
}
