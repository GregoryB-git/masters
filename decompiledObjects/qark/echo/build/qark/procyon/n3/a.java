// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
    public static final a b;
    public final Map a;
    
    static {
        b = a().a();
    }
    
    public a(final Map a) {
        this.a = a;
    }
    
    public static b a() {
        return new b();
    }
    
    public Map b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof a && this.a.equals(((a)o).a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public static final class b
    {
        public HashMap a;
        
        public b() {
            this.a = new HashMap();
        }
        
        public a a() {
            if (this.a != null) {
                final a a = new a(Collections.unmodifiableMap((Map<?, ?>)this.a), null);
                this.a = null;
                return a;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }
}
