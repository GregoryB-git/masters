/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.L;
import com.google.firebase.messaging.c;
import java.util.concurrent.atomic.AtomicInteger;
import w.h;
import x2.e;
import x2.f;
import x2.i;

public abstract class d {
    public static final AtomicInteger a = new AtomicInteger((int)SystemClock.elapsedRealtime());

    public static PendingIntent a(Context context, L l8, String string2, PackageManager packageManager) {
        if ((string2 = d.f(string2, l8, packageManager)) == null) {
            return null;
        }
        string2.addFlags(67108864);
        string2.putExtras(l8.y());
        if (d.q(l8)) {
            string2.putExtra("gcm.n.analytics_data", l8.x());
        }
        return PendingIntent.getActivity((Context)context, (int)d.g(), (Intent)string2, (int)d.l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, L l8) {
        if (!d.q(l8)) {
            return null;
        }
        return d.c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(l8.x()));
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast((Context)context, (int)d.g(), (Intent)new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", (Parcelable)intent), (int)d.l(1073741824));
    }

    public static a d(Context arrl, Context context, L l8, String object, Bundle bundle) {
        String string2 = context.getPackageName();
        Resources resources = context.getResources();
        PackageManager packageManager = context.getPackageManager();
        object = new h.e(context, (String)object);
        String string3 = l8.n(resources, string2, "gcm.n.title");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            object.l(string3);
        }
        if (!TextUtils.isEmpty((CharSequence)(string3 = l8.n(resources, string2, "gcm.n.body")))) {
            object.k(string3);
            object.y(new h.c().h(string3));
        }
        object.w(d.m(packageManager, resources, string2, l8.p("gcm.n.icon"), bundle));
        resources = d.n(string2, l8, resources);
        if (resources != null) {
            object.x((Uri)resources);
        }
        object.j(d.a((Context)arrl, l8, string2, packageManager));
        arrl = d.b((Context)arrl, context, l8);
        if (arrl != null) {
            object.n((PendingIntent)arrl);
        }
        if ((arrl = d.h(context, l8.p("gcm.n.color"), bundle)) != null) {
            object.i(arrl.intValue());
        }
        object.g(l8.a("gcm.n.sticky") ^ true);
        object.r(l8.a("gcm.n.local_only"));
        arrl = l8.p("gcm.n.ticker");
        if (arrl != null) {
            object.A((CharSequence)arrl);
        }
        if ((arrl = l8.m()) != null) {
            object.u(arrl.intValue());
        }
        if ((arrl = l8.r()) != null) {
            object.C(arrl.intValue());
        }
        if ((arrl = l8.l()) != null) {
            object.s(arrl.intValue());
        }
        if ((arrl = l8.j("gcm.n.event_time")) != null) {
            object.v(true);
            object.D(arrl.longValue());
        }
        if ((arrl = l8.q()) != null) {
            object.B(arrl);
        }
        if ((arrl = l8.e()) != null) {
            object.q((int)arrl[0], (int)arrl[1], (int)arrl[2]);
        }
        object.m(d.i(l8));
        return new a((h.e)object, d.o(l8), 0);
    }

    public static a e(Context context, L l8) {
        Bundle bundle = d.j(context.getPackageManager(), context.getPackageName());
        return d.d(context, context, l8, d.k(context, l8.k(), bundle), bundle);
    }

    public static Intent f(String string2, L l8, PackageManager packageManager) {
        String string3 = l8.p("gcm.n.click_action");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            l8 = new Intent(string3);
            l8.setPackage(string2);
            l8.setFlags(268435456);
            return l8;
        }
        if ((l8 = l8.f()) != null) {
            packageManager = new Intent("android.intent.action.VIEW");
            packageManager.setPackage(string2);
            packageManager.setData((Uri)l8);
            return packageManager;
        }
        if ((string2 = packageManager.getLaunchIntentForPackage(string2)) == null) {
            Log.w((String)"FirebaseMessaging", (String)"No activity found to launch app");
        }
        return string2;
    }

    public static int g() {
        return a.incrementAndGet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer h(Context context, String string2, Bundle bundle) {
        int n8;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            int n9;
            try {
                n9 = Color.parseColor((String)string2);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            return n9;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Color is invalid: ");
            stringBuilder.append(string2);
            stringBuilder.append(". Notification will use default color.");
            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        }
        if ((n8 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0)) != 0) {
            try {
                n8 = x.a.c(context, n8);
            }
            catch (Resources.NotFoundException notFoundException) {}
            return n8;
            Log.w((String)"FirebaseMessaging", (String)"Cannot find the color resource referenced in AndroidManifest.");
        }
        return null;
    }

    public static int i(L l8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bundle j(PackageManager packageManager, String string2) {
        packageManager = packageManager.getApplicationInfo(string2, 128);
        if (packageManager == null) return Bundle.EMPTY;
        try {
            packageManager = packageManager.metaData;
            if (packageManager == null) return Bundle.EMPTY;
            return packageManager;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            string2 = new StringBuilder();
            string2.append("Couldn't get own application info: ");
            string2.append((Object)nameNotFoundException);
            Log.w((String)"FirebaseMessaging", (String)string2.toString());
        }
        return Bundle.EMPTY;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String k(Context object, String string2, Bundle bundle) {
        int n8;
        block11 : {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            try {
                n8 = object.getPackageManager().getApplicationInfo((String)object.getPackageName(), (int)0).targetSdkVersion;
                if (n8 >= 26) break block11;
                return null;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
        }
        NotificationManager notificationManager = (NotificationManager)object.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            if (e.a(notificationManager, string2) != null) {
                return string2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Notification Channel requested (");
            stringBuilder.append(string2);
            stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id")))) {
            if (e.a(notificationManager, string2) != null) {
                return string2;
            }
            string2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
        } else {
            string2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
        }
        Log.w((String)"FirebaseMessaging", (String)string2);
        if (e.a(notificationManager, "fcm_fallback_notification_channel") == null) {
            n8 = object.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", object.getPackageName());
            if (n8 == 0) {
                Log.e((String)"FirebaseMessaging", (String)"String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                object = "Misc";
            } else {
                object = object.getString(n8);
            }
            f.a(notificationManager, i.a("fcm_fallback_notification_channel", (CharSequence)object, 3));
        }
        return "fcm_fallback_notification_channel";
    }

    public static int l(int n8) {
        return n8 | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String string2, String string3, Bundle bundle) {
        int n8;
        block14 : {
            block13 : {
                int n9;
                block12 : {
                    block11 : {
                        if (!TextUtils.isEmpty((CharSequence)string3)) {
                            n9 = resources.getIdentifier(string3, "drawable", string2);
                            if (n9 != 0 && d.p(resources, n9)) {
                                return n9;
                            }
                            n9 = resources.getIdentifier(string3, "mipmap", string2);
                            if (n9 != 0 && d.p(resources, n9)) {
                                return n9;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Icon resource ");
                            stringBuilder.append(string3);
                            stringBuilder.append(" not found. Notification will use default icon.");
                            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
                        }
                        if ((n8 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0)) == 0) break block11;
                        n9 = n8;
                        if (d.p(resources, n8)) break block12;
                    }
                    try {
                        n9 = packageManager.getApplicationInfo((String)string2, (int)0).icon;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        string2 = new StringBuilder();
                        string2.append("Couldn't get own application info: ");
                        string2.append((Object)nameNotFoundException);
                        Log.w((String)"FirebaseMessaging", (String)string2.toString());
                        n9 = n8;
                    }
                }
                if (n9 == 0) break block13;
                n8 = n9;
                if (d.p(resources, n9)) break block14;
            }
            n8 = 17301651;
        }
        return n8;
    }

    public static Uri n(String string2, L object, Resources resources) {
        if (TextUtils.isEmpty((CharSequence)(object = object.o()))) {
            return null;
        }
        if (!"default".equals(object) && resources.getIdentifier((String)object, "raw", string2) != 0) {
            resources = new StringBuilder();
            resources.append("android.resource://");
            resources.append(string2);
            resources.append("/raw/");
            resources.append((String)object);
            return Uri.parse((String)resources.toString());
        }
        return RingtoneManager.getDefaultUri((int)2);
    }

    public static String o(L object) {
        if (!TextUtils.isEmpty((CharSequence)(object = object.p("gcm.n.tag")))) {
            return object;
        }
        object = new StringBuilder();
        object.append("FCM-Notification:");
        object.append(SystemClock.uptimeMillis());
        return object.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean p(Resources resources, int n8) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (c.a((Object)resources.getDrawable(n8, null))) {
                resources = new StringBuilder();
                resources.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                resources.append(n8);
                Log.e((String)"FirebaseMessaging", (String)resources.toString());
                return false;
            }
            return true;
        }
        catch (Resources.NotFoundException notFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't find resource ");
        stringBuilder.append(n8);
        stringBuilder.append(", treating it as an invalid icon");
        Log.e((String)"FirebaseMessaging", (String)stringBuilder.toString());
        return false;
    }

    public static boolean q(L l8) {
        return l8.a("google.c.a.e");
    }

    public static class a {
        public final h.e a;
        public final String b;
        public final int c;

        public a(h.e e8, String string2, int n8) {
            this.a = e8;
            this.b = string2;
            this.c = n8;
        }
    }

}

