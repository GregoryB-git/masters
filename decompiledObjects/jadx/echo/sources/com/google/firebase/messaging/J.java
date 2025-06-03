package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;
import java.util.concurrent.ExecutionException;
import s3.C1947e;
import w3.InterfaceC2100a;
import y4.C2275a;
import y4.C2276b;

/* loaded from: classes.dex */
public abstract class J {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }

    public static boolean B(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return C(intent.getExtras());
    }

    public static boolean C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C1947e.o();
            Context m7 = C1947e.o().m();
            SharedPreferences sharedPreferences = m7.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m7.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m7.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static C2275a b(C2275a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C2275a.C0303a h7 = C2275a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(C2275a.d.ANDROID).h(k(extras));
        String h8 = h(extras);
        if (h8 != null) {
            h7.g(h8);
        }
        String o7 = o(extras);
        if (o7 != null) {
            h7.l(o7);
        }
        String c7 = c(extras);
        if (c7 != null) {
            h7.c(c7);
        }
        String i7 = i(extras);
        if (i7 != null) {
            h7.b(i7);
        }
        String e7 = e(extras);
        if (e7 != null) {
            h7.d(e7);
        }
        long n7 = n(extras);
        if (n7 > 0) {
            h7.j(n7);
        }
        return h7.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) V2.m.a(s4.h.u(C1947e.o()).a());
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static C2275a.c k(Bundle bundle) {
        return (bundle == null || !L.t(bundle)) ? C2275a.c.DATA_MESSAGE : C2275a.c.DISPLAY_NOTIFICATION;
    }

    public static String l(Bundle bundle) {
        return (bundle == null || !L.t(bundle)) ? "data" : "display";
    }

    public static String m() {
        return C1947e.o().m().getPackageName();
    }

    public static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e7) {
                Log.w("FirebaseMessaging", "error parsing project number", e7);
            }
        }
        C1947e o7 = C1947e.o();
        String f7 = o7.r().f();
        if (f7 != null) {
            try {
                return Long.parseLong(f7);
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e8);
            }
        }
        String c7 = o7.r().c();
        try {
            if (!c7.startsWith("1:")) {
                return Long.parseLong(c7);
            }
            String[] split = c7.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e9) {
            Log.w("FirebaseMessaging", "error parsing app ID", e9);
            return 0L;
        }
    }

    public static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        z(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (B(intent)) {
            x("_nr", intent.getExtras());
        }
        if (A(intent)) {
            w(C2275a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.w());
        }
    }

    public static void w(C2275a.b bVar, Intent intent, c2.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C2275a b7 = b(bVar, intent);
        if (b7 == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", C2276b.class, C0819b.b("proto"), new InterfaceC0822e() { // from class: com.google.firebase.messaging.I
                @Override // c2.InterfaceC0822e
                public final Object apply(Object obj) {
                    return ((C2276b) obj).c();
                }
            }).b(AbstractC0820c.d(C2276b.b().b(b7).a()));
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
        }
    }

    public static void x(String str, Bundle bundle) {
        try {
            C1947e.o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d7 = d(bundle);
            if (d7 != null) {
                bundle2.putString("_nmid", d7);
            }
            String e7 = e(bundle);
            if (e7 != null) {
                bundle2.putString("_nmn", e7);
            }
            String i7 = i(bundle);
            if (!TextUtils.isEmpty(i7)) {
                bundle2.putString("label", i7);
            }
            String g7 = g(bundle);
            if (!TextUtils.isEmpty(g7)) {
                bundle2.putString("message_channel", g7);
            }
            String o7 = o(bundle);
            if (o7 != null) {
                bundle2.putString("_nt", o7);
            }
            String j7 = j(bundle);
            if (j7 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j7));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e8);
                }
            }
            String q7 = q(bundle);
            if (q7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q7));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            String l7 = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l7);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC2100a interfaceC2100a = (InterfaceC2100a) C1947e.o().k(InterfaceC2100a.class);
            if (interfaceC2100a != null) {
                interfaceC2100a.e("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void y(boolean z7) {
        C1947e.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z7).apply();
    }

    public static void z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC2100a interfaceC2100a = (InterfaceC2100a) C1947e.o().k(InterfaceC2100a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC2100a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC2100a.d("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC2100a.e("fcm", "_cmp", bundle2);
    }
}
