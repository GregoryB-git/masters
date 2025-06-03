// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

public final class u0 extends RuntimeException
{
    public final int o;
    
    public u0(final int o) {
        super(a(o));
        this.o = o;
    }
    
    public static String a(final int n) {
        if (n == 1) {
            return "Player release timed out.";
        }
        if (n == 2) {
            return "Setting foreground mode timed out.";
        }
        if (n != 3) {
            return "Undefined timeout.";
        }
        return "Detaching surface timed out.";
    }
}
