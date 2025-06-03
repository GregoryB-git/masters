// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import U1.e;
import O1.n;
import java.util.Random;
import kotlin.jvm.internal.g;

public class o extends RuntimeException
{
    public static final a o;
    public static final long serialVersionUID = 1L;
    
    static {
        o = new a(null);
    }
    
    public o() {
    }
    
    public o(final String message) {
        super(message);
        final Random random = new Random();
        if (message != null && B.F() && random.nextInt(100) > 50) {
            final n a = n.a;
            n.a(n.b.M, (n.a)new x1.n(message));
        }
    }
    
    public o(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public o(final Throwable cause) {
        super(cause);
    }
    
    public static final void b(final String s, final boolean b) {
        if (!b) {
            return;
        }
        try {
            e.g(s);
        }
        catch (Exception ex) {}
    }
    
    @Override
    public String toString() {
        String message;
        if ((message = this.getMessage()) == null) {
            message = "";
        }
        return message;
    }
    
    public static final class a
    {
    }
}
