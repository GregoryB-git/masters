/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.hintsolutions.raintv.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Foreground
implements Application.ActivityLifecycleCallbacks {
    public static final long CHECK_DELAY = 500L;
    public static final String TAG = Foreground.class.getName();
    private static Foreground instance;
    private Runnable check;
    private boolean foreground = false;
    private Handler handler = new Handler();
    private List<Listener> listeners = new CopyOnWriteArrayList();
    private boolean paused = true;

    public static /* synthetic */ void a(Foreground foreground) {
        foreground.lambda$onActivityPaused$0();
    }

    private void detachActivityFromActivityManager(Activity activity) throws NoSuchFieldException, IllegalAccessException {
        Field field = ((ActivityManager)activity.getSystemService("activity")).getClass().getDeclaredField("mContext");
        int n = field.getModifiers();
        if ((n | 8) == n) {
            field.setAccessible(true);
            if (field.get(null) == activity) {
                field.set(null, null);
            }
        }
    }

    public static Foreground get(Application application) {
        if (instance == null) {
            Foreground.init(application);
        }
        return instance;
    }

    public static Foreground get(Context context) {
        Foreground foreground = instance;
        if (foreground == null) {
            if ((context = context.getApplicationContext()) instanceof Application) {
                Foreground.init((Application)context);
            }
            throw new IllegalStateException("Foreground is not initialised and cannot obtain the Application object");
        }
        return foreground;
    }

    public static Foreground getInstance() {
        Foreground foreground = instance;
        if (foreground != null) {
            return foreground;
        }
        throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameterised init/get");
    }

    public static Foreground init(Application application) {
        if (instance == null) {
            Foreground foreground;
            instance = foreground = new Foreground();
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)foreground);
        }
        return instance;
    }

    private /* synthetic */ void lambda$onActivityPaused$0() {
        if (this.foreground && this.paused) {
            this.foreground = false;
            for (Listener listener : this.listeners) {
                try {
                    listener.onBecameBackground();
                }
                catch (Exception exception) {
                    Log.e((String)TAG, (String)"Listener threw exception!", (Throwable)exception);
                }
            }
        }
    }

    public void addListener(Listener listener) {
        this.listeners.add((Object)listener);
    }

    public boolean isBackground() {
        return this.foreground ^ true;
    }

    public boolean isForeground() {
        return this.foreground;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onActivityDestroyed(Activity activity) {
        try {
            this.detachActivityFromActivityManager(activity);
            return;
        }
        catch (Exception | IllegalAccessException | NoSuchFieldException throwable) {
            return;
        }
    }

    public void onActivityPaused(Activity activity) {
        this.paused = true;
        activity = this.check;
        if (activity != null) {
            this.handler.removeCallbacks((Runnable)activity);
        }
        activity = this.handler;
        h0 h02 = new h0(this, 8);
        this.check = h02;
        activity.postDelayed((Runnable)h02, 500L);
    }

    public void onActivityResumed(Activity activity) {
        this.paused = false;
        boolean bl = this.foreground;
        this.foreground = true;
        activity = this.check;
        if (activity != null) {
            this.handler.removeCallbacks((Runnable)activity);
        }
        if (bl ^ true) {
            for (Listener listener : this.listeners) {
                try {
                    listener.onBecameForeground();
                }
                catch (Exception exception) {
                    Log.e((String)TAG, (String)"Listener threw exception!", (Throwable)exception);
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void removeListener(Listener listener) {
        this.listeners.remove((Object)listener);
    }

    public static interface Listener {
        public void onBecameBackground();

        public void onBecameForeground();
    }
}

