// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.BaseBundle;
import android.content.pm.PackageManager;
import java.util.Map;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import O1.r;
import android.os.Bundle;
import O1.v;
import T1.a;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;

public final class X
{
    public static final X a;
    public static final String b;
    public static final AtomicBoolean c;
    public static final AtomicBoolean d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static SharedPreferences j;
    
    static {
        a = new X();
        b = X.class.getName();
        c = new AtomicBoolean(false);
        d = new AtomicBoolean(false);
        e = new a(true, "com.facebook.sdk.AutoInitEnabled");
        f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
        g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
        h = new a(false, "auto_event_setup_enabled");
        i = new a(true, "com.facebook.sdk.MonitorEnabled");
    }
    
    public static final boolean d() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            X.a.j();
            return X.g.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, X.class);
            return false;
        }
    }
    
    public static final boolean e() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            X.a.j();
            return X.e.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, X.class);
            return false;
        }
    }
    
    public static final boolean f() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            final X a = X.a;
            a.j();
            return a.b();
        }
        finally {
            final Throwable t;
            T1.a.b(t, X.class);
            return false;
        }
    }
    
    public static final boolean g() {
        if (T1.a.d(X.class)) {
            return false;
        }
        try {
            X.a.j();
            return X.h.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, X.class);
            return false;
        }
    }
    
    public static final void i(final long n) {
        if (T1.a.d(X.class)) {
            return;
        }
        while (true) {
            while (true) {
                Label_0176: {
                    while (true) {
                        try {
                            if (X.g.e()) {
                                final v a = v.a;
                                final r q = v.q(B.m(), false);
                                if (q != null && q.b()) {
                                    final O1.a e = O1.a.f.e(B.l());
                                    if (e == null || e.h() == null) {
                                        break Label_0176;
                                    }
                                    final String h = e.h();
                                    if (h != null) {
                                        final Bundle bundle = new Bundle();
                                        ((BaseBundle)bundle).putString("advertiser_id", h);
                                        ((BaseBundle)bundle).putString("fields", "auto_event_setup_enabled");
                                        final F x = F.n.x(null, "app", null);
                                        x.G(bundle);
                                        final JSONObject c = x.k().c();
                                        if (c != null) {
                                            final a h2 = X.h;
                                            h2.g(c.optBoolean("auto_event_setup_enabled", false));
                                            h2.f(n);
                                            X.a.u(h2);
                                        }
                                    }
                                }
                            }
                            X.d.set(false);
                            return;
                            final Throwable t;
                            T1.a.b(t, X.class);
                            return;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final String h = null;
                continue;
            }
        }
    }
    
    public static final void n() {
        if (T1.a.d(X.class)) {
            return;
        }
        while (true) {
            try {
                final Context l = B.l();
                final ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                final Bundle metaData = applicationInfo.metaData;
                if (metaData != null && ((BaseBundle)metaData).getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    final y1.F f = new y1.F(l);
                    final Bundle bundle = new Bundle();
                    if (!P.U()) {
                        ((BaseBundle)bundle).putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        Log.w(X.b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    f.d("fb_auto_applink", bundle);
                    return;
                }
                return;
                final Throwable t;
                T1.a.b(t, X.class);
                return;
            }
            catch (PackageManager$NameNotFoundException ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final Boolean q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_0       
        //     3: ldc             Lx1/X;.class
        //     5: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     8: ifeq            13
        //    11: aconst_null    
        //    12: areturn        
        //    13: getstatic       x1/X.a:Lx1/X;
        //    16: invokevirtual   x1/X.t:()V
        //    19: getstatic       x1/X.j:Landroid/content/SharedPreferences;
        //    22: astore_1       
        //    23: aload_1        
        //    24: ifnull          76
        //    27: aload_1        
        //    28: getstatic       x1/X.f:Lx1/X$a;
        //    31: invokevirtual   x1/X$a.b:()Ljava/lang/String;
        //    34: ldc             ""
        //    36: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    41: astore_1       
        //    42: aload_1        
        //    43: ifnonnull       105
        //    46: goto            49
        //    49: aload_0        
        //    50: invokeinterface java/lang/CharSequence.length:()I
        //    55: ifle            95
        //    58: new             Lorg/json/JSONObject;
        //    61: dup            
        //    62: aload_0        
        //    63: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    66: ldc_w           "value"
        //    69: invokevirtual   org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
        //    72: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    75: areturn        
        //    76: ldc_w           "userSettingPref"
        //    79: invokestatic    kotlin/jvm/internal/Intrinsics.n:(Ljava/lang/String;)V
        //    82: aconst_null    
        //    83: athrow         
        //    84: getstatic       O1/P.a:LO1/P;
        //    87: astore_0       
        //    88: getstatic       x1/X.b:Ljava/lang/String;
        //    91: aload_1        
        //    92: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //    95: aconst_null    
        //    96: areturn        
        //    97: aload_0        
        //    98: ldc             Lx1/X;.class
        //   100: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   103: aconst_null    
        //   104: areturn        
        //   105: aload_1        
        //   106: astore_0       
        //   107: goto            49
        //   110: astore_0       
        //   111: goto            97
        //   114: astore_1       
        //   115: goto            84
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  13     19     110    105    Any
        //  19     23     114    95     Lorg/json/JSONException;
        //  19     23     110    105    Any
        //  27     42     114    95     Lorg/json/JSONException;
        //  27     42     110    105    Any
        //  49     76     114    95     Lorg/json/JSONException;
        //  49     76     110    105    Any
        //  76     84     114    95     Lorg/json/JSONException;
        //  76     84     110    105    Any
        //  84     95     110    105    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    public static final void s(final boolean b) {
        if (T1.a.d(X.class)) {
            return;
        }
        while (true) {
            try {
                final a f = X.f;
                f.g(b);
                f.f(System.currentTimeMillis());
                if (X.c.get()) {
                    X.a.u(f);
                    return;
                }
                X.a.j();
                return;
                final Throwable t;
                T1.a.b(t, X.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean b() {
        if (T1.a.d(this)) {
            return false;
        }
        while (true) {
            try {
                final Map g = v.g();
                if (g == null || g.isEmpty()) {
                    return X.f.e();
                }
                final Boolean b = g.get("auto_log_app_events_enabled");
                final Boolean b2 = g.get("auto_log_app_events_default");
                if (b != null) {
                    return b;
                }
                final Boolean c = this.c();
                if (c == null) {
                    return b2 == null || b2;
                }
                return c;
                final Throwable t;
                T1.a.b(t, this);
                return false;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Boolean c() {
        if (T1.a.d(this)) {
            return null;
        }
        final Throwable t;
        Label_0036: {
            try {
                if (q() == null) {
                    final Boolean l = this.l();
                    if (l == null) {
                        return null;
                    }
                    return l;
                }
            }
            finally {
                break Label_0036;
            }
            return (Boolean)t;
        }
        T1.a.b(t, this);
        return null;
    }
    
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final a h = X.h;
                this.r(h);
                final long currentTimeMillis = System.currentTimeMillis();
                if (h.d() != null && currentTimeMillis - h.c() < 604800000L) {
                    return;
                }
                h.g(null);
                h.f(0L);
                if (!X.d.compareAndSet(false, true)) {
                    return;
                }
                B.t().execute(new W(currentTimeMillis));
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (!B.F()) {
                return;
            }
            if (!X.c.compareAndSet(false, true)) {
                return;
            }
            final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            X.j = sharedPreferences;
            this.k(X.f, X.g, X.e);
            this.h();
            this.p();
            this.o();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void k(final a... array) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final int length = array.length;
                int i = 0;
                while (i < length) {
                    final a a = array[i];
                    final int n = i + 1;
                    if (a == X.h) {
                        this.h();
                        i = n;
                    }
                    else if (a.d() == null) {
                        this.r(a);
                        i = n;
                        if (a.d() != null) {
                            continue;
                        }
                        this.m(a);
                        i = n;
                    }
                    else {
                        this.u(a);
                        i = n;
                    }
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Boolean l() {
        if (T1.a.d(this)) {
            return null;
        }
        Throwable t = null;
        Label_0100: {
            try {
                this.t();
                final Context context = B.l();
                final Context context3;
                final Context context2 = context3 = context;
                final PackageManager packageManager = context3.getPackageManager();
                final Context context4 = context2;
                final String s = context4.getPackageName();
                final int n = 128;
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, n);
                final ApplicationInfo applicationInfo3;
                final ApplicationInfo applicationInfo2 = applicationInfo3 = applicationInfo;
                final String s2 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)";
                Intrinsics.checkNotNullExpressionValue(applicationInfo3, s2);
                final ApplicationInfo applicationInfo4 = applicationInfo2;
                final Bundle bundle = applicationInfo4.metaData;
                final Bundle bundle3;
                final Bundle bundle2 = bundle3 = bundle;
                if (bundle3 == null) {
                    return null;
                }
                final a a = X.f;
                final Bundle bundle4 = bundle2;
                final a a2 = a;
                final String s3 = a2.b();
                final boolean b = ((BaseBundle)bundle4).containsKey(s3);
                if (b) {
                    final ApplicationInfo applicationInfo5 = applicationInfo2;
                    final Bundle bundle5 = applicationInfo5.metaData;
                    final a a3 = a;
                    final String s4 = a3.b();
                    final boolean boolean1 = ((BaseBundle)bundle5).getBoolean(s4);
                    final boolean boolean2 = boolean1;
                    return boolean2;
                }
                return null;
            }
            finally {
                final Object o;
                t = (Throwable)o;
                break Label_0100;
            }
            try {
                final Context context = B.l();
                final Context context3;
                final Context context2 = context3 = context;
                final PackageManager packageManager = context3.getPackageManager();
                final Context context4 = context2;
                final String s = context4.getPackageName();
                final int n = 128;
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, n);
                final ApplicationInfo applicationInfo3;
                final ApplicationInfo applicationInfo2 = applicationInfo3 = applicationInfo;
                final String s2 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)";
                Intrinsics.checkNotNullExpressionValue(applicationInfo3, s2);
                final ApplicationInfo applicationInfo4 = applicationInfo2;
                final Bundle bundle = applicationInfo4.metaData;
                final Bundle bundle3;
                final Bundle bundle2 = bundle3 = bundle;
                if (bundle3 != null) {
                    final a a = X.f;
                    final Bundle bundle4 = bundle2;
                    final a a2 = a;
                    final String s3 = a2.b();
                    final boolean b = ((BaseBundle)bundle4).containsKey(s3);
                    if (b) {
                        final ApplicationInfo applicationInfo5 = applicationInfo2;
                        final Bundle bundle5 = applicationInfo5.metaData;
                        final a a3 = a;
                        final String s4 = a3.b();
                        final boolean boolean2;
                        final boolean boolean1 = boolean2 = ((BaseBundle)bundle5).getBoolean(s4);
                        return boolean2;
                    }
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                final P a4 = P.a;
                P.i0(X.b, (Exception)ex);
            }
            return null;
        }
        T1.a.b(t, this);
        return null;
    }
    
    public final void m(final a a) {
        if (a.d(this)) {
            return;
        }
        Throwable t = null;
        Label_0097: {
            try {
                this.t();
                final Context context = B.l();
                final Context context3;
                final Context context2 = context3 = context;
                final PackageManager packageManager = context3.getPackageManager();
                final Context context4 = context2;
                final String s = context4.getPackageName();
                final int n = 128;
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, n);
                final ApplicationInfo applicationInfo3;
                final ApplicationInfo applicationInfo2 = applicationInfo3 = applicationInfo;
                final String s2 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)";
                Intrinsics.checkNotNullExpressionValue(applicationInfo3, s2);
                final ApplicationInfo applicationInfo4 = applicationInfo2;
                final Bundle bundle = applicationInfo4.metaData;
                final Bundle bundle3;
                final Bundle bundle2 = bundle3 = bundle;
                if (bundle3 == null) {
                    return;
                }
                final Bundle bundle4 = bundle2;
                final a a2 = a;
                final String s3 = a2.b();
                final boolean b = ((BaseBundle)bundle4).containsKey(s3);
                if (b) {
                    final a a3 = a;
                    final ApplicationInfo applicationInfo5 = applicationInfo2;
                    final Bundle bundle5 = applicationInfo5.metaData;
                    final a a4 = a;
                    final String s4 = a4.b();
                    final a a5 = a;
                    final boolean b2 = a5.a();
                    final boolean b3 = ((BaseBundle)bundle5).getBoolean(s4, b2);
                    final Boolean b4 = b3;
                    a3.g(b4);
                }
                return;
            }
            finally {
                final Object o;
                t = (Throwable)o;
                break Label_0097;
            }
            try {
                final Context context = B.l();
                final Context context3;
                final Context context2 = context3 = context;
                final PackageManager packageManager = context3.getPackageManager();
                final Context context4 = context2;
                final String s = context4.getPackageName();
                final int n = 128;
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, n);
                final ApplicationInfo applicationInfo3;
                final ApplicationInfo applicationInfo2 = applicationInfo3 = applicationInfo;
                final String s2 = "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)";
                Intrinsics.checkNotNullExpressionValue(applicationInfo3, s2);
                final ApplicationInfo applicationInfo4 = applicationInfo2;
                final Bundle bundle = applicationInfo4.metaData;
                final Bundle bundle3;
                final Bundle bundle2 = bundle3 = bundle;
                if (bundle3 != null) {
                    final Bundle bundle4 = bundle2;
                    final a a2 = a;
                    final String s3 = a2.b();
                    final boolean b = ((BaseBundle)bundle4).containsKey(s3);
                    if (b) {
                        final a a3 = a;
                        final ApplicationInfo applicationInfo5 = applicationInfo2;
                        final Bundle bundle5 = applicationInfo5.metaData;
                        final a a4 = a;
                        final String s4 = a4.b();
                        final a a5 = a;
                        final boolean b2 = a5.a();
                        final boolean b3 = ((BaseBundle)bundle5).getBoolean(s4, b2);
                        final Boolean b4 = b3;
                        a3.g(b4);
                        return;
                    }
                }
            }
            catch (PackageManager$NameNotFoundException ex) {
                final P a6 = P.a;
                P.i0(X.b, (Exception)ex);
            }
            return;
        }
        a.b(t, this);
    }
    
    public final void o() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final void p() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final Context l = B.l();
                final ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                final Bundle metaData = applicationInfo.metaData;
                if (metaData != null) {
                    if (!((BaseBundle)metaData).containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(X.b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!d()) {
                        Log.w(X.b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                        return;
                    }
                }
                return;
                final Throwable t;
                T1.a.b(t, this);
                return;
            }
            catch (PackageManager$NameNotFoundException ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void r(final a p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_2       
        //     3: aload_0        
        //     4: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     7: ifeq            11
        //    10: return         
        //    11: aload_0        
        //    12: invokevirtual   x1/X.t:()V
        //    15: getstatic       x1/X.j:Landroid/content/SharedPreferences;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnull          87
        //    23: aload_3        
        //    24: aload_1        
        //    25: invokevirtual   x1/X$a.b:()Ljava/lang/String;
        //    28: ldc             ""
        //    30: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    35: astore_3       
        //    36: aload_3        
        //    37: ifnonnull       113
        //    40: goto            43
        //    43: aload_2        
        //    44: invokeinterface java/lang/CharSequence.length:()I
        //    49: ifle            106
        //    52: new             Lorg/json/JSONObject;
        //    55: dup            
        //    56: aload_2        
        //    57: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    60: astore_2       
        //    61: aload_1        
        //    62: aload_2        
        //    63: ldc_w           "value"
        //    66: invokevirtual   org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
        //    69: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    72: invokevirtual   x1/X$a.g:(Ljava/lang/Boolean;)V
        //    75: aload_1        
        //    76: aload_2        
        //    77: ldc_w           "last_timestamp"
        //    80: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //    83: invokevirtual   x1/X$a.f:(J)V
        //    86: return         
        //    87: ldc_w           "userSettingPref"
        //    90: invokestatic    kotlin/jvm/internal/Intrinsics.n:(Ljava/lang/String;)V
        //    93: aconst_null    
        //    94: athrow         
        //    95: getstatic       O1/P.a:LO1/P;
        //    98: astore_1       
        //    99: getstatic       x1/X.b:Ljava/lang/String;
        //   102: aload_2        
        //   103: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   106: return         
        //   107: aload_1        
        //   108: aload_0        
        //   109: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   112: return         
        //   113: aload_3        
        //   114: astore_2       
        //   115: goto            43
        //   118: astore_1       
        //   119: goto            107
        //   122: astore_2       
        //   123: goto            95
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  11     15     118    113    Any
        //  15     19     122    106    Lorg/json/JSONException;
        //  15     19     118    113    Any
        //  23     36     122    106    Lorg/json/JSONException;
        //  23     36     118    113    Any
        //  43     86     122    106    Lorg/json/JSONException;
        //  43     86     118    113    Any
        //  87     95     122    106    Lorg/json/JSONException;
        //  87     95     118    113    Any
        //  95     106    118    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public final void t() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (X.c.get()) {
                return;
            }
            throw new C("The UserSettingManager has not been initialized successfully");
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void u(final a p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: invokevirtual   x1/X.t:()V
        //    12: new             Lorg/json/JSONObject;
        //    15: dup            
        //    16: invokespecial   org/json/JSONObject.<init>:()V
        //    19: astore_2       
        //    20: aload_2        
        //    21: ldc_w           "value"
        //    24: aload_1        
        //    25: invokevirtual   x1/X$a.d:()Ljava/lang/Boolean;
        //    28: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    31: pop            
        //    32: aload_2        
        //    33: ldc_w           "last_timestamp"
        //    36: aload_1        
        //    37: invokevirtual   x1/X$a.c:()J
        //    40: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;J)Lorg/json/JSONObject;
        //    43: pop            
        //    44: getstatic       x1/X.j:Landroid/content/SharedPreferences;
        //    47: astore_3       
        //    48: aload_3        
        //    49: ifnull          81
        //    52: aload_3        
        //    53: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    58: aload_1        
        //    59: invokevirtual   x1/X$a.b:()Ljava/lang/String;
        //    62: aload_2        
        //    63: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    66: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //    71: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //    76: aload_0        
        //    77: invokevirtual   x1/X.o:()V
        //    80: return         
        //    81: ldc_w           "userSettingPref"
        //    84: invokestatic    kotlin/jvm/internal/Intrinsics.n:(Ljava/lang/String;)V
        //    87: aconst_null    
        //    88: athrow         
        //    89: getstatic       O1/P.a:LO1/P;
        //    92: astore_1       
        //    93: getstatic       x1/X.b:Ljava/lang/String;
        //    96: aload_2        
        //    97: invokestatic    O1/P.i0:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   100: return         
        //   101: aload_1        
        //   102: aload_0        
        //   103: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   106: return         
        //   107: astore_1       
        //   108: goto            101
        //   111: astore_2       
        //   112: goto            89
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      12     107    111    Any
        //  12     48     111    101    Ljava/lang/Exception;
        //  12     48     107    111    Any
        //  52     80     111    101    Ljava/lang/Exception;
        //  52     80     107    111    Any
        //  81     89     111    101    Ljava/lang/Exception;
        //  81     89     107    111    Any
        //  89     100    107    111    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    public static final class a
    {
        public boolean a;
        public String b;
        public Boolean c;
        public long d;
        
        public a(final boolean a, final String b) {
            Intrinsics.checkNotNullParameter(b, "key");
            this.a = a;
            this.b = b;
        }
        
        public final boolean a() {
            return this.a;
        }
        
        public final String b() {
            return this.b;
        }
        
        public final long c() {
            return this.d;
        }
        
        public final Boolean d() {
            return this.c;
        }
        
        public final boolean e() {
            final Boolean c = this.c;
            if (c == null) {
                return this.a;
            }
            return c;
        }
        
        public final void f(final long d) {
            this.d = d;
        }
        
        public final void g(final Boolean c) {
            this.c = c;
        }
    }
}
