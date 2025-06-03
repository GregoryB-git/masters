/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package w1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w.a;
import w1.r;
import w1.s;
import w1.t;

public abstract class u {
    public static String a(Context context, String string2) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 31 && u.d(context, null, string2)) {
            return string2;
        }
        if (n8 < 29) {
            if (u.d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (u.d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        }
        if (n8 >= 29 && u.d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static List b(Context var0, int var1_1) {
        block52 : {
            var3_2 = new ArrayList();
            switch (var1_1) {
                default: {
                    return var3_2;
                }
                case 35: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    var2_3 = "android.permission.BODY_SENSORS_BACKGROUND";
                    if (u.d((Context)var0, var3_2, "android.permission.BODY_SENSORS_BACKGROUND") == false) return var3_2;
                    var0 = var2_3;
                    ** GOTO lbl107
                }
                case 34: {
                    if (Build.VERSION.SDK_INT < 31) return var3_2;
                    var2_4 = "android.permission.SCHEDULE_EXACT_ALARM";
                    if (u.d((Context)var0, var3_2, "android.permission.SCHEDULE_EXACT_ALARM") == false) return var3_2;
                    var0 = var2_4;
                    ** GOTO lbl107
                }
                case 33: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    var2_5 = "android.permission.READ_MEDIA_AUDIO";
                    if (u.d((Context)var0, var3_2, "android.permission.READ_MEDIA_AUDIO") == false) return var3_2;
                    var0 = var2_5;
                    ** GOTO lbl107
                }
                case 32: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    var2_6 = "android.permission.READ_MEDIA_VIDEO";
                    if (u.d((Context)var0, var3_2, "android.permission.READ_MEDIA_VIDEO") == false) return var3_2;
                    var0 = var2_6;
                    ** GOTO lbl107
                }
                case 31: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    var2_7 = "android.permission.NEARBY_WIFI_DEVICES";
                    if (u.d((Context)var0, var3_2, "android.permission.NEARBY_WIFI_DEVICES") == false) return var3_2;
                    var0 = var2_7;
                    ** GOTO lbl107
                }
                case 30: {
                    var0 = u.a((Context)var0, "android.permission.BLUETOOTH_CONNECT");
                    if (var0 == null) return var3_2;
                    break block52;
                }
                case 29: {
                    var0 = u.a((Context)var0, "android.permission.BLUETOOTH_ADVERTISE");
                    if (var0 == null) return var3_2;
                    break block52;
                }
                case 28: {
                    var0 = u.a((Context)var0, "android.permission.BLUETOOTH_SCAN");
                    if (var0 == null) return var3_2;
                    break block52;
                }
                case 27: {
                    var2_8 = "android.permission.ACCESS_NOTIFICATION_POLICY";
                    if (u.d((Context)var0, var3_2, "android.permission.ACCESS_NOTIFICATION_POLICY") == false) return var3_2;
                    var0 = var2_8;
                    ** GOTO lbl107
                }
                case 24: {
                    var2_9 = "android.permission.REQUEST_INSTALL_PACKAGES";
                    if (u.d((Context)var0, var3_2, "android.permission.REQUEST_INSTALL_PACKAGES") == false) return var3_2;
                    var0 = var2_9;
                    ** GOTO lbl107
                }
                case 23: {
                    var2_10 = "android.permission.SYSTEM_ALERT_WINDOW";
                    if (u.d((Context)var0, var3_2, "android.permission.SYSTEM_ALERT_WINDOW") == false) return var3_2;
                    var0 = var2_10;
                    ** GOTO lbl107
                }
                case 22: {
                    if (Build.VERSION.SDK_INT < 30) return var3_2;
                    var2_11 = "android.permission.MANAGE_EXTERNAL_STORAGE";
                    if (u.d((Context)var0, var3_2, "android.permission.MANAGE_EXTERNAL_STORAGE") == false) return var3_2;
                    var0 = var2_11;
                    ** GOTO lbl107
                }
                case 21: {
                    var2_12 = "android.permission.BLUETOOTH";
                    if (u.d((Context)var0, var3_2, "android.permission.BLUETOOTH") == false) return var3_2;
                    var0 = var2_12;
                    ** GOTO lbl107
                }
                case 19: {
                    if (Build.VERSION.SDK_INT < 29) {
                        return null;
                    }
                    var2_13 = "android.permission.ACTIVITY_RECOGNITION";
                    if (u.d((Context)var0, var3_2, "android.permission.ACTIVITY_RECOGNITION") == false) return var3_2;
                    var0 = var2_13;
                    ** GOTO lbl107
                }
                case 18: {
                    if (Build.VERSION.SDK_INT < 29) {
                        return null;
                    }
                    var2_14 = "android.permission.ACCESS_MEDIA_LOCATION";
                    if (u.d((Context)var0, var3_2, "android.permission.ACCESS_MEDIA_LOCATION") == false) return var3_2;
                    var0 = var2_14;
                    ** GOTO lbl107
                }
                case 17: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    var2_15 = "android.permission.POST_NOTIFICATIONS";
                    if (u.d((Context)var0, var3_2, "android.permission.POST_NOTIFICATIONS") == false) return var3_2;
                    var0 = var2_15;
                    ** GOTO lbl107
                }
                case 16: {
                    var2_16 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                    if (u.d((Context)var0, var3_2, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") == false) return var3_2;
                    var0 = var2_16;
                    ** GOTO lbl107
                }
                case 15: {
                    if (u.d((Context)var0, var3_2, "android.permission.READ_EXTERNAL_STORAGE")) {
                        var3_2.add((Object)"android.permission.READ_EXTERNAL_STORAGE");
                    }
                    if ((var1_1 = Build.VERSION.SDK_INT) >= 29) {
                        if (var1_1 != 29) return var3_2;
                        if (r.a() == false) return var3_2;
                    }
                    var2_17 = "android.permission.WRITE_EXTERNAL_STORAGE";
                    if (u.d((Context)var0, var3_2, "android.permission.WRITE_EXTERNAL_STORAGE") == false) return var3_2;
                    var0 = var2_17;
lbl107: // 15 sources:
                    var3_2.add(var0);
                    return var3_2;
                }
                case 13: {
                    if (u.d((Context)var0, var3_2, "android.permission.SEND_SMS")) {
                        var3_2.add((Object)"android.permission.SEND_SMS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.RECEIVE_SMS")) {
                        var3_2.add((Object)"android.permission.RECEIVE_SMS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.READ_SMS")) {
                        var3_2.add((Object)"android.permission.READ_SMS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.RECEIVE_WAP_PUSH")) {
                        var3_2.add((Object)"android.permission.RECEIVE_WAP_PUSH");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.RECEIVE_MMS") == false) return var3_2;
                    var0 = "android.permission.RECEIVE_MMS";
                    break block52;
                }
                case 12: {
                    if (u.d((Context)var0, var3_2, "android.permission.BODY_SENSORS") == false) return var3_2;
                    var0 = "android.permission.BODY_SENSORS";
                    break block52;
                }
                case 9: {
                    if (Build.VERSION.SDK_INT < 33) return var3_2;
                    if (u.d((Context)var0, var3_2, "android.permission.READ_MEDIA_IMAGES") == false) return var3_2;
                    var0 = "android.permission.READ_MEDIA_IMAGES";
                    break block52;
                }
                case 8: {
                    if (u.d((Context)var0, var3_2, "android.permission.READ_PHONE_STATE")) {
                        var3_2.add((Object)"android.permission.READ_PHONE_STATE");
                    }
                    if ((var1_1 = Build.VERSION.SDK_INT) > 29 && u.d((Context)var0, var3_2, "android.permission.READ_PHONE_NUMBERS")) {
                        var3_2.add((Object)"android.permission.READ_PHONE_NUMBERS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.CALL_PHONE")) {
                        var3_2.add((Object)"android.permission.CALL_PHONE");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.READ_CALL_LOG")) {
                        var3_2.add((Object)"android.permission.READ_CALL_LOG");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.WRITE_CALL_LOG")) {
                        var3_2.add((Object)"android.permission.WRITE_CALL_LOG");
                    }
                    if (u.d((Context)var0, var3_2, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                        var3_2.add((Object)"com.android.voicemail.permission.ADD_VOICEMAIL");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.USE_SIP")) {
                        var3_2.add((Object)"android.permission.USE_SIP");
                    }
                    if (var1_1 >= 29 && u.d((Context)var0, var3_2, "android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                        var3_2.add((Object)"android.permission.BIND_CALL_REDIRECTION_SERVICE");
                    }
                    if (var1_1 < 26) return var3_2;
                    if (u.d((Context)var0, var3_2, "android.permission.ANSWER_PHONE_CALLS") == false) return var3_2;
                    var0 = "android.permission.ANSWER_PHONE_CALLS";
                    break block52;
                }
                case 7: 
                case 14: {
                    if (u.d((Context)var0, var3_2, "android.permission.RECORD_AUDIO") == false) return var3_2;
                    var0 = "android.permission.RECORD_AUDIO";
                    break block52;
                }
                case 6: 
                case 11: 
                case 20: {
                    return null;
                }
                case 3: 
                case 4: 
                case 5: {
                    if (var1_1 == 4 && Build.VERSION.SDK_INT >= 29) {
                        if (u.d((Context)var0, var3_2, "android.permission.ACCESS_BACKGROUND_LOCATION") == false) return var3_2;
                        var0 = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    } else {
                        if (u.d((Context)var0, var3_2, "android.permission.ACCESS_COARSE_LOCATION")) {
                            var3_2.add((Object)"android.permission.ACCESS_COARSE_LOCATION");
                        }
                        if (u.d((Context)var0, var3_2, "android.permission.ACCESS_FINE_LOCATION") == false) return var3_2;
                        var0 = "android.permission.ACCESS_FINE_LOCATION";
                    }
                    break block52;
                }
                case 2: {
                    if (u.d((Context)var0, var3_2, "android.permission.READ_CONTACTS")) {
                        var3_2.add((Object)"android.permission.READ_CONTACTS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.WRITE_CONTACTS")) {
                        var3_2.add((Object)"android.permission.WRITE_CONTACTS");
                    }
                    if (u.d((Context)var0, var3_2, "android.permission.GET_ACCOUNTS") == false) return var3_2;
                    var0 = "android.permission.GET_ACCOUNTS";
                    break block52;
                }
                case 1: {
                    if (u.d((Context)var0, var3_2, "android.permission.CAMERA") == false) return var3_2;
                    var0 = "android.permission.CAMERA";
                    break block52;
                }
                case 0: 
            }
            if (u.d((Context)var0, var3_2, "android.permission.READ_CALENDAR")) {
                var3_2.add((Object)"android.permission.READ_CALENDAR");
            }
            if (u.d((Context)var0, var3_2, "android.permission.WRITE_CALENDAR") == false) return var3_2;
            var0 = "android.permission.WRITE_CALENDAR";
        }
        var3_2.add(var0);
        return var3_2;
    }

    public static PackageInfo c(Context object) {
        PackageManager packageManager = object.getPackageManager();
        int n8 = Build.VERSION.SDK_INT;
        object = object.getPackageName();
        if (n8 >= 33) {
            return t.a(packageManager, (String)object, s.a(4096L));
        }
        return packageManager.getPackageInfo((String)object, 4096);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean d(Context var0, ArrayList var1_2, String var2_3) {
        if (var1_2 == null) ** GOTO lbl7
        try {
            var1_2 = var1_2.iterator();
            while (var1_2.hasNext()) {
                if (!((String)var1_2.next()).equals((Object)var2_3)) continue;
                return true;
            }
lbl7: // 2 sources:
            if (var0 == null) {
                Log.d((String)"permissions_handler", (String)"Unable to detect current Activity or App Context.");
                return false;
            }
            if ((var0 = u.c(var0)) == null) {
                Log.d((String)"permissions_handler", (String)"Unable to get Package info, will not be able to determine permissions to request.");
                return false;
            }
            var0 = new ArrayList((Collection)Arrays.asList((Object[])var0.requestedPermissions)).iterator();
            do {
                if (var0.hasNext() == false) return false;
            } while (!(var3_4 = ((String)var0.next()).equals((Object)var2_3)));
            return true;
        }
        catch (Exception var0_1) {}
        Log.d((String)"permissions_handler", (String)"Unable to check manifest for permission: ", (Throwable)var0_1);
        return false;
    }

    public static boolean e(Activity activity, String string2) {
        if (activity == null) {
            return false;
        }
        return a.m(activity, string2) ^ true;
    }

    public static int f(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2133799037: {
                if (!string2.equals((Object)"com.android.voicemail.permission.ADD_VOICEMAIL")) break;
                n9 = 41;
                break;
            }
            case 2114579147: {
                if (!string2.equals((Object)"android.permission.ACCESS_MEDIA_LOCATION")) break;
                n9 = 40;
                break;
            }
            case 2062356686: {
                if (!string2.equals((Object)"android.permission.BLUETOOTH_SCAN")) break;
                n9 = 39;
                break;
            }
            case 2024715147: {
                if (!string2.equals((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) break;
                n9 = 38;
                break;
            }
            case 1977429404: {
                if (!string2.equals((Object)"android.permission.READ_CONTACTS")) break;
                n9 = 37;
                break;
            }
            case 1831139720: {
                if (!string2.equals((Object)"android.permission.RECORD_AUDIO")) break;
                n9 = 36;
                break;
            }
            case 1780337063: {
                if (!string2.equals((Object)"android.permission.ACTIVITY_RECOGNITION")) break;
                n9 = 35;
                break;
            }
            case 1777263169: {
                if (!string2.equals((Object)"android.permission.REQUEST_INSTALL_PACKAGES")) break;
                n9 = 34;
                break;
            }
            case 1365911975: {
                if (!string2.equals((Object)"android.permission.WRITE_EXTERNAL_STORAGE")) break;
                n9 = 33;
                break;
            }
            case 1271781903: {
                if (!string2.equals((Object)"android.permission.GET_ACCOUNTS")) break;
                n9 = 32;
                break;
            }
            case 1166454870: {
                if (!string2.equals((Object)"android.permission.BLUETOOTH_ADVERTISE")) break;
                n9 = 31;
                break;
            }
            case 970694249: {
                if (!string2.equals((Object)"android.permission.SCHEDULE_EXACT_ALARM")) break;
                n9 = 30;
                break;
            }
            case 784519842: {
                if (!string2.equals((Object)"android.permission.USE_SIP")) break;
                n9 = 29;
                break;
            }
            case 710297143: {
                if (!string2.equals((Object)"android.permission.READ_MEDIA_VIDEO")) break;
                n9 = 28;
                break;
            }
            case 691260818: {
                if (!string2.equals((Object)"android.permission.READ_MEDIA_AUDIO")) break;
                n9 = 27;
                break;
            }
            case 610633091: {
                if (!string2.equals((Object)"android.permission.WRITE_CALL_LOG")) break;
                n9 = 26;
                break;
            }
            case 603653886: {
                if (!string2.equals((Object)"android.permission.WRITE_CALENDAR")) break;
                n9 = 25;
                break;
            }
            case 463403621: {
                if (!string2.equals((Object)"android.permission.CAMERA")) break;
                n9 = 24;
                break;
            }
            case 361658321: {
                if (!string2.equals((Object)"android.permission.BODY_SENSORS_BACKGROUND")) break;
                n9 = 23;
                break;
            }
            case 214526995: {
                if (!string2.equals((Object)"android.permission.WRITE_CONTACTS")) break;
                n9 = 22;
                break;
            }
            case 175802396: {
                if (!string2.equals((Object)"android.permission.READ_MEDIA_IMAGES")) break;
                n9 = 21;
                break;
            }
            case 112197485: {
                if (!string2.equals((Object)"android.permission.CALL_PHONE")) break;
                n9 = 20;
                break;
            }
            case 52602690: {
                if (!string2.equals((Object)"android.permission.SEND_SMS")) break;
                n9 = 19;
                break;
            }
            case -5573545: {
                if (!string2.equals((Object)"android.permission.READ_PHONE_STATE")) break;
                n9 = 18;
                break;
            }
            case -63024214: {
                if (!string2.equals((Object)"android.permission.ACCESS_COARSE_LOCATION")) break;
                n9 = 17;
                break;
            }
            case -406040016: {
                if (!string2.equals((Object)"android.permission.READ_EXTERNAL_STORAGE")) break;
                n9 = 16;
                break;
            }
            case -798669607: {
                if (!string2.equals((Object)"android.permission.BLUETOOTH_CONNECT")) break;
                n9 = 15;
                break;
            }
            case -895673731: {
                if (!string2.equals((Object)"android.permission.RECEIVE_SMS")) break;
                n9 = 14;
                break;
            }
            case -895679497: {
                if (!string2.equals((Object)"android.permission.RECEIVE_MMS")) break;
                n9 = 13;
                break;
            }
            case -901151997: {
                if (!string2.equals((Object)"android.permission.BIND_CALL_REDIRECTION_SERVICE")) break;
                n9 = 12;
                break;
            }
            case -909527021: {
                if (!string2.equals((Object)"android.permission.NEARBY_WIFI_DEVICES")) break;
                n9 = 11;
                break;
            }
            case -1164582768: {
                if (!string2.equals((Object)"android.permission.READ_PHONE_NUMBERS")) break;
                n9 = 10;
                break;
            }
            case -1238066820: {
                if (!string2.equals((Object)"android.permission.BODY_SENSORS")) break;
                n9 = 9;
                break;
            }
            case -1479758289: {
                if (!string2.equals((Object)"android.permission.RECEIVE_WAP_PUSH")) break;
                n9 = 8;
                break;
            }
            case -1561629405: {
                if (!string2.equals((Object)"android.permission.SYSTEM_ALERT_WINDOW")) break;
                n9 = 7;
                break;
            }
            case -1783097621: {
                if (!string2.equals((Object)"android.permission.ACCESS_NOTIFICATION_POLICY")) break;
                n9 = 6;
                break;
            }
            case -1813079487: {
                if (!string2.equals((Object)"android.permission.MANAGE_EXTERNAL_STORAGE")) break;
                n9 = 5;
                break;
            }
            case -1888586689: {
                if (!string2.equals((Object)"android.permission.ACCESS_FINE_LOCATION")) break;
                n9 = 4;
                break;
            }
            case -1921431796: {
                if (!string2.equals((Object)"android.permission.READ_CALL_LOG")) break;
                n9 = 3;
                break;
            }
            case -1925850455: {
                if (!string2.equals((Object)"android.permission.POST_NOTIFICATIONS")) break;
                n9 = 2;
                break;
            }
            case -1928411001: {
                if (!string2.equals((Object)"android.permission.READ_CALENDAR")) break;
                n9 = 1;
                break;
            }
            case -2062386608: {
                if (!string2.equals((Object)"android.permission.READ_SMS")) break;
                n9 = 0;
            }
        }
        switch (n9) {
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
            case 19: 
        }
        return 13;
    }

    public static void g(Context context, String string2) {
        context.getSharedPreferences(string2, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    public static int h(Activity activity, String string2, int n8) {
        int n9 = 1;
        if (n8 == -1) {
            boolean bl = u.j((Context)activity, string2);
            n8 = u.e(activity, string2) ^ true;
            if (bl) {
                n8 = n8 == 0 ? n9 : 0;
            }
            if (!bl && n8 != 0) {
                u.g((Context)activity, string2);
            }
            if (bl && n8 != 0) {
                return 4;
            }
            return 0;
        }
        return 1;
    }

    public static void i(Activity activity, int n8) {
        if (activity == null) {
            return;
        }
        if ((activity = u.b((Context)activity, n8)) != null) {
            activity.isEmpty();
        }
    }

    public static boolean j(Context context, String string2) {
        return context.getSharedPreferences(string2, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}

