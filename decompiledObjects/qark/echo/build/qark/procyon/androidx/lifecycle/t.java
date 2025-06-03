// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class t
{
    public final HashMap a;
    
    public t() {
        this.a = new HashMap();
    }
    
    public final void a() {
        final Iterator<r> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.a.clear();
    }
    
    public final r b(final String key) {
        return this.a.get(key);
    }
    
    public Set c() {
        return new HashSet(this.a.keySet());
    }
    
    public final void d(final String key, final r value) {
        final r r = this.a.put(key, value);
        if (r != null) {
            r.d();
        }
    }
}
