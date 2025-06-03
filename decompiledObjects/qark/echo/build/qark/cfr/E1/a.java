/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package E1;

import E1.b;
import E1.c;
import E1.i;
import E1.m;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class a {
    public static final a a = new a();
    public static final String b = a.class.getCanonicalName();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static Boolean d;
    public static Boolean e;
    public static ServiceConnection f;
    public static Application.ActivityLifecycleCallbacks g;
    public static Intent h;
    public static Object i;

    public static final /* synthetic */ void d(Object object) {
        i = object;
    }

    public static final void g() {
        a a8 = a;
        a8.e();
        if (Intrinsics.a((Object)d, (Object)Boolean.FALSE)) {
            return;
        }
        if (G1.i.c()) {
            a8.h();
        }
    }

    public final void e() {
        if (d != null) {
            return;
        }
        Class class_ = m.a("com.android.vending.billing.IInAppBillingService$Stub");
        boolean bl = false;
        boolean bl2 = class_ != null;
        class_ = Boolean.valueOf((boolean)bl2);
        d = class_;
        if (Intrinsics.a((Object)class_, (Object)Boolean.FALSE)) {
            return;
        }
        bl2 = bl;
        if (m.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
            bl2 = true;
        }
        e = bl2;
        i.b();
        class_ = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue((Object)class_, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        h = class_;
        f = new ServiceConnection(){

            public void onServiceConnected(ComponentName object, IBinder iBinder) {
                Intrinsics.checkNotNullParameter(object, "name");
                Intrinsics.checkNotNullParameter((Object)iBinder, "service");
                object = a.a;
                object = i.a;
                a.d(i.a(B.l(), iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                Intrinsics.checkNotNullParameter((Object)componentName, "name");
            }
        };
        g = new Application.ActivityLifecycleCallbacks(){

            public static /* synthetic */ void a() {
                .c();
            }

            public static /* synthetic */ void b() {
                .d();
            }

            public static final void c() {
                Context context = B.l();
                i i8 = i.a;
                i8 = i.i(context, i);
                a a8 = a.a;
                a8.f(context, (ArrayList)i8, false);
                a8.f(context, i.j(context, i), true);
            }

            public static final void d() {
                Context context = B.l();
                i i8 = i.a;
                ArrayList arrayList = i.i(context, i);
                i8 = arrayList;
                if (arrayList.isEmpty()) {
                    i8 = i.g(context, i);
                }
                a.a.f(context, (ArrayList)i8, false);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                try {
                    B.t().execute((Runnable)new c());
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                Intrinsics.checkNotNullParameter((Object)bundle, "outState");
            }

            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
            }

            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter((Object)activity, "activity");
                try {
                    if (Intrinsics.a((Object)e, (Object)Boolean.TRUE) && Intrinsics.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                        B.t().execute((Runnable)new b());
                    }
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
        };
    }

    public final void f(Context context, ArrayList object, boolean bl) {
        if (object.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Object object2 = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            String string2 = (String)object.next();
            try {
                String string3 = new JSONObject(string2).getString("productId");
                Intrinsics.checkNotNullExpressionValue(string3, "sku");
                Intrinsics.checkNotNullExpressionValue(string2, "purchase");
                hashMap.put((Object)string3, (Object)string2);
                object2.add((Object)string3);
            }
            catch (JSONException jSONException) {
                Log.e((String)b, (String)"Error parsing in-app purchase data.", (Throwable)jSONException);
            }
        }
        object = i.a;
        context = i.k(context, (ArrayList)object2, i, bl).entrySet().iterator();
        while (context.hasNext()) {
            object2 = (Map.Entry)context.next();
            object = (String)object2.getKey();
            object2 = (String)object2.getValue();
            if ((object = (String)hashMap.get(object)) == null) continue;
            G1.i.f((String)object, (String)object2, bl);
        }
    }

    public final void h() {
        if (!c.compareAndSet(false, true)) {
            return;
        }
        Context context = B.l();
        if (context instanceof Application) {
            Application application = (Application)context;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = g;
            if (activityLifecycleCallbacks != null) {
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                application = h;
                if (application != null) {
                    activityLifecycleCallbacks = f;
                    if (activityLifecycleCallbacks != null) {
                        context.bindService((Intent)application, (ServiceConnection)activityLifecycleCallbacks, 1);
                        return;
                    }
                    Intrinsics.n("serviceConnection");
                    throw null;
                }
                Intrinsics.n("intent");
                throw null;
            }
            Intrinsics.n("callbacks");
            throw null;
        }
    }

}

