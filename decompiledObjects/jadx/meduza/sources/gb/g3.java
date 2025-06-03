package gb;

import eb.e1;
import eb.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g;

/* loaded from: classes.dex */
public final class g3 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f6446a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, ?> f6447b;

        public a(String str, Map<String, ?> map) {
            x6.b.y(str, "policyName");
            this.f6446a = str;
            x6.b.y(map, "rawConfigValue");
            this.f6447b = map;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6446a.equals(aVar.f6446a) && this.f6447b.equals(aVar.f6447b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6446a, this.f6447b});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f6446a, "policyName");
            b10.a(this.f6447b, "rawConfigValue");
            return b10.toString();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final eb.l0 f6448a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f6449b;

        public b(eb.l0 l0Var, Object obj) {
            this.f6448a = l0Var;
            this.f6449b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return x6.b.Q(this.f6448a, bVar.f6448a) && x6.b.Q(this.f6449b, bVar.f6449b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6448a, this.f6449b});
        }

        public final String toString() {
            g.a b10 = n7.g.b(this);
            b10.a(this.f6448a, "provider");
            b10.a(this.f6449b, "config");
            return b10.toString();
        }
    }

    public static Set a(String str, Map map) {
        e1.a valueOf;
        List c10 = n1.c(str, map);
        if (c10 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(e1.a.class);
        for (Object obj : c10) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                b.z.r(obj, "Status code %s is not integral", ((double) intValue) == d10.doubleValue());
                valueOf = eb.e1.c(intValue).f5081a;
                b.z.r(obj, "Status code %s is not valid", valueOf.f5098a == d10.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new n7.w("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = e1.a.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new n7.w("Status code " + obj + " is not valid", e10);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List<Map<String, ?>> b(Map<String, ?> map) {
        String h10;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List c10 = n1.c("loadBalancingConfig", map);
            if (c10 == null) {
                c10 = null;
            } else {
                n1.a(c10);
            }
            arrayList.addAll(c10);
        }
        if (arrayList.isEmpty() && (h10 = n1.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(h10.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0.b c(List<a> list, eb.m0 m0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String str = aVar.f6446a;
            eb.l0 b10 = m0Var.b(str);
            if (b10 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(g3.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                u0.b e10 = b10.e(aVar.f6447b);
                return e10.f5244a != null ? e10 : new u0.b(new b(b10, e10.f5245b));
            }
            arrayList.add(str);
        }
        return new u0.b(eb.e1.f5071g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List<a> d(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            if (map.size() != 1) {
                StringBuilder l10 = defpackage.f.l("There are ");
                l10.append(map.size());
                l10.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                l10.append(map);
                throw new RuntimeException(l10.toString());
            }
            String key = map.entrySet().iterator().next().getKey();
            arrayList.add(new a(key, n1.g(key, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
