package com.google.firebase.iid;

import V2.m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C1124n;
import com.google.firebase.messaging.J;
import java.util.concurrent.ExecutionException;
import w2.AbstractC2080b;
import w2.C2079a;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2080b {
    public static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // w2.AbstractC2080b
    public int b(Context context, C2079a c2079a) {
        try {
            return ((Integer) m.a(new C1124n(context).k(c2079a.a()))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
            return 500;
        }
    }

    @Override // w2.AbstractC2080b
    public void c(Context context, Bundle bundle) {
        Intent g7 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (J.B(g7)) {
            J.s(g7);
        }
    }
}
