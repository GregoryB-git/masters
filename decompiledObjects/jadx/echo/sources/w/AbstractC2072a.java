package w;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import x.AbstractC2112a;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2072a extends AbstractC2112a {

    /* renamed from: w.a$a, reason: collision with other inner class name */
    public static class C0283a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i7, Bundle bundle) {
            activity.startActivityForResult(intent, i7, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
        }
    }

    /* renamed from: w.a$b */
    public static class b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: w.a$c */
    public static class c {
        public static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: w.a$d */
    public static class d {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: w.a$e */
    public interface e {
        void a(int i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (!E.b.c() && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof e) {
            ((e) activity).a(i7);
        }
        b.b(activity, strArr, i7);
    }

    public static boolean m(Activity activity, String str) {
        if (!E.b.c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 32 ? d.a(activity, str) : i7 == 31 ? c.b(activity, str) : b.c(activity, str);
    }

    public static void n(Activity activity, Intent intent, int i7, Bundle bundle) {
        C0283a.b(activity, intent, i7, bundle);
    }

    public static void o(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        C0283a.c(activity, intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
