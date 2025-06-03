/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package S;

import S.d;
import W5.m;
import g6.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a
extends d {
    public final Map a;
    public final AtomicBoolean b;

    public a(Map map, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(bl);
    }

    public /* synthetic */ a(Map map, boolean bl, int n8, g g8) {
        if ((n8 & 1) != 0) {
            map = new LinkedHashMap();
        }
        if ((n8 & 2) != 0) {
            bl = true;
        }
        this(map, bl);
    }

    @Override
    public Map a() {
        Map map = Collections.unmodifiableMap((Map)this.a);
        Intrinsics.checkNotNullExpressionValue((Object)map, "unmodifiableMap(preferencesMap)");
        return map;
    }

    @Override
    public Object b(d.a a8) {
        Intrinsics.checkNotNullParameter(a8, "key");
        return this.a.get((Object)a8);
    }

    public final void e() {
        if (this.b.get() ^ true) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            return Intrinsics.a((Object)this.a, (Object)((a)object).a);
        }
        return false;
    }

    public final void f() {
        this.b.set(true);
    }

    public final /* varargs */ void g(d.b ... object) {
        Intrinsics.checkNotNullParameter(object, "pairs");
        this.e();
        if (object.length <= 0) {
            return;
        }
        object = object[0];
        throw null;
    }

    public final Object h(d.a a8) {
        Intrinsics.checkNotNullParameter(a8, "key");
        this.e();
        return this.a.remove((Object)a8);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final void i(d.a a8, Object object) {
        Intrinsics.checkNotNullParameter(a8, "key");
        this.j(a8, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(d.a a8, Object object) {
        Map map;
        Intrinsics.checkNotNullParameter(a8, "key");
        this.e();
        if (object == null) {
            this.h(a8);
            return;
        }
        if (object instanceof Set) {
            map = this.a;
            object = Collections.unmodifiableSet((Set)m.J((Iterable)object));
            Intrinsics.checkNotNullExpressionValue(object, "unmodifiableSet(value.toSet())");
        } else {
            map = this.a;
        }
        map.put((Object)a8, object);
    }

    public String toString() {
        return m.x((Iterable)this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, .o, 24, null);
    }

}

