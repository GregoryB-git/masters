// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import r3.a;

public abstract class j
{
    public final a a;
    public final Class b;
    
    public j(final a a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static j a(final b b, final a a, final Class clazz) {
        return new j(a, clazz) {};
    }
    
    public final a b() {
        return this.a;
    }
    
    public final Class c() {
        return this.b;
    }
    
    public interface b
    {
    }
}
