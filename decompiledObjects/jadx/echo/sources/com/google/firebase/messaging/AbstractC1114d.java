package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import w.h;
import x.AbstractC2112a;
import x2.AbstractC2195i;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1114d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f11739a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final h.e f11740a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11742c;

        public a(h.e eVar, String str, int i7) {
            this.f11740a = eVar;
            this.f11741b = str;
            this.f11742c = i7;
        }
    }

    public static PendingIntent a(Context context, L l7, String str, PackageManager packageManager) {
        Intent f7 = f(str, l7, packageManager);
        if (f7 == null) {
            return null;
        }
        f7.addFlags(67108864);
        f7.putExtras(l7.y());
        if (q(l7)) {
            f7.putExtra("gcm.n.analytics_data", l7.x());
        }
        return PendingIntent.getActivity(context, g(), f7, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, L l7) {
        if (q(l7)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(l7.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, L l7, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        h.e eVar = new h.e(context2, str);
        String n7 = l7.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n7)) {
            eVar.l(n7);
        }
        String n8 = l7.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n8)) {
            eVar.k(n8);
            eVar.y(new h.c().h(n8));
        }
        eVar.w(m(packageManager, resources, packageName, l7.p("gcm.n.icon"), bundle));
        Uri n9 = n(packageName, l7, resources);
        if (n9 != null) {
            eVar.x(n9);
        }
        eVar.j(a(context, l7, packageName, packageManager));
        PendingIntent b7 = b(context, context2, l7);
        if (b7 != null) {
            eVar.n(b7);
        }
        Integer h7 = h(context2, l7.p("gcm.n.color"), bundle);
        if (h7 != null) {
            eVar.i(h7.intValue());
        }
        eVar.g(!l7.a("gcm.n.sticky"));
        eVar.r(l7.a("gcm.n.local_only"));
        String p7 = l7.p("gcm.n.ticker");
        if (p7 != null) {
            eVar.A(p7);
        }
        Integer m7 = l7.m();
        if (m7 != null) {
            eVar.u(m7.intValue());
        }
        Integer r7 = l7.r();
        if (r7 != null) {
            eVar.C(r7.intValue());
        }
        Integer l8 = l7.l();
        if (l8 != null) {
            eVar.s(l8.intValue());
        }
        Long j7 = l7.j("gcm.n.event_time");
        if (j7 != null) {
            eVar.v(true);
            eVar.D(j7.longValue());
        }
        long[] q7 = l7.q();
        if (q7 != null) {
            eVar.B(q7);
        }
        int[] e7 = l7.e();
        if (e7 != null) {
            eVar.q(e7[0], e7[1], e7[2]);
        }
        eVar.m(i(l7));
        return new a(eVar, o(l7), 0);
    }

    public static a e(Context context, L l7) {
        Bundle j7 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, l7, k(context, l7.k(), j7), j7);
    }

    public static Intent f(String str, L l7, PackageManager packageManager) {
        String p7 = l7.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p7)) {
            Intent intent = new Intent(p7);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f7 = l7.f();
        if (f7 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f7);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f11739a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC2112a.c(context, i7));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int i(L l7) {
        boolean a7 = l7.a("gcm.n.default_sound");
        ?? r02 = a7;
        if (l7.a("gcm.n.default_vibrate_timings")) {
            r02 = (a7 ? 1 : 0) | 2;
        }
        return l7.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(AbstractC2195i.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i7) {
        return i7 | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0 || !p(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
            }
        }
        return (i7 == 0 || !p(resources, i7)) ? R.drawable.sym_def_app_icon : i7;
    }

    public static Uri n(String str, L l7, Resources resources) {
        String o7 = l7.o();
        if (TextUtils.isEmpty(o7)) {
            return null;
        }
        if ("default".equals(o7) || resources.getIdentifier(o7, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o7);
    }

    public static String o(L l7) {
        String p7 = l7.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p7)) {
            return p7;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static boolean p(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC1113c.a(resources.getDrawable(i7, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean q(L l7) {
        return l7.a("google.c.a.e");
    }
}
