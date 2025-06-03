/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 */
package com.google.firebase.messaging;

import V2.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c2.c;
import c2.f;
import c2.g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.I;
import com.google.firebase.messaging.L;
import java.util.concurrent.ExecutionException;
import s3.e;
import s3.m;
import s4.h;
import w3.a;
import y4.a;
import y4.b;

public abstract class J {
    public static boolean A(Intent intent) {
        if (intent != null && !J.r(intent)) {
            return J.a();
        }
        return false;
    }

    public static boolean B(Intent intent) {
        if (intent != null && !J.r(intent)) {
            return J.C(intent.getExtras());
        }
        return false;
    }

    public static boolean C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals((Object)bundle.getString("google.c.a.e"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a() {
        try {
            e.o();
        }
        catch (IllegalStateException illegalStateException) {}
        Context context = e.o().m();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        try {
            sharedPreferences = context.getPackageManager();
            if (sharedPreferences == null) return false;
            if ((context = sharedPreferences.getApplicationInfo(context.getPackageName(), 128)) == null) return false;
            sharedPreferences = context.metaData;
            if (sharedPreferences == null) return false;
            if (!sharedPreferences.containsKey("delivery_metrics_exported_to_big_query_enabled")) return false;
            return context.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        Log.i((String)"FirebaseMessaging", (String)"FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
        return false;
    }

    public static y4.a b(a.b object, Intent intent) {
        long l8;
        if (intent == null) {
            return null;
        }
        Object object2 = intent.getExtras();
        intent = object2;
        if (object2 == null) {
            intent = Bundle.EMPTY;
        }
        object = y4.a.p().m(J.p((Bundle)intent)).e((a.b)object).f(J.f((Bundle)intent)).i(J.m()).k(a.d.q).h(J.k((Bundle)intent));
        object2 = J.h((Bundle)intent);
        if (object2 != null) {
            object.g((String)object2);
        }
        if ((object2 = J.o((Bundle)intent)) != null) {
            object.l((String)object2);
        }
        if ((object2 = J.c((Bundle)intent)) != null) {
            object.c((String)object2);
        }
        if ((object2 = J.i((Bundle)intent)) != null) {
            object.b((String)object2);
        }
        if ((object2 = J.e((Bundle)intent)) != null) {
            object.d((String)object2);
        }
        if ((l8 = J.n((Bundle)intent)) > 0L) {
            object.j(l8);
        }
        return object.a();
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

    public static String f(Bundle object) {
        void var0_3;
        if (!TextUtils.isEmpty((CharSequence)(object = object.getString("google.to")))) {
            return object;
        }
        try {
            object = (String)V2.m.a(h.u(e.o()).a());
            return object;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_3);
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string2;
        String string3 = string2 = bundle.getString("google.message_id");
        if (string2 == null) {
            string3 = bundle.getString("message_id");
        }
        return string3;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static a.c k(Bundle bundle) {
        if (bundle != null && L.t(bundle)) {
            return a.c.s;
        }
        return a.c.q;
    }

    public static String l(Bundle bundle) {
        if (bundle != null && L.t(bundle)) {
            return "display";
        }
        return "data";
    }

    public static String m() {
        return e.o().m().getPackageName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long n(Bundle object) {
        String string2;
        if (object.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong((String)object.getString("google.c.sender.id"));
            }
            catch (NumberFormatException numberFormatException) {
                Log.w((String)"FirebaseMessaging", (String)"error parsing project number", (Throwable)numberFormatException);
            }
        }
        if ((string2 = (object = e.o()).r().f()) != null) {
            try {
                return Long.parseLong((String)string2);
            }
            catch (NumberFormatException numberFormatException) {
                Log.w((String)"FirebaseMessaging", (String)"error parsing sender ID", (Throwable)numberFormatException);
            }
        }
        if (!(object = object.r().c()).startsWith("1:")) {
            return Long.parseLong((String)object);
        }
        if ((object = object.split(":")).length < 2) {
            return 0L;
        }
        if ((object = object[1]).isEmpty()) {
            return 0L;
        }
        try {
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            Log.w((String)"FirebaseMessaging", (String)"error parsing app ID", (Throwable)numberFormatException);
            return 0L;
        }
    }

    public static String o(Bundle object) {
        if ((object = object.getString("from")) != null && object.startsWith("/topics/")) {
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int p(Bundle object) {
        if ((object = object.get("google.ttl")) instanceof Integer) {
            return (Integer)object;
        }
        if (!(object instanceof String)) return 0;
        try {
            return Integer.parseInt((String)((String)object));
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid TTL: ");
        stringBuilder.append(object);
        Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return 0;
    }

    public static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)intent.getAction());
    }

    public static void s(Intent intent) {
        J.x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        J.x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        J.z(bundle);
        J.x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (J.B(intent)) {
            J.x("_nr", intent.getExtras());
        }
        if (J.A(intent)) {
            J.w(a.b.q, intent, FirebaseMessaging.w());
        }
    }

    public static void w(a.b object, Intent intent, g g8) {
        if (g8 == null) {
            Log.e((String)"FirebaseMessaging", (String)"TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        if ((object = J.b((a.b)object, intent)) == null) {
            return;
        }
        try {
            g8.a("FCM_CLIENT_EVENT_LOGGING", b.class, c2.b.b("proto"), new I()).b(c.d(b.b().b((y4.a)object).a()));
            return;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"FirebaseMessaging", (String)"Failed to send big query analytics payload.", (Throwable)runtimeException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void x(String string2, Bundle bundle) {
        Object object;
        block16 : {
            try {
                e.o();
                object = bundle;
                if (bundle != null) break block16;
            }
            catch (IllegalStateException illegalStateException) {}
            object = new Bundle();
        }
        bundle = new Bundle();
        String string3 = J.d((Bundle)object);
        if (string3 != null) {
            bundle.putString("_nmid", string3);
        }
        if ((string3 = J.e((Bundle)object)) != null) {
            bundle.putString("_nmn", string3);
        }
        if (!TextUtils.isEmpty((CharSequence)(string3 = J.i((Bundle)object)))) {
            bundle.putString("label", string3);
        }
        if (!TextUtils.isEmpty((CharSequence)(string3 = J.g((Bundle)object)))) {
            bundle.putString("message_channel", string3);
        }
        if ((string3 = J.o((Bundle)object)) != null) {
            bundle.putString("_nt", string3);
        }
        if ((string3 = J.j((Bundle)object)) != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt((String)string3));
            }
            catch (NumberFormatException numberFormatException) {
                Log.w((String)"FirebaseMessaging", (String)"Error while parsing timestamp in GCM event", (Throwable)numberFormatException);
            }
        }
        if ((string3 = J.q((Bundle)object)) != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt((String)string3));
            }
            catch (NumberFormatException numberFormatException) {
                Log.w((String)"FirebaseMessaging", (String)"Error while parsing use_device_time in GCM event", (Throwable)numberFormatException);
            }
        }
        object = J.l((Bundle)object);
        if ("_nr".equals((Object)string2) || "_nf".equals((Object)string2)) {
            bundle.putString("_nmc", (String)object);
        }
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            object = new StringBuilder();
            object.append("Logging to scion event=");
            object.append(string2);
            object.append(" scionPayload=");
            object.append((Object)bundle);
            Log.d((String)"FirebaseMessaging", (String)object.toString());
        }
        if ((object = (a)e.o().k(a.class)) != null) {
            object.e("fcm", string2, bundle);
            return;
        }
        Log.w((String)"FirebaseMessaging", (String)"Unable to log event: analytics library is missing");
        return;
        Log.e((String)"FirebaseMessaging", (String)"Default FirebaseApp has not been initialized. Skip logging event to GA.");
    }

    public static void y(boolean bl) {
        e.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", bl).apply();
    }

    public static void z(Bundle object) {
        if (object == null) {
            return;
        }
        if ("1".equals((Object)object.getString("google.c.a.tc"))) {
            a a8 = (a)e.o().k(a.class);
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                Log.d((String)"FirebaseMessaging", (String)"Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (a8 != null) {
                object = object.getString("google.c.a.c_id");
                a8.d("fcm", "_ln", object);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString("medium", "notification");
                bundle.putString("campaign", (String)object);
                a8.e("fcm", "_cmp", bundle);
                return;
            }
            Log.w((String)"FirebaseMessaging", (String)"Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            Log.d((String)"FirebaseMessaging", (String)"Received event with track-conversion=false. Do not set user property");
        }
    }
}

