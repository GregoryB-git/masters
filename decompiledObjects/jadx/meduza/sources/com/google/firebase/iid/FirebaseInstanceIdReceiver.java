package com.google.firebase.iid;

import aa.j;
import aa.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends i6.b {
    @Override // i6.b
    public final int a(Context context, i6.a aVar) {
        try {
            return ((Integer) Tasks.await(new j(context).b(aVar.f7564a))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // i6.b
    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (q.d(putExtras)) {
            q.c(putExtras.getExtras(), "_nd");
        }
    }
}
