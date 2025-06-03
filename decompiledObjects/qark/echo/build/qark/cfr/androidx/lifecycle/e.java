/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b;
import androidx.lifecycle.q;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class e {
    public static AtomicBoolean a = new AtomicBoolean(false);

    public static void a(Context context) {
        if (a.getAndSet(true)) {
            return;
        }
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new a());
    }

    public static class a
    extends b {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            q.g(activity);
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override
        public void onActivityStopped(Activity activity) {
        }
    }

}

