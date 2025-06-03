package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f2544a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<b8.g> f2545b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f2546c;

    /* renamed from: d, reason: collision with root package name */
    public final b8.r f2547d;

    public z(w wVar, Activity activity, TaskCompletionSource<b8.g> taskCompletionSource, FirebaseAuth firebaseAuth, b8.r rVar) {
        this.f2544a = new WeakReference<>(activity);
        this.f2545b = taskCompletionSource;
        this.f2546c = firebaseAuth;
        this.f2547d = rVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f2544a.get() == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f2545b.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            w.c(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap hashMap = v0.f2529a;
            if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                m6.j.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                this.f2545b.setException(zzadr.zza((Status) n6.d.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR)));
                w.c(context);
                return;
            }
            if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                this.f2545b.setException(zzadr.zza(p.a("WEB_CONTEXT_CANCELED")));
                w.c(context);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            TaskCompletionSource<b8.g> taskCompletionSource = this.f2545b;
            this.f2546c.g(w.a(intent)).addOnSuccessListener(new l3.l(taskCompletionSource, context)).addOnFailureListener(new v(taskCompletionSource, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            TaskCompletionSource<b8.g> taskCompletionSource2 = this.f2545b;
            b8.r rVar = this.f2547d;
            FirebaseAuth.getInstance(rVar.K()).i(rVar, w.a(intent)).addOnSuccessListener(new v(taskCompletionSource2, context)).addOnFailureListener(new x(taskCompletionSource2, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            TaskCompletionSource<b8.g> taskCompletionSource3 = this.f2545b;
            b8.r rVar2 = this.f2547d;
            FirebaseAuth.getInstance(rVar2.K()).r(rVar2, w.a(intent)).addOnSuccessListener(new x(taskCompletionSource3, context)).addOnFailureListener(new d5.n(taskCompletionSource3, context));
            return;
        }
        this.f2545b.setException(zzadr.zza(p.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
    }
}
