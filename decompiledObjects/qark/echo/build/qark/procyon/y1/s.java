// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import O1.y;
import V5.t;
import java.util.concurrent.Executor;
import android.app.Application;
import java.util.Iterator;
import O1.v;
import java.util.HashSet;
import android.util.Log;
import G1.i;
import java.util.Currency;
import java.math.BigDecimal;
import org.json.JSONException;
import x1.o;
import F1.c;
import F1.b;
import x1.N;
import O1.q;
import java.util.UUID;
import G1.f;
import android.os.Bundle;
import x1.B;
import O1.Q;
import kotlin.jvm.internal.Intrinsics;
import O1.P;
import android.content.Context;
import kotlin.jvm.internal.g;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class s
{
    public static final a c;
    public static final String d;
    public static ScheduledThreadPoolExecutor e;
    public static p.b f;
    public static final Object g;
    public static String h;
    public static boolean i;
    public static String j;
    public final String a;
    public y1.a b;
    
    static {
        c = new a(null);
        String canonicalName;
        if ((canonicalName = s.class.getCanonicalName()) == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        d = canonicalName;
        s.f = p.b.o;
        g = new Object();
    }
    
    public s(final Context context, final String s, final x1.a a) {
        this(P.t(context), s, a);
    }
    
    public s(String j, final String s, final x1.a a) {
        Intrinsics.checkNotNullParameter(j, "activityName");
        Q.l();
        this.a = j;
        x1.a e = a;
        if (a == null) {
            e = x1.a.z.e();
        }
        y1.a b;
        if (e != null && !e.n() && (s == null || Intrinsics.a(s, e.c()))) {
            b = new y1.a(e);
        }
        else {
            if ((j = s) == null) {
                final P a2 = P.a;
                j = P.J(B.l());
            }
            if (j == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            b = new y1.a(null, j);
        }
        this.b = b;
        s.c.o();
    }
    
    public static final /* synthetic */ String a() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            return s.h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return null;
        }
    }
    
    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            return s.e;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return null;
        }
    }
    
    public static final /* synthetic */ p.b c() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            return s.f;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return null;
        }
    }
    
    public static final /* synthetic */ String d() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            return s.j;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Object e() {
        if (T1.a.d(s.class)) {
            return null;
        }
        try {
            return s.g;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return null;
        }
    }
    
    public static final /* synthetic */ boolean f() {
        if (T1.a.d(s.class)) {
            return false;
        }
        try {
            return s.i;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
            return false;
        }
    }
    
    public static final /* synthetic */ void g(final boolean i) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            s.i = i;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
        }
    }
    
    public static final /* synthetic */ void h(final String h) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            s.h = h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
        }
    }
    
    public static final /* synthetic */ void i(final ScheduledThreadPoolExecutor e) {
        if (T1.a.d(s.class)) {
            return;
        }
        try {
            s.e = e;
        }
        finally {
            final Throwable t;
            T1.a.b(t, s.class);
        }
    }
    
    public final void j() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final n a = n.a;
            n.l(C.o);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final String k() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.b.b();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final void l(final String s) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.o(s, null);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void m(final String s, final double n) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.n(s, n, null);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void n(final String s, final double d, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(s, d, bundle, false, G1.f.m());
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void o(final String s, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(s, null, bundle, false, G1.f.m());
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void p(final String s, final Double n, final Bundle bundle, final boolean b, final UUID uuid) {
        if (T1.a.d(this)) {
            return;
        }
        if (s != null) {
            final String s2;
            Label_0172: {
                try {
                    if (s.length() == 0) {
                        return;
                    }
                    final q a = q.a;
                    if (q.d("app_events_killswitch", B.m(), false)) {
                        O1.C.e.c(N.s, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", s);
                        return;
                    }
                }
                finally {
                    break Label_0172;
                }
                try {
                    b.h(bundle, s2);
                    F1.c.e(bundle);
                    s.c.q(new e(this.a, s2, n, bundle, b, G1.f.o(), uuid), this.b);
                    return;
                }
                catch (o o) {
                    O1.C.e.c(N.s, "AppEvents", "Invalid app event: %s", o.toString());
                    return;
                }
                catch (JSONException ex2) {
                    final JSONException ex;
                    O1.C.e.c(N.s, "AppEvents", "JSON encoding for app event failed: '%s'", ex.toString());
                    return;
                }
            }
            T1.a.b((Throwable)s2, this);
        }
    }
    
    public final void q(final String s, final String s2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("_is_suggested_event", "1");
            ((BaseBundle)bundle).putString("_button_text", s2);
            this.o(s, bundle);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void r(final String s, final Double n, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.p(s, n, bundle, true, G1.f.m());
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void s(final String s, final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            Label_0071: {
                if (bigDecimal == null || currency == null) {
                    break Label_0071;
                }
                Label_0091: {
                    Bundle bundle2;
                    if ((bundle2 = bundle) != null) {
                        break Label_0091;
                    }
                    try {
                        bundle2 = new Bundle();
                        ((BaseBundle)bundle2).putString("fb_currency", currency.getCurrencyCode());
                        this.p(s, bigDecimal.doubleValue(), bundle2, true, G1.f.m());
                        return;
                        final Throwable t;
                        T1.a.b(t, this);
                        return;
                        final P a = P.a;
                        P.j0(s.d, "purchaseAmount and currency cannot be null");
                        return;
                    }
                    finally {}
                }
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void t(final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                if (G1.i.c()) {
                    Log.w(s.d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                }
                this.u(bigDecimal, currency, bundle, false);
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
    
    public final void u(final BigDecimal bigDecimal, final Currency currency, final Bundle bundle, final boolean b) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0022: {
            if (bigDecimal != null) {
                break Label_0022;
            }
            while (true) {
                try {
                    s.c.r("purchaseAmount cannot be null");
                    return;
                    final Throwable t;
                    T1.a.b(t, this);
                    return;
                    // iftrue(Label_0036:, currency != null)
                    s.c.r("currency cannot be null");
                    return;
                    final Bundle bundle2;
                    Label_0036: {
                        bundle2 = new Bundle();
                    }
                    // iftrue(Label_0052:, bundle2 = bundle != null)
                    Label_0052: {
                        ((BaseBundle)bundle2).putString("fb_currency", currency.getCurrencyCode());
                    }
                    this.p("fb_mobile_purchase", bigDecimal.doubleValue(), bundle2, b, G1.f.m());
                    s.c.g();
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void v(final BigDecimal bigDecimal, final Currency currency, final Bundle bundle) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.u(bigDecimal, currency, bundle, true);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void w(final Bundle p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_1        
        //     9: ldc_w           "payload"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_1        
        //    16: ldc_w           "fb_push_payload"
        //    19: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    22: astore_1       
        //    23: aload_1        
        //    24: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
        //    27: ifeq            31
        //    30: return         
        //    31: new             Lorg/json/JSONObject;
        //    34: dup            
        //    35: aload_1        
        //    36: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    39: ldc_w           "campaign"
        //    42: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    45: astore_1       
        //    46: goto            55
        //    49: astore_1       
        //    50: goto            112
        //    53: aconst_null    
        //    54: astore_1       
        //    55: aload_1        
        //    56: ifnonnull       75
        //    59: getstatic       O1/C.e:LO1/C$a;
        //    62: getstatic       x1/N.t:Lx1/N;
        //    65: getstatic       y1/s.d:Ljava/lang/String;
        //    68: ldc_w           "Malformed payload specified for logging a push notification open."
        //    71: invokevirtual   O1/C$a.b:(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V
        //    74: return         
        //    75: new             Landroid/os/Bundle;
        //    78: dup            
        //    79: invokespecial   android/os/Bundle.<init>:()V
        //    82: astore_3       
        //    83: aload_3        
        //    84: ldc_w           "fb_push_campaign"
        //    87: aload_1        
        //    88: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //    91: aload_2        
        //    92: ifnull          103
        //    95: aload_3        
        //    96: ldc_w           "fb_push_action"
        //    99: aload_2        
        //   100: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: ldc_w           "fb_mobile_push_opened"
        //   107: aload_3        
        //   108: invokevirtual   y1/s.o:(Ljava/lang/String;Landroid/os/Bundle;)V
        //   111: return         
        //   112: aload_1        
        //   113: aload_0        
        //   114: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   117: return         
        //   118: astore_1       
        //   119: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  8      15     49     53     Any
        //  15     30     118    55     Lorg/json/JSONException;
        //  15     30     49     53     Any
        //  31     46     118    55     Lorg/json/JSONException;
        //  31     46     49     53     Any
        //  59     74     49     53     Any
        //  75     91     49     53     Any
        //  95     103    49     53     Any
        //  103    111    49     53     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
        public static final void n(Context sharedPreferences, final s s) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "$context");
            Intrinsics.checkNotNullParameter(s, "$logger");
            final Bundle bundle = new Bundle();
            int n2;
            int n = n2 = 0;
            while (true) {
                final int n3 = n + 1;
                final String className = (new String[] { "com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService" })[n];
                final String s2 = (new String[] { "core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included" })[n];
                while (true) {
                    try {
                        Class.forName(className);
                        ((BaseBundle)bundle).putInt(s2, 1);
                        n2 |= 1 << n;
                        if (n3 > 10) {
                            sharedPreferences = (Context)sharedPreferences.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                            if (((SharedPreferences)sharedPreferences).getInt("kitsBitmask", 0) != n2) {
                                ((SharedPreferences)sharedPreferences).edit().putInt("kitsBitmask", n2).apply();
                                s.r("fb_sdk_initialize", null, bundle);
                            }
                            return;
                        }
                        n = n3;
                    }
                    catch (ClassNotFoundException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public static final void p() {
            final HashSet<String> set = new HashSet<String>();
            final Iterator<y1.a> iterator = n.p().iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().b());
            }
            final Iterator<Object> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                v.q(iterator2.next(), true);
            }
        }
        
        public final void f(final Application application, final String s) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (B.F()) {
                y1.d.e();
                L.i();
                String m;
                if ((m = s) == null) {
                    m = B.m();
                }
                B.K((Context)application, m);
                G1.f.x(application, m);
                return;
            }
            throw new o("The Facebook sdk must be initialized before calling activateApp");
        }
        
        public final void g() {
            if (this.j() != p.b.p) {
                final n a = n.a;
                n.l(C.t);
            }
        }
        
        public final Executor h() {
            if (s.b() == null) {
                this.o();
            }
            final ScheduledThreadPoolExecutor b = s.b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        
        public final String i(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            while (true) {
                if (s.a() == null) {
                    final Object e = s.e();
                    // monitorenter(e)
                    while (true) {
                        try {
                            if (s.a() == null) {
                                s.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String)null));
                                if (s.a() == null) {
                                    final UUID randomUUID = UUID.randomUUID();
                                    Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
                                    s.h(Intrinsics.i("XZ", randomUUID));
                                    context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", s.a()).apply();
                                }
                            }
                            final t a = t.a;
                            // monitorexit(e)
                            final String a2 = s.a();
                            if (a2 != null) {
                                return a2;
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        // monitorexit(e)
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        public final p.b j() {
            synchronized (s.e()) {
                return s.c();
            }
        }
        
        public final String k() {
            final y a = y.a;
            y.d((y.a)new y.a() {
                @Override
                public void a(final String s) {
                    s.c.t(s);
                }
            });
            return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String)null);
        }
        
        public final String l() {
            synchronized (s.e()) {
                return s.d();
            }
        }
        
        public final void m(final Context context, final String s) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!B.p()) {
                return;
            }
            final s s2 = new s(context, s, null);
            final ScheduledThreadPoolExecutor b = s.b();
            if (b != null) {
                b.execute(new r(context, s2));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        
        public final void o() {
            Object e = s.e();
            synchronized (e) {
                if (s.b() != null) {
                    return;
                }
                s.i(new ScheduledThreadPoolExecutor(1));
                final t a = t.a;
                // monitorexit(e)
                e = new y1.q();
                final ScheduledThreadPoolExecutor b = s.b();
                if (b != null) {
                    b.scheduleAtFixedRate((Runnable)e, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        
        public final void q(final e e, final y1.a a) {
            n.g(a, e);
            final O1.n a2 = O1.n.a;
            if (O1.n.g(O1.n.b.F) && I1.c.d()) {
                I1.c.e(a.b(), e);
            }
            if (!e.c() && !s.f()) {
                if (Intrinsics.a(e.f(), "fb_mobile_activate_app")) {
                    s.g(true);
                    return;
                }
                O1.C.e.b(N.s, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
        
        public final void r(final String s) {
            O1.C.e.b(N.t, "AppEvents", s);
        }
        
        public final void s() {
            n.s();
        }
        
        public final void t(final String s) {
            final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (s != null) {
                sharedPreferences.edit().putString("install_referrer", s).apply();
            }
        }
    }
}
