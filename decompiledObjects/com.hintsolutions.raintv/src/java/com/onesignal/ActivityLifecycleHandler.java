/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.ref.WeakReference
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.ConcurrentHashMap
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.onesignal.OSFocusHandler;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSUtils;
import com.onesignal.OSViewUtils;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

class ActivityLifecycleHandler
implements OSSystemConditionController.OSSystemConditionHandler {
    private static final String FOCUS_LOST_WORKER_TAG = "FOCUS_LOST_WORKER_TAG";
    private static final int SYNC_AFTER_BG_DELAY_MS = 2000;
    private static final Map<String, ActivityAvailableListener> sActivityAvailableListeners = new ConcurrentHashMap();
    private static final Map<String, KeyboardListener> sKeyboardListeners;
    private static final Map<String, OSSystemConditionController.OSSystemConditionObserver> sSystemConditionObservers;
    @SuppressLint(value={"StaticFieldLeak"})
    private Activity curActivity = null;
    private final OSFocusHandler focusHandler;
    private boolean nextResumeIsFirstActivity = false;

    static {
        sSystemConditionObservers = new ConcurrentHashMap();
        sKeyboardListeners = new ConcurrentHashMap();
    }

    public ActivityLifecycleHandler(OSFocusHandler oSFocusHandler) {
        this.focusHandler = oSFocusHandler;
    }

    public static /* synthetic */ OSFocusHandler access$100(ActivityLifecycleHandler activityLifecycleHandler) {
        return activityLifecycleHandler.focusHandler;
    }

    private void handleFocus() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: ");
        stringBuilder.append(this.nextResumeIsFirstActivity);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        if (!this.focusHandler.hasBackgrounded() && !this.nextResumeIsFirstActivity) {
            OneSignal.onesignalLog(lOG_LEVEL, "ActivityLifecycleHandler cancel background lost focus worker");
            this.focusHandler.cancelOnLostFocusWorker(FOCUS_LOST_WORKER_TAG, OneSignal.appContext);
        } else {
            OneSignal.onesignalLog(lOG_LEVEL, "ActivityLifecycleHandler reset background state, call app focus");
            this.nextResumeIsFirstActivity = false;
            this.focusHandler.startOnFocusWork();
        }
    }

    private void handleLostFocus() {
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.focusHandler;
        if (oSFocusHandler != null && (!oSFocusHandler.hasBackgrounded() || this.focusHandler.hasCompleted())) {
            new Thread(this){
                public final ActivityLifecycleHandler this$0;
                {
                    this.this$0 = activityLifecycleHandler;
                }

                public void run() {
                    OneSignal.getFocusTimeController().appStopped();
                    ActivityLifecycleHandler.access$100(this.this$0).startOnLostFocusWorker("FOCUS_LOST_WORKER_TAG", 2000L, OneSignal.appContext);
                }
            }.start();
        }
    }

    private void logCurActivity() {
        String string;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("curActivity is NOW: ");
        if (this.curActivity != null) {
            string = z2.t("");
            string.append(this.curActivity.getClass().getName());
            string.append(":");
            string.append((Object)this.curActivity);
            string = string.toString();
        } else {
            string = "null";
        }
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    private void logOrientationChange(int n, Activity activity) {
        if (n == 2) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration Orientation Change: LANDSCAPE (");
            stringBuilder.append(n);
            stringBuilder.append(") on activity: ");
            stringBuilder.append((Object)activity);
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        } else if (n == 1) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration Orientation Change: PORTRAIT (");
            stringBuilder.append(n);
            stringBuilder.append(") on activity: ");
            stringBuilder.append((Object)activity);
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        }
    }

    private void onOrientationChanged(Activity activity) {
        this.handleLostFocus();
        Iterator iterator = sActivityAvailableListeners.entrySet().iterator();
        while (iterator.hasNext()) {
            (((Map.Entry)iterator.next()).getValue()).stopped(activity);
        }
        activity = sActivityAvailableListeners.entrySet().iterator();
        while (activity.hasNext()) {
            (((Map.Entry)activity.next()).getValue()).available(this.curActivity);
        }
        iterator = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry entry : sSystemConditionObservers.entrySet()) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this, (OSSystemConditionController.OSSystemConditionObserver)entry.getValue(), (String)entry.getKey(), null){
                private final String key;
                private final OSSystemConditionController.OSSystemConditionObserver observer;
                private final OSSystemConditionController.OSSystemConditionHandler systemConditionListener;
                {
                    this.systemConditionListener = oSSystemConditionHandler;
                    this.observer = oSSystemConditionObserver;
                    this.key = string;
                }
                {
                    this(oSSystemConditionHandler, oSSystemConditionObserver, string);
                }

                public void onGlobalLayout() {
                    if (!OSViewUtils.isKeyboardUp((WeakReference<Activity>)new WeakReference((Object)OneSignal.getCurrentActivity()))) {
                        this.systemConditionListener.removeSystemConditionObserver(this.key, this);
                        this.observer.systemConditionChanged();
                    }
                }
            };
            iterator.addOnGlobalLayoutListener(onGlobalLayoutListener);
            sKeyboardListeners.put((Object)((String)entry.getKey()), (Object)onGlobalLayoutListener);
        }
        this.handleFocus();
    }

    public void addActivityAvailableListener(String string, ActivityAvailableListener activityAvailableListener) {
        sActivityAvailableListeners.put((Object)string, (Object)activityAvailableListener);
        string = this.curActivity;
        if (string != null) {
            activityAvailableListener.available((Activity)string);
        }
    }

    public void addSystemConditionObserver(String string, OSSystemConditionController.OSSystemConditionObserver oSSystemConditionObserver) {
        Activity activity = this.curActivity;
        if (activity != null) {
            activity = activity.getWindow().getDecorView().getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new /* invalid duplicate definition of identical inner class */;
            activity.addOnGlobalLayoutListener(onGlobalLayoutListener);
            sKeyboardListeners.put((Object)string, (Object)onGlobalLayoutListener);
        }
        sSystemConditionObservers.put((Object)string, (Object)oSSystemConditionObserver);
    }

    public Activity getCurActivity() {
        return this.curActivity;
    }

    public void onActivityCreated(Activity activity) {
    }

    public void onActivityDestroyed(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityDestroyed: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        sKeyboardListeners.clear();
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        this.logCurActivity();
    }

    public void onActivityPaused(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityPaused: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        this.logCurActivity();
    }

    public void onActivityResumed(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityResumed: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        this.setCurActivity(activity);
        this.logCurActivity();
        this.handleFocus();
    }

    public void onActivityStarted(Activity activity) {
        this.focusHandler.startOnStartFocusWork();
    }

    public void onActivityStopped(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityStopped: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        lOG_LEVEL = sActivityAvailableListeners.entrySet().iterator();
        while (lOG_LEVEL.hasNext()) {
            (((Map.Entry)lOG_LEVEL.next()).getValue()).stopped(activity);
        }
        this.logCurActivity();
        if (this.curActivity == null) {
            this.focusHandler.startOnStopFocusWork();
        }
    }

    public void onConfigurationChanged(Configuration configuration, Activity activity) {
        Activity activity2 = this.curActivity;
        if (activity2 != null && OSUtils.hasConfigChangeFlag(activity2, 128)) {
            this.logOrientationChange(configuration.orientation, activity);
            this.onOrientationChanged(activity);
        }
    }

    public void removeActivityAvailableListener(String string) {
        sActivityAvailableListeners.remove((Object)string);
    }

    @Override
    public void removeSystemConditionObserver(@NotNull String string, @NotNull KeyboardListener keyboardListener) {
        Activity activity = this.curActivity;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
        }
        sKeyboardListeners.remove((Object)string);
        sSystemConditionObservers.remove((Object)string);
    }

    public void setCurActivity(Activity activity) {
        this.curActivity = activity;
        activity = sActivityAvailableListeners.entrySet().iterator();
        while (activity.hasNext()) {
            (((Map.Entry)activity.next()).getValue()).available(this.curActivity);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : sSystemConditionObservers.entrySet()) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new /* invalid duplicate definition of identical inner class */;
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                sKeyboardListeners.put((Object)((String)entry.getKey()), (Object)onGlobalLayoutListener);
            }
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
        }
    }

    public void setNextResumeIsFirstActivity(boolean bl) {
        this.nextResumeIsFirstActivity = bl;
    }
}

