/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package kotlin.jvm.internal;

import V5.q;
import W5.C;
import g6.b;
import g6.f;
import g6.h;
import g6.i;
import g6.j;
import g6.k;
import g6.l;
import g6.m;
import g6.n;
import g6.o;
import g6.p;
import g6.r;
import g6.s;
import g6.t;
import g6.u;
import g6.v;
import g6.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;
import m6.c;

public final class e
implements c,
d {
    public static final a p;
    public static final Map q;
    public static final HashMap r;
    public static final HashMap s;
    public static final HashMap t;
    public static final Map u;
    public final Class o;

    static {
        Object object;
        Object object22;
        p = new a(null);
        int n8 = 0;
        Iterable iterable = (Iterable)W5.m.i((Object[])new Class[]{g6.a.class, l.class, p.class, g6.q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, g6.c.class, g6.d.class, g6.e.class, f.class, g6.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        ArrayList arrayList = new ArrayList(W5.m.l(iterable, 10));
        for (Object object22 : iterable) {
            if (n8 < 0) {
                W5.m.k();
            }
            arrayList.add((Object)q.a((Object)((Class)object22), n8));
            ++n8;
        }
        q = C.k((Iterable)arrayList);
        iterable = new HashMap();
        iterable.put((Object)"boolean", (Object)"kotlin.Boolean");
        iterable.put((Object)"char", (Object)"kotlin.Char");
        iterable.put((Object)"byte", (Object)"kotlin.Byte");
        iterable.put((Object)"short", (Object)"kotlin.Short");
        iterable.put((Object)"int", (Object)"kotlin.Int");
        iterable.put((Object)"float", (Object)"kotlin.Float");
        iterable.put((Object)"long", (Object)"kotlin.Long");
        iterable.put((Object)"double", (Object)"kotlin.Double");
        r = iterable;
        object22 = new HashMap();
        object22.put((Object)"java.lang.Boolean", (Object)"kotlin.Boolean");
        object22.put((Object)"java.lang.Character", (Object)"kotlin.Char");
        object22.put((Object)"java.lang.Byte", (Object)"kotlin.Byte");
        object22.put((Object)"java.lang.Short", (Object)"kotlin.Short");
        object22.put((Object)"java.lang.Integer", (Object)"kotlin.Int");
        object22.put((Object)"java.lang.Float", (Object)"kotlin.Float");
        object22.put((Object)"java.lang.Long", (Object)"kotlin.Long");
        object22.put((Object)"java.lang.Double", (Object)"kotlin.Double");
        s = object22;
        arrayList = new HashMap();
        arrayList.put((Object)"java.lang.Object", (Object)"kotlin.Any");
        arrayList.put((Object)"java.lang.String", (Object)"kotlin.String");
        arrayList.put((Object)"java.lang.CharSequence", (Object)"kotlin.CharSequence");
        arrayList.put((Object)"java.lang.Throwable", (Object)"kotlin.Throwable");
        arrayList.put((Object)"java.lang.Cloneable", (Object)"kotlin.Cloneable");
        arrayList.put((Object)"java.lang.Number", (Object)"kotlin.Number");
        arrayList.put((Object)"java.lang.Comparable", (Object)"kotlin.Comparable");
        arrayList.put((Object)"java.lang.Enum", (Object)"kotlin.Enum");
        arrayList.put((Object)"java.lang.annotation.Annotation", (Object)"kotlin.Annotation");
        arrayList.put((Object)"java.lang.Iterable", (Object)"kotlin.collections.Iterable");
        arrayList.put((Object)"java.util.Iterator", (Object)"kotlin.collections.Iterator");
        arrayList.put((Object)"java.util.Collection", (Object)"kotlin.collections.Collection");
        arrayList.put((Object)"java.util.List", (Object)"kotlin.collections.List");
        arrayList.put((Object)"java.util.Set", (Object)"kotlin.collections.Set");
        arrayList.put((Object)"java.util.ListIterator", (Object)"kotlin.collections.ListIterator");
        arrayList.put((Object)"java.util.Map", (Object)"kotlin.collections.Map");
        arrayList.put((Object)"java.util.Map$Entry", (Object)"kotlin.collections.Map.Entry");
        arrayList.put((Object)"kotlin.jvm.internal.StringCompanionObject", (Object)"kotlin.String.Companion");
        arrayList.put((Object)"kotlin.jvm.internal.EnumCompanionObject", (Object)"kotlin.Enum.Companion");
        arrayList.putAll((Map)iterable);
        arrayList.putAll((Map)object22);
        iterable = iterable.values();
        Intrinsics.checkNotNullExpressionValue((Object)iterable, "<get-values>(...)");
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            object22 = (String)iterable.next();
            object = new StringBuilder();
            object.append("kotlin.jvm.internal.");
            Intrinsics.b(object22);
            object.append(kotlin.text.i.e0((String)object22, '.', null, 2, null));
            object.append("CompanionObject");
            object = object.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object22);
            stringBuilder.append(".Companion");
            object22 = q.a(object, stringBuilder.toString());
            arrayList.put(object22.c(), object22.d());
        }
        iterable = q.entrySet().iterator();
        while (iterable.hasNext()) {
            object22 = (Map.Entry)iterable.next();
            object = (Class)object22.getKey();
            n8 = ((Number)object22.getValue()).intValue();
            object22 = object.getName();
            object = new StringBuilder();
            object.append("kotlin.Function");
            object.append(n8);
            arrayList.put(object22, (Object)object.toString());
        }
        t = arrayList;
        iterable = new LinkedHashMap(C.a(arrayList.size()));
        for (Object object22 : arrayList.entrySet()) {
            iterable.put(object22.getKey(), (Object)kotlin.text.i.e0((String)object22.getValue(), '.', null, 2, null));
        }
        u = iterable;
    }

    public e(Class class_) {
        Intrinsics.checkNotNullParameter((Object)class_, "jClass");
        this.o = class_;
    }

    @Override
    public String a() {
        return p.a(this.b());
    }

    @Override
    public Class b() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (object instanceof e && Intrinsics.a((Object)f6.a.a(this), (Object)f6.a.a((c)object))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return f6.a.a(this).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b().toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final String a(Class object) {
            Intrinsics.checkNotNullParameter(object, "jClass");
            boolean bl = object.isAnonymousClass();
            Object object2 = null;
            if (bl) {
                return null;
            }
            if (object.isLocalClass()) {
                String string2 = object.getSimpleName();
                object2 = object.getEnclosingMethod();
                if (object2 != null) {
                    Intrinsics.b(string2);
                    Object object3 = new StringBuilder();
                    object3.append(object2.getName());
                    object3.append('$');
                    object2 = object3 = kotlin.text.i.c0(string2, object3.toString(), null, 2, null);
                    if (object3 != null) return object2;
                }
                object = object.getEnclosingConstructor();
                Intrinsics.b(string2);
                if (object == null) return kotlin.text.i.b0(string2, '$', null, 2, null);
                object2 = new StringBuilder();
                object2.append(object.getName());
                object2.append('$');
                return kotlin.text.i.c0(string2, object2.toString(), null, 2, null);
            }
            if (object.isArray()) {
                Object object4 = object.getComponentType();
                bl = object4.isPrimitive();
                String string3 = "Array";
                object = object2;
                if (bl) {
                    object4 = (String)u.get((Object)object4.getName());
                    object = object2;
                    if (object4 != null) {
                        object = new StringBuilder();
                        object.append((String)object4);
                        object.append("Array");
                        object = object.toString();
                    }
                }
                object2 = object;
                if (object != null) return object2;
                return string3;
            }
            String string4 = (String)u.get((Object)object.getName());
            object2 = string4;
            if (string4 != null) return object2;
            return object.getSimpleName();
        }
    }

}

