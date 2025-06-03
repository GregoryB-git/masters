/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.HashSet
 *  java.util.Set
 */
package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class ActivityLifecycleManager {
    private final ActivityLifecycleCallbacksWrapper callbacksWrapper;

    public ActivityLifecycleManager(Context context) {
        this.callbacksWrapper = new ActivityLifecycleCallbacksWrapper((Application)context.getApplicationContext());
    }

    public boolean registerCallbacks(Callbacks callbacks) {
        ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        boolean bl = activityLifecycleCallbacksWrapper != null && activityLifecycleCallbacksWrapper.registerLifecycleCallbacks(callbacks);
        return bl;
    }

    public void resetCallbacks() {
        ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        if (activityLifecycleCallbacksWrapper != null) {
            activityLifecycleCallbacksWrapper.clearCallbacks();
        }
    }

    public static class ActivityLifecycleCallbacksWrapper {
        private final Application application;
        private final Set<Application.ActivityLifecycleCallbacks> registeredCallbacks = new HashSet();

        public ActivityLifecycleCallbacksWrapper(Application application) {
            this.application = application;
        }

        private void clearCallbacks() {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.registeredCallbacks) {
                this.application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }

        private boolean registerLifecycleCallbacks(Callbacks object) {
            if (this.application != null) {
                object = new Application.ActivityLifecycleCallbacks(this, (Callbacks)object){
                    public final ActivityLifecycleCallbacksWrapper this$0;
                    public final Callbacks val$callbacks;
                    {
                        this.this$0 = activityLifecycleCallbacksWrapper;
                        this.val$callbacks = callbacks;
                    }

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        this.val$callbacks.onActivityCreated(activity, bundle);
                    }

                    public void onActivityDestroyed(Activity activity) {
                        this.val$callbacks.onActivityDestroyed(activity);
                    }

                    public void onActivityPaused(Activity activity) {
                        this.val$callbacks.onActivityPaused(activity);
                    }

                    public void onActivityResumed(Activity activity) {
                        this.val$callbacks.onActivityResumed(activity);
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        this.val$callbacks.onActivitySaveInstanceState(activity, bundle);
                    }

                    public void onActivityStarted(Activity activity) {
                        this.val$callbacks.onActivityStarted(activity);
                    }

                    public void onActivityStopped(Activity activity) {
                        this.val$callbacks.onActivityStopped(activity);
                    }
                };
                this.application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
                this.registeredCallbacks.add(object);
                return true;
            }
            return false;
        }
    }

    public static abstract class Callbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
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
}

