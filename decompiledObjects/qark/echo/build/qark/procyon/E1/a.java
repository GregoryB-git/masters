// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Activity;
import x1.B;
import android.os.IBinder;
import android.content.ComponentName;
import G1.i;
import kotlin.jvm.internal.Intrinsics;
import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
    public static final a a;
    public static final String b;
    public static final AtomicBoolean c;
    public static Boolean d;
    public static Boolean e;
    public static ServiceConnection f;
    public static Application$ActivityLifecycleCallbacks g;
    public static Intent h;
    public static Object i;
    
    static {
        a = new a();
        b = a.class.getCanonicalName();
        c = new AtomicBoolean(false);
    }
    
    public static final /* synthetic */ Boolean a() {
        return E1.a.e;
    }
    
    public static final /* synthetic */ Object b() {
        return E1.a.i;
    }
    
    public static final /* synthetic */ void d(final Object i) {
        E1.a.i = i;
    }
    
    public static final void g() {
        final a a = E1.a.a;
        a.e();
        if (Intrinsics.a(E1.a.d, Boolean.FALSE)) {
            return;
        }
        if (G1.i.c()) {
            a.h();
        }
    }
    
    public final void e() {
        if (E1.a.d != null) {
            return;
        }
        final Class a = m.a("com.android.vending.billing.IInAppBillingService$Stub");
        final boolean b = false;
        if (Intrinsics.a(E1.a.d = (a != null), Boolean.FALSE)) {
            return;
        }
        boolean b2 = b;
        if (m.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
            b2 = true;
        }
        E1.a.e = b2;
        E1.i.b();
        final Intent setPackage = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(setPackage, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        E1.a.h = setPackage;
        E1.a.f = (ServiceConnection)new ServiceConnection() {
            public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                Intrinsics.checkNotNullParameter(componentName, "name");
                Intrinsics.checkNotNullParameter(binder, "service");
                final a a = E1.a.a;
                final E1.i a2 = E1.i.a;
                E1.a.d(E1.i.a(B.l(), binder));
            }
            
            public void onServiceDisconnected(final ComponentName componentName) {
                Intrinsics.checkNotNullParameter(componentName, "name");
            }
        };
        E1.a.g = (Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks() {
            public static final void c() {
                final Context l = B.l();
                final E1.i a = E1.i.a;
                final ArrayList i = E1.i.i(l, E1.a.b());
                final a a2 = E1.a.a;
                a2.f(l, i, false);
                a2.f(l, E1.i.j(l, E1.a.b()), true);
            }
            
            public static final void d() {
                final Context l = B.l();
                final E1.i a = E1.i.a;
                ArrayList list;
                if ((list = E1.i.i(l, E1.a.b())).isEmpty()) {
                    list = E1.i.g(l, E1.a.b());
                }
                E1.a.a.f(l, list, false);
            }
            
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityDestroyed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityPaused(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityResumed(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    B.t().execute(new c());
                }
                catch (Exception ex) {}
            }
            
            public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(bundle, "outState");
            }
            
            public void onActivityStarted(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
            
            public void onActivityStopped(final Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    if (Intrinsics.a(E1.a.a(), Boolean.TRUE) && Intrinsics.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        B.t().execute(new b());
                    }
                }
                catch (Exception ex) {}
            }
        };
    }
    
    public final void f(final Context context, ArrayList iterator, final boolean b) {
        if (((ArrayList)iterator).isEmpty()) {
            return;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final ArrayList<String> list = new ArrayList<String>();
        iterator = ((ArrayList<String>)iterator).iterator();
        while (iterator.hasNext()) {
            final String s = iterator.next();
            try {
                final String string = new JSONObject(s).getString("productId");
                Intrinsics.checkNotNullExpressionValue(string, "sku");
                Intrinsics.checkNotNullExpressionValue(s, "purchase");
                hashMap.put(string, s);
                list.add(string);
            }
            catch (JSONException ex) {
                Log.e(E1.a.b, "Error parsing in-app purchase data.", (Throwable)ex);
            }
        }
        final E1.i a = E1.i.a;
        for (final Map.Entry<String, V> entry : E1.i.k(context, list, E1.a.i, b).entrySet()) {
            final String key = entry.getKey();
            final String s2 = (String)entry.getValue();
            final String s3 = hashMap.get(key);
            if (s3 == null) {
                continue;
            }
            G1.i.f(s3, s2, b);
        }
    }
    
    public final void h() {
        if (!E1.a.c.compareAndSet(false, true)) {
            return;
        }
        final Context l = B.l();
        if (!(l instanceof Application)) {
            return;
        }
        final Application application = (Application)l;
        final Application$ActivityLifecycleCallbacks g = E1.a.g;
        if (g == null) {
            Intrinsics.n("callbacks");
            throw null;
        }
        application.registerActivityLifecycleCallbacks(g);
        final Intent h = E1.a.h;
        if (h == null) {
            Intrinsics.n("intent");
            throw null;
        }
        final ServiceConnection f = E1.a.f;
        if (f != null) {
            l.bindService(h, f, 1);
            return;
        }
        Intrinsics.n("serviceConnection");
        throw null;
    }
}
