package gb;

import eb.c;
import eb.d0;
import eb.e1;
import gb.y2;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n7.g;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f6434a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f6435b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, a> f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.b0 f6437d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6438e;
    public final Map<String, ?> f;

    public static final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final c.b<a> f6439g = new c.b<>("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a, reason: collision with root package name */
        public final Long f6440a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f6441b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f6442c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f6443d;

        /* renamed from: e, reason: collision with root package name */
        public final a3 f6444e;
        public final x0 f;

        public a(Map<String, ?> map, boolean z10, int i10, int i11) {
            a3 a3Var;
            x0 x0Var;
            this.f6440a = n1.i("timeout", map);
            this.f6441b = n1.b("waitForReady", map);
            Integer f = n1.f("maxResponseMessageBytes", map);
            this.f6442c = f;
            if (f != null) {
                x6.b.n(f, "maxInboundMessageSize %s exceeds bounds", f.intValue() >= 0);
            }
            Integer f10 = n1.f("maxRequestMessageBytes", map);
            this.f6443d = f10;
            if (f10 != null) {
                x6.b.n(f10, "maxOutboundMessageSize %s exceeds bounds", f10.intValue() >= 0);
            }
            Map g10 = z10 ? n1.g("retryPolicy", map) : null;
            if (g10 == null) {
                a3Var = null;
            } else {
                Integer f11 = n1.f("maxAttempts", g10);
                x6.b.y(f11, "maxAttempts cannot be empty");
                int intValue = f11.intValue();
                x6.b.l(intValue, "maxAttempts must be greater than 1: %s", intValue >= 2);
                int min = Math.min(intValue, i10);
                Long i12 = n1.i("initialBackoff", g10);
                x6.b.y(i12, "initialBackoff cannot be empty");
                long longValue = i12.longValue();
                x6.b.m(longValue, "initialBackoffNanos must be greater than 0: %s", longValue > 0);
                Long i13 = n1.i("maxBackoff", g10);
                x6.b.y(i13, "maxBackoff cannot be empty");
                long longValue2 = i13.longValue();
                x6.b.m(longValue2, "maxBackoff must be greater than 0: %s", longValue2 > 0);
                Double e10 = n1.e("backoffMultiplier", g10);
                x6.b.y(e10, "backoffMultiplier cannot be empty");
                double doubleValue = e10.doubleValue();
                x6.b.n(Double.valueOf(doubleValue), "backoffMultiplier must be greater than 0: %s", doubleValue > 0.0d);
                Long i14 = n1.i("perAttemptRecvTimeout", g10);
                x6.b.n(i14, "perAttemptRecvTimeout cannot be negative: %s", i14 == null || i14.longValue() >= 0);
                Set a10 = g3.a("retryableStatusCodes", g10);
                b.z.r("retryableStatusCodes", "%s is required in retry policy", a10 != null);
                b.z.r("retryableStatusCodes", "%s must not contain OK", !a10.contains(e1.a.OK));
                x6.b.s("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (i14 == null && a10.isEmpty()) ? false : true);
                a3Var = new a3(min, longValue, longValue2, doubleValue, i14, a10);
            }
            this.f6444e = a3Var;
            Map g11 = z10 ? n1.g("hedgingPolicy", map) : null;
            if (g11 == null) {
                x0Var = null;
            } else {
                Integer f12 = n1.f("maxAttempts", g11);
                x6.b.y(f12, "maxAttempts cannot be empty");
                int intValue2 = f12.intValue();
                x6.b.l(intValue2, "maxAttempts must be greater than 1: %s", intValue2 >= 2);
                int min2 = Math.min(intValue2, i11);
                Long i15 = n1.i("hedgingDelay", g11);
                x6.b.y(i15, "hedgingDelay cannot be empty");
                long longValue3 = i15.longValue();
                x6.b.m(longValue3, "hedgingDelay must not be negative: %s", longValue3 >= 0);
                Set a11 = g3.a("nonFatalStatusCodes", g11);
                if (a11 == null) {
                    a11 = Collections.unmodifiableSet(EnumSet.noneOf(e1.a.class));
                } else {
                    b.z.r("nonFatalStatusCodes", "%s must not contain OK", !a11.contains(e1.a.OK));
                }
                x0Var = new x0(min2, longValue3, a11);
            }
            this.f = x0Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return x6.b.Q(this.f6440a, aVar.f6440a) && x6.b.Q(this.f6441b, aVar.f6441b) && x6.b.Q(this.f6442c, aVar.f6442c) && x6.b.Q(this.f6443d, aVar.f6443d) && x6.b.Q(this.f6444e, aVar.f6444e) && x6.b.Q(this.f, aVar.f);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6440a, this.f6441b, this.f6442c, this.f6443d, this.f6444e, this.f});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f6440a, "timeoutNanos");
            b10.a(this.f6441b, "waitForReady");
            b10.a(this.f6442c, "maxInboundMessageSize");
            b10.a(this.f6443d, "maxOutboundMessageSize");
            b10.a(this.f6444e, "retryPolicy");
            b10.a(this.f, "hedgingPolicy");
            return b10.toString();
        }
    }

    public static final class b extends eb.d0 {

        /* renamed from: b, reason: collision with root package name */
        public final g2 f6445b;

        public b(g2 g2Var) {
            this.f6445b = g2Var;
        }

        @Override // eb.d0
        public final d0.a a() {
            g2 g2Var = this.f6445b;
            x6.b.y(g2Var, "config");
            return new d0.a(eb.e1.f5070e, g2Var);
        }
    }

    public g2(a aVar, HashMap hashMap, HashMap hashMap2, y2.b0 b0Var, Object obj, Map map) {
        this.f6434a = aVar;
        this.f6435b = defpackage.g.i(hashMap);
        this.f6436c = defpackage.g.i(hashMap2);
        this.f6437d = b0Var;
        this.f6438e = obj;
        this.f = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
    }

    public static g2 a(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        y2.b0 b0Var;
        y2.b0 b0Var2;
        Map g10;
        if (z10) {
            if (map == null || (g10 = n1.g("retryThrottling", map)) == null) {
                b0Var2 = null;
            } else {
                float floatValue = n1.e("maxTokens", g10).floatValue();
                float floatValue2 = n1.e("tokenRatio", g10).floatValue();
                x6.b.I(floatValue > 0.0f, "maxToken should be greater than zero");
                x6.b.I(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
                b0Var2 = new y2.b0(floatValue, floatValue2);
            }
            b0Var = b0Var2;
        } else {
            b0Var = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map g11 = map == null ? null : n1.g("healthCheckConfig", map);
        List<Map> c10 = n1.c("methodConfig", map);
        if (c10 == null) {
            c10 = null;
        } else {
            n1.a(c10);
        }
        if (c10 == null) {
            return new g2(null, hashMap, hashMap2, b0Var, obj, g11);
        }
        a aVar = null;
        for (Map map2 : c10) {
            a aVar2 = new a(map2, z10, i10, i11);
            List<Map> c11 = n1.c("name", map2);
            if (c11 == null) {
                c11 = null;
            } else {
                n1.a(c11);
            }
            if (c11 != null && !c11.isEmpty()) {
                for (Map map3 : c11) {
                    String h10 = n1.h("service", map3);
                    String h11 = n1.h(Constants.METHOD, map3);
                    if (n7.i.a(h10)) {
                        x6.b.n(h11, "missing service name for method %s", n7.i.a(h11));
                        x6.b.n(map, "Duplicate default method config in service config %s", aVar == null);
                        aVar = aVar2;
                    } else if (n7.i.a(h11)) {
                        x6.b.n(h10, "Duplicate service %s", !hashMap2.containsKey(h10));
                        hashMap2.put(h10, aVar2);
                    } else {
                        String a10 = eb.t0.a(h10, h11);
                        x6.b.n(a10, "Duplicate method name %s", !hashMap.containsKey(a10));
                        hashMap.put(a10, aVar2);
                    }
                }
            }
        }
        return new g2(aVar, hashMap, hashMap2, b0Var, obj, g11);
    }

    public final b b() {
        if (this.f6436c.isEmpty() && this.f6435b.isEmpty() && this.f6434a == null) {
            return null;
        }
        return new b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return x6.b.Q(this.f6434a, g2Var.f6434a) && x6.b.Q(this.f6435b, g2Var.f6435b) && x6.b.Q(this.f6436c, g2Var.f6436c) && x6.b.Q(this.f6437d, g2Var.f6437d) && x6.b.Q(this.f6438e, g2Var.f6438e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6434a, this.f6435b, this.f6436c, this.f6437d, this.f6438e});
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f6434a, "defaultMethodConfig");
        b10.a(this.f6435b, "serviceMethodMap");
        b10.a(this.f6436c, "serviceMap");
        b10.a(this.f6437d, "retryThrottling");
        b10.a(this.f6438e, "loadBalancingConfig");
        return b10.toString();
    }
}
