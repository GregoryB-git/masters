package w1;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.AbstractC2072a;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public final class q implements E5.m, E5.o {

    /* renamed from: a, reason: collision with root package name */
    public b f20317a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f20318b;

    /* renamed from: c, reason: collision with root package name */
    public int f20319c;

    /* renamed from: d, reason: collision with root package name */
    public Map f20320d;

    public interface a {
        void a(int i7);
    }

    public interface b {
        void a(Map map);
    }

    public interface c {
        void a(boolean z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E5.m
    public boolean a(int i7, int i8, Intent intent) {
        boolean canScheduleExactAlarms;
        int i9;
        boolean canRequestPackageInstalls;
        boolean isExternalStorageManager;
        int i10;
        if (i7 != 209 && i7 != 210 && i7 != 211 && i7 != 212 && i7 != 213 && i7 != 214) {
            return false;
        }
        boolean z7 = i8 == -1;
        if (i7 == 209) {
            i9 = 16;
            i10 = z7;
        } else if (i7 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            isExternalStorageManager = Environment.isExternalStorageManager();
            i9 = 22;
            i10 = isExternalStorageManager;
        } else if (i7 == 211) {
            i9 = 23;
            i10 = Settings.canDrawOverlays(this.f20318b);
        } else if (i7 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            canRequestPackageInstalls = this.f20318b.getPackageManager().canRequestPackageInstalls();
            i9 = 24;
            i10 = canRequestPackageInstalls;
        } else if (i7 == 213) {
            i9 = 27;
            i10 = ((NotificationManager) this.f20318b.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i7 != 214 || Build.VERSION.SDK_INT < 31) {
                return false;
            }
            canScheduleExactAlarms = ((AlarmManager) this.f20318b.getSystemService("alarm")).canScheduleExactAlarms();
            i9 = 34;
            i10 = canScheduleExactAlarms;
        }
        this.f20320d.put(Integer.valueOf(i9), Integer.valueOf(i10));
        int i11 = this.f20319c - 1;
        this.f20319c = i11;
        if (i11 == 0) {
            this.f20317a.a(this.f20320d);
        }
        return true;
    }

    @Override // E5.o
    public boolean b(int i7, String[] strArr, int[] iArr) {
        Map map;
        int valueOf;
        int h7;
        Map map2;
        int valueOf2;
        if (i7 != 24) {
            this.f20319c = 0;
            return false;
        }
        if (this.f20320d == null) {
            return false;
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            int f7 = u.f(str);
            if (f7 != 20) {
                int i9 = iArr[i8];
                if (f7 == 7) {
                    if (!this.f20320d.containsKey(7)) {
                        this.f20320d.put(7, Integer.valueOf(u.h(this.f20318b, str, i9)));
                    }
                    if (!this.f20320d.containsKey(14)) {
                        map = this.f20320d;
                        valueOf = 14;
                        map.put(valueOf, Integer.valueOf(u.h(this.f20318b, str, i9)));
                    }
                    u.i(this.f20318b, f7);
                } else if (f7 == 4) {
                    h7 = u.h(this.f20318b, str, i9);
                    if (!this.f20320d.containsKey(4)) {
                        map2 = this.f20320d;
                        valueOf2 = 4;
                        map2.put(valueOf2, Integer.valueOf(h7));
                    }
                    u.i(this.f20318b, f7);
                } else if (f7 == 3) {
                    h7 = u.h(this.f20318b, str, i9);
                    if (Build.VERSION.SDK_INT < 29 && !this.f20320d.containsKey(4)) {
                        this.f20320d.put(4, Integer.valueOf(h7));
                    }
                    if (!this.f20320d.containsKey(5)) {
                        this.f20320d.put(5, Integer.valueOf(h7));
                    }
                    map2 = this.f20320d;
                    valueOf2 = Integer.valueOf(f7);
                    map2.put(valueOf2, Integer.valueOf(h7));
                    u.i(this.f20318b, f7);
                } else {
                    if (!this.f20320d.containsKey(Integer.valueOf(f7))) {
                        map = this.f20320d;
                        valueOf = Integer.valueOf(f7);
                        map.put(valueOf, Integer.valueOf(u.h(this.f20318b, str, i9)));
                    }
                    u.i(this.f20318b, f7);
                }
            }
        }
        int length = this.f20319c - iArr.length;
        this.f20319c = length;
        if (length != 0) {
            return true;
        }
        this.f20317a.a(this.f20320d);
        return true;
    }

    public final int c(Context context) {
        List b7 = u.b(context, 21);
        if (b7 != null && !b7.isEmpty()) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    public final int d(Context context) {
        return Build.VERSION.SDK_INT < 33 ? w.k.b(context).a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    public void e(int i7, Context context, a aVar) {
        aVar.a(f(i7, context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f(int i7, Context context) {
        boolean isExternalStorageManager;
        boolean canScheduleExactAlarms;
        boolean canRequestPackageInstalls;
        if (i7 == 17) {
            return d(context);
        }
        if (i7 == 21) {
            return c(context);
        }
        if ((i7 == 30 || i7 == 28 || i7 == 29) && Build.VERSION.SDK_INT < 31) {
            return c(context);
        }
        List<String> b7 = u.b(context, i7);
        if (b7 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i7);
            return 1;
        }
        if (b7.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b7 + i7);
            return (i7 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        byte b8 = context.getApplicationInfo().targetSdkVersion >= 23;
        for (String str : b7) {
            if (b8 != false) {
                if (i7 == 16) {
                    String packageName = context.getPackageName();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                }
                if (i7 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    return isExternalStorageManager ? 1 : 0;
                }
                if (i7 == 23) {
                    return Settings.canDrawOverlays(context) ? 1 : 0;
                }
                if (i7 == 24 && Build.VERSION.SDK_INT >= 26) {
                    canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                    return canRequestPackageInstalls ? 1 : 0;
                }
                if (i7 == 27) {
                    return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                }
                if (i7 == 34) {
                    if (Build.VERSION.SDK_INT < 31) {
                        return 1;
                    }
                    canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                    return canScheduleExactAlarms ? 1 : 0;
                }
                if (AbstractC2112a.a(context, str) != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public final void g(String str, int i7) {
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f20318b.getPackageName()));
        }
        this.f20318b.startActivityForResult(intent, i7);
        this.f20319c++;
    }

    public void h(List list, Activity activity, b bVar, w1.b bVar2) {
        Map map;
        int i7;
        String str;
        int i8;
        String str2;
        if (this.f20319c > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else {
            if (activity != null) {
                this.f20317a = bVar;
                this.f20318b = activity;
                this.f20320d = new HashMap();
                this.f20319c = 0;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (f(num.intValue(), activity) != 1) {
                        List b7 = u.b(activity, num.intValue());
                        if (b7 != null && !b7.isEmpty()) {
                            int i9 = Build.VERSION.SDK_INT;
                            if (num.intValue() == 16) {
                                str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                                i8 = 209;
                            } else if (i9 >= 30 && num.intValue() == 22) {
                                str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                                i8 = 210;
                            } else if (num.intValue() == 23) {
                                str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                                i8 = 211;
                            } else if (i9 >= 26 && num.intValue() == 24) {
                                str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                                i8 = 212;
                            } else if (num.intValue() == 27) {
                                str = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                                i8 = 213;
                            } else if (i9 < 31 || num.intValue() != 34) {
                                arrayList.addAll(b7);
                                this.f20319c += b7.size();
                            } else {
                                str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                                i8 = 214;
                            }
                            g(str, i8);
                        } else if (!this.f20320d.containsKey(num)) {
                            this.f20320d.put(num, 0);
                            if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                map = this.f20320d;
                                i7 = 0;
                            } else {
                                map = this.f20320d;
                                i7 = 2;
                            }
                            map.put(num, i7);
                        }
                    } else if (!this.f20320d.containsKey(num)) {
                        map = this.f20320d;
                        i7 = 1;
                        map.put(num, i7);
                    }
                }
                if (arrayList.size() > 0) {
                    AbstractC2072a.l(activity, (String[]) arrayList.toArray(new String[0]), 24);
                }
                if (this.f20319c == 0) {
                    this.f20317a.a(this.f20320d);
                    return;
                }
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        bVar2.a("PermissionHandler.PermissionManager", str2);
    }

    public void i(int i7, Activity activity, c cVar, w1.b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List b7 = u.b(activity, i7);
        if (b7 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i7);
            cVar.a(false);
            return;
        }
        if (!b7.isEmpty()) {
            cVar.a(AbstractC2072a.m(activity, (String) b7.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i7 + " no need to show request rationale");
        cVar.a(false);
    }
}
