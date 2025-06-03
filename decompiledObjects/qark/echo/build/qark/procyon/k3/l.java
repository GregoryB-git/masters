// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import c3.g;

public abstract class l
{
    public final Class a;
    public final Class b;
    
    public l(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static l b(final b b, final Class clazz, final Class clazz2) {
        return new l(clazz, clazz2) {
            @Override
            public Object a(final g g) {
                return b.a(g);
            }
        };
    }
    
    public abstract Object a(final g p0);
    
    public Class c() {
        return this.a;
    }
    
    public Class d() {
        return this.b;
    }
    
    public interface b
    {
        Object a(final g p0);
    }
}
