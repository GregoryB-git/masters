/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 */
package com.google.firebase.iid;

import V2.j;
import V2.m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.n;
import java.util.concurrent.ExecutionException;
import w2.a;
import w2.b;

public final class FirebaseInstanceIdReceiver
extends b {
    public static Intent g(Context context, String string2, Bundle bundle) {
        return new Intent(string2).putExtras(bundle);
    }

    @Override
    public int b(Context context, a a8) {
        void var1_4;
        try {
            int n8 = (Integer)m.a(new n(context).k(a8.a()));
            return n8;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        Log.e((String)"FirebaseMessaging", (String)"Failed to send message to service.", (Throwable)var1_4);
        return 500;
    }

    @Override
    public void c(Context context, Bundle bundle) {
        if (J.B((Intent)(context = FirebaseInstanceIdReceiver.g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle)))) {
            J.s((Intent)context);
        }
    }
}

