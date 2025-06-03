/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.DialogFragment
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
 *  com.onesignal.ActivityLifecycleHandler
 *  com.onesignal.OSSystemConditionController$1
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSViewUtils;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;

class OSSystemConditionController {
    private static final String TAG = "com.onesignal.OSSystemConditionController";
    private final OSSystemConditionObserver systemConditionObserver;

    public OSSystemConditionController(OSSystemConditionObserver oSSystemConditionObserver) {
        this.systemConditionObserver = oSSystemConditionObserver;
    }

    public static /* synthetic */ OSSystemConditionObserver access$000(OSSystemConditionController oSSystemConditionController) {
        return oSSystemConditionController.systemConditionObserver;
    }

    public boolean isDialogFragmentShowing(Context context) throws NoClassDefFoundError {
        boolean bl;
        boolean bl2 = context instanceof AppCompatActivity;
        boolean bl3 = bl = false;
        if (bl2) {
            context = ((AppCompatActivity)context).getSupportFragmentManager();
            context.registerFragmentLifecycleCallbacks((FragmentManager.FragmentLifecycleCallbacks)new 1(this, (FragmentManager)context), true);
            context = context.getFragments();
            int n = context.size();
            bl3 = bl;
            if (n > 0) {
                context = (Fragment)context.get(n - 1);
                bl3 = bl;
                if (context.isVisible()) {
                    bl3 = bl;
                    if (context instanceof DialogFragment) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public boolean systemConditionsAvailable() {
        ActivityLifecycleHandler activityLifecycleHandler;
        if (OneSignal.getCurrentActivity() == null) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (this.isDialogFragmentShowing((Context)OneSignal.getCurrentActivity())) {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            activityLifecycleHandler = new StringBuilder();
            activityLifecycleHandler.append("AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: ");
            activityLifecycleHandler.append((Object)noClassDefFoundError);
            OneSignal.onesignalLog(lOG_LEVEL, activityLifecycleHandler.toString());
        }
        activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        boolean bl = OSViewUtils.isKeyboardUp((WeakReference<Activity>)new WeakReference((Object)OneSignal.getCurrentActivity()));
        if (bl && activityLifecycleHandler != null) {
            activityLifecycleHandler.addSystemConditionObserver(TAG, this.systemConditionObserver);
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return bl ^ true;
    }

    public static interface OSSystemConditionHandler {
        public void removeSystemConditionObserver(@NonNull String var1, @NonNull ActivityLifecycleHandler.KeyboardListener var2);
    }

    public static interface OSSystemConditionObserver {
        public void systemConditionChanged();
    }
}

