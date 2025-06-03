// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import h6.a;
import java.io.Serializable;
import java.util.Map;

public final class z implements Map, Serializable, a
{
    public static final z o;
    private static final long serialVersionUID = 8246714829545688274L;
    
    static {
        o = new z();
    }
    
    private final Object readResolve() {
        return z.o;
    }
    
    public boolean a(final Void void1) {
        Intrinsics.checkNotNullParameter(void1, "value");
        return false;
    }
    
    public Void b(final Object o) {
        return null;
    }
    
    public Set c() {
        return A.o;
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return false;
    }
    
    @Override
    public final /* bridge */ boolean containsValue(final Object o) {
        return o instanceof Void && this.a((Void)o);
    }
    
    public Set d() {
        return A.o;
    }
    
    public int e() {
        return 0;
    }
    
    @Override
    public final /* bridge */ Set entrySet() {
        return this.c();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Map && ((Map)o).isEmpty();
    }
    
    public Collection f() {
        return y.o;
    }
    
    public Void g(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public final /* bridge */ Set keySet() {
        return this.d();
    }
    
    @Override
    public void putAll(final Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.e();
    }
    
    @Override
    public String toString() {
        return "{}";
    }
    
    @Override
    public final /* bridge */ Collection values() {
        return this.f();
    }
}
