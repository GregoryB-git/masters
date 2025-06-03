package E1;

import E1.a;
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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1537a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f1538b = a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f1539c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f1540d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f1541e;

    /* renamed from: f, reason: collision with root package name */
    public static ServiceConnection f1542f;

    /* renamed from: g, reason: collision with root package name */
    public static Application.ActivityLifecycleCallbacks f1543g;

    /* renamed from: h, reason: collision with root package name */
    public static Intent f1544h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f1545i;

    /* renamed from: E1.a$a, reason: collision with other inner class name */
    public static final class ServiceConnectionC0020a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            a aVar = a.f1537a;
            i iVar = i.f1577a;
            a.f1545i = i.a(C2146B.l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final void c() {
            Context l7 = C2146B.l();
            i iVar = i.f1577a;
            ArrayList i7 = i.i(l7, a.f1545i);
            a aVar = a.f1537a;
            aVar.f(l7, i7, false);
            aVar.f(l7, i.j(l7, a.f1545i), true);
        }

        public static final void d() {
            Context l7 = C2146B.l();
            i iVar = i.f1577a;
            ArrayList i7 = i.i(l7, a.f1545i);
            if (i7.isEmpty()) {
                i7 = i.g(l7, a.f1545i);
            }
            a.f1537a.f(l7, i7, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                C2146B.t().execute(new Runnable() { // from class: E1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.a(a.f1541e, Boolean.TRUE) && Intrinsics.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C2146B.t().execute(new Runnable() { // from class: E1.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void g() {
        a aVar = f1537a;
        aVar.e();
        if (!Intrinsics.a(f1540d, Boolean.FALSE) && G1.i.c()) {
            aVar.h();
        }
    }

    public final void e() {
        if (f1540d != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f1540d = valueOf;
        if (Intrinsics.a(valueOf, Boolean.FALSE)) {
            return;
        }
        f1541e = Boolean.valueOf(m.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        i.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f1544h = intent;
        f1542f = new ServiceConnectionC0020a();
        f1543g = new b();
    }

    public final void f(Context context, ArrayList arrayList, boolean z7) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e7) {
                Log.e(f1538b, "Error parsing in-app purchase data.", e7);
            }
        }
        i iVar = i.f1577a;
        for (Map.Entry entry : i.k(context, arrayList2, f1545i, z7).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) hashMap.get(str);
            if (str3 != null) {
                G1.i.f(str3, str2, z7);
            }
        }
    }

    public final void h() {
        if (f1539c.compareAndSet(false, true)) {
            Context l7 = C2146B.l();
            if (l7 instanceof Application) {
                Application application = (Application) l7;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f1543g;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.n("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f1544h;
                if (intent == null) {
                    Intrinsics.n("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f1542f;
                if (serviceConnection != null) {
                    l7.bindService(intent, serviceConnection, 1);
                } else {
                    Intrinsics.n("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
