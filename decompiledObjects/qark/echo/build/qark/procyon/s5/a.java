// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s5;

import android.os.BaseBundle;
import android.content.Context;
import java.util.ArrayList;
import x1.B;
import java.util.Currency;
import java.math.BigDecimal;
import E5.j;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import java.util.Map;
import y1.p;
import E5.k;

public final class a implements A5.a, c
{
    public k a;
    public p b;
    public String c;
    public final String d;
    
    public a() {
        this.d = "FacebookAppEvents";
    }
    
    public final Bundle a(final Map map) {
        if (map == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            final Boolean value = entry.getValue();
            final String s = (String)entry.getKey();
            if (value instanceof String) {
                ((BaseBundle)bundle).putString(s, (String)value);
            }
            else if (value instanceof Integer) {
                ((BaseBundle)bundle).putInt(s, (int)(Integer)(Object)value);
            }
            else if (value instanceof Long) {
                ((BaseBundle)bundle).putLong(s, (long)(Long)(Object)value);
            }
            else if (value instanceof Double) {
                ((BaseBundle)bundle).putDouble(s, (double)(Double)(Object)value);
            }
            else if (value instanceof Boolean) {
                ((BaseBundle)bundle).putBoolean(s, (boolean)value);
            }
            else {
                if (!(value instanceof Map)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported value type: ");
                    sb.append(f6.a.b(((Map)value).getClass()));
                    throw new IllegalArgumentException(sb.toString());
                }
                final Bundle a = this.a((Map)value);
                Intrinsics.c(a, "null cannot be cast to non-null type android.os.Bundle");
                bundle.putBundle(s, a);
            }
        }
        return bundle;
    }
    
    public final void b(final j j, final d d) {
        p.b.b();
        d.a(null);
    }
    
    public final void c(final j j, final d d) {
        p.b.c();
        d.a(null);
    }
    
    public final void d(final j j, final d d) {
        p b;
        if ((b = this.b) == null) {
            Intrinsics.n("appEventsLogger");
            b = null;
        }
        b.a();
        d.a(null);
    }
    
    public final void e(final j j, final d d) {
        String c;
        if ((c = this.c) == null) {
            Intrinsics.n("anonymousId");
            c = null;
        }
        d.a(c);
    }
    
    public final void f(final j j, final d d) {
        p b;
        if ((b = this.b) == null) {
            Intrinsics.n("appEventsLogger");
            b = null;
        }
        d.a(b.b());
    }
    
    public final void g(final j j, final d d) {
        final Object a = j.a("name");
        String s;
        if (a instanceof String) {
            s = (String)a;
        }
        else {
            s = null;
        }
        final Object a2 = j.a("parameters");
        Map map;
        if (a2 instanceof Map) {
            map = (Map)a2;
        }
        else {
            map = null;
        }
        final Object a3 = j.a("_valueToSum");
        Double n;
        if (a3 instanceof Double) {
            n = (Double)a3;
        }
        else {
            n = null;
        }
        if (n != null && map != null) {
            final Bundle a4 = this.a(map);
            p b;
            if ((b = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b = null;
            }
            b.e(s, n, a4);
        }
        else if (n != null) {
            p b2;
            if ((b2 = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b2 = null;
            }
            b2.d(s, n);
        }
        else if (map != null) {
            final Bundle a5 = this.a(map);
            p b3;
            if ((b3 = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b3 = null;
            }
            b3.f(s, a5);
        }
        else {
            p b4;
            if ((b4 = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b4 = null;
            }
            b4.c(s);
        }
        d.a(null);
    }
    
    public final void h(final j j, final d d) {
        final Object a = j.a("amount");
        Double n;
        if (a instanceof Double) {
            n = (Double)a;
        }
        else {
            n = null;
        }
        BigDecimal bigDecimal;
        if (n != null) {
            bigDecimal = new BigDecimal(String.valueOf((double)n));
        }
        else {
            bigDecimal = null;
        }
        final Object a2 = j.a("currency");
        String currencyCode;
        if (a2 instanceof String) {
            currencyCode = (String)a2;
        }
        else {
            currencyCode = null;
        }
        final Currency instance = Currency.getInstance(currencyCode);
        final Object a3 = j.a("parameters");
        Map map;
        if (a3 instanceof Map) {
            map = (Map)a3;
        }
        else {
            map = null;
        }
        Bundle a4;
        if ((a4 = this.a(map)) == null) {
            a4 = new Bundle();
        }
        p b;
        if ((b = this.b) == null) {
            Intrinsics.n("appEventsLogger");
            b = null;
        }
        b.g(bigDecimal, instance, a4);
        d.a(null);
    }
    
    public final void i(final j j, final d d) {
        final Object a = j.a("action");
        String s;
        if (a instanceof String) {
            s = (String)a;
        }
        else {
            s = null;
        }
        final Object a2 = j.a("payload");
        Map map;
        if (a2 instanceof Map) {
            map = (Map)a2;
        }
        else {
            map = null;
        }
        final Bundle a3 = this.a(map);
        Intrinsics.b(a3);
        if (s != null) {
            p b;
            if ((b = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b = null;
            }
            b.i(a3, s);
        }
        else {
            p b2;
            if ((b2 = this.b) == null) {
                Intrinsics.n("appEventsLogger");
                b2 = null;
            }
            b2.h(a3);
        }
        d.a(null);
    }
    
    public final void j(final j j, final d d) {
        d.a(null);
    }
    
    public final void k(final j j, final d d) {
        final Object b = j.b;
        Intrinsics.c(b, "null cannot be cast to non-null type kotlin.Boolean");
        B.V((boolean)b);
        d.a(null);
    }
    
    public final void l(final j j, final d d) {
        final Object a = j.a("options");
        ArrayList list;
        if (a instanceof ArrayList) {
            list = (ArrayList)a;
        }
        else {
            list = null;
        }
        ArrayList list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        final Object a2 = j.a("country");
        Integer n;
        if (a2 instanceof Integer) {
            n = (Integer)a2;
        }
        else {
            n = null;
        }
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        final Object a3 = j.a("state");
        Integer n2;
        if (a3 instanceof Integer) {
            n2 = (Integer)a3;
        }
        else {
            n2 = null;
        }
        int intValue2;
        if (n2 != null) {
            intValue2 = n2;
        }
        else {
            intValue2 = 0;
        }
        B.W((String[])list2.toArray(new String[0]), intValue, intValue2);
        d.a(null);
    }
    
    public final void m(final j j, final d d) {
        final Object a = j.a("parameters");
        Map map;
        if (a instanceof Map) {
            map = (Map)a;
        }
        else {
            map = null;
        }
        final Bundle a2 = this.a(map);
        final p.a b = p.b;
        String string;
        if (a2 != null) {
            string = ((BaseBundle)a2).getString("email");
        }
        else {
            string = null;
        }
        String string2;
        if (a2 != null) {
            string2 = ((BaseBundle)a2).getString("firstName");
        }
        else {
            string2 = null;
        }
        String string3;
        if (a2 != null) {
            string3 = ((BaseBundle)a2).getString("lastName");
        }
        else {
            string3 = null;
        }
        String string4;
        if (a2 != null) {
            string4 = ((BaseBundle)a2).getString("phone");
        }
        else {
            string4 = null;
        }
        String string5;
        if (a2 != null) {
            string5 = ((BaseBundle)a2).getString("dateOfBirth");
        }
        else {
            string5 = null;
        }
        String string6;
        if (a2 != null) {
            string6 = ((BaseBundle)a2).getString("gender");
        }
        else {
            string6 = null;
        }
        String string7;
        if (a2 != null) {
            string7 = ((BaseBundle)a2).getString("city");
        }
        else {
            string7 = null;
        }
        String string8;
        if (a2 != null) {
            string8 = ((BaseBundle)a2).getString("state");
        }
        else {
            string8 = null;
        }
        String string9;
        if (a2 != null) {
            string9 = ((BaseBundle)a2).getString("zip");
        }
        else {
            string9 = null;
        }
        String string10;
        if (a2 != null) {
            string10 = ((BaseBundle)a2).getString("country");
        }
        else {
            string10 = null;
        }
        b.j(string, string2, string3, string4, string5, string6, string7, string8, string9, string10);
        d.a(null);
    }
    
    public final void n(final j j, final d d) {
        final Object b = j.b;
        Intrinsics.c(b, "null cannot be cast to non-null type kotlin.String");
        p.b.k((String)b);
        d.a(null);
    }
    
    @Override
    public void onAttachedToEngine(final A5.a.b b) {
        Intrinsics.checkNotNullParameter(b, "flutterPluginBinding");
        (this.a = new k(b.b(), "flutter.oddbit.id/facebook_app_events")).e((k.c)this);
        final p.a b2 = p.b;
        final Context a = b.a();
        Intrinsics.checkNotNullExpressionValue(a, "getApplicationContext(...)");
        this.b = b2.h(a);
        final Context a2 = b.a();
        Intrinsics.checkNotNullExpressionValue(a2, "getApplicationContext(...)");
        this.c = b2.d(a2);
    }
    
    @Override
    public void onDetachedFromEngine(final A5.a.b b) {
        Intrinsics.checkNotNullParameter(b, "binding");
        k a;
        if ((a = this.a) == null) {
            Intrinsics.n("channel");
            a = null;
        }
        a.e(null);
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        Intrinsics.checkNotNullParameter(j, "call");
        Intrinsics.checkNotNullParameter(d, "result");
        final String a = j.a;
        if (a != null) {
            switch (a) {
                case "setAdvertiserTracking": {
                    this.j(j, d);
                    return;
                }
                case "logEvent": {
                    this.g(j, d);
                    return;
                }
                case "setDataProcessingOptions": {
                    this.l(j, d);
                    return;
                }
                case "setUserData": {
                    this.m(j, d);
                    return;
                }
                case "logPushNotificationOpen": {
                    this.i(j, d);
                    return;
                }
                case "setAutoLogAppEventsEnabled": {
                    this.k(j, d);
                    return;
                }
                case "setUserID": {
                    this.n(j, d);
                    return;
                }
                case "flush": {
                    this.d(j, d);
                    return;
                }
                case "getAnonymousId": {
                    this.e(j, d);
                    return;
                }
                case "logPurchase": {
                    this.h(j, d);
                    return;
                }
                case "clearUserData": {
                    this.b(j, d);
                    return;
                }
                case "clearUserID": {
                    this.c(j, d);
                    return;
                }
                case "getApplicationId": {
                    this.f(j, d);
                    return;
                }
                default:
                    break;
            }
        }
        d.c();
    }
}
