// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.BaseBundle;
import c2.c;
import y4.b;
import c2.g;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import V2.m;
import s4.h;
import s3.e;
import android.text.TextUtils;
import y4.a;
import android.os.Bundle;
import android.content.Intent;

public abstract class J
{
    public static boolean A(final Intent intent) {
        return intent != null && !r(intent) && a();
    }
    
    public static boolean B(final Intent intent) {
        return intent != null && !r(intent) && C(intent.getExtras());
    }
    
    public static boolean C(final Bundle bundle) {
        return bundle != null && "1".equals(((BaseBundle)bundle).getString("google.c.a.e"));
    }
    
    public static boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: invokestatic    s3/e.o:()Ls3/e;
        //     7: invokevirtual   s3/e.m:()Landroid/content/Context;
        //    10: astore_1       
        //    11: aload_1        
        //    12: ldc             "com.google.firebase.messaging"
        //    14: iconst_0       
        //    15: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    18: astore_2       
        //    19: aload_2        
        //    20: ldc             "export_to_big_query"
        //    22: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    27: ifeq            40
        //    30: aload_2        
        //    31: ldc             "export_to_big_query"
        //    33: iconst_0       
        //    34: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    39: ireturn        
        //    40: aload_1        
        //    41: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    44: astore_2       
        //    45: aload_2        
        //    46: ifnull          96
        //    49: aload_2        
        //    50: aload_1        
        //    51: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    54: sipush          128
        //    57: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    60: astore_1       
        //    61: aload_1        
        //    62: ifnull          96
        //    65: aload_1        
        //    66: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    69: astore_2       
        //    70: aload_2        
        //    71: ifnull          96
        //    74: aload_2        
        //    75: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    77: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //    80: ifeq            96
        //    83: aload_1        
        //    84: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    87: ldc             "delivery_metrics_exported_to_big_query_enabled"
        //    89: iconst_0       
        //    90: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //    93: istore_0       
        //    94: iload_0        
        //    95: ireturn        
        //    96: iconst_0       
        //    97: ireturn        
        //    98: ldc             "FirebaseMessaging"
        //   100: ldc             "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
        //   102: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   105: pop            
        //   106: iconst_0       
        //   107: ireturn        
        //   108: astore_1       
        //   109: goto            98
        //   112: astore_1       
        //   113: iconst_0       
        //   114: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      4      108    112    Ljava/lang/IllegalStateException;
        //  40     45     112    115    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  49     61     112    115    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  65     70     112    115    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  74     94     112    115    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    public static a b(final a.b b, final Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle bundle;
        if ((bundle = intent.getExtras()) == null) {
            bundle = Bundle.EMPTY;
        }
        final a.a h = a.p().m(p(bundle)).e(b).f(f(bundle)).i(m()).k(a.d.q).h(k(bundle));
        final String h2 = h(bundle);
        if (h2 != null) {
            h.g(h2);
        }
        final String o = o(bundle);
        if (o != null) {
            h.l(o);
        }
        final String c = c(bundle);
        if (c != null) {
            h.c(c);
        }
        final String i = i(bundle);
        if (i != null) {
            h.b(i);
        }
        final String e = e(bundle);
        if (e != null) {
            h.d(e);
        }
        final long n = n(bundle);
        if (n > 0L) {
            h.j(n);
        }
        return h.a();
    }
    
    public static String c(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("collapse_key");
    }
    
    public static String d(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("google.c.a.c_id");
    }
    
    public static String e(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("google.c.a.c_l");
    }
    
    public static String f(Bundle string) {
        string = (InterruptedException)((BaseBundle)string).getString("google.to");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return (String)string;
        }
        try {
            string = (InterruptedException)m.a(h.u(e.o()).a());
            return (String)string;
        }
        catch (InterruptedException string) {}
        catch (ExecutionException ex) {}
        throw new RuntimeException(string);
    }
    
    public static String g(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("google.c.a.m_c");
    }
    
    public static String h(final Bundle bundle) {
        String s;
        if ((s = ((BaseBundle)bundle).getString("google.message_id")) == null) {
            s = ((BaseBundle)bundle).getString("message_id");
        }
        return s;
    }
    
    public static String i(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("google.c.a.m_l");
    }
    
    public static String j(final Bundle bundle) {
        return ((BaseBundle)bundle).getString("google.c.a.ts");
    }
    
    public static a.c k(final Bundle bundle) {
        if (bundle != null && L.t(bundle)) {
            return a.c.s;
        }
        return a.c.q;
    }
    
    public static String l(final Bundle bundle) {
        if (bundle != null && L.t(bundle)) {
            return "display";
        }
        return "data";
    }
    
    public static String m() {
        return e.o().m().getPackageName();
    }
    
    public static long n(Bundle o) {
        if (((BaseBundle)o).containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(((BaseBundle)o).getString("google.c.sender.id"));
            }
            catch (NumberFormatException ex) {
                Log.w("FirebaseMessaging", "error parsing project number", (Throwable)ex);
            }
        }
        o = (Bundle)e.o();
        final String f = ((e)o).r().f();
        if (f != null) {
            try {
                return Long.parseLong(f);
            }
            catch (NumberFormatException ex2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", (Throwable)ex2);
            }
        }
        final String c = ((e)o).r().c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            }
            catch (NumberFormatException ex3) {
                Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex3);
                return 0L;
            }
        }
        final String[] split = c.split(":");
        if (split.length < 2) {
            return 0L;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(s);
    }
    
    public static String o(final Bundle bundle) {
        final String string = ((BaseBundle)bundle).getString("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }
    
    public static int p(Bundle value) {
        value = (Bundle)((BaseBundle)value).get("google.ttl");
        if (value instanceof Integer) {
            return (int)value;
        }
        if (!(value instanceof String)) {
            return 0;
        }
        while (true) {
            while (true) {
                try {
                    return Integer.parseInt((String)value);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid TTL: ");
                    sb.append(value);
                    Log.w("FirebaseMessaging", sb.toString());
                    return 0;
                }
                catch (NumberFormatException ex) {}
                continue;
            }
        }
    }
    
    public static String q(final Bundle bundle) {
        if (((BaseBundle)bundle).containsKey("google.c.a.udt")) {
            return ((BaseBundle)bundle).getString("google.c.a.udt");
        }
        return null;
    }
    
    public static boolean r(final Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
    
    public static void s(final Intent intent) {
        x("_nd", intent.getExtras());
    }
    
    public static void t(final Intent intent) {
        x("_nf", intent.getExtras());
    }
    
    public static void u(final Bundle bundle) {
        z(bundle);
        x("_no", bundle);
    }
    
    public static void v(final Intent intent) {
        if (B(intent)) {
            x("_nr", intent.getExtras());
        }
        if (A(intent)) {
            w(a.b.q, intent, FirebaseMessaging.w());
        }
    }
    
    public static void w(final a.b b, final Intent intent, final g g) {
        if (g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        final a b2 = b(b, intent);
        if (b2 == null) {
            return;
        }
        try {
            g.a("FCM_CLIENT_EVENT_LOGGING", b.class, c2.b.b("proto"), new I()).b(c.d(b.b().b(b2).a()));
        }
        catch (RuntimeException ex) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", (Throwable)ex);
        }
    }
    
    public static void x(final String str, Bundle obj) {
        while (true) {
            try {
                e.o();
                Bundle bundle = obj;
                if (obj == null) {
                    bundle = new Bundle();
                }
                obj = new Bundle();
                final String d = d(bundle);
                if (d != null) {
                    ((BaseBundle)obj).putString("_nmid", d);
                }
                final String e = e(bundle);
                if (e != null) {
                    ((BaseBundle)obj).putString("_nmn", e);
                }
                final String i = i(bundle);
                if (!TextUtils.isEmpty((CharSequence)i)) {
                    ((BaseBundle)obj).putString("label", i);
                }
                final String g = g(bundle);
                if (!TextUtils.isEmpty((CharSequence)g)) {
                    ((BaseBundle)obj).putString("message_channel", g);
                }
                final String o = o(bundle);
                if (o != null) {
                    ((BaseBundle)obj).putString("_nt", o);
                }
                final String j = j(bundle);
                if (j != null) {
                    try {
                        ((BaseBundle)obj).putInt("_nmt", Integer.parseInt(j));
                    }
                    catch (NumberFormatException ex) {
                        Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
                    }
                }
                final String q = q(bundle);
                if (q != null) {
                    try {
                        ((BaseBundle)obj).putInt("_ndt", Integer.parseInt(q));
                    }
                    catch (NumberFormatException ex2) {
                        Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
                    }
                }
                final String l = l(bundle);
                if ("_nr".equals(str) || "_nf".equals(str)) {
                    ((BaseBundle)obj).putString("_nmc", l);
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Logging to scion event=");
                    sb.append(str);
                    sb.append(" scionPayload=");
                    sb.append(obj);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                final w3.a a = (w3.a)s3.e.o().k(w3.a.class);
                if (a != null) {
                    a.e("fcm", str, obj);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
                return;
                Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
            }
            catch (IllegalStateException ex3) {
                continue;
            }
            break;
        }
    }
    
    public static void y(final boolean b) {
        e.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", b).apply();
    }
    
    public static void z(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(((BaseBundle)bundle).getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
            return;
        }
        final w3.a a = (w3.a)e.o().k(w3.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (a != null) {
            final String string = ((BaseBundle)bundle).getString("google.c.a.c_id");
            a.d("fcm", "_ln", string);
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("source", "Firebase");
            ((BaseBundle)bundle2).putString("medium", "notification");
            ((BaseBundle)bundle2).putString("campaign", string);
            a.e("fcm", "_cmp", bundle2);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
    }
}
