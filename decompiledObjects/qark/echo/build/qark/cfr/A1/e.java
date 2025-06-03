/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package A1;

import A1.a;
import A1.b;
import A1.i;
import A1.j;
import A1.k;
import A1.l;
import A1.m;
import A1.n;
import O1.C;
import O1.P;
import V5.q;
import V5.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.N;

public final class e {
    public static final e a = new e();
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        Object object = A1.b.q;
        Object object2 = k.p;
        object = q.a(object, new c((k)((Object)object2), l.p));
        Object object3 = q.a((Object)A1.b.r, new c((k)((Object)object2), l.q));
        Object object4 = q.a((Object)A1.b.s, new c((k)((Object)object2), l.r));
        V5.m m8 = q.a((Object)A1.b.t, new c((k)((Object)object2), l.s));
        V5.m m9 = q.a((Object)A1.b.u, new c((k)((Object)object2), l.t));
        A1.b b8 = A1.b.w;
        k k8 = k.q;
        b = W5.C.f(new V5.m[]{object, object3, object4, m8, m9, q.a((Object)b8, new c(k8, l.v)), q.a((Object)A1.b.x, new c(k8, l.w)), q.a((Object)A1.b.y, new c(k8, l.x)), q.a((Object)A1.b.z, new c(k8, l.y)), q.a((Object)A1.b.A, new c(k8, l.z)), q.a((Object)A1.b.B, new c(k8, l.A)), q.a((Object)A1.b.C, new c(k8, l.B)), q.a((Object)A1.b.D, new c(k8, l.C)), q.a((Object)A1.b.E, new c(k8, l.D)), q.a((Object)A1.b.F, new c(k8, l.E)), q.a((Object)A1.b.G, new c(k8, l.F)), q.a((Object)A1.b.v, new c((k)((Object)object2), null))});
        object2 = q.a((Object)m.q, new b(null, i.q));
        object = q.a((Object)m.r, new b(null, i.r));
        object3 = m.s;
        object4 = k.r;
        c = W5.C.f(new V5.m[]{object2, object, q.a(object3, new b((k)((Object)object4), i.p)), q.a((Object)m.t, new b((k)((Object)object4), i.s)), q.a((Object)m.u, new b((k)((Object)object4), i.t)), q.a((Object)m.v, new b((k)((Object)object4), i.u)), q.a((Object)m.G, new b((k)((Object)object4), i.F)), q.a((Object)m.w, new b((k)((Object)object4), i.v)), q.a((Object)m.x, new b((k)((Object)object4), i.w)), q.a((Object)m.y, new b((k)((Object)object4), i.x)), q.a((Object)m.z, new b((k)((Object)object4), i.y)), q.a((Object)m.A, new b((k)((Object)object4), i.z)), q.a((Object)m.B, new b((k)((Object)object4), i.A)), q.a((Object)m.C, new b((k)((Object)object4), i.B)), q.a((Object)m.D, new b((k)((Object)object4), i.C)), q.a((Object)m.E, new b((k)((Object)object4), i.D)), q.a((Object)m.F, new b((k)((Object)object4), i.E))});
        d = W5.C.f(q.a("fb_mobile_achievement_unlocked", (Object)j.p), q.a("fb_mobile_activate_app", (Object)j.q), q.a("fb_mobile_add_payment_info", (Object)j.r), q.a("fb_mobile_add_to_cart", (Object)j.s), q.a("fb_mobile_add_to_wishlist", (Object)j.t), q.a("fb_mobile_complete_registration", (Object)j.u), q.a("fb_mobile_content_view", (Object)j.v), q.a("fb_mobile_initiated_checkout", (Object)j.w), q.a("fb_mobile_level_achieved", (Object)j.x), q.a("fb_mobile_purchase", (Object)j.y), q.a("fb_mobile_rate", (Object)j.z), q.a("fb_mobile_search", (Object)j.A), q.a("fb_mobile_spent_credits", (Object)j.B), q.a("fb_mobile_tutorial_completion", (Object)j.C));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final ArrayList k(String object) {
        ArrayList arrayList;
        P p8;
        P p9;
        block14 : {
            JSONException jSONException222;
            block13 : {
                Intrinsics.checkNotNullParameter(object, "appEvents");
                arrayList = new ArrayList();
                try {
                    p9 = P.a;
                    for (String string2 : (Iterable)P.m(new JSONArray((String)object))) {
                        p8 = P.a;
                        arrayList.add((Object)P.n(new JSONObject(string2)));
                    }
                }
                catch (JSONException jSONException222) {
                    break block13;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                break block14;
            }
            C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[]{object, jSONException222});
            return null;
        }
        p9 = new ArrayList();
        arrayList = arrayList.iterator();
        block5 : while (arrayList.hasNext()) {
            String string2;
            string2 = (Map)arrayList.next();
            p8 = new LinkedHashMap();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator iterator = string2.keySet().iterator();
            do {
                if (iterator.hasNext()) {
                    object = (String)iterator.next();
                    Object object2 = m.p.a((String)object);
                    Object object3 = (b)c.get(object2);
                    if (object2 == null || object3 == null) continue;
                    k k8 = object3.b();
                    if (k8 != null) {
                        if (k8 != k.r) continue;
                        object3 = object3.a().e();
                        object2 = string2.get(object);
                        if (object2 == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        if ((object = e.l((String)object, object2)) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        p8.put(object3, object);
                        continue;
                    }
                    object3 = object3.a().e();
                    if (object2 == m.r && (String)string2.get(object) != null) {
                        object2 = a;
                        if ((object = string2.get(object)) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        object = object2.j((String)object);
                    } else {
                        if (object2 != m.q || (Integer)string2.get(object) == null) continue;
                        object2 = string2.get(object);
                        if (object2 == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        if ((object = e.l((String)object, object2)) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    linkedHashMap.put(object3, object);
                    continue;
                }
                if (p8.isEmpty() ^ true) {
                    linkedHashMap.put((Object)k.r.e(), (Object)p8);
                }
                p9.add((Object)linkedHashMap);
                continue block5;
                catch (ClassCastException classCastException) {}
                C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", V5.a.b((Throwable)classCastException));
            } while (true);
            break;
        }
        return p9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final Object l(String var0, Object var1_2) {
        block20 : {
            block19 : {
                block17 : {
                    block18 : {
                        var3_3 = false;
                        Intrinsics.checkNotNullParameter(var0, "field");
                        Intrinsics.checkNotNullParameter(var1_2, "value");
                        var6_4 = d.o.a((String)var0);
                        var4_5 = var1_2 instanceof String;
                        var5_6 = null;
                        var0 = var4_5 != false ? (String)var1_2 : null;
                        if (var6_4 == null) break block20;
                        if (var0 == null) {
                            return var1_2;
                        }
                        var2_9 = e.a[var6_4.ordinal()];
                        if (var2_9 != 1) {
                            if (var2_9 != 2) {
                                if (var2_9 == 3) {
                                    return kotlin.text.i.f(var1_2.toString());
                                }
                                throw new V5.l();
                            }
                            var1_2 = kotlin.text.i.f((String)var0);
                            var0 = var5_6;
                            if (var1_2 != null) {
                                if (var1_2.intValue() != 0) {
                                    var3_3 = true;
                                }
                                var0 = var3_3;
                            }
                            return var0;
                        }
                        try {
                            var5_6 = P.a;
                            var0 = P.m(new JSONArray((String)var0));
                            var6_4 = new ArrayList();
                            var7_10 = ((Iterable)var0).iterator();
lbl29: // 2 sources:
                            if (!var7_10.hasNext()) break block17;
                            var0 = (String)var7_10.next();
                        }
                        catch (JSONException var0_1) {
                            break block19;
                        }
                        try {
                            var5_6 = P.a;
                            var5_6 = P.n(new JSONObject((String)var0));
                            var0 = var5_6;
                            break block18;
                        }
                        catch (JSONException var5_7) {}
                        {
                        }
                        try {
                            var5_6 = P.a;
                            var5_6 = P.m(new JSONArray((String)var0));
                            var0 = var5_6;
                        }
                        catch (JSONException var5_8) {
                            break;
                        }
                    }
                    var6_4.add(var0);
                    ** GOTO lbl29
                }
                return var6_4;
            }
            C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[]{var1_2, var0_1});
            return t.a;
        }
        return var1_2;
    }

    public final List a(A1.a a8, Map map, Map map2, Map map3, List list, Object object) {
        Intrinsics.checkNotNullParameter((Object)a8, "eventType");
        Intrinsics.checkNotNullParameter((Object)map, "userData");
        Intrinsics.checkNotNullParameter((Object)map2, "appData");
        Intrinsics.checkNotNullParameter((Object)map3, "restOfData");
        Intrinsics.checkNotNullParameter((Object)list, "customEvents");
        map = this.d(map, map2, map3);
        int n8 = e.c[a8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                return null;
            }
            return this.b(map, list);
        }
        return this.c(map, object);
    }

    public final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (Iterable)list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add((Object)linkedHashMap);
        }
        return arrayList;
    }

    public final List c(Map map, Object object) {
        if (object == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put((Object)i.r.e(), (Object)n.s.e());
        linkedHashMap.put((Object)i.q.e(), object);
        return W5.m.b((Object)linkedHashMap);
    }

    public final Map d(Map map, Map map2, Map map3) {
        Intrinsics.checkNotNullParameter((Object)map, "userData");
        Intrinsics.checkNotNullParameter((Object)map2, "appData");
        Intrinsics.checkNotNullParameter((Object)map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put((Object)n.q.e(), (Object)n.r.e());
        linkedHashMap.put((Object)k.p.e(), (Object)map);
        linkedHashMap.put((Object)k.q.e(), (Object)map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    public final List e(Map map) {
        Intrinsics.checkNotNullParameter((Object)map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        A1.a a8 = this.f(map, (Map)linkedHashMap, (Map)linkedHashMap2, arrayList, (Map)linkedHashMap3);
        if (a8 == A1.a.r) {
            return null;
        }
        return this.a(a8, (Map)linkedHashMap, (Map)linkedHashMap2, (Map)linkedHashMap3, (List)arrayList, map.get((Object)n.t.e()));
    }

    public final A1.a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object object = map.get((Object)n.p.e());
        Object object2 = A1.a.o;
        if (object != null) {
            if ((object = object2.a((String)object)) == A1.a.r) {
                return object;
            }
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Object object3 = (Map.Entry)map.next();
                object2 = (String)object3.getKey();
                object3 = object3.getValue();
                A1.b b8 = A1.b.p.a((String)object2);
                if (b8 != null) {
                    a.g(map2, map3, b8, object3);
                    continue;
                }
                boolean bl = Intrinsics.a(object2, k.s.e());
                boolean bl2 = object3 instanceof String;
                if (object == A1.a.q && bl && bl2) {
                    object2 = e.k((String)object3);
                    if (object2 == null) continue;
                    arrayList.addAll((Collection)object2);
                    continue;
                }
                if (a.p.a((String)object2) == null) continue;
                map4.put(object2, object3);
            }
            return object;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void g(Map map, Map map2, A1.b b8, Object object) {
        Intrinsics.checkNotNullParameter((Object)map, "userData");
        Intrinsics.checkNotNullParameter((Object)map2, "appData");
        Intrinsics.checkNotNullParameter((Object)b8, "field");
        Intrinsics.checkNotNullParameter(object, "value");
        Object object2 = (c)b.get((Object)b8);
        if (object2 == null) {
            return;
        }
        int n8 = e.b[(object2 = object2.b()).ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                return;
            }
            this.i(map, b8, object);
            return;
        }
        this.h(map2, b8, object);
    }

    public final void h(Map map, A1.b object, Object object2) {
        object = (object = (c)b.get(object)) == null ? null : object.a();
        if (object == null) {
            return;
        }
        map.put((Object)object.e(), object2);
    }

    public final void i(Map map, A1.b object, Object object2) {
        if (object == A1.b.v) {
            try {
                object = P.a;
                map.putAll(P.n(new JSONObject((String)object2)));
                return;
            }
            catch (JSONException jSONException) {
                C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[]{object2, jSONException});
                return;
            }
        }
        object = (object = (c)b.get(object)) == null ? null : object.a();
        if (object == null) {
            return;
        }
        map.put((Object)object.e(), object2);
    }

    public final String j(String object) {
        Map map = d;
        String string2 = object;
        if (map.containsKey(object)) {
            if ((object = (j)((Object)map.get(object))) == null) {
                return "";
            }
            string2 = object.e();
        }
        return string2;
    }

    public static final class A1.e$a
    extends Enum {
        public static final a p;
        public static final /* enum */ A1.e$a q;
        public static final /* enum */ A1.e$a r;
        public static final /* enum */ A1.e$a s;
        public static final /* synthetic */ A1.e$a[] t;
        public final String o;

        static {
            q = new A1.e$a("data_processing_options");
            r = new A1.e$a("data_processing_options_country");
            s = new A1.e$a("data_processing_options_state");
            t = A1.e$a.c();
            p = new a(null);
        }

        public A1.e$a(String string3) {
            this.o = string3;
        }

        public static final /* synthetic */ A1.e$a[] c() {
            return new A1.e$a[]{q, r, s};
        }

        public static A1.e$a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (A1.e$a)Enum.valueOf(A1.e$a.class, (String)string2);
        }

        public static A1.e$a[] values() {
            A1.e$a[] arra = t;
            return (A1.e$a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }

        public final String e() {
            return this.o;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            public final A1.e$a a(String string2) {
                Intrinsics.checkNotNullParameter(string2, "rawValue");
                for (A1.e$a a8 : A1.e$a.values()) {
                    if (!Intrinsics.a(a8.e(), string2)) continue;
                    return a8;
                }
                return null;
            }
        }

    }

    public static final class b {
        public k a;
        public i b;

        public b(k k8, i i8) {
            Intrinsics.checkNotNullParameter((Object)i8, "field");
            this.a = k8;
            this.b = i8;
        }

        public final i a() {
            return this.b;
        }

        public final k b() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (this.a != object.a) {
                return false;
            }
            if (this.b != object.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            k k8 = this.a;
            int n8 = k8 == null ? 0 : k8.hashCode();
            return n8 * 31 + this.b.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SectionCustomEventFieldMapping(section=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", field=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    public static final class c {
        public k a;
        public l b;

        public c(k k8, l l8) {
            Intrinsics.checkNotNullParameter((Object)k8, "section");
            this.a = k8;
            this.b = l8;
        }

        public final l a() {
            return this.b;
        }

        public final k b() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            if (this.a != object.a) {
                return false;
            }
            if (this.b != object.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            l l8 = this.b;
            int n9 = l8 == null ? 0 : l8.hashCode();
            return n8 * 31 + n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SectionFieldMapping(section=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(", field=");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    public static final class d
    extends Enum {
        public static final a o;
        public static final /* enum */ d p;
        public static final /* enum */ d q;
        public static final /* enum */ d r;
        public static final /* synthetic */ d[] s;

        static {
            p = new d();
            q = new d();
            r = new d();
            s = d.c();
            o = new a(null);
        }

        public static final /* synthetic */ d[] c() {
            return new d[]{p, q, r};
        }

        public static d valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            d[] arrd = s;
            return (d[])Arrays.copyOf((Object[])arrd, (int)arrd.length);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            /*
             * Enabled aggressive block sorting
             */
            public final d a(String string2) {
                Intrinsics.checkNotNullParameter(string2, "rawValue");
                if (Intrinsics.a(string2, A1.b.A.e())) {
                    return d.p;
                }
                if (Intrinsics.a(string2, A1.b.G.e())) {
                    return d.p;
                }
                if (Intrinsics.a(string2, m.t.e())) {
                    return d.p;
                }
                if (Intrinsics.a(string2, m.u.e())) {
                    return d.p;
                }
                if (Intrinsics.a(string2, A1.e$a.q.e())) {
                    return d.p;
                }
                if (Intrinsics.a(string2, A1.b.w.e())) {
                    return d.q;
                }
                if (Intrinsics.a(string2, A1.b.x.e())) {
                    return d.q;
                }
                if (!Intrinsics.a(string2, m.q.e())) return null;
                return d.r;
            }
        }

    }

    public abstract class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] arrn = new int[d.values().length];
            arrn[d.p.ordinal()] = 1;
            arrn[d.q.ordinal()] = 2;
            arrn[d.r.ordinal()] = 3;
            a = arrn;
            arrn = new int[k.values().length];
            arrn[k.q.ordinal()] = 1;
            arrn[k.p.ordinal()] = 2;
            b = arrn;
            arrn = new int[A1.a.values().length];
            arrn[A1.a.p.ordinal()] = 1;
            arrn[A1.a.q.ordinal()] = 2;
            c = arrn;
        }
    }

}

