// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.CancellationException;

public abstract class f0
{
    public static final CancellationException a(final String message, final Throwable cause) {
        final CancellationException ex = new CancellationException(message);
        ex.initCause(cause);
        return ex;
    }
}
