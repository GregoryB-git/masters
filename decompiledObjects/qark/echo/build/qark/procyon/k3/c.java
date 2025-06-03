// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

public abstract class c
{
    public final Class a;
    public final Class b;
    
    public c(final Class a, final Class b) {
        this.a = a;
        this.b = b;
    }
    
    public static c a(final b b, final Class clazz, final Class clazz2) {
        return new c(clazz, clazz2) {};
    }
    
    public Class b() {
        return this.a;
    }
    
    public Class c() {
        return this.b;
    }
    
    public interface b
    {
    }
}
