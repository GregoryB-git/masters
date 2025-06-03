// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.io.IOException;

public class h extends IOException
{
    public final int o;
    
    public h(final int o) {
        this.o = o;
    }
    
    public h(final String message, final int o) {
        super(message);
        this.o = o;
    }
    
    public h(final String message, final Throwable cause, final int o) {
        super(message, cause);
        this.o = o;
    }
    
    public h(final Throwable cause, final int o) {
        super(cause);
        this.o = o;
    }
    
    public static boolean a(IOException cause) {
        while (cause != null) {
            if (cause instanceof h && ((h)cause).o == 2008) {
                return true;
            }
            cause = (IOException)cause.getCause();
        }
        return false;
    }
}
