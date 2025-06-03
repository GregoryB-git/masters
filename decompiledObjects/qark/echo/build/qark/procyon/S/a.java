// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import g6.l;
import W5.m;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

public final class a extends d
{
    public final Map a;
    public final AtomicBoolean b;
    
    public a(final Map a, final boolean initialValue) {
        Intrinsics.checkNotNullParameter(a, "preferencesMap");
        this.a = a;
        this.b = new AtomicBoolean(initialValue);
    }
    
    @Override
    public Map a() {
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)this.a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }
    
    @Override
    public Object b(final d.a a) {
        Intrinsics.checkNotNullParameter(a, "key");
        return this.a.get(a);
    }
    
    public final void e() {
        if (this.b.get() ^ true) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof a && Intrinsics.a(this.a, ((a)o).a);
    }
    
    public final void f() {
        this.b.set(true);
    }
    
    public final void g(final b... array) {
        Intrinsics.checkNotNullParameter(array, "pairs");
        this.e();
        if (array.length <= 0) {
            return;
        }
        final b b = array[0];
        throw null;
    }
    
    public final Object h(final d.a a) {
        Intrinsics.checkNotNullParameter(a, "key");
        this.e();
        return this.a.remove(a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public final void i(final d.a a, final Object o) {
        Intrinsics.checkNotNullParameter(a, "key");
        this.j(a, o);
    }
    
    public final void j(final d.a a, Object unmodifiableSet) {
        Intrinsics.checkNotNullParameter(a, "key");
        this.e();
        if (unmodifiableSet == null) {
            this.h(a);
            return;
        }
        Map map;
        if (unmodifiableSet instanceof Set) {
            map = this.a;
            unmodifiableSet = Collections.unmodifiableSet((Set<?>)m.J((Iterable)unmodifiableSet));
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
        }
        else {
            map = this.a;
        }
        map.put(a, unmodifiableSet);
    }
    
    @Override
    public String toString() {
        return m.x(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, a$a.o, 24, null);
    }
}
