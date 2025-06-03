package w1;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import w.AbstractC2072a;

/* loaded from: classes.dex */
public abstract class u {
    public static String a(Context context, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && d(context, null, str)) {
            return str;
        }
        if (i7 >= 29) {
            if (i7 < 29 || !d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return null;
            }
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (d(r4, r0, "android.permission.SCHEDULE_EXACT_ALARM") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (d(r4, r0, "android.permission.READ_MEDIA_AUDIO") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (d(r4, r0, "android.permission.READ_MEDIA_VIDEO") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (d(r4, r0, "android.permission.NEARBY_WIFI_DEVICES") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (d(r4, r0, "android.permission.ACCESS_NOTIFICATION_POLICY") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (d(r4, r0, "android.permission.REQUEST_INSTALL_PACKAGES") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (d(r4, r0, "android.permission.SYSTEM_ALERT_WINDOW") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (d(r4, r0, "android.permission.MANAGE_EXTERNAL_STORAGE") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        if (d(r4, r0, "android.permission.BLUETOOTH") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        if (d(r4, r0, "android.permission.ACTIVITY_RECOGNITION") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c4, code lost:
    
        if (d(r4, r0, "android.permission.ACCESS_MEDIA_LOCATION") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (d(r4, r0, "android.permission.POST_NOTIFICATIONS") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (d(r4, r0, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f5, code lost:
    
        if (r5 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fd, code lost:
    
        if (d(r4, r0, "android.permission.WRITE_EXTERNAL_STORAGE") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (d(r4, r0, "android.permission.BODY_SENSORS_BACKGROUND") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r0.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List b(android.content.Context r4, int r5) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.b(android.content.Context, int):java.util.List");
    }

    public static PackageInfo c(Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        int i7 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        if (i7 < 33) {
            return packageManager.getPackageInfo(packageName, 4096);
        }
        of = PackageManager.PackageInfoFlags.of(4096L);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        return packageInfo;
    }

    public static boolean d(Context context, ArrayList arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e7);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo c7 = c(context);
        if (c7 == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(c7.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !AbstractC2072a.m(activity, str);
    }

    public static int f(String str) {
        str.hashCode();
        switch (str) {
            case "android.permission.READ_SMS":
            case "android.permission.RECEIVE_WAP_PUSH":
            case "android.permission.RECEIVE_MMS":
            case "android.permission.RECEIVE_SMS":
            case "android.permission.SEND_SMS":
                return 13;
            case "android.permission.READ_CALENDAR":
            case "android.permission.WRITE_CALENDAR":
                return 0;
            case "android.permission.POST_NOTIFICATIONS":
                return 17;
            case "android.permission.READ_CALL_LOG":
            case "android.permission.READ_PHONE_NUMBERS":
            case "android.permission.BIND_CALL_REDIRECTION_SERVICE":
            case "android.permission.READ_PHONE_STATE":
            case "android.permission.CALL_PHONE":
            case "android.permission.WRITE_CALL_LOG":
            case "android.permission.USE_SIP":
            case "com.android.voicemail.permission.ADD_VOICEMAIL":
                return 8;
            case "android.permission.ACCESS_FINE_LOCATION":
            case "android.permission.ACCESS_COARSE_LOCATION":
                return 3;
            case "android.permission.MANAGE_EXTERNAL_STORAGE":
                return 22;
            case "android.permission.ACCESS_NOTIFICATION_POLICY":
                return 27;
            case "android.permission.SYSTEM_ALERT_WINDOW":
                return 23;
            case "android.permission.BODY_SENSORS":
                return 12;
            case "android.permission.NEARBY_WIFI_DEVICES":
                return 31;
            case "android.permission.BLUETOOTH_CONNECT":
                return 30;
            case "android.permission.READ_EXTERNAL_STORAGE":
            case "android.permission.WRITE_EXTERNAL_STORAGE":
                return 15;
            case "android.permission.READ_MEDIA_IMAGES":
                return 9;
            case "android.permission.WRITE_CONTACTS":
            case "android.permission.GET_ACCOUNTS":
            case "android.permission.READ_CONTACTS":
                return 2;
            case "android.permission.BODY_SENSORS_BACKGROUND":
                return 35;
            case "android.permission.CAMERA":
                return 1;
            case "android.permission.READ_MEDIA_AUDIO":
                return 33;
            case "android.permission.READ_MEDIA_VIDEO":
                return 32;
            case "android.permission.SCHEDULE_EXACT_ALARM":
                return 34;
            case "android.permission.BLUETOOTH_ADVERTISE":
                return 29;
            case "android.permission.REQUEST_INSTALL_PACKAGES":
                return 24;
            case "android.permission.ACTIVITY_RECOGNITION":
                return 19;
            case "android.permission.RECORD_AUDIO":
                return 7;
            case "android.permission.ACCESS_BACKGROUND_LOCATION":
                return 4;
            case "android.permission.BLUETOOTH_SCAN":
                return 28;
            case "android.permission.ACCESS_MEDIA_LOCATION":
                return 18;
            default:
                return 20;
        }
    }

    public static void g(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    public static int h(Activity activity, String str, int i7) {
        boolean z7 = true;
        if (i7 != -1) {
            return 1;
        }
        boolean j7 = j(activity, str);
        boolean z8 = !e(activity, str);
        if (!j7) {
            z7 = z8;
        } else if (z8) {
            z7 = false;
        }
        if (!j7 && z7) {
            g(activity, str);
        }
        return (j7 && z7) ? 4 : 0;
    }

    public static void i(Activity activity, int i7) {
        List b7;
        if (activity == null || (b7 = b(activity, i7)) == null) {
            return;
        }
        b7.isEmpty();
    }

    public static boolean j(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
