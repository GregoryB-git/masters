package ec;

import b.a0;
import dc.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sb.y;
import sb.z;

/* loaded from: classes.dex */
public final class d implements jc.c<Object>, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<? extends rb.a<?>>, Integer> f5265b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f5266c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f5267d;

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f5268a;

    static {
        int i10 = 0;
        List g10 = va.a.g(dc.a.class, dc.l.class, dc.p.class, dc.q.class, dc.r.class, dc.s.class, dc.t.class, dc.u.class, dc.v.class, w.class, dc.b.class, dc.c.class, dc.d.class, dc.e.class, dc.f.class, dc.g.class, dc.h.class, dc.i.class, dc.j.class, dc.k.class, dc.m.class, dc.n.class, dc.o.class);
        ArrayList arrayList = new ArrayList(sb.m.j(g10));
        for (Object obj : g10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new rb.d((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f5265b = z.L0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
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
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            i.b(str);
            sb2.append(lc.k.A0(str, str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str + ".Companion");
        }
        for (Map.Entry<Class<? extends rb.a<?>>, Integer> entry : f5265b.entrySet()) {
            Class<? extends rb.a<?>> key = entry.getKey();
            int intValue = entry.getValue().intValue();
            hashMap3.put(key.getName(), "kotlin.Function" + intValue);
        }
        f5266c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(hashMap3.size()));
        Iterator<T> it = hashMap3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key2, lc.k.A0(str2, str2));
        }
        f5267d = linkedHashMap;
    }

    public d(Class<?> cls) {
        i.e(cls, "jClass");
        this.f5268a = cls;
    }

    @Override // jc.c
    public final String b() {
        String str;
        Class<?> cls = this.f5268a;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str3 = f5266c.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = f5266c.get(componentType.getName())) != null) {
            str2 = defpackage.g.d(str, "Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    @Override // jc.c
    public final boolean c(Object obj) {
        Class<?> cls = this.f5268a;
        i.e(cls, "jClass");
        Map<Class<? extends rb.a<?>>, Integer> map = f5265b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(cls);
        if (num != null) {
            return v.b(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = a0.t(t.a(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // ec.c
    public final Class<?> d() {
        return this.f5268a;
    }

    public final String e() {
        String str;
        String str2;
        Class<?> cls = this.f5268a;
        i.e(cls, "jClass");
        String str3 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    str2 = enclosingMethod.getName() + '$';
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int indexOf = simpleName.indexOf(36, 0);
                        if (indexOf == -1) {
                            return simpleName;
                        }
                        String substring = simpleName.substring(indexOf + 1, simpleName.length());
                        i.d(substring, "substring(...)");
                        return substring;
                    }
                    str2 = enclosingConstructor.getName() + '$';
                }
                return lc.k.z0(simpleName, str2, simpleName);
            }
            if (!cls.isArray()) {
                String str4 = (String) f5267d.get(cls.getName());
                return str4 == null ? cls.getSimpleName() : str4;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) f5267d.get(componentType.getName())) != null) {
                str3 = defpackage.g.d(str, "Array");
            }
            if (str3 == null) {
                return "Array";
            }
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && i.a(a0.t(this), a0.t((jc.c) obj));
    }

    public final int hashCode() {
        return a0.t(this).hashCode();
    }

    public final String toString() {
        return this.f5268a + " (Kotlin reflection is not available)";
    }
}
