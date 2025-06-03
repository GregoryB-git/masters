// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t6;

import s6.c;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException
{
    public final transient c o;
    
    public a(final c o) {
        super("Flow was aborted, no more elements needed");
        this.o = o;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
