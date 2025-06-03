// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import W2.s;
import java.util.TreeMap;
import java.util.Map;
import W2.m;
import java.util.Comparator;

public abstract class J
{
    public static d a() {
        return b(P.d());
    }
    
    public static d b(final Comparator comparator) {
        m.j(comparator);
        return (d)new d() {
            @Override
            public Map c() {
                return new TreeMap(comparator);
            }
        };
    }
    
    public static final class b implements s, Serializable
    {
        public final int o;
        
        public b(final int n) {
            this.o = i.b(n, "expectedValuesPerKey");
        }
        
        public List a() {
            return new ArrayList(this.o);
        }
    }
    
    public abstract static class c extends J
    {
        public c() {
            super(null);
        }
        
        public abstract D c();
    }
    
    public abstract static class d
    {
        public c a() {
            return this.b(2);
        }
        
        public c b(final int n) {
            i.b(n, "expectedValuesPerKey");
            return new c() {
                @Override
                public D c() {
                    return K.b(d.this.c(), new b(n));
                }
            };
        }
        
        public abstract Map c();
    }
}
