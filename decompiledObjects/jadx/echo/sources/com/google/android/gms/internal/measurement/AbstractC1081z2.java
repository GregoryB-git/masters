package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1081z2 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f11229a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f11230b = !a();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11231c = false;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    public static boolean d(Context context) {
        if (f11230b) {
            return true;
        }
        synchronized (AbstractC1081z2.class) {
            try {
                if (f11230b) {
                    return true;
                }
                boolean e7 = e(context);
                if (e7) {
                    f11230b = e7;
                }
                return e7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e(Context context) {
        boolean z7;
        boolean isUserUnlocked;
        boolean z8 = true;
        int i7 = 1;
        while (true) {
            z7 = false;
            if (i7 > 2) {
                break;
            }
            if (f11229a == null) {
                f11229a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f11229a;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z8 = false;
                }
            } catch (NullPointerException e7) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e7);
                f11229a = null;
                i7++;
            }
        }
        z7 = z8;
        if (z7) {
            f11229a = null;
        }
        return z7;
    }
}
