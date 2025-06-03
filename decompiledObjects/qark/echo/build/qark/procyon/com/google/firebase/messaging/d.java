// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources$Theme;
import android.media.RingtoneManager;
import x2.f;
import x2.i;
import x2.e;
import android.app.NotificationManager;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.res.Resources;
import android.text.TextUtils;
import w.h;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d
{
    public static final AtomicInteger a;
    
    static {
        a = new AtomicInteger((int)SystemClock.elapsedRealtime());
    }
    
    public static PendingIntent a(final Context context, final L l, final String s, final PackageManager packageManager) {
        final Intent f = f(s, l, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(l.y());
        if (q(l)) {
            f.putExtra("gcm.n.analytics_data", l.x());
        }
        return PendingIntent.getActivity(context, g(), f, l(1073741824));
    }
    
    public static PendingIntent b(final Context context, final Context context2, final L l) {
        if (!q(l)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(l.x()));
    }
    
    public static PendingIntent c(final Context context, final Context context2, final Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", (Parcelable)intent), l(1073741824));
    }
    
    public static a d(final Context context, final Context context2, final L l, final String s, final Bundle bundle) {
        final String packageName = context2.getPackageName();
        final Resources resources = context2.getResources();
        final PackageManager packageManager = context2.getPackageManager();
        final h.e e = new h.e(context2, s);
        final String n = l.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty((CharSequence)n)) {
            e.l(n);
        }
        final String n2 = l.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty((CharSequence)n2)) {
            e.k(n2);
            e.y(new h.c().h(n2));
        }
        e.w(m(packageManager, resources, packageName, l.p("gcm.n.icon"), bundle));
        final Uri n3 = n(packageName, l, resources);
        if (n3 != null) {
            e.x(n3);
        }
        e.j(a(context, l, packageName, packageManager));
        final PendingIntent b = b(context, context2, l);
        if (b != null) {
            e.n(b);
        }
        final Integer h = h(context2, l.p("gcm.n.color"), bundle);
        if (h != null) {
            e.i(h);
        }
        e.g(l.a("gcm.n.sticky") ^ true);
        e.r(l.a("gcm.n.local_only"));
        final String p5 = l.p("gcm.n.ticker");
        if (p5 != null) {
            e.A(p5);
        }
        final Integer m = l.m();
        if (m != null) {
            e.u(m);
        }
        final Integer r = l.r();
        if (r != null) {
            e.C(r);
        }
        final Integer i = l.l();
        if (i != null) {
            e.s(i);
        }
        final Long j = l.j("gcm.n.event_time");
        if (j != null) {
            e.v(true);
            e.D(j);
        }
        final long[] q = l.q();
        if (q != null) {
            e.B(q);
        }
        final int[] e2 = l.e();
        if (e2 != null) {
            e.q(e2[0], e2[1], e2[2]);
        }
        e.m(i(l));
        return new a(e, o(l), 0);
    }
    
    public static a e(final Context context, final L l) {
        final Bundle j = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, l, k(context, l.k(), j), j);
    }
    
    public static Intent f(final String s, final L l, final PackageManager packageManager) {
        final String p3 = l.p("gcm.n.click_action");
        if (!TextUtils.isEmpty((CharSequence)p3)) {
            final Intent intent = new Intent(p3);
            intent.setPackage(s);
            intent.setFlags(268435456);
            return intent;
        }
        final Uri f = l.f();
        if (f != null) {
            final Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(s);
            intent2.setData(f);
            return intent2;
        }
        final Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(s);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }
    
    public static int g() {
        return d.a.incrementAndGet();
    }
    
    public static Integer h(final Context p0, final String p1, final Bundle p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     4: ifne            63
        //     7: aload_1        
        //     8: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    11: istore_3       
        //    12: iload_3        
        //    13: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    16: areturn        
        //    17: new             Ljava/lang/StringBuilder;
        //    20: dup            
        //    21: invokespecial   java/lang/StringBuilder.<init>:()V
        //    24: astore          4
        //    26: aload           4
        //    28: ldc_w           "Color is invalid: "
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload           4
        //    37: aload_1        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: pop            
        //    42: aload           4
        //    44: ldc_w           ". Notification will use default color."
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: pop            
        //    51: ldc_w           "FirebaseMessaging"
        //    54: aload           4
        //    56: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    59: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    62: pop            
        //    63: aload_2        
        //    64: ldc_w           "com.google.firebase.messaging.default_notification_color"
        //    67: iconst_0       
        //    68: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;I)I
        //    71: istore_3       
        //    72: iload_3        
        //    73: ifeq            97
        //    76: aload_0        
        //    77: iload_3        
        //    78: invokestatic    x/a.c:(Landroid/content/Context;I)I
        //    81: istore_3       
        //    82: iload_3        
        //    83: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    86: areturn        
        //    87: ldc_w           "FirebaseMessaging"
        //    90: ldc_w           "Cannot find the color resource referenced in AndroidManifest."
        //    93: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    96: pop            
        //    97: aconst_null    
        //    98: areturn        
        //    99: astore          4
        //   101: goto            17
        //   104: astore_0       
        //   105: goto            87
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  7      12     99     63     Ljava/lang/IllegalArgumentException;
        //  76     82     104    97     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int i(final L l) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static Bundle j(final PackageManager packageManager, final String s) {
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 128);
            if (applicationInfo != null) {
                final Bundle metaData = applicationInfo.metaData;
                if (metaData != null) {
                    return metaData;
                }
            }
        }
        catch (PackageManager$NameNotFoundException obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Couldn't get own application info: ");
            sb.append(obj);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }
    
    public static String k(final Context context, String string, final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService((Class)NotificationManager.class);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (e.a(notificationManager, string) != null) {
                    return string;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Notification Channel requested (");
                sb.append(string);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            string = ((BaseBundle)bundle).getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (e.a(notificationManager, string) != null) {
                    return string;
                }
                string = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            else {
                string = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            }
            Log.w("FirebaseMessaging", string);
            if (e.a(notificationManager, "fcm_fallback_notification_channel") == null) {
                final int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                String string2;
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string2 = "Misc";
                }
                else {
                    string2 = context.getString(identifier);
                }
                f.a(notificationManager, i.a("fcm_fallback_notification_channel", string2, 3));
            }
            return "fcm_fallback_notification_channel";
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static int l(final int n) {
        return n | 0x4000000;
    }
    
    public static int m(final PackageManager packageManager, final Resources resources, final String s, final String str, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)str)) {
            final int identifier = resources.getIdentifier(str, "drawable", s);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            final int identifier2 = resources.getIdentifier(str, "mipmap", s);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        final int int1 = ((BaseBundle)bundle).getInt("com.google.firebase.messaging.default_notification_icon", 0);
        int icon = 0;
        Label_0190: {
            if (int1 != 0) {
                icon = int1;
                if (p(resources, int1)) {
                    break Label_0190;
                }
            }
            try {
                icon = packageManager.getApplicationInfo(s, 0).icon;
            }
            catch (PackageManager$NameNotFoundException obj) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't get own application info: ");
                sb2.append(obj);
                Log.w("FirebaseMessaging", sb2.toString());
                icon = int1;
            }
        }
        if (icon != 0) {
            final int n = icon;
            if (p(resources, icon)) {
                return n;
            }
        }
        return 17301651;
    }
    
    public static Uri n(final String str, final L l, final Resources resources) {
        final String o = l.o();
        if (TextUtils.isEmpty((CharSequence)o)) {
            return null;
        }
        if (!"default".equals(o) && resources.getIdentifier(o, "raw", str) != 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(o);
            return Uri.parse(sb.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }
    
    public static String o(final L l) {
        final String p = l.p("gcm.n.tag");
        if (!TextUtils.isEmpty((CharSequence)p)) {
            return p;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FCM-Notification:");
        sb.append(SystemClock.uptimeMillis());
        return sb.toString();
    }
    
    public static boolean p(final Resources resources, final int n) {
        if (Build$VERSION.SDK_INT != 26) {
            return true;
        }
        while (true) {
            try {
                if (c.a((Object)resources.getDrawable(n, (Resources$Theme)null))) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                    sb.append(n);
                    Log.e("FirebaseMessaging", sb.toString());
                    return false;
                }
                return true;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't find resource ");
                sb2.append(n);
                sb2.append(", treating it as an invalid icon");
                Log.e("FirebaseMessaging", sb2.toString());
                return false;
            }
            catch (Resources$NotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean q(final L l) {
        return l.a("google.c.a.e");
    }
    
    public static class a
    {
        public final h.e a;
        public final String b;
        public final int c;
        
        public a(final h.e a, final String b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
