// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import android.app.Application$ActivityLifecycleCallbacks;

public class q implements Application$ActivityLifecycleCallbacks
{
    public final Set o;
    
    public q() {
        this.o = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void c(final Intent intent) {
        final Bundle bundle = null;
        Bundle bundle2;
        try {
            final Bundle extras = intent.getExtras();
            bundle2 = bundle;
            if (extras != null) {
                bundle2 = extras.getBundle("gcm.n.analytics_data");
            }
        }
        catch (RuntimeException ex) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", (Throwable)ex);
            bundle2 = bundle;
        }
        if (J.C(bundle2)) {
            J.u(bundle2);
        }
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null) {
            if (!this.o.add(intent)) {
                return;
            }
            if (Build$VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post((Runnable)new p(this, intent));
                return;
            }
            this.c(intent);
        }
    }
    
    public void onActivityDestroyed(final Activity activity) {
    }
    
    public void onActivityPaused(final Activity activity) {
        if (activity.isFinishing()) {
            this.o.remove(activity.getIntent());
        }
    }
    
    public void onActivityResumed(final Activity activity) {
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public void onActivityStarted(final Activity activity) {
    }
    
    public void onActivityStopped(final Activity activity) {
    }
}
