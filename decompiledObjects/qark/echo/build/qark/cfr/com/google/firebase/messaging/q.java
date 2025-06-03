/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.p;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class q
implements Application.ActivityLifecycleCallbacks {
    public final Set o = Collections.newSetFromMap((Map)new WeakHashMap());

    public static /* synthetic */ void a(q q8, Intent intent) {
        q8.b(intent);
    }

    public final /* synthetic */ void b(Intent intent) {
        this.c(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Intent intent) {
        Object var2_3 = null;
        try {
            Bundle bundle = intent.getExtras();
            intent = var2_3;
            if (bundle != null) {
                intent = bundle.getBundle("gcm.n.analytics_data");
            }
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"FirebaseMessaging", (String)"Failed trying to get analytics data from Intent extras.", (Throwable)runtimeException);
            intent = var2_3;
        }
        if (J.C((Bundle)intent)) {
            J.u((Bundle)intent);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if ((activity = activity.getIntent()) != null) {
            if (!this.o.add((Object)activity)) {
                return;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post((Runnable)new p(this, (Intent)activity));
                return;
            }
            this.c((Intent)activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.o.remove((Object)activity.getIntent());
        }
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}

