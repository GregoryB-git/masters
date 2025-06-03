// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import com.google.firebase.messaging.J;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import V2.m;
import com.google.firebase.messaging.n;
import w2.a;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import w2.b;

public final class FirebaseInstanceIdReceiver extends b
{
    public static Intent g(final Context context, final String s, final Bundle bundle) {
        return new Intent(s).putExtras(bundle);
    }
    
    @Override
    public int b(final Context ex, final a a) {
        try {
            return (int)m.a(new n((Context)ex).k(a.a()));
        }
        catch (InterruptedException ex) {}
        catch (ExecutionException ex2) {}
        Log.e("FirebaseMessaging", "Failed to send message to service.", (Throwable)ex);
        return 500;
    }
    
    @Override
    public void c(final Context context, final Bundle bundle) {
        final Intent g = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (J.B(g)) {
            J.s(g);
        }
    }
}
