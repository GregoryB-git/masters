// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

public final class c extends f
{
    public static final c w;
    
    static {
        w = new c();
    }
    
    public c() {
        super(l.c, l.d, l.e, l.a);
    }
    
    @Override
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}
