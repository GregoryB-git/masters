// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n;

import java.util.Map;
import java.util.HashMap;

public class a extends b
{
    public HashMap s;
    
    public a() {
        this.s = new HashMap();
    }
    
    public boolean contains(final Object key) {
        return this.s.containsKey(key);
    }
    
    @Override
    public c d(final Object key) {
        return this.s.get(key);
    }
    
    @Override
    public Object k(final Object key, final Object o) {
        final c d = this.d(key);
        if (d != null) {
            return d.p;
        }
        this.s.put(key, this.i(key, o));
        return null;
    }
    
    @Override
    public Object q(final Object key) {
        final Object q = super.q(key);
        this.s.remove(key);
        return q;
    }
    
    public Map.Entry s(final Object key) {
        if (this.contains(key)) {
            return this.s.get(key).r;
        }
        return null;
    }
}
