// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Collection;
import java.util.Set;
import java.util.Map;

public abstract class q extends r implements Map
{
    public abstract Map b();
    
    public boolean c(final Object o) {
        return G.b(this, o);
    }
    
    @Override
    public void clear() {
        this.b().clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.b().containsKey(o);
    }
    
    public boolean d(final Object o) {
        return G.c(this, o);
    }
    
    public int e() {
        return a0.d(this.entrySet());
    }
    
    @Override
    public Set entrySet() {
        return this.b().entrySet();
    }
    
    @Override
    public Object get(final Object o) {
        return this.b().get(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }
    
    @Override
    public Set keySet() {
        return this.b().keySet();
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        return this.b().put(o, o2);
    }
    
    @Override
    public void putAll(final Map map) {
        this.b().putAll(map);
    }
    
    @Override
    public Object remove(final Object o) {
        return this.b().remove(o);
    }
    
    @Override
    public int size() {
        return this.b().size();
    }
    
    @Override
    public Collection values() {
        return this.b().values();
    }
}
