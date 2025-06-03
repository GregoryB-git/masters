// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import X5.g;

public final class i extends RuntimeException
{
    public final transient g o;
    
    public i(final g o) {
        this.o = o;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public String getLocalizedMessage() {
        return this.o.toString();
    }
}
