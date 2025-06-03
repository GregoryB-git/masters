/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Process
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.core.app.ActivityCompat
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;

class AndroidSupportV4Compat {

    public static class ActivityCompat {
        public static void requestPermissions(@NonNull Activity activity, @NonNull String[] stringArray, int n) {
            ActivityCompatApi23.requestPermissions(activity, stringArray, n);
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String string2) {
            return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, string2);
        }
    }

    @TargetApi(value=23)
    public static class ActivityCompatApi23 {
        public static void requestPermissions(Activity activity, String[] stringArray, int n) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(n);
            }
            activity.requestPermissions(stringArray, n);
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String string2) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale((Activity)activity, (String)string2);
        }
    }

    public static class ContextCompat {
        public static int checkSelfPermission(@NonNull Context context, @NonNull String string2) {
            try {
                int n = context.checkPermission(string2, Process.myPid(), Process.myUid());
                return n;
            }
            catch (Throwable throwable) {
                Log.e((String)"OneSignal", (String)"checkSelfPermission failed, returning PERMISSION_DENIED");
                return -1;
            }
        }

        public static int getColor(Context context, int n) {
            return context.getColor(n);
        }
    }

    public static interface RequestPermissionsRequestCodeValidator {
        public void validateRequestPermissionsRequestCode(int var1);
    }
}

