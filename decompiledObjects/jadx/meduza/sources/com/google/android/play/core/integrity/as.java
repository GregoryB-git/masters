package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f2952a;

    /* renamed from: b, reason: collision with root package name */
    public final m7.e f2953b;

    /* renamed from: c, reason: collision with root package name */
    private final m7.v f2954c = new m7.v("RequestDialogCallbackImpl");

    /* renamed from: d, reason: collision with root package name */
    private final String f2955d;

    /* renamed from: e, reason: collision with root package name */
    private final k f2956e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, m7.e eVar) {
        this.f2955d = context.getPackageName();
        this.f2956e = kVar;
        this.f2952a = taskCompletionSource;
        this.f = activity;
        this.f2953b = eVar;
    }

    @Override // m7.u
    public final void b(Bundle bundle) {
        this.f2953b.d(this.f2952a);
        this.f2954c.b("onRequestDialog(%s)", this.f2955d);
        k6.b a10 = this.f2956e.a(bundle);
        if (a10 != null) {
            this.f2952a.trySetException(a10);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            m7.v vVar = this.f2954c;
            Object[] objArr = {this.f2955d};
            vVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m7.v.c(vVar.f10368a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f2952a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f2953b.a()));
        m7.v vVar2 = this.f2954c;
        Object[] objArr2 = new Object[0];
        vVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", m7.v.c(vVar2.f10368a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
