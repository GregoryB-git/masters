// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import java.io.IOException;

public class A extends IOException
{
    public final boolean o;
    public final int p;
    
    public A(final String message, final Throwable cause, final boolean o, final int p4) {
        super(message, cause);
        this.o = o;
        this.p = p4;
    }
    
    public static A a(final String s, final Throwable t) {
        return new A(s, t, true, 1);
    }
    
    public static A b(final String s, final Throwable t) {
        return new A(s, t, true, 0);
    }
    
    public static A c(final String s, final Throwable t) {
        return new A(s, t, true, 4);
    }
    
    public static A d(final String s) {
        return new A(s, null, false, 1);
    }
    
    @Override
    public String getMessage() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.o);
        sb.append(", dataType=");
        sb.append(this.p);
        sb.append("}");
        return sb.toString();
    }
}
