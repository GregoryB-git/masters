/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.ActivityLifecycleHandler
 *  java.lang.Object
 */
package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.OSFocusHandler;

class ActivityLifecycleListener
implements Application.ActivityLifecycleCallbacks {
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static ActivityLifecycleHandler activityLifecycleHandler;
    @Nullable
    private static ComponentCallbacks configuration;
    @Nullable
    private static ActivityLifecycleListener instance;

    @Nullable
    public static ActivityLifecycleHandler getActivityLifecycleHandler() {
        return activityLifecycleHandler;
    }

    public static void registerActivityLifecycleCallbacks(@NonNull Application application) {
        Object object;
        if (instance == null) {
            object = new ActivityLifecycleListener();
            instance = object;
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
        }
        if (activityLifecycleHandler == null) {
            activityLifecycleHandler = new ActivityLifecycleHandler(new OSFocusHandler());
        }
        if (configuration == null) {
            object = new ComponentCallbacks(){

                public void onConfigurationChanged(Configuration configuration) {
                    activityLifecycleHandler.onConfigurationChanged(configuration, activityLifecycleHandler.getCurActivity());
                }

                public void onLowMemory() {
                }
            };
            configuration = object;
            application.registerComponentCallbacks((ComponentCallbacks)object);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        bundle = activityLifecycleHandler;
        if (bundle != null) {
            bundle.onActivityCreated(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStopped(activity);
        }
    }
}

