/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.Currency
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package s5;

import A5.a;
import E5.c;
import E5.j;
import E5.k;
import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.p;

public final class a
implements A5.a,
k.c {
    public k a;
    public p b;
    public String c;
    public final String d = "FacebookAppEvents";

    public final Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Object object = (Map.Entry)map.next();
            Object object2 = object.getValue();
            object = (String)object.getKey();
            if (object2 instanceof String) {
                bundle.putString((String)object, (String)object2);
                continue;
            }
            if (object2 instanceof Integer) {
                bundle.putInt((String)object, ((Integer)object2).intValue());
                continue;
            }
            if (object2 instanceof Long) {
                bundle.putLong((String)object, ((Long)object2).longValue());
                continue;
            }
            if (object2 instanceof Double) {
                bundle.putDouble((String)object, ((Double)object2).doubleValue());
                continue;
            }
            if (object2 instanceof Boolean) {
                bundle.putBoolean((String)object, ((Boolean)object2).booleanValue());
                continue;
            }
            if (object2 instanceof Map) {
                object2 = this.a((Map)object2);
                Intrinsics.c(object2, "null cannot be cast to non-null type android.os.Bundle");
                bundle.putBundle((String)object, (Bundle)object2);
                continue;
            }
            map = new StringBuilder();
            map.append("Unsupported value type: ");
            map.append((Object)f6.a.b(object2.getClass()));
            throw new IllegalArgumentException(map.toString());
        }
        return bundle;
    }

    public final void b(j j8, k.d d8) {
        p.b.b();
        d8.a(null);
    }

    public final void c(j j8, k.d d8) {
        p.b.c();
        d8.a(null);
    }

    public final void d(j object, k.d d8) {
        p p8 = this.b;
        object = p8;
        if (p8 == null) {
            Intrinsics.n("appEventsLogger");
            object = null;
        }
        object.a();
        d8.a(null);
    }

    public final void e(j object, k.d d8) {
        String string2 = this.c;
        object = string2;
        if (string2 == null) {
            Intrinsics.n("anonymousId");
            object = null;
        }
        d8.a(object);
    }

    public final void f(j object, k.d d8) {
        p p8 = this.b;
        object = p8;
        if (p8 == null) {
            Intrinsics.n("appEventsLogger");
            object = null;
        }
        d8.a(object.b());
    }

    public final void g(j object, k.d d8) {
        Object object2 = object.a("name");
        object2 = object2 instanceof String ? (String)object2 : null;
        Object object3 = object.a("parameters");
        object3 = object3 instanceof Map ? (Map)object3 : null;
        object = object.a("_valueToSum");
        object = object instanceof Double ? (Double)object : null;
        if (object != null && object3 != null) {
            Bundle bundle = this.a((Map)object3);
            p p8 = this.b;
            object3 = p8;
            if (p8 == null) {
                Intrinsics.n("appEventsLogger");
                object3 = null;
            }
            object3.e((String)object2, object.doubleValue(), bundle);
        } else if (object != null) {
            p p9 = this.b;
            object3 = p9;
            if (p9 == null) {
                Intrinsics.n("appEventsLogger");
                object3 = null;
            }
            object3.d((String)object2, object.doubleValue());
        } else if (object3 != null) {
            Bundle bundle = this.a((Map)object3);
            object = object3 = this.b;
            if (object3 == null) {
                Intrinsics.n("appEventsLogger");
                object = null;
            }
            object.f((String)object2, bundle);
        } else {
            object = object3 = this.b;
            if (object3 == null) {
                Intrinsics.n("appEventsLogger");
                object = null;
            }
            object.c((String)object2);
        }
        d8.a(null);
    }

    public final void h(j object, k.d d8) {
        Object object2 = object.a("amount");
        object2 = object2 instanceof Double ? (Double)object2 : null;
        object2 = object2 != null ? new BigDecimal(String.valueOf((double)object2.doubleValue())) : null;
        Object object3 = object.a("currency");
        object3 = object3 instanceof String ? (String)object3 : null;
        Currency currency = Currency.getInstance((String)object3);
        object = object.a("parameters");
        object = object instanceof Map ? (Map)object : null;
        object = object3 = this.a((Map)object);
        if (object3 == null) {
            object = new Bundle();
        }
        p p8 = this.b;
        object3 = p8;
        if (p8 == null) {
            Intrinsics.n("appEventsLogger");
            object3 = null;
        }
        object3.g((BigDecimal)object2, currency, (Bundle)object);
        d8.a(null);
    }

    public final void i(j object, k.d d8) {
        Object object2 = object.a("action");
        object2 = object2 instanceof String ? (String)object2 : null;
        object = object.a("payload");
        object = object instanceof Map ? (Map)object : null;
        Bundle bundle = this.a((Map)object);
        Intrinsics.b((Object)bundle);
        if (object2 != null) {
            p p8 = this.b;
            object = p8;
            if (p8 == null) {
                Intrinsics.n("appEventsLogger");
                object = null;
            }
            object.i(bundle, (String)object2);
        } else {
            object = object2 = this.b;
            if (object2 == null) {
                Intrinsics.n("appEventsLogger");
                object = null;
            }
            object.h(bundle);
        }
        d8.a(null);
    }

    public final void j(j j8, k.d d8) {
        d8.a(null);
    }

    public final void k(j object, k.d d8) {
        object = object.b;
        Intrinsics.c(object, "null cannot be cast to non-null type kotlin.Boolean");
        B.V((Boolean)object);
        d8.a(null);
    }

    public final void l(j object, k.d d8) {
        Object object2 = object.a("options");
        object2 = object2 instanceof ArrayList ? (ArrayList)object2 : null;
        Object object3 = object2;
        if (object2 == null) {
            object3 = new ArrayList();
        }
        object2 = (object2 = object.a("country")) instanceof Integer ? (Integer)object2 : null;
        int n8 = object2 != null ? object2.intValue() : 0;
        object = object.a("state");
        object = object instanceof Integer ? (Integer)object : null;
        int n9 = object != null ? object.intValue() : 0;
        B.W((String[])object3.toArray((Object[])new String[0]), n8, n9);
        d8.a(null);
    }

    public final void m(j object, k.d d8) {
        object = (object = object.a("parameters")) instanceof Map ? (Map)object : null;
        Object object2 = this.a((Map)object);
        p.a a8 = p.b;
        object = object2 != null ? object2.getString("email") : null;
        String string2 = object2 != null ? object2.getString("firstName") : null;
        String string3 = object2 != null ? object2.getString("lastName") : null;
        String string4 = object2 != null ? object2.getString("phone") : null;
        String string5 = object2 != null ? object2.getString("dateOfBirth") : null;
        String string6 = object2 != null ? object2.getString("gender") : null;
        String string7 = object2 != null ? object2.getString("city") : null;
        String string8 = object2 != null ? object2.getString("state") : null;
        String string9 = object2 != null ? object2.getString("zip") : null;
        object2 = object2 != null ? object2.getString("country") : null;
        a8.j((String)object, string2, string3, string4, string5, string6, string7, string8, string9, (String)object2);
        d8.a(null);
    }

    public final void n(j object, k.d d8) {
        object = object.b;
        Intrinsics.c(object, "null cannot be cast to non-null type kotlin.String");
        object = (String)object;
        p.b.k((String)object);
        d8.a(null);
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        Intrinsics.checkNotNullParameter(b8, "flutterPluginBinding");
        Object object = new k(b8.b(), "flutter.oddbit.id/facebook_app_events");
        this.a = object;
        object.e(this);
        object = p.b;
        Context context = b8.a();
        Intrinsics.checkNotNullExpressionValue((Object)context, "getApplicationContext(...)");
        this.b = object.h(context);
        b8 = b8.a();
        Intrinsics.checkNotNullExpressionValue(b8, "getApplicationContext(...)");
        this.c = object.d((Context)b8);
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        Intrinsics.checkNotNullParameter(object, "binding");
        k k8 = this.a;
        object = k8;
        if (k8 == null) {
            Intrinsics.n("channel");
            object = null;
        }
        object.e(null);
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        Intrinsics.checkNotNullParameter(j8, "call");
        Intrinsics.checkNotNullParameter(d8, "result");
        String string2 = j8.a;
        if (string2 != null) {
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 2126113028: {
                    if (!string2.equals((Object)"setAdvertiserTracking")) break;
                    this.j(j8, d8);
                    return;
                }
                case 1989757366: {
                    if (!string2.equals((Object)"logEvent")) break;
                    this.g(j8, d8);
                    return;
                }
                case 1817723455: {
                    if (!string2.equals((Object)"setDataProcessingOptions")) break;
                    this.l(j8, d8);
                    return;
                }
                case 1722355863: {
                    if (!string2.equals((Object)"setUserData")) break;
                    this.m(j8, d8);
                    return;
                }
                case 1413464691: {
                    if (!string2.equals((Object)"logPushNotificationOpen")) break;
                    this.i(j8, d8);
                    return;
                }
                case 792787386: {
                    if (!string2.equals((Object)"setAutoLogAppEventsEnabled")) break;
                    this.k(j8, d8);
                    return;
                }
                case 645367080: {
                    if (!string2.equals((Object)"setUserID")) break;
                    this.n(j8, d8);
                    return;
                }
                case 97532676: {
                    if (!string2.equals((Object)"flush")) break;
                    this.d(j8, d8);
                    return;
                }
                case -375431886: {
                    if (!string2.equals((Object)"getAnonymousId")) break;
                    this.e(j8, d8);
                    return;
                }
                case -811628443: {
                    if (!string2.equals((Object)"logPurchase")) break;
                    this.h(j8, d8);
                    return;
                }
                case -1005195390: {
                    if (!string2.equals((Object)"clearUserData")) break;
                    this.b(j8, d8);
                    return;
                }
                case -1529535789: {
                    if (!string2.equals((Object)"clearUserID")) break;
                    this.c(j8, d8);
                    return;
                }
                case -2129152299: {
                    if (!string2.equals((Object)"getApplicationId")) break;
                    this.f(j8, d8);
                    return;
                }
            }
        }
        d8.c();
    }
}

