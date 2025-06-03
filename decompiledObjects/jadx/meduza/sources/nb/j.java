package nb;

import eb.e1;
import eb.k0;
import eb.l0;
import eb.m0;
import eb.u0;
import gb.g3;
import gb.n1;
import java.util.List;
import java.util.Map;
import nb.i;

/* loaded from: classes.dex */
public final class j extends l0 {
    public static u0.b f(Map map) {
        i.f.b bVar;
        i.f.a aVar;
        List list;
        Integer num;
        Integer num2;
        Long i10 = n1.i("interval", map);
        Long i11 = n1.i("baseEjectionTime", map);
        Long i12 = n1.i("maxEjectionTime", map);
        Integer f = n1.f("maxEjectionPercentage", map);
        Long l10 = i10 != null ? i10 : 10000000000L;
        Long l11 = i11 != null ? i11 : 30000000000L;
        Long l12 = i12 != null ? i12 : 300000000000L;
        Integer num3 = f != null ? f : 10;
        Map g10 = n1.g("successRateEjection", map);
        if (g10 != null) {
            Integer num4 = 100;
            Integer f10 = n1.f("stdevFactor", g10);
            Integer f11 = n1.f("enforcementPercentage", g10);
            Integer f12 = n1.f("minimumHosts", g10);
            Integer f13 = n1.f("requestVolume", g10);
            Integer num5 = f10 != null ? f10 : 1900;
            if (f11 != null) {
                x6.b.t(f11.intValue() >= 0 && f11.intValue() <= 100);
                num = f11;
            } else {
                num = num4;
            }
            if (f12 != null) {
                x6.b.t(f12.intValue() >= 0);
                num2 = f12;
            } else {
                num2 = 5;
            }
            if (f13 != null) {
                x6.b.t(f13.intValue() >= 0);
                num4 = f13;
            }
            bVar = new i.f.b(num5, num, num2, num4);
        } else {
            bVar = null;
        }
        Map g11 = n1.g("failurePercentageEjection", map);
        if (g11 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer f14 = n1.f("threshold", g11);
            Integer f15 = n1.f("enforcementPercentage", g11);
            Integer f16 = n1.f("minimumHosts", g11);
            Integer f17 = n1.f("requestVolume", g11);
            if (f14 != null) {
                x6.b.t(f14.intValue() >= 0 && f14.intValue() <= 100);
                num6 = f14;
            }
            if (f15 != null) {
                x6.b.t(f15.intValue() >= 0 && f15.intValue() <= 100);
                num7 = f15;
            }
            if (f16 != null) {
                x6.b.t(f16.intValue() >= 0);
                num8 = f16;
            }
            if (f17 != null) {
                x6.b.t(f17.intValue() >= 0);
                num9 = f17;
            }
            aVar = new i.f.a(num6, num7, num8, num9);
        } else {
            aVar = null;
        }
        List c10 = n1.c("childPolicy", map);
        if (c10 == null) {
            list = null;
        } else {
            n1.a(c10);
            list = c10;
        }
        List<g3.a> d10 = g3.d(list);
        if (d10 == null || d10.isEmpty()) {
            return new u0.b(e1.f5077m.g("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        u0.b c11 = g3.c(d10, m0.a());
        if (c11.f5244a != null) {
            return c11;
        }
        g3.b bVar2 = (g3.b) c11.f5245b;
        x6.b.J(bVar2 != null);
        x6.b.J(bVar2 != null);
        return new u0.b(new i.f(l10, l11, l12, num3, bVar, aVar, bVar2));
    }

    @Override // eb.k0.c
    public final k0 a(k0.e eVar) {
        return new i(eVar);
    }

    @Override // eb.l0
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // eb.l0
    public int c() {
        return 5;
    }

    @Override // eb.l0
    public boolean d() {
        return true;
    }

    @Override // eb.l0
    public u0.b e(Map<String, ?> map) {
        try {
            return f(map);
        } catch (RuntimeException e10) {
            e1 f = e1.f5078n.f(e10);
            StringBuilder l10 = defpackage.f.l("Failed parsing configuration for ");
            l10.append(b());
            return new u0.b(f.g(l10.toString()));
        }
    }
}
