// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.content.Context;
import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.content.IntentSender;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import E.b;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashSet;
import android.app.Activity;

public abstract class a extends a
{
    public static void l(final Activity activity, final String[] a, final int n) {
        final HashSet<Integer> set = new HashSet<Integer>();
        final int n2 = 0;
        for (int i = 0; i < a.length; ++i) {
            if (TextUtils.isEmpty((CharSequence)a[i])) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Permission request for permissions ");
                sb.append(Arrays.toString(a));
                sb.append(" must not contain null or empty values");
                throw new IllegalArgumentException(sb.toString());
            }
            if (!E.b.c() && TextUtils.equals((CharSequence)a[i], (CharSequence)"android.permission.POST_NOTIFICATIONS")) {
                set.add(i);
            }
        }
        final int size = set.size();
        String[] array;
        if (size > 0) {
            array = new String[a.length - size];
        }
        else {
            array = a;
        }
        if (size > 0) {
            if (size == a.length) {
                return;
            }
            int n3 = 0;
            int n4;
            for (int j = n2; j < a.length; ++j, n3 = n4) {
                n4 = n3;
                if (!set.contains(j)) {
                    array[n3] = a[j];
                    n4 = n3 + 1;
                }
            }
        }
        if (activity instanceof e) {
            ((e)activity).a(n);
        }
        b.b(activity, a, n);
    }
    
    public static boolean m(final Activity activity, final String s) {
        if (!E.b.c() && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            return false;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 32) {
            return d.a(activity, s);
        }
        if (sdk_INT == 31) {
            return c.b(activity, s);
        }
        return b.c(activity, s);
    }
    
    public static void n(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        a.b(activity, intent, n, bundle);
    }
    
    public static void o(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        a.c(activity, intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public abstract static class a
    {
        public static void a(final Activity activity) {
            activity.finishAffinity();
        }
        
        public static void b(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
            activity.startActivityForResult(intent, n, bundle);
        }
        
        public static void c(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
        }
    }
    
    public abstract static class b
    {
        public static void a(final Object o) {
            ((SharedElementCallback$OnSharedElementsReadyListener)o).onSharedElementsReady();
        }
        
        public static void b(final Activity activity, final String[] array, final int n) {
            activity.requestPermissions(array, n);
        }
        
        public static boolean c(final Activity activity, final String s) {
            return activity.shouldShowRequestPermissionRationale(s);
        }
    }
    
    public abstract static class c
    {
        public static boolean a(@NonNull final Activity activity) {
            return activity.isLaunchedFromBubble();
        }
        
        @SuppressLint({ "BanUncheckedReflection" })
        public static boolean b(final Activity activity, final String s) {
            try {
                return (boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(((Context)activity.getApplication()).getPackageManager(), s);
            }
            catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
                return activity.shouldShowRequestPermissionRationale(s);
            }
        }
    }
    
    public abstract static class d
    {
        public static boolean a(final Activity activity, final String s) {
            return activity.shouldShowRequestPermissionRationale(s);
        }
    }
    
    public interface e
    {
        void a(final int p0);
    }
}
