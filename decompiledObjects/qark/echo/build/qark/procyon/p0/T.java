// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

public final class T extends Exception
{
    public final int o;
    
    public T(final int o) {
        this.o = o;
    }
    
    public T(final int o, final Exception cause) {
        super(cause);
        this.o = o;
    }
}
