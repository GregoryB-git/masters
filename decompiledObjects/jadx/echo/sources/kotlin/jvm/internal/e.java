package kotlin.jvm.internal;

import W5.E;
import W5.F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements m6.c, d {

    /* renamed from: p, reason: collision with root package name */
    public static final a f16216p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final Map f16217q;

    /* renamed from: r, reason: collision with root package name */
    public static final HashMap f16218r;

    /* renamed from: s, reason: collision with root package name */
    public static final HashMap f16219s;

    /* renamed from: t, reason: collision with root package name */
    public static final HashMap f16220t;

    /* renamed from: u, reason: collision with root package name */
    public static final Map f16221u;

    /* renamed from: o, reason: collision with root package name */
    public final Class f16222o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Laf
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L66
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L40
                kotlin.jvm.internal.Intrinsics.b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.i.c0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L40
            L3e:
                r1 = r2
                goto Laf
            L40:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                kotlin.jvm.internal.Intrinsics.b(r0)
                if (r7 == 0) goto L61
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.i.c0(r0, r7, r1, r3, r1)
                goto Laf
            L61:
                java.lang.String r1 = kotlin.text.i.b0(r0, r4, r1, r3, r1)
                goto Laf
            L66:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9a
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L97
                java.util.Map r0 = kotlin.jvm.internal.e.c()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L97
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L97:
                if (r1 != 0) goto Laf
                goto L3e
            L9a:
                java.util.Map r0 = kotlin.jvm.internal.e.c()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Laf
                java.lang.String r1 = r7.getSimpleName()
            Laf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.e.a.a(java.lang.Class):java.lang.String");
        }
    }

    static {
        List i7;
        int l7;
        Map k7;
        int a7;
        String e02;
        String e03;
        int i8 = 0;
        i7 = W5.o.i(g6.a.class, g6.l.class, g6.p.class, g6.q.class, g6.r.class, g6.s.class, g6.t.class, g6.u.class, g6.v.class, g6.w.class, g6.b.class, g6.c.class, g6.d.class, g6.e.class, g6.f.class, g6.g.class, g6.h.class, g6.i.class, g6.j.class, g6.k.class, g6.m.class, g6.n.class, g6.o.class);
        List list = i7;
        l7 = W5.p.l(list, 10);
        ArrayList arrayList = new ArrayList(l7);
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                W5.o.k();
            }
            arrayList.add(V5.q.a((Class) obj, Integer.valueOf(i8)));
            i8 = i9;
        }
        k7 = F.k(arrayList);
        f16217q = k7;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f16218r = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f16219s = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.b(str);
            e03 = kotlin.text.s.e0(str, '.', null, 2, null);
            sb.append(e03);
            sb.append("CompanionObject");
            V5.m a8 = V5.q.a(sb.toString(), str + ".Companion");
            hashMap3.put(a8.c(), a8.d());
        }
        for (Map.Entry entry : f16217q.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f16220t = hashMap3;
        a7 = E.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            e02 = kotlin.text.s.e0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, e02);
        }
        f16221u = linkedHashMap;
    }

    public e(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f16222o = jClass;
    }

    @Override // m6.c
    public String a() {
        return f16216p.a(b());
    }

    @Override // kotlin.jvm.internal.d
    public Class b() {
        return this.f16222o;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && Intrinsics.a(f6.a.a(this), f6.a.a((m6.c) obj));
    }

    public int hashCode() {
        return f6.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
