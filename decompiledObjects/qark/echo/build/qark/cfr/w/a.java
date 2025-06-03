/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.app.SharedElementCallback
 *  android.app.SharedElementCallback$OnSharedElementsReadyListener
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Arrays
 *  java.util.HashSet
 */
package w;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;

public abstract class a
extends x.a {
    public static void l(Activity activity, String[] arrstring, int n8) {
        int n9;
        HashSet hashSet = new HashSet();
        int n10 = 0;
        for (n9 = 0; n9 < arrstring.length; ++n9) {
            if (!TextUtils.isEmpty((CharSequence)arrstring[n9])) {
                if (E.b.c() || !TextUtils.equals((CharSequence)arrstring[n9], (CharSequence)"android.permission.POST_NOTIFICATIONS")) continue;
                hashSet.add((Object)n9);
                continue;
            }
            activity = new StringBuilder();
            activity.append("Permission request for permissions ");
            activity.append(Arrays.toString((Object[])arrstring));
            activity.append(" must not contain null or empty values");
            throw new IllegalArgumentException(activity.toString());
        }
        n9 = hashSet.size();
        String[] arrstring2 = n9 > 0 ? new String[arrstring.length - n9] : arrstring;
        if (n9 > 0) {
            if (n9 == arrstring.length) {
                return;
            }
            int n11 = 0;
            for (n9 = n10; n9 < arrstring.length; ++n9) {
                n10 = n11;
                if (!hashSet.contains((Object)n9)) {
                    arrstring2[n11] = arrstring[n9];
                    n10 = n11 + 1;
                }
                n11 = n10;
            }
        }
        if (activity instanceof e) {
            ((e)activity).a(n8);
        }
        b.b(activity, arrstring, n8);
    }

    public static boolean m(Activity activity, String string2) {
        if (!E.b.c() && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string2)) {
            return false;
        }
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 32) {
            return d.a(activity, string2);
        }
        if (n8 == 31) {
            return c.b(activity, string2);
        }
        return b.c(activity, string2);
    }

    public static void n(Activity activity, Intent intent, int n8, Bundle bundle) {
        a.b(activity, intent, n8, bundle);
    }

    public static void o(Activity activity, IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) {
        a.c(activity, intentSender, n8, intent, n9, n10, n11, bundle);
    }

    public static abstract class a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int n8, Bundle bundle) {
            activity.startActivityForResult(intent, n8, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11, bundle);
        }
    }

    public static abstract class b {
        public static void a(Object object) {
            ((SharedElementCallback.OnSharedElementsReadyListener)object).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] arrstring, int n8) {
            activity.requestPermissions(arrstring, n8);
        }

        public static boolean c(Activity activity, String string2) {
            return activity.shouldShowRequestPermissionRationale(string2);
        }
    }

    public static abstract class c {
        public static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        public static boolean b(Activity activity, String string2) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return (Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke((Object)packageManager, new Object[]{string2});
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException illegalAccessException) {
                return activity.shouldShowRequestPermissionRationale(string2);
            }
        }
    }

    public static abstract class d {
        public static boolean a(Activity activity, String string2) {
            return activity.shouldShowRequestPermissionRationale(string2);
        }
    }

    public static interface e {
        public void a(int var1);
    }

}

