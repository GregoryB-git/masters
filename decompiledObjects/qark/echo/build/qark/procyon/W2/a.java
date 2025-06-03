// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

public final class a extends l
{
    public static final a o;
    private static final long serialVersionUID = 0L;
    
    static {
        o = new a();
    }
    
    public static l e() {
        return a.o;
    }
    
    private Object readResolve() {
        return a.o;
    }
    
    @Override
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public int hashCode() {
        return 2040732332;
    }
    
    @Override
    public String toString() {
        return "Optional.absent()";
    }
}
