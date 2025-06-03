/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  com.onesignal.PermissionsActivity$2
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashMap
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import com.onesignal.R;
import java.util.HashMap;

public class PermissionsActivity
extends Activity {
    private static final int DELAY_TIME_CALLBACK_CALL = 500;
    private static final String INTENT_EXTRA_ANDROID_PERMISSION_STRING = "INTENT_EXTRA_ANDROID_PERMISSION_STRING";
    private static final String INTENT_EXTRA_CALLBACK_CLASS = "INTENT_EXTRA_CALLBACK_CLASS";
    private static final String INTENT_EXTRA_PERMISSION_TYPE = "INTENT_EXTRA_PERMISSION_TYPE";
    private static final int ONESIGNAL_PERMISSION_REQUEST_CODE = 2;
    private static final int REQUEST_SETTINGS = 3;
    private static final String TAG = "com.onesignal.PermissionsActivity";
    private static ActivityLifecycleHandler.ActivityAvailableListener activityAvailableListener;
    private static final HashMap<String, PermissionCallback> callbackMap;
    private static boolean fallbackToSettings;
    private static boolean neverAskAgainClicked;
    private static boolean waiting;
    private String androidPermissionString;
    private String permissionRequestType;

    static {
        callbackMap = new HashMap();
    }

    private void handleBundleParams(Bundle object) {
        this.reregisterCallbackHandlers((Bundle)object);
        this.permissionRequestType = object.getString(INTENT_EXTRA_PERMISSION_TYPE);
        object = object.getString(INTENT_EXTRA_ANDROID_PERMISSION_STRING);
        this.androidPermissionString = object;
        this.requestPermission((String)object);
    }

    public static void registerAsCallback(@NonNull String string2, @NonNull PermissionCallback permissionCallback) {
        callbackMap.put((Object)string2, (Object)permissionCallback);
    }

    private void requestPermission(String string2) {
        if (!waiting) {
            waiting = true;
            neverAskAgainClicked = AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale(this, string2) ^ true;
            AndroidSupportV4Compat.ActivityCompat.requestPermissions(this, new String[]{string2}, 2);
        }
    }

    private void reregisterCallbackHandlers(Bundle bundle) {
        String string2 = bundle.getString(INTENT_EXTRA_CALLBACK_CLASS);
        try {
            Class.forName((String)string2);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(z2.o("Could not find callback class for PermissionActivity: ", string2));
        }
    }

    private boolean shouldShowSettings() {
        boolean bl = fallbackToSettings && neverAskAgainClicked && !AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale(this, this.androidPermissionString);
        return bl;
    }

    public static void startPrompt(boolean bl, String string2, String string3, Class<?> clazz) {
        if (waiting) {
            return;
        }
        fallbackToSettings = bl;
        activityAvailableListener = new 2(string2, string3, clazz);
        string2 = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (string2 != null) {
            string2.addActivityAvailableListener(TAG, activityAvailableListener);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OneSignal.initWithContext((Context)this);
        this.handleBundleParams(this.getIntent().getExtras());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.handleBundleParams(intent.getExtras());
    }

    public void onRequestPermissionsResult(int n, @NonNull String[] activityLifecycleHandler, @NonNull int[] nArray) {
        waiting = false;
        if (n == 2) {
            new Handler().postDelayed(new Runnable(this, nArray){
                public final PermissionsActivity this$0;
                public final int[] val$grantResults;
                {
                    this.this$0 = permissionsActivity;
                    this.val$grantResults = nArray;
                }

                public void run() {
                    boolean bl;
                    Object object = this.val$grantResults;
                    int n = ((int[])object).length;
                    boolean bl2 = bl = false;
                    if (n > 0) {
                        bl2 = bl;
                        if (object[0] == 0) {
                            bl2 = true;
                        }
                    }
                    if ((object = (Object)((PermissionCallback)callbackMap.get((Object)this.this$0.permissionRequestType))) != null) {
                        if (bl2) {
                            object.onAccept();
                        } else {
                            object.onReject(this.this$0.shouldShowSettings());
                        }
                        return;
                    }
                    object = z2.t("Missing handler for permissionRequestType: ");
                    object.append(this.this$0.permissionRequestType);
                    throw new RuntimeException(object.toString());
                }
            }, 500L);
        }
        if ((activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler()) != null) {
            activityLifecycleHandler.removeActivityAvailableListener(TAG);
        }
        this.finish();
        this.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }

    public static interface PermissionCallback {
        public void onAccept();

        public void onReject(boolean var1);
    }
}

