// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import c3.g;
import c3.y;
import r3.a;

public abstract class b
{
    public final a a;
    public final Class b;
    
    public b(final a a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static b a(final b b, final a a, final Class clazz) {
        return new b(a, clazz) {
            @Override
            public g d(final q q, final y y) {
                return b.a(q, y);
            }
        };
    }
    
    public final a b() {
        return this.a;
    }
    
    public final Class c() {
        return this.b;
    }
    
    public abstract g d(final q p0, final y p1);
    
    public interface b
    {
        g a(final q p0, final y p1);
    }
}
