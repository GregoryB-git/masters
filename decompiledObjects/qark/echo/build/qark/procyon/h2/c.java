// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h2;

public final class c implements b
{
    public static final c b;
    public final Object a;
    
    static {
        b = new c(null);
    }
    
    public c(final Object a) {
        this.a = a;
    }
    
    public static b a(final Object o) {
        return new c(d.c(o, "instance cannot be null"));
    }
    
    @Override
    public Object get() {
        return this.a;
    }
}
