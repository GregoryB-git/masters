// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import java.util.Iterator;
import java.util.List;
import java.security.GeneralSecurityException;
import c3.v;
import c3.x;
import c3.w;

public class h implements w
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    public static void d() {
        x.n(h.a);
    }
    
    @Override
    public Class a() {
        return g.class;
    }
    
    @Override
    public Class c() {
        return g.class;
    }
    
    public g e(final v v) {
        if (v == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (v.e() != null) {
            final Iterator<List<v.c>> iterator = v.c().iterator();
            while (iterator.hasNext()) {
                final Iterator<v.c> iterator2 = iterator.next().iterator();
                while (iterator2.hasNext()) {
                    final g g = (g)iterator2.next().a();
                }
            }
            return new b(v, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
    
    public static class b implements g
    {
        public final v a;
        
        public b(final v a) {
            this.a = a;
        }
    }
}
