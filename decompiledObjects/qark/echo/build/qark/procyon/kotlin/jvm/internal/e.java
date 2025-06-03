// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collection;
import W5.C;
import java.util.ArrayList;
import g6.o;
import g6.n;
import g6.m;
import g6.k;
import g6.j;
import g6.i;
import g6.h;
import g6.f;
import g6.b;
import g6.w;
import g6.v;
import g6.u;
import g6.t;
import g6.s;
import g6.r;
import g6.q;
import g6.p;
import g6.l;
import g6.a;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import m6.c;

public final class e implements c, d
{
    public static final a p;
    public static final Map q;
    public static final HashMap r;
    public static final HashMap s;
    public static final HashMap t;
    public static final Map u;
    public final Class o;
    
    static {
        p = new a(null);
        int i = 0;
        final List list = W5.m.i(g6.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, g6.c.class, g6.d.class, g6.e.class, f.class, g6.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        final ArrayList list2 = new ArrayList<V5.m>(W5.m.l(list, 10));
        for (final Class<?> next : list) {
            if (i < 0) {
                W5.m.k();
            }
            list2.add(V5.q.a(next, i));
            ++i;
        }
        q = C.k(list2);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        r = hashMap;
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        s = hashMap2;
        final HashMap<String, String> t2 = new HashMap<String, String>();
        t2.put("java.lang.Object", "kotlin.Any");
        t2.put("java.lang.String", "kotlin.String");
        t2.put("java.lang.CharSequence", "kotlin.CharSequence");
        t2.put("java.lang.Throwable", "kotlin.Throwable");
        t2.put("java.lang.Cloneable", "kotlin.Cloneable");
        t2.put("java.lang.Number", "kotlin.Number");
        t2.put("java.lang.Comparable", "kotlin.Comparable");
        t2.put("java.lang.Enum", "kotlin.Enum");
        t2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        t2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        t2.put("java.util.Iterator", "kotlin.collections.Iterator");
        t2.put("java.util.Collection", "kotlin.collections.Collection");
        t2.put("java.util.List", "kotlin.collections.List");
        t2.put("java.util.Set", "kotlin.collections.Set");
        t2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        t2.put("java.util.Map", "kotlin.collections.Map");
        t2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        t2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        t2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        t2.putAll(hashMap);
        t2.putAll(hashMap2);
        final Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (final String str : values) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.b(str);
            sb.append(kotlin.text.i.e0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            final V5.m a = V5.q.a(string, sb2.toString());
            t2.put((String)a.c(), (String)a.d());
        }
        for (final Map.Entry<Class, V> entry : e.q.entrySet()) {
            final Class clazz = entry.getKey();
            final int intValue = ((Number)entry.getValue()).intValue();
            final String name = clazz.getName();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("kotlin.Function");
            sb3.append(intValue);
            t2.put(name, sb3.toString());
        }
        t = t2;
        final LinkedHashMap u2 = new LinkedHashMap<Object, String>(C.a(t2.size()));
        for (final Map.Entry<Object, V> entry2 : t2.entrySet()) {
            u2.put(entry2.getKey(), kotlin.text.i.e0((String)entry2.getValue(), '.', null, 2, null));
        }
        u = u2;
    }
    
    public e(final Class o) {
        Intrinsics.checkNotNullParameter(o, "jClass");
        this.o = o;
    }
    
    public static final /* synthetic */ Map c() {
        return e.u;
    }
    
    @Override
    public String a() {
        return e.p.a(this.b());
    }
    
    @Override
    public Class b() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && Intrinsics.a(f6.a.a(this), f6.a.a((c)o));
    }
    
    @Override
    public int hashCode() {
        return f6.a.a(this).hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a(final Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "jClass");
            final boolean anonymousClass = clazz.isAnonymousClass();
            final String s = null;
            if (anonymousClass) {
                return null;
            }
            if (!clazz.isLocalClass()) {
                String simpleName;
                if (clazz.isArray()) {
                    final Class componentType = clazz.getComponentType();
                    final boolean primitive = componentType.isPrimitive();
                    final String s2 = "Array";
                    String string = s;
                    if (primitive) {
                        final String str = e.c().get(componentType.getName());
                        string = s;
                        if (str != null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("Array");
                            string = sb.toString();
                        }
                    }
                    if ((simpleName = string) == null) {
                        return s2;
                    }
                }
                else if ((simpleName = e.c().get(clazz.getName())) == null) {
                    simpleName = clazz.getSimpleName();
                }
                return simpleName;
            }
            final String simpleName2 = clazz.getSimpleName();
            final Method enclosingMethod = clazz.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.b(simpleName2);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingMethod.getName());
                sb2.append('$');
                final String c0;
                if ((c0 = kotlin.text.i.c0(simpleName2, sb2.toString(), null, 2, null)) != null) {
                    return c0;
                }
            }
            final Constructor enclosingConstructor = clazz.getEnclosingConstructor();
            Intrinsics.b(simpleName2);
            if (enclosingConstructor != null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(enclosingConstructor.getName());
                sb3.append('$');
                return kotlin.text.i.c0(simpleName2, sb3.toString(), null, 2, null);
            }
            return kotlin.text.i.b0(simpleName2, '$', null, 2, null);
        }
    }
}
