// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import w.a;
import android.app.Activity;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import android.util.Log;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.List;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class u
{
    public static String a(final Context context, final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 31 && d(context, null, s)) {
            return s;
        }
        if (sdk_INT < 29) {
            if (d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        }
        else {
            if (sdk_INT >= 29 && d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
    }
    
    public static List b(final Context context, int n) {
        final ArrayList<String> list = new ArrayList<String>();
        String e2 = null;
        Label_0316: {
            String e = null;
            switch (n) {
                default: {
                    return list;
                }
                case 35: {
                    if (Build$VERSION.SDK_INT < 33) {
                        return list;
                    }
                    final String s = "android.permission.BODY_SENSORS_BACKGROUND";
                    if (d(context, list, "android.permission.BODY_SENSORS_BACKGROUND")) {
                        e = s;
                        break;
                    }
                    return list;
                }
                case 34: {
                    if (Build$VERSION.SDK_INT < 31) {
                        return list;
                    }
                    final String s2 = "android.permission.SCHEDULE_EXACT_ALARM";
                    if (d(context, list, "android.permission.SCHEDULE_EXACT_ALARM")) {
                        e = s2;
                        break;
                    }
                    return list;
                }
                case 33: {
                    if (Build$VERSION.SDK_INT < 33) {
                        return list;
                    }
                    final String s3 = "android.permission.READ_MEDIA_AUDIO";
                    if (d(context, list, "android.permission.READ_MEDIA_AUDIO")) {
                        e = s3;
                        break;
                    }
                    return list;
                }
                case 32: {
                    if (Build$VERSION.SDK_INT < 33) {
                        return list;
                    }
                    final String s4 = "android.permission.READ_MEDIA_VIDEO";
                    if (d(context, list, "android.permission.READ_MEDIA_VIDEO")) {
                        e = s4;
                        break;
                    }
                    return list;
                }
                case 31: {
                    if (Build$VERSION.SDK_INT < 33) {
                        return list;
                    }
                    final String s5 = "android.permission.NEARBY_WIFI_DEVICES";
                    if (d(context, list, "android.permission.NEARBY_WIFI_DEVICES")) {
                        e = s5;
                        break;
                    }
                    return list;
                }
                case 30: {
                    e2 = a(context, "android.permission.BLUETOOTH_CONNECT");
                    if (e2 != null) {
                        break Label_0316;
                    }
                    return list;
                }
                case 29: {
                    e2 = a(context, "android.permission.BLUETOOTH_ADVERTISE");
                    if (e2 != null) {
                        break Label_0316;
                    }
                    return list;
                }
                case 28: {
                    e2 = a(context, "android.permission.BLUETOOTH_SCAN");
                    if (e2 != null) {
                        break Label_0316;
                    }
                    return list;
                }
                case 27: {
                    final String s6 = "android.permission.ACCESS_NOTIFICATION_POLICY";
                    if (d(context, list, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                        e = s6;
                        break;
                    }
                    return list;
                }
                case 24: {
                    final String s7 = "android.permission.REQUEST_INSTALL_PACKAGES";
                    if (d(context, list, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                        e = s7;
                        break;
                    }
                    return list;
                }
                case 23: {
                    final String s8 = "android.permission.SYSTEM_ALERT_WINDOW";
                    if (d(context, list, "android.permission.SYSTEM_ALERT_WINDOW")) {
                        e = s8;
                        break;
                    }
                    return list;
                }
                case 22: {
                    if (Build$VERSION.SDK_INT < 30) {
                        return list;
                    }
                    final String s9 = "android.permission.MANAGE_EXTERNAL_STORAGE";
                    if (d(context, list, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                        e = s9;
                        break;
                    }
                    return list;
                }
                case 21: {
                    final String s10 = "android.permission.BLUETOOTH";
                    if (d(context, list, "android.permission.BLUETOOTH")) {
                        e = s10;
                        break;
                    }
                    return list;
                }
                case 19: {
                    if (Build$VERSION.SDK_INT < 29) {
                        return null;
                    }
                    final String s11 = "android.permission.ACTIVITY_RECOGNITION";
                    if (d(context, list, "android.permission.ACTIVITY_RECOGNITION")) {
                        e = s11;
                        break;
                    }
                    return list;
                }
                case 18: {
                    if (Build$VERSION.SDK_INT < 29) {
                        return null;
                    }
                    final String s12 = "android.permission.ACCESS_MEDIA_LOCATION";
                    if (d(context, list, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        e = s12;
                        break;
                    }
                    return list;
                }
                case 17: {
                    if (Build$VERSION.SDK_INT < 33) {
                        return list;
                    }
                    final String s13 = "android.permission.POST_NOTIFICATIONS";
                    if (d(context, list, "android.permission.POST_NOTIFICATIONS")) {
                        e = s13;
                        break;
                    }
                    return list;
                }
                case 16: {
                    final String s14 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                    if (d(context, list, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                        e = s14;
                        break;
                    }
                    return list;
                }
                case 15: {
                    if (d(context, list, "android.permission.READ_EXTERNAL_STORAGE")) {
                        list.add("android.permission.READ_EXTERNAL_STORAGE");
                    }
                    n = Build$VERSION.SDK_INT;
                    if (n >= 29 && (n != 29 || !r.a())) {
                        return list;
                    }
                    final String s15 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    if (d(context, list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                        e = s15;
                        break;
                    }
                    return list;
                }
                case 13: {
                    if (d(context, list, "android.permission.SEND_SMS")) {
                        list.add("android.permission.SEND_SMS");
                    }
                    if (d(context, list, "android.permission.RECEIVE_SMS")) {
                        list.add("android.permission.RECEIVE_SMS");
                    }
                    if (d(context, list, "android.permission.READ_SMS")) {
                        list.add("android.permission.READ_SMS");
                    }
                    if (d(context, list, "android.permission.RECEIVE_WAP_PUSH")) {
                        list.add("android.permission.RECEIVE_WAP_PUSH");
                    }
                    if (d(context, list, "android.permission.RECEIVE_MMS")) {
                        e2 = "android.permission.RECEIVE_MMS";
                        break Label_0316;
                    }
                    return list;
                }
                case 12: {
                    if (d(context, list, "android.permission.BODY_SENSORS")) {
                        e2 = "android.permission.BODY_SENSORS";
                        break Label_0316;
                    }
                    return list;
                }
                case 9: {
                    if (Build$VERSION.SDK_INT >= 33 && d(context, list, "android.permission.READ_MEDIA_IMAGES")) {
                        e2 = "android.permission.READ_MEDIA_IMAGES";
                        break Label_0316;
                    }
                    return list;
                }
                case 8: {
                    if (d(context, list, "android.permission.READ_PHONE_STATE")) {
                        list.add("android.permission.READ_PHONE_STATE");
                    }
                    n = Build$VERSION.SDK_INT;
                    if (n > 29 && d(context, list, "android.permission.READ_PHONE_NUMBERS")) {
                        list.add("android.permission.READ_PHONE_NUMBERS");
                    }
                    if (d(context, list, "android.permission.CALL_PHONE")) {
                        list.add("android.permission.CALL_PHONE");
                    }
                    if (d(context, list, "android.permission.READ_CALL_LOG")) {
                        list.add("android.permission.READ_CALL_LOG");
                    }
                    if (d(context, list, "android.permission.WRITE_CALL_LOG")) {
                        list.add("android.permission.WRITE_CALL_LOG");
                    }
                    if (d(context, list, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                        list.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                    }
                    if (d(context, list, "android.permission.USE_SIP")) {
                        list.add("android.permission.USE_SIP");
                    }
                    if (n >= 29 && d(context, list, "android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                        list.add("android.permission.BIND_CALL_REDIRECTION_SERVICE");
                    }
                    if (n >= 26 && d(context, list, "android.permission.ANSWER_PHONE_CALLS")) {
                        e2 = "android.permission.ANSWER_PHONE_CALLS";
                        break Label_0316;
                    }
                    return list;
                }
                case 7:
                case 14: {
                    if (d(context, list, "android.permission.RECORD_AUDIO")) {
                        e2 = "android.permission.RECORD_AUDIO";
                        break Label_0316;
                    }
                    return list;
                }
                case 6:
                case 11:
                case 20: {
                    return null;
                }
                case 3:
                case 4:
                case 5: {
                    if (n == 4 && Build$VERSION.SDK_INT >= 29) {
                        if (d(context, list, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            e2 = "android.permission.ACCESS_BACKGROUND_LOCATION";
                            break Label_0316;
                        }
                        return list;
                    }
                    else {
                        if (d(context, list, "android.permission.ACCESS_COARSE_LOCATION")) {
                            list.add("android.permission.ACCESS_COARSE_LOCATION");
                        }
                        if (d(context, list, "android.permission.ACCESS_FINE_LOCATION")) {
                            e2 = "android.permission.ACCESS_FINE_LOCATION";
                            break Label_0316;
                        }
                        return list;
                    }
                    break;
                }
                case 2: {
                    if (d(context, list, "android.permission.READ_CONTACTS")) {
                        list.add("android.permission.READ_CONTACTS");
                    }
                    if (d(context, list, "android.permission.WRITE_CONTACTS")) {
                        list.add("android.permission.WRITE_CONTACTS");
                    }
                    if (d(context, list, "android.permission.GET_ACCOUNTS")) {
                        e2 = "android.permission.GET_ACCOUNTS";
                        break Label_0316;
                    }
                    return list;
                }
                case 1: {
                    if (d(context, list, "android.permission.CAMERA")) {
                        e2 = "android.permission.CAMERA";
                        break Label_0316;
                    }
                    return list;
                }
                case 0: {
                    if (d(context, list, "android.permission.READ_CALENDAR")) {
                        list.add("android.permission.READ_CALENDAR");
                    }
                    if (d(context, list, "android.permission.WRITE_CALENDAR")) {
                        e2 = "android.permission.WRITE_CALENDAR";
                        break Label_0316;
                    }
                    return list;
                }
            }
            list.add(e);
            return list;
        }
        list.add(e2);
        return list;
    }
    
    public static PackageInfo c(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String packageName = context.getPackageName();
        if (sdk_INT >= 33) {
            return t.a(packageManager, packageName, s.a(4096L));
        }
        return packageManager.getPackageInfo(packageName, 4096);
    }
    
    public static boolean d(final Context context, final ArrayList list, final String s) {
        while (true) {
            if (list != null) {
                while (true) {
                    try {
                        final Iterator<String> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().equals(s)) {
                                return true;
                            }
                        }
                        if (context == null) {
                            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
                            return false;
                        }
                        final PackageInfo c = c(context);
                        if (c == null) {
                            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
                            return false;
                        }
                        final Iterator<String> iterator2 = new ArrayList<String>(Arrays.asList(c.requestedPermissions)).iterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().equals(s)) {
                                return true;
                            }
                        }
                        return false;
                        final Exception ex;
                        Log.d("permissions_handler", "Unable to check manifest for permission: ", (Throwable)ex);
                        return false;
                    }
                    catch (Exception ex2) {}
                    final Exception ex2;
                    final Exception ex = ex2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public static boolean e(final Activity activity, final String s) {
        return activity != null && (a.m(activity, s) ^ true);
    }
    
    public static int f(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 2133799037: {
                if (!s.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    break;
                }
                n = 41;
                break;
            }
            case 2114579147: {
                if (!s.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    break;
                }
                n = 40;
                break;
            }
            case 2062356686: {
                if (!s.equals("android.permission.BLUETOOTH_SCAN")) {
                    break;
                }
                n = 39;
                break;
            }
            case 2024715147: {
                if (!s.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    break;
                }
                n = 38;
                break;
            }
            case 1977429404: {
                if (!s.equals("android.permission.READ_CONTACTS")) {
                    break;
                }
                n = 37;
                break;
            }
            case 1831139720: {
                if (!s.equals("android.permission.RECORD_AUDIO")) {
                    break;
                }
                n = 36;
                break;
            }
            case 1780337063: {
                if (!s.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    break;
                }
                n = 35;
                break;
            }
            case 1777263169: {
                if (!s.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    break;
                }
                n = 34;
                break;
            }
            case 1365911975: {
                if (!s.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    break;
                }
                n = 33;
                break;
            }
            case 1271781903: {
                if (!s.equals("android.permission.GET_ACCOUNTS")) {
                    break;
                }
                n = 32;
                break;
            }
            case 1166454870: {
                if (!s.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    break;
                }
                n = 31;
                break;
            }
            case 970694249: {
                if (!s.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    break;
                }
                n = 30;
                break;
            }
            case 784519842: {
                if (!s.equals("android.permission.USE_SIP")) {
                    break;
                }
                n = 29;
                break;
            }
            case 710297143: {
                if (!s.equals("android.permission.READ_MEDIA_VIDEO")) {
                    break;
                }
                n = 28;
                break;
            }
            case 691260818: {
                if (!s.equals("android.permission.READ_MEDIA_AUDIO")) {
                    break;
                }
                n = 27;
                break;
            }
            case 610633091: {
                if (!s.equals("android.permission.WRITE_CALL_LOG")) {
                    break;
                }
                n = 26;
                break;
            }
            case 603653886: {
                if (!s.equals("android.permission.WRITE_CALENDAR")) {
                    break;
                }
                n = 25;
                break;
            }
            case 463403621: {
                if (!s.equals("android.permission.CAMERA")) {
                    break;
                }
                n = 24;
                break;
            }
            case 361658321: {
                if (!s.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    break;
                }
                n = 23;
                break;
            }
            case 214526995: {
                if (!s.equals("android.permission.WRITE_CONTACTS")) {
                    break;
                }
                n = 22;
                break;
            }
            case 175802396: {
                if (!s.equals("android.permission.READ_MEDIA_IMAGES")) {
                    break;
                }
                n = 21;
                break;
            }
            case 112197485: {
                if (!s.equals("android.permission.CALL_PHONE")) {
                    break;
                }
                n = 20;
                break;
            }
            case 52602690: {
                if (!s.equals("android.permission.SEND_SMS")) {
                    break;
                }
                n = 19;
                break;
            }
            case -5573545: {
                if (!s.equals("android.permission.READ_PHONE_STATE")) {
                    break;
                }
                n = 18;
                break;
            }
            case -63024214: {
                if (!s.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    break;
                }
                n = 17;
                break;
            }
            case -406040016: {
                if (!s.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    break;
                }
                n = 16;
                break;
            }
            case -798669607: {
                if (!s.equals("android.permission.BLUETOOTH_CONNECT")) {
                    break;
                }
                n = 15;
                break;
            }
            case -895673731: {
                if (!s.equals("android.permission.RECEIVE_SMS")) {
                    break;
                }
                n = 14;
                break;
            }
            case -895679497: {
                if (!s.equals("android.permission.RECEIVE_MMS")) {
                    break;
                }
                n = 13;
                break;
            }
            case -901151997: {
                if (!s.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    break;
                }
                n = 12;
                break;
            }
            case -909527021: {
                if (!s.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    break;
                }
                n = 11;
                break;
            }
            case -1164582768: {
                if (!s.equals("android.permission.READ_PHONE_NUMBERS")) {
                    break;
                }
                n = 10;
                break;
            }
            case -1238066820: {
                if (!s.equals("android.permission.BODY_SENSORS")) {
                    break;
                }
                n = 9;
                break;
            }
            case -1479758289: {
                if (!s.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    break;
                }
                n = 8;
                break;
            }
            case -1561629405: {
                if (!s.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1783097621: {
                if (!s.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1813079487: {
                if (!s.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1888586689: {
                if (!s.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1921431796: {
                if (!s.equals("android.permission.READ_CALL_LOG")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1925850455: {
                if (!s.equals("android.permission.POST_NOTIFICATIONS")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1928411001: {
                if (!s.equals("android.permission.READ_CALENDAR")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2062386608: {
                if (!s.equals("android.permission.READ_SMS")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 20;
            }
            case 40: {
                return 18;
            }
            case 39: {
                return 28;
            }
            case 38: {
                return 4;
            }
            case 36: {
                return 7;
            }
            case 35: {
                return 19;
            }
            case 34: {
                return 24;
            }
            case 31: {
                return 29;
            }
            case 30: {
                return 34;
            }
            case 28: {
                return 32;
            }
            case 27: {
                return 33;
            }
            case 24: {
                return 1;
            }
            case 23: {
                return 35;
            }
            case 22:
            case 32:
            case 37: {
                return 2;
            }
            case 21: {
                return 9;
            }
            case 16:
            case 33: {
                return 15;
            }
            case 15: {
                return 30;
            }
            case 11: {
                return 31;
            }
            case 9: {
                return 12;
            }
            case 7: {
                return 23;
            }
            case 6: {
                return 27;
            }
            case 5: {
                return 22;
            }
            case 4:
            case 17: {
                return 3;
            }
            case 3:
            case 10:
            case 12:
            case 18:
            case 20:
            case 26:
            case 29:
            case 41: {
                return 8;
            }
            case 2: {
                return 17;
            }
            case 1:
            case 25: {
                return 0;
            }
            case 0:
            case 8:
            case 13:
            case 14:
            case 19: {
                return 13;
            }
        }
    }
    
    public static void g(final Context context, final String s) {
        context.getSharedPreferences(s, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }
    
    public static int h(final Activity activity, final String s, int n) {
        final int n2 = 1;
        if (n != -1) {
            return 1;
        }
        final boolean j = j((Context)activity, s);
        n = ((e(activity, s) ^ true) ? 1 : 0);
        if (j) {
            if (n == 0) {
                n = n2;
            }
            else {
                n = 0;
            }
        }
        if (!j && n != 0) {
            g((Context)activity, s);
        }
        if (j && n != 0) {
            return 4;
        }
        return 0;
    }
    
    public static void i(final Activity activity, final int n) {
        if (activity == null) {
            return;
        }
        final List b = b((Context)activity, n);
        if (b != null) {
            b.isEmpty();
        }
    }
    
    public static boolean j(final Context context, final String s) {
        return context.getSharedPreferences(s, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
