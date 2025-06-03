package e3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {
    public static String a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && d(context, null, str)) {
            return str;
        }
        if (i10 >= 29) {
            if (d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    public static int b(Activity activity, String str) {
        if (activity == null) {
            return 0;
        }
        boolean z10 = activity.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean z11 = !(!u.b.b(activity, str));
        if (z10) {
            z11 = !z11;
        }
        if (!z10 && z11) {
            activity.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        return (z10 && z11) ? 4 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016d, code lost:
    
        if (d(r20, r2, "android.permission.RECEIVE_MMS") != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        if (d(r20, r2, "android.permission.BODY_SENSORS") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        if (d(r20, r2, "android.permission.READ_MEDIA_IMAGES") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f1, code lost:
    
        if (d(r20, r2, "android.permission.RECORD_AUDIO") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (d(r20, r2, "android.permission.SCHEDULE_EXACT_ALARM") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0204, code lost:
    
        if (d(r20, r2, r1) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0239, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0258, code lost:
    
        r2.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0218, code lost:
    
        if (d(r20, r2, r1) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0237, code lost:
    
        if (d(r20, r2, r1) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0244, code lost:
    
        if (d(r20, r2, "android.permission.CAMERA") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0256, code lost:
    
        if (d(r20, r2, "android.permission.READ_CALENDAR") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (d(r20, r2, "android.permission.SYSTEM_ALERT_WINDOW") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
    
        if (d(r20, r2, "android.permission.BLUETOOTH") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010d, code lost:
    
        if (d(r20, r2, "android.permission.POST_NOTIFICATIONS") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
    
        if (d(r20, r2, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
    
        if (r1 != false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r20, int r21) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.g.c(android.content.Context, int):java.util.ArrayList");
    }

    public static boolean d(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = i10 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(packageName, 4096);
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Integer e(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static int f(Activity activity, String str, int i10) {
        if (i10 == -1) {
            return b(activity, str);
        }
        return 1;
    }
}
