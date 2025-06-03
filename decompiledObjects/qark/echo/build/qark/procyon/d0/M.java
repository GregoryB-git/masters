// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

public final class M extends Exception
{
    public final long o;
    
    public M(final Throwable cause, final long o) {
        super(cause);
        this.o = o;
    }
    
    public static M a(final Exception ex) {
        return b(ex, -9223372036854775807L);
    }
    
    public static M b(final Exception ex, final long n) {
        if (ex instanceof M) {
            return (M)ex;
        }
        return new M(ex, n);
    }
}
