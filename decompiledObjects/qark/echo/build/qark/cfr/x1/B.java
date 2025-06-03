/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.locks.ReentrantLock
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import G1.f;
import G1.h;
import I1.c;
import O1.E;
import O1.H;
import O1.P;
import O1.a;
import O1.b;
import O1.n;
import W5.I;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.A;
import x1.F;
import x1.K;
import x1.N;
import x1.O;
import x1.Q;
import x1.X;
import x1.a;
import x1.g;
import x1.o;
import x1.r;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
import x1.w;
import x1.x;
import x1.y;
import x1.z;
import y1.p;

public final class B {
    public static final B a = new B();
    public static final String b = B.class.getCanonicalName();
    public static final HashSet c = I.c((Object[])new N[]{N.t});
    public static Executor d;
    public static volatile String e;
    public static volatile String f;
    public static volatile String g;
    public static volatile Boolean h;
    public static AtomicLong i;
    public static volatile boolean j;
    public static boolean k;
    public static O1.B l;
    public static Context m;
    public static int n;
    public static final ReentrantLock o;
    public static String p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static final AtomicBoolean t;
    public static volatile String u;
    public static volatile String v;
    public static a w;
    public static boolean x;

    static {
        i = new AtomicLong(65536L);
        n = 64206;
        o = new ReentrantLock();
        p = H.a();
        t = new AtomicBoolean(false);
        u = "instagram.com";
        v = "facebook.com";
        w = new s();
    }

    public static final long A() {
        O1.Q.l();
        return i.get();
    }

    public static final String B() {
        return "16.3.0";
    }

    public static final F C(x1.a a8, String string2, JSONObject jSONObject, F.b b8) {
        return F.n.A(a8, string2, jSONObject, b8);
    }

    public static final boolean D() {
        return j;
    }

    public static final boolean E() {
        synchronized (B.class) {
            boolean bl = x;
            return bl;
        }
    }

    public static final boolean F() {
        return t.get();
    }

    public static final boolean G() {
        return k;
    }

    public static final boolean H(N n8) {
        Intrinsics.checkNotNullParameter((Object)n8, "behavior");
        HashSet hashSet = c;
        synchronized (hashSet) {
            Throwable throwable2;
            block3 : {
                boolean bl;
                try {
                    bl = B.D() && (bl = hashSet.contains((Object)n8));
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                return bl;
            }
            throw throwable2;
        }
    }

    public static final void I(Context object) {
        ApplicationInfo applicationInfo;
        if (object == null) {
            return;
        }
        try {
            applicationInfo = object.getPackageManager().getApplicationInfo(object.getPackageName(), 128);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue((Object)applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
        if (applicationInfo.metaData == null) {
            return;
        }
        if (e == null) {
            object = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
            if (object instanceof String) {
                String string2 = (String)object;
                object = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(object, "ROOT");
                String string3 = string2.toLowerCase((Locale)object);
                Intrinsics.checkNotNullExpressionValue(string3, "(this as java.lang.String).toLowerCase(locale)");
                object = string2;
                if (i.s(string3, "fb", false, 2, null)) {
                    object = string2.substring(2);
                    Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).substring(startIndex)");
                }
                e = object;
            } else if (object instanceof Number) {
                throw new o("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
            }
        }
        if (f == null) {
            f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if (g == null) {
            g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
        }
        if (n == 64206) {
            n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
        }
        if (h == null) {
            h = applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false);
        }
    }

    public static final void K(Context object, String string2) {
        Throwable throwable2;
        block7 : {
            block6 : {
                block5 : {
                    if (T1.a.d(B.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(object, "context");
                        Intrinsics.checkNotNullParameter(string2, "applicationId");
                        object = object.getApplicationContext();
                        if (object != null) break block5;
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                B.t().execute((Runnable)new A((Context)object, string2));
                object = n.a;
                if (n.g(n.b.E) && c.d()) {
                    c.g(string2, "com.facebook.sdk.attributionTracking");
                    return;
                }
                break block6;
                break block7;
            }
            return;
        }
        T1.a.b(throwable2, B.class);
    }

    public static final void L(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "$applicationContext");
        Intrinsics.checkNotNullParameter(string2, "$applicationId");
        a.J(context, string2);
    }

    public static final void M(Context context) {
        synchronized (B.class) {
            Intrinsics.checkNotNullParameter((Object)context, "applicationContext");
            B.N(context, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void N(Context object, b b8) {
        synchronized (B.class) {
            Throwable throwable2;
            block15 : {
                block10 : {
                    block11 : {
                        block12 : {
                            block13 : {
                                block14 : {
                                    AtomicBoolean atomicBoolean;
                                    block8 : {
                                        block9 : {
                                            try {
                                                Intrinsics.checkNotNullParameter(object, "applicationContext");
                                                atomicBoolean = t;
                                                if (!atomicBoolean.get()) break block8;
                                                if (b8 == null) break block9;
                                                b8.a();
                                            }
                                            catch (Throwable throwable2) {}
                                        }
                                        return;
                                    }
                                    O1.Q.e((Context)object, false);
                                    O1.Q.f((Context)object, false);
                                    Context context = object.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue((Object)context, "applicationContext.applicationContext");
                                    m = context;
                                    p.b.d((Context)object);
                                    object = m;
                                    if (object == null) break block10;
                                    B.I((Context)object);
                                    object = e;
                                    if (object == null || object.length() == 0) break block11;
                                    object = g;
                                    if (object == null || object.length() == 0) break block12;
                                    atomicBoolean.set(true);
                                    if (B.o()) {
                                        B.j();
                                    }
                                    if ((object = m) == null) break block13;
                                    if (object instanceof Application && X.f()) {
                                        object = f.a;
                                        object = m;
                                        if (object == null) {
                                            Intrinsics.n("applicationContext");
                                            throw null;
                                        }
                                        f.x((Application)object, e);
                                    }
                                    O1.v.h();
                                    E.x();
                                    object = O1.b.b;
                                    atomicBoolean = m;
                                    if (atomicBoolean == null) break block14;
                                    object.a((Context)atomicBoolean);
                                    l = new O1.B(new t());
                                    object = n.a;
                                    n.a(n.b.I, new u());
                                    n.a(n.b.s, new v());
                                    n.a(n.b.T, new w());
                                    n.a(n.b.U, new x());
                                    n.a(n.b.V, new y());
                                    object = new FutureTask((Callable)new z(b8));
                                    B.t().execute((Runnable)object);
                                    return;
                                }
                                Intrinsics.n("applicationContext");
                                throw null;
                                break block15;
                            }
                            Intrinsics.n("applicationContext");
                            throw null;
                        }
                        throw new o("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                    }
                    throw new o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                }
                Intrinsics.n("applicationContext");
                throw null;
            }
            throw throwable2;
        }
    }

    public static final File O() {
        Context context = m;
        if (context != null) {
            return context.getCacheDir();
        }
        Intrinsics.n("applicationContext");
        throw null;
    }

    public static final void P(boolean bl) {
        if (bl) {
            Q1.g.d();
        }
    }

    public static final void Q(boolean bl) {
        if (bl) {
            y1.B.a();
        }
    }

    public static final void R(boolean bl) {
        if (bl) {
            q = true;
        }
    }

    public static final void S(boolean bl) {
        if (bl) {
            r = true;
        }
    }

    public static final void T(boolean bl) {
        if (bl) {
            s = true;
        }
    }

    public static final Void U(b object) {
        O.b b8;
        g.f.e().j();
        Q.d.a().d();
        if (x1.a.z.g() && (b8 = O.v).b() == null) {
            b8.a();
        }
        if (object != null) {
            object.a();
        }
        object = p.b;
        object.g(B.l(), e);
        X.n();
        b8 = B.l().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(b8, "getApplicationContext().applicationContext");
        object.h((Context)b8).a();
        return null;
    }

    public static final void V(boolean bl) {
        X.s(bl);
        if (bl) {
            Application application = (Application)B.l();
            f f8 = f.a;
            f.x(application, B.m());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void W(String[] jSONObject, int n8, int n9) {
        Throwable throwable2;
        block7 : {
            if (T1.a.d(B.class)) {
                return;
            }
            JSONObject jSONObject2 = jSONObject;
            if (jSONObject == null) {
                try {
                    jSONObject2 = new String[]{};
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            try {
                jSONObject = new JSONObject();
                jSONObject.put("data_processing_options", (Object)new JSONArray((Collection)W5.g.u((Object[])jSONObject2)));
                jSONObject.put("data_processing_options_country", n8);
                jSONObject.put("data_processing_options_state", n9);
                jSONObject2 = m;
                if (jSONObject2 != null) {
                    jSONObject2.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
                    return;
                }
                Intrinsics.n("applicationContext");
                throw null;
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        T1.a.b(throwable2, B.class);
    }

    public static /* synthetic */ File a() {
        return B.O();
    }

    public static /* synthetic */ void b(boolean bl) {
        B.P(bl);
    }

    public static /* synthetic */ void c(boolean bl) {
        B.S(bl);
    }

    public static /* synthetic */ Void d(b b8) {
        return B.U(b8);
    }

    public static /* synthetic */ F e(x1.a a8, String string2, JSONObject jSONObject, F.b b8) {
        return B.C(a8, string2, jSONObject, b8);
    }

    public static /* synthetic */ void f(boolean bl) {
        B.Q(bl);
    }

    public static /* synthetic */ void g(boolean bl) {
        B.R(bl);
    }

    public static /* synthetic */ void h(boolean bl) {
        B.T(bl);
    }

    public static /* synthetic */ void i(Context context, String string2) {
        B.L(context, string2);
    }

    public static final void j() {
        x = true;
    }

    public static final boolean k() {
        return X.d();
    }

    public static final Context l() {
        O1.Q.l();
        Context context = m;
        if (context != null) {
            return context;
        }
        Intrinsics.n("applicationContext");
        throw null;
    }

    public static final String m() {
        O1.Q.l();
        String string2 = e;
        if (string2 != null) {
            return string2;
        }
        throw new o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        O1.Q.l();
        return f;
    }

    public static final boolean o() {
        return X.e();
    }

    public static final boolean p() {
        return X.f();
    }

    public static final int q() {
        O1.Q.l();
        return n;
    }

    public static final String r() {
        O1.Q.l();
        String string2 = g;
        if (string2 != null) {
            return string2;
        }
        throw new o("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return X.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Executor t() {
        ReentrantLock reentrantLock = o;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            V5.t t8 = V5.t.a;
        }
        catch (Throwable throwable) {}
        reentrantLock.unlock();
        reentrantLock = d;
        if (reentrantLock != null) {
            return reentrantLock;
        }
        throw new IllegalStateException("Required value was null.".toString());
        reentrantLock.unlock();
        throw throwable;
    }

    public static final String u() {
        return v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        Object object = P.a;
        object = b;
        Object object2 = kotlin.jvm.internal.x.a;
        object2 = String.format((String)"getGraphApiVersion: %s", (Object[])Arrays.copyOf((Object[])new Object[]{p}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(format, *args)");
        P.j0((String)object, (String)object2);
        return p;
    }

    public static final String x() {
        Object object = x1.a.z.e();
        object = object != null ? object.h() : null;
        return P.E((String)object);
    }

    public static final String y() {
        return u;
    }

    public static final boolean z(Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        O1.Q.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void J(Context object, String string2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object object2 = O1.a.f.e((Context)object);
            SharedPreferences sharedPreferences = object.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String string3 = Intrinsics.i(string2, "ping");
            long l8 = sharedPreferences.getLong(string3, 0L);
            try {
                h h8 = h.a;
                object = h.a(h.a.o, (O1.a)object2, p.b.d((Context)object), B.z((Context)object), (Context)object);
                object2 = kotlin.jvm.internal.x.a;
            }
            catch (JSONException jSONException) {
                throw new o("An error occurred while publishing install.", (Throwable)jSONException);
            }
            string2 = String.format((String)"%s/activities", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
            Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
            object = w.a(null, string2, (JSONObject)object, null);
            if (l8 != 0L) return;
            if (object.k().b() != null) return;
            object = sharedPreferences.edit();
            object.putLong(string3, System.currentTimeMillis());
            object.apply();
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return;
        catch (Exception exception) {}
        P.i0("Facebook-publish", exception);
    }

    public static interface a {
        public F a(x1.a var1, String var2, JSONObject var3, F.b var4);
    }

    public static interface b {
        public void a();
    }

}

