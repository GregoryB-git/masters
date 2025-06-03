package s5;

import A5.a;
import E5.j;
import E5.k;
import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import y1.C2259p;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957a implements A5.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    public k f19314a;

    /* renamed from: b, reason: collision with root package name */
    public C2259p f19315b;

    /* renamed from: c, reason: collision with root package name */
    public String f19316c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19317d = "FacebookAppEvents";

    public final Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + f6.a.b(value.getClass()));
                }
                Bundle a7 = a((Map) value);
                Intrinsics.c(a7, "null cannot be cast to non-null type android.os.Bundle");
                bundle.putBundle(str, a7);
            }
        }
        return bundle;
    }

    public final void b(j jVar, k.d dVar) {
        C2259p.f21393b.b();
        dVar.a(null);
    }

    public final void c(j jVar, k.d dVar) {
        C2259p.f21393b.c();
        dVar.a(null);
    }

    public final void d(j jVar, k.d dVar) {
        C2259p c2259p = this.f19315b;
        if (c2259p == null) {
            Intrinsics.n("appEventsLogger");
            c2259p = null;
        }
        c2259p.a();
        dVar.a(null);
    }

    public final void e(j jVar, k.d dVar) {
        String str = this.f19316c;
        if (str == null) {
            Intrinsics.n("anonymousId");
            str = null;
        }
        dVar.a(str);
    }

    public final void f(j jVar, k.d dVar) {
        C2259p c2259p = this.f19315b;
        if (c2259p == null) {
            Intrinsics.n("appEventsLogger");
            c2259p = null;
        }
        dVar.a(c2259p.b());
    }

    public final void g(j jVar, k.d dVar) {
        Object a7 = jVar.a("name");
        String str = a7 instanceof String ? (String) a7 : null;
        Object a8 = jVar.a("parameters");
        Map map = a8 instanceof Map ? (Map) a8 : null;
        Object a9 = jVar.a("_valueToSum");
        Double d7 = a9 instanceof Double ? (Double) a9 : null;
        if (d7 != null && map != null) {
            Bundle a10 = a(map);
            C2259p c2259p = this.f19315b;
            if (c2259p == null) {
                Intrinsics.n("appEventsLogger");
                c2259p = null;
            }
            c2259p.e(str, d7.doubleValue(), a10);
        } else if (d7 != null) {
            C2259p c2259p2 = this.f19315b;
            if (c2259p2 == null) {
                Intrinsics.n("appEventsLogger");
                c2259p2 = null;
            }
            c2259p2.d(str, d7.doubleValue());
        } else if (map != null) {
            Bundle a11 = a(map);
            C2259p c2259p3 = this.f19315b;
            if (c2259p3 == null) {
                Intrinsics.n("appEventsLogger");
                c2259p3 = null;
            }
            c2259p3.f(str, a11);
        } else {
            C2259p c2259p4 = this.f19315b;
            if (c2259p4 == null) {
                Intrinsics.n("appEventsLogger");
                c2259p4 = null;
            }
            c2259p4.c(str);
        }
        dVar.a(null);
    }

    public final void h(j jVar, k.d dVar) {
        Object a7 = jVar.a("amount");
        Double d7 = a7 instanceof Double ? (Double) a7 : null;
        BigDecimal bigDecimal = d7 != null ? new BigDecimal(String.valueOf(d7.doubleValue())) : null;
        Object a8 = jVar.a("currency");
        Currency currency = Currency.getInstance(a8 instanceof String ? (String) a8 : null);
        Object a9 = jVar.a("parameters");
        Bundle a10 = a(a9 instanceof Map ? (Map) a9 : null);
        if (a10 == null) {
            a10 = new Bundle();
        }
        C2259p c2259p = this.f19315b;
        if (c2259p == null) {
            Intrinsics.n("appEventsLogger");
            c2259p = null;
        }
        c2259p.g(bigDecimal, currency, a10);
        dVar.a(null);
    }

    public final void i(j jVar, k.d dVar) {
        Object a7 = jVar.a("action");
        String str = a7 instanceof String ? (String) a7 : null;
        Object a8 = jVar.a("payload");
        Bundle a9 = a(a8 instanceof Map ? (Map) a8 : null);
        Intrinsics.b(a9);
        if (str != null) {
            C2259p c2259p = this.f19315b;
            if (c2259p == null) {
                Intrinsics.n("appEventsLogger");
                c2259p = null;
            }
            c2259p.i(a9, str);
        } else {
            C2259p c2259p2 = this.f19315b;
            if (c2259p2 == null) {
                Intrinsics.n("appEventsLogger");
                c2259p2 = null;
            }
            c2259p2.h(a9);
        }
        dVar.a(null);
    }

    public final void j(j jVar, k.d dVar) {
        dVar.a(null);
    }

    public final void k(j jVar, k.d dVar) {
        Object obj = jVar.f1671b;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        C2146B.V(((Boolean) obj).booleanValue());
        dVar.a(null);
    }

    public final void l(j jVar, k.d dVar) {
        Object a7 = jVar.a("options");
        ArrayList arrayList = a7 instanceof ArrayList ? (ArrayList) a7 : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Object a8 = jVar.a("country");
        Integer num = a8 instanceof Integer ? (Integer) a8 : null;
        int intValue = num != null ? num.intValue() : 0;
        Object a9 = jVar.a("state");
        Integer num2 = a9 instanceof Integer ? (Integer) a9 : null;
        C2146B.W((String[]) arrayList.toArray(new String[0]), intValue, num2 != null ? num2.intValue() : 0);
        dVar.a(null);
    }

    public final void m(j jVar, k.d dVar) {
        Object a7 = jVar.a("parameters");
        Bundle a8 = a(a7 instanceof Map ? (Map) a7 : null);
        C2259p.f21393b.j(a8 != null ? a8.getString("email") : null, a8 != null ? a8.getString("firstName") : null, a8 != null ? a8.getString("lastName") : null, a8 != null ? a8.getString("phone") : null, a8 != null ? a8.getString("dateOfBirth") : null, a8 != null ? a8.getString("gender") : null, a8 != null ? a8.getString("city") : null, a8 != null ? a8.getString("state") : null, a8 != null ? a8.getString("zip") : null, a8 != null ? a8.getString("country") : null);
        dVar.a(null);
    }

    public final void n(j jVar, k.d dVar) {
        Object obj = jVar.f1671b;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
        C2259p.f21393b.k((String) obj);
        dVar.a(null);
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        k kVar = new k(flutterPluginBinding.b(), "flutter.oddbit.id/facebook_app_events");
        this.f19314a = kVar;
        kVar.e(this);
        C2259p.a aVar = C2259p.f21393b;
        Context a7 = flutterPluginBinding.a();
        Intrinsics.checkNotNullExpressionValue(a7, "getApplicationContext(...)");
        this.f19315b = aVar.h(a7);
        Context a8 = flutterPluginBinding.a();
        Intrinsics.checkNotNullExpressionValue(a8, "getApplicationContext(...)");
        this.f19316c = aVar.d(a8);
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        k kVar = this.f19314a;
        if (kVar == null) {
            Intrinsics.n(AppsFlyerProperties.CHANNEL);
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // E5.k.c
    public void onMethodCall(j call, k.d result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f1670a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2129152299:
                    if (str.equals("getApplicationId")) {
                        f(call, result);
                        return;
                    }
                    break;
                case -1529535789:
                    if (str.equals("clearUserID")) {
                        c(call, result);
                        return;
                    }
                    break;
                case -1005195390:
                    if (str.equals("clearUserData")) {
                        b(call, result);
                        return;
                    }
                    break;
                case -811628443:
                    if (str.equals("logPurchase")) {
                        h(call, result);
                        return;
                    }
                    break;
                case -375431886:
                    if (str.equals("getAnonymousId")) {
                        e(call, result);
                        return;
                    }
                    break;
                case 97532676:
                    if (str.equals("flush")) {
                        d(call, result);
                        return;
                    }
                    break;
                case 645367080:
                    if (str.equals("setUserID")) {
                        n(call, result);
                        return;
                    }
                    break;
                case 792787386:
                    if (str.equals("setAutoLogAppEventsEnabled")) {
                        k(call, result);
                        return;
                    }
                    break;
                case 1413464691:
                    if (str.equals("logPushNotificationOpen")) {
                        i(call, result);
                        return;
                    }
                    break;
                case 1722355863:
                    if (str.equals("setUserData")) {
                        m(call, result);
                        return;
                    }
                    break;
                case 1817723455:
                    if (str.equals("setDataProcessingOptions")) {
                        l(call, result);
                        return;
                    }
                    break;
                case 1989757366:
                    if (str.equals("logEvent")) {
                        g(call, result);
                        return;
                    }
                    break;
                case 2126113028:
                    if (str.equals("setAdvertiserTracking")) {
                        j(call, result);
                        return;
                    }
                    break;
            }
        }
        result.c();
    }
}
