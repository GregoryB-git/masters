// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.concurrent.locks.Lock;
import android.os.BaseBundle;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import G1.h;
import java.util.Arrays;
import O1.P;
import android.os.AsyncTask;
import org.json.JSONException;
import java.util.Collection;
import org.json.JSONArray;
import java.util.List;
import Q1.g;
import java.io.File;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import O1.b;
import O1.E;
import O1.v;
import G1.f;
import android.app.Application;
import y1.p;
import I1.c;
import O1.n;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import kotlin.text.i;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import O1.Q;
import O1.H;
import W5.I;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executor;
import java.util.HashSet;

public final class B
{
    public static final B a;
    public static final String b;
    public static final HashSet c;
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
        a = new B();
        b = B.class.getCanonicalName();
        c = I.c(N.t);
        B.i = new AtomicLong(65536L);
        B.n = 64206;
        o = new ReentrantLock();
        B.p = H.a();
        t = new AtomicBoolean(false);
        B.u = "instagram.com";
        B.v = "facebook.com";
        B.w = (a)new s();
    }
    
    public static final long A() {
        Q.l();
        return B.i.get();
    }
    
    public static final String B() {
        return "16.3.0";
    }
    
    public static final F C(final x1.a a, final String s, final JSONObject jsonObject, final F.b b) {
        return F.n.A(a, s, jsonObject, b);
    }
    
    public static final boolean D() {
        return B.j;
    }
    
    public static final boolean E() {
        synchronized (B.class) {
            return B.x;
        }
    }
    
    public static final boolean F() {
        return B.t.get();
    }
    
    public static final boolean G() {
        return B.k;
    }
    
    public static final boolean H(final N o) {
        Intrinsics.checkNotNullParameter(o, "behavior");
        final HashSet c = B.c;
        // monitorenter(c)
        // monitorexit(c)
        Label_0043: {
            boolean contains = false;
            Label_0039: {
                try {
                    if (D()) {
                        contains = c.contains(o);
                        if (contains) {
                            contains = true;
                            break Label_0039;
                        }
                    }
                }
                finally {
                    break Label_0043;
                }
                contains = false;
            }
            return contains;
        }
    }
    // monitorexit(c)
    
    public static final void I(final Context context) {
        if (context == null) {
            return;
        }
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (B.e == null) {
                final Object value = ((BaseBundle)applicationInfo.metaData).get("com.facebook.sdk.ApplicationId");
                if (value instanceof String) {
                    final String s = (String)value;
                    final Locale root = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(root, "ROOT");
                    final String lowerCase = s.toLowerCase(root);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String substring = s;
                    if (kotlin.text.i.s(lowerCase, "fb", false, 2, null)) {
                        substring = s.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    }
                    B.e = substring;
                }
                else if (value instanceof Number) {
                    throw new o("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (B.f == null) {
                B.f = ((BaseBundle)applicationInfo.metaData).getString("com.facebook.sdk.ApplicationName");
            }
            if (B.g == null) {
                B.g = ((BaseBundle)applicationInfo.metaData).getString("com.facebook.sdk.ClientToken");
            }
            if (B.n == 64206) {
                B.n = ((BaseBundle)applicationInfo.metaData).getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (B.h == null) {
                B.h = ((BaseBundle)applicationInfo.metaData).getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false);
            }
        }
        catch (PackageManager$NameNotFoundException ex) {}
    }
    
    public static final void K(Context applicationContext, final String s) {
        if (T1.a.d(B.class)) {
            return;
        }
        Label_0082: {
            try {
                Intrinsics.checkNotNullParameter(applicationContext, "context");
                Intrinsics.checkNotNullParameter(s, "applicationId");
                applicationContext = applicationContext.getApplicationContext();
                if (applicationContext == null) {
                    return;
                }
                t().execute(new A(applicationContext, s));
                final n a = O1.n.a;
                if (O1.n.g(O1.n.b.E) && I1.c.d()) {
                    I1.c.g(s, "com.facebook.sdk.attributionTracking");
                    return;
                }
            }
            finally {
                break Label_0082;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, B.class);
    }
    
    public static final void L(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "$applicationContext");
        Intrinsics.checkNotNullParameter(s, "$applicationId");
        B.a.J(context, s);
    }
    
    public static final void M(final Context context) {
        synchronized (B.class) {
            Intrinsics.checkNotNullParameter(context, "applicationContext");
            N(context, null);
        }
    }
    
    public static final void N(Context context, final b b) {
        // monitorenter(B.class)
        Label_0375: {
            AtomicBoolean t;
            try {
                Intrinsics.checkNotNullParameter(context, "applicationContext");
                t = B.t;
                if (t.get()) {
                    if (b != null) {
                        b.a();
                    }
                    // monitorexit(B.class)
                    return;
                }
            }
            finally {
                break Label_0375;
            }
            final Context context2;
            Q.e(context2, false);
            Q.f(context2, false);
            final Context applicationContext = context2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext.applicationContext");
            B.m = applicationContext;
            y1.p.b.d(context2);
            context = B.m;
            if (context == null) {
                Intrinsics.n("applicationContext");
                throw null;
            }
            I(context);
            final String e = B.e;
            if (e == null || e.length() == 0) {
                throw new o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            final String g = B.g;
            if (g == null || g.length() == 0) {
                throw new o("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            t.set(true);
            if (o()) {
                j();
            }
            context = B.m;
            if (context == null) {
                Intrinsics.n("applicationContext");
                throw null;
            }
            if (context instanceof Application && X.f()) {
                final f a = G1.f.a;
                context = B.m;
                if (context == null) {
                    Intrinsics.n("applicationContext");
                    throw null;
                }
                G1.f.x((Application)context, B.e);
            }
            O1.v.h();
            E.x();
            final O1.b.a b2 = b.b;
            final Context m = B.m;
            if (m != null) {
                b2.a(m);
                B.l = new O1.B(new t());
                final n a2 = O1.n.a;
                O1.n.a(O1.n.b.I, (n.a)new u());
                O1.n.a(O1.n.b.s, (n.a)new x1.v());
                O1.n.a(O1.n.b.T, (n.a)new w());
                O1.n.a(O1.n.b.U, (n.a)new x());
                O1.n.a(O1.n.b.V, (n.a)new y());
                t().execute(new FutureTask<Object>(new z(b)));
                // monitorexit(B.class)
                return;
            }
            Intrinsics.n("applicationContext");
            throw null;
        }
    }
    // monitorexit(B.class)
    
    public static final File O() {
        final Context m = B.m;
        if (m != null) {
            return m.getCacheDir();
        }
        Intrinsics.n("applicationContext");
        throw null;
    }
    
    public static final void P(final boolean b) {
        if (b) {
            Q1.g.d();
        }
    }
    
    public static final void Q(final boolean b) {
        if (b) {
            y1.B.a();
        }
    }
    
    public static final void R(final boolean b) {
        if (b) {
            B.q = true;
        }
    }
    
    public static final void S(final boolean b) {
        if (b) {
            B.r = true;
        }
    }
    
    public static final void T(final boolean b) {
        if (b) {
            B.s = true;
        }
    }
    
    public static final Void U(final b b) {
        x1.g.f.e().j();
        x1.Q.d.a().d();
        if (x1.a.z.g()) {
            final O.b v = O.v;
            if (v.b() == null) {
                v.a();
            }
        }
        if (b != null) {
            b.a();
        }
        final p.a b2 = y1.p.b;
        b2.g(l(), B.e);
        X.n();
        final Context applicationContext = l().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        b2.h(applicationContext).a();
        return null;
    }
    
    public static final void V(final boolean b) {
        X.s(b);
        if (b) {
            final Application application = (Application)l();
            final f a = G1.f.a;
            G1.f.x(application, m());
        }
    }
    
    public static final void W(final String[] array, final int n, final int n2) {
        if (T1.a.d(B.class)) {
            return;
        }
        Label_0122: {
            String[] array2;
            if ((array2 = array) == null) {
                try {
                    array2 = new String[0];
                }
                finally {
                    break Label_0122;
                }
            }
            try {
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("data_processing_options", (Object)new JSONArray((Collection)W5.g.u(array2)));
                jsonObject.put("data_processing_options_country", n);
                jsonObject.put("data_processing_options_state", n2);
                final Context m = B.m;
                if (m != null) {
                    m.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jsonObject.toString()).apply();
                    return;
                }
                Intrinsics.n("applicationContext");
                throw null;
                final Throwable t;
                T1.a.b(t, B.class);
            }
            catch (JSONException ex) {}
        }
    }
    
    public static final void j() {
        B.x = true;
    }
    
    public static final boolean k() {
        return X.d();
    }
    
    public static final Context l() {
        Q.l();
        final Context m = B.m;
        if (m != null) {
            return m;
        }
        Intrinsics.n("applicationContext");
        throw null;
    }
    
    public static final String m() {
        Q.l();
        final String e = B.e;
        if (e != null) {
            return e;
        }
        throw new o("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }
    
    public static final String n() {
        Q.l();
        return B.f;
    }
    
    public static final boolean o() {
        return X.e();
    }
    
    public static final boolean p() {
        return X.f();
    }
    
    public static final int q() {
        Q.l();
        return B.n;
    }
    
    public static final String r() {
        Q.l();
        final String g = B.g;
        if (g != null) {
            return g;
        }
        throw new o("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }
    
    public static final boolean s() {
        return X.g();
    }
    
    public static final Executor t() {
        Object o = B.o;
        ((Lock)o).lock();
        while (true) {
            try {
                if (B.d == null) {
                    B.d = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                final V5.t a = V5.t.a;
                ((Lock)o).unlock();
                o = B.d;
                if (o != null) {
                    return (Executor)o;
                }
                throw new IllegalStateException("Required value was null.".toString());
                ((Lock)o).unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final String u() {
        return B.v;
    }
    
    public static final String v() {
        return "fb.gg";
    }
    
    public static final String w() {
        final P a = P.a;
        final String b = B.b;
        final kotlin.jvm.internal.x a2 = kotlin.jvm.internal.x.a;
        final String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[] { B.p }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        P.j0(b, format);
        return B.p;
    }
    
    public static final String x() {
        final x1.a e = x1.a.z.e();
        String h;
        if (e != null) {
            h = e.h();
        }
        else {
            h = null;
        }
        return P.E(h);
    }
    
    public static final String y() {
        return B.u;
    }
    
    public static final boolean z(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Q.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
    
    public final void J(final Context context, String format) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    final O1.a e = O1.a.f.e(context);
                    final SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    final String i = Intrinsics.i(format, "ping");
                    final long long1 = sharedPreferences.getLong(i, 0L);
                    try {
                        final h a = G1.h.a;
                        final JSONObject a2 = G1.h.a(G1.h.a.o, e, y1.p.b.d(context), z(context), context);
                        final kotlin.jvm.internal.x a3 = kotlin.jvm.internal.x.a;
                        format = String.format("%s/activities", Arrays.copyOf(new Object[] { format }, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        final F a4 = B.w.a(null, format, a2, null);
                        if (long1 == 0L && a4.k().b() == null) {
                            final SharedPreferences$Editor edit = sharedPreferences.edit();
                            edit.putLong(i, System.currentTimeMillis());
                            edit.apply();
                        }
                        return;
                    }
                    catch (JSONException ex) {
                        throw new o("An error occurred while publishing install.", (Throwable)ex);
                    }
                    final Exception ex2;
                    P.i0("Facebook-publish", ex2);
                    return;
                    final Throwable t;
                    T1.a.b(t, this);
                    return;
                }
                finally {}
            }
            catch (Exception ex3) {}
            final Exception ex3;
            final Exception ex2 = ex3;
            continue;
        }
    }
    
    public interface a
    {
        F a(final x1.a p0, final String p1, final JSONObject p2, final F.b p3);
    }
    
    public interface b
    {
        void a();
    }
}
