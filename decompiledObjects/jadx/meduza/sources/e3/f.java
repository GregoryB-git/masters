package e3;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u.u;

/* loaded from: classes.dex */
public final class f implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3887a;

    /* renamed from: b, reason: collision with root package name */
    public a f3888b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f3889c;

    /* renamed from: d, reason: collision with root package name */
    public int f3890d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f3891e;

    @FunctionalInterface
    public interface a {
    }

    public f(Context context) {
        this.f3887a = context;
    }

    public final int a() {
        ArrayList c10 = g.c(this.f3887a, 21);
        if (!(c10 == null || c10.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(int i10) {
        int b10;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        int i11;
        Integer valueOf;
        boolean isExternalStorageManager;
        int i12 = 0;
        if (i10 == 17) {
            if (Build.VERSION.SDK_INT < 33) {
                return new u(this.f3887a).a() ? 1 : 0;
            }
            if (this.f3887a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                return 1;
            }
            return g.b(this.f3889c, "android.permission.POST_NOTIFICATIONS");
        }
        if (i10 == 21) {
            return a();
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a();
        }
        if ((i10 == 37 || i10 == 0) && !c()) {
            return 0;
        }
        ArrayList c10 = g.c(this.f3887a, i10);
        if (c10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (c10.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + c10 + i10);
            return (i10 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if (this.f3887a.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i10 == 16) {
                    String packageName = this.f3887a.getPackageName();
                    PowerManager powerManager = (PowerManager) this.f3887a.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        valueOf = Integer.valueOf(i12);
                        hashSet.add(valueOf);
                    }
                    hashSet.add(1);
                } else {
                    if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            hashSet.add(2);
                        }
                        isExternalStorageManager = Environment.isExternalStorageManager();
                        i11 = isExternalStorageManager;
                    } else if (i10 == 23) {
                        i11 = Settings.canDrawOverlays(this.f3887a);
                    } else {
                        if (i10 == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                canRequestPackageInstalls = this.f3887a.getPackageManager().canRequestPackageInstalls();
                                i11 = canRequestPackageInstalls;
                            }
                        } else if (i10 == 27) {
                            i11 = ((NotificationManager) this.f3887a.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).isNotificationPolicyAccessGranted();
                        } else if (i10 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                canScheduleExactAlarms = ((AlarmManager) this.f3887a.getSystemService("alarm")).canScheduleExactAlarms();
                                i11 = canScheduleExactAlarms;
                            }
                            hashSet.add(1);
                        } else if (i10 == 9 || i10 == 32) {
                            int checkSelfPermission = v.a.checkSelfPermission(this.f3887a, str);
                            if ((Build.VERSION.SDK_INT >= 34 ? v.a.checkSelfPermission(this.f3887a, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : checkSelfPermission) != 0 || checkSelfPermission != -1) {
                                b10 = checkSelfPermission != 0 ? g.b(this.f3889c, str) : 3;
                                hashSet.add(1);
                            }
                            hashSet.add(Integer.valueOf(b10));
                        } else if (v.a.checkSelfPermission(this.f3887a, str) != 0) {
                            i11 = g.b(this.f3889c, str);
                        }
                        hashSet.add(valueOf);
                    }
                    valueOf = Integer.valueOf(i11);
                    hashSet.add(valueOf);
                }
                i12 = 0;
            }
            if (!hashSet.isEmpty()) {
                return g.e(hashSet).intValue();
            }
        }
        return 1;
    }

    public final boolean c() {
        ArrayList c10 = g.c(this.f3887a, 37);
        boolean z10 = c10 != null && c10.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = c10 != null && c10.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.isIgnoringBatteryOptimizations(r5) != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            android.app.Activity r5 = r3.f3889c
            r6 = 0
            if (r5 != 0) goto L6
            return r6
        L6:
            java.util.HashMap r0 = r3.f3891e
            if (r0 != 0) goto Ld
            r3.f3890d = r6
            return r6
        Ld:
            r0 = 209(0xd1, float:2.93E-43)
            r1 = 1
            if (r4 != r0) goto L2d
            r4 = 16
            android.content.Context r5 = r3.f3887a
            java.lang.String r5 = r5.getPackageName()
            android.content.Context r0 = r3.f3887a
            java.lang.String r2 = "power"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            if (r0 == 0) goto L8d
            boolean r5 = r0.isIgnoringBatteryOptimizations(r5)
            if (r5 == 0) goto L8d
            goto L8c
        L2d:
            r0 = 210(0xd2, float:2.94E-43)
            if (r4 != r0) goto L3f
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L3e
            boolean r6 = e0.g0.i()
            r4 = 22
            goto L8d
        L3e:
            return r6
        L3f:
            r0 = 211(0xd3, float:2.96E-43)
            if (r4 != r0) goto L4a
            boolean r6 = android.provider.Settings.canDrawOverlays(r5)
            r4 = 23
            goto L8d
        L4a:
            r0 = 212(0xd4, float:2.97E-43)
            if (r4 != r0) goto L60
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r4 < r0) goto L5f
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            boolean r6 = c0.b.z(r4)
            r4 = 24
            goto L8d
        L5f:
            return r6
        L60:
            r0 = 213(0xd5, float:2.98E-43)
            if (r4 != r0) goto L73
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r5.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            boolean r6 = r4.isNotificationPolicyAccessGranted()
            r4 = 27
            goto L8d
        L73:
            r0 = 214(0xd6, float:3.0E-43)
            if (r4 != r0) goto Laf
            r4 = 34
            java.lang.String r6 = "alarm"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r6 < r0) goto L8c
            boolean r6 = a4.r.h(r5)
            goto L8d
        L8c:
            r6 = r1
        L8d:
            java.util.HashMap r5 = r3.f3891e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r4, r6)
            int r4 = r3.f3890d
            int r4 = r4 - r1
            r3.f3890d = r4
            e3.f$a r5 = r3.f3888b
            if (r5 == 0) goto Lae
            if (r4 != 0) goto Lae
            java.util.HashMap r4 = r3.f3891e
            e3.c r5 = (e3.c) r5
            io.flutter.plugin.common.MethodChannel$Result r5 = r5.f3879a
            r5.success(r4)
        Lae:
            return r1
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.onActivityResult(int, int, android.content.Intent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        char c10;
        char c11;
        int i11;
        HashMap hashMap;
        int valueOf;
        int b10;
        int valueOf2;
        HashMap hashMap2;
        int i12;
        Integer valueOf3;
        if (i10 != 24) {
            this.f3890d = 0;
            return false;
        }
        if (this.f3891e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
        if (indexOf >= 0) {
            int f = g.f(this.f3889c, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
            this.f3891e.put(36, Integer.valueOf(f));
            int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
            if (indexOf2 >= 0) {
                int f10 = g.f(this.f3889c, "android.permission.READ_CALENDAR", iArr[indexOf2]);
                Integer valueOf4 = Integer.valueOf(f);
                Integer valueOf5 = Integer.valueOf(f10);
                HashSet hashSet = new HashSet();
                hashSet.add(valueOf4);
                hashSet.add(valueOf5);
                int intValue = g.e(hashSet).intValue();
                this.f3891e.put(37, Integer.valueOf(intValue));
                this.f3891e.put(0, Integer.valueOf(intValue));
            }
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            String str = strArr[i13];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals("android.permission.READ_SMS")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1928411001:
                        if (str.equals("android.permission.READ_CALENDAR")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1925850455:
                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1921431796:
                        if (str.equals("android.permission.READ_CALL_LOG")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1888586689:
                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                            c11 = 4;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1813079487:
                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1783097621:
                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                            c11 = 6;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1561629405:
                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                            c11 = 7;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1479758289:
                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                            c11 = '\b';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1238066820:
                        if (str.equals("android.permission.BODY_SENSORS")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1164582768:
                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                            c11 = '\n';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -909527021:
                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                            c11 = 11;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -895679497:
                        if (str.equals("android.permission.RECEIVE_MMS")) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -895673731:
                        if (str.equals("android.permission.RECEIVE_SMS")) {
                            c10 = '\r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -798669607:
                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                            c10 = 14;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -406040016:
                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            c11 = 15;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -63024214:
                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                            c11 = 16;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -5573545:
                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                            c11 = 17;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 52602690:
                        if (str.equals("android.permission.SEND_SMS")) {
                            c11 = 18;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 112197485:
                        if (str.equals("android.permission.CALL_PHONE")) {
                            c11 = 19;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 175802396:
                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                            c10 = 20;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 214526995:
                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                            c11 = 21;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 361658321:
                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                            c10 = 22;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 463403621:
                        if (str.equals("android.permission.CAMERA")) {
                            c10 = 23;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 603653886:
                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                            c10 = 24;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 610633091:
                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                            c11 = 25;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 691260818:
                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                            c11 = 26;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 710297143:
                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                            c10 = 27;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 784519842:
                        if (str.equals("android.permission.USE_SIP")) {
                            c10 = 28;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 970694249:
                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                            c10 = 29;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1166454870:
                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                            c10 = 30;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1271781903:
                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                            c11 = 31;
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1365911975:
                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            c10 = ' ';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1777263169:
                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                            c11 = '!';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1780337063:
                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                            c11 = '\"';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1831139720:
                        if (str.equals("android.permission.RECORD_AUDIO")) {
                            c11 = '#';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1977429404:
                        if (str.equals("android.permission.READ_CONTACTS")) {
                            c10 = '$';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2024715147:
                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            c10 = '%';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2062356686:
                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                            c11 = '&';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2114579147:
                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                            c11 = '\'';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2133799037:
                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                            c11 = '(';
                            c10 = c11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case '\b':
                    case '\f':
                    case '\r':
                    case 18:
                        i11 = 13;
                        break;
                    case 1:
                    case 24:
                        i11 = 0;
                        break;
                    case 2:
                        i11 = 17;
                        break;
                    case 3:
                    case '\n':
                    case 17:
                    case 19:
                    case 25:
                    case 28:
                    case '(':
                        i11 = 8;
                        break;
                    case 4:
                    case 16:
                        i11 = 3;
                        break;
                    case 5:
                        i11 = 22;
                        break;
                    case 6:
                        i11 = 27;
                        break;
                    case 7:
                        i11 = 23;
                        break;
                    case '\t':
                        i11 = 12;
                        break;
                    case 11:
                        i11 = 31;
                        break;
                    case 14:
                        i11 = 30;
                        break;
                    case 15:
                    case ' ':
                        i11 = 15;
                        break;
                    case 20:
                        i11 = 9;
                        break;
                    case 21:
                    case 31:
                    case '$':
                        i11 = 2;
                        break;
                    case 22:
                        i11 = 35;
                        break;
                    case 23:
                        i11 = 1;
                        break;
                    case 26:
                        i11 = 33;
                        break;
                    case 27:
                        i11 = 32;
                        break;
                    case 29:
                        i11 = 34;
                        break;
                    case 30:
                        i11 = 29;
                        break;
                    case '!':
                        i11 = 24;
                        break;
                    case '\"':
                        i11 = 19;
                        break;
                    case '#':
                        i11 = 7;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        i11 = 4;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        i11 = 28;
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        i11 = 18;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                if (i11 != 20) {
                    int i14 = iArr[i13];
                    if (i11 == 8) {
                        Integer num = (Integer) this.f3891e.get(8);
                        Integer valueOf6 = Integer.valueOf(g.f(this.f3889c, str, i14));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(valueOf6);
                        valueOf3 = g.e(hashSet2);
                        hashMap2 = this.f3891e;
                        valueOf2 = 8;
                    } else {
                        if (i11 == 7) {
                            if (!this.f3891e.containsKey(7)) {
                                this.f3891e.put(7, Integer.valueOf(g.f(this.f3889c, str, i14)));
                            }
                            if (!this.f3891e.containsKey(14)) {
                                hashMap = this.f3891e;
                                valueOf = 14;
                                b10 = g.f(this.f3889c, str, i14);
                            }
                        } else if (i11 == 4) {
                            i12 = g.f(this.f3889c, str, i14);
                            if (!this.f3891e.containsKey(4)) {
                                hashMap2 = this.f3891e;
                                valueOf2 = 4;
                                valueOf3 = Integer.valueOf(i12);
                            }
                        } else if (i11 == 3) {
                            int f11 = g.f(this.f3889c, str, i14);
                            if (Build.VERSION.SDK_INT < 29 && !this.f3891e.containsKey(4)) {
                                this.f3891e.put(4, Integer.valueOf(f11));
                            }
                            if (!this.f3891e.containsKey(5)) {
                                this.f3891e.put(5, Integer.valueOf(f11));
                            }
                            HashMap hashMap3 = this.f3891e;
                            valueOf2 = Integer.valueOf(i11);
                            hashMap2 = hashMap3;
                            i12 = f11;
                            valueOf3 = Integer.valueOf(i12);
                        } else if (i11 == 9 || i11 == 32) {
                            hashMap = this.f3891e;
                            valueOf = Integer.valueOf(i11);
                            b10 = b(i11);
                        } else if (!this.f3891e.containsKey(Integer.valueOf(i11))) {
                            hashMap = this.f3891e;
                            valueOf = Integer.valueOf(i11);
                            b10 = g.f(this.f3889c, str, i14);
                        }
                        hashMap.put(valueOf, Integer.valueOf(b10));
                    }
                    hashMap2.put(valueOf2, valueOf3);
                }
            }
        }
        int length = this.f3890d - iArr.length;
        this.f3890d = length;
        a aVar = this.f3888b;
        if (aVar == null || length != 0) {
            return true;
        }
        ((c) aVar).f3879a.success(this.f3891e);
        return true;
    }
}
