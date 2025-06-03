package O1;

import W5.C0681k;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* renamed from: O1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0443f f3841a = new C0443f();

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3842b = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        HashSet t7;
        if (T1.a.d(C0443f.class)) {
            return null;
        }
        try {
            Context l7 = C2146B.l();
            List<ResolveInfo> queryIntentServices = l7.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            t7 = C0681k.t(f3842b);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && t7.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, C0443f.class);
            return null;
        }
    }

    public static final String b() {
        if (T1.a.d(C0443f.class)) {
            return null;
        }
        try {
            return Intrinsics.i("fbconnect://cct.", C2146B.l().getPackageName());
        } catch (Throwable th) {
            T1.a.b(th, C0443f.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (T1.a.d(C0443f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            Q q7 = Q.f3766a;
            return Q.d(C2146B.l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : Q.d(C2146B.l(), b()) ? b() : "";
        } catch (Throwable th) {
            T1.a.b(th, C0443f.class);
            return null;
        }
    }
}
