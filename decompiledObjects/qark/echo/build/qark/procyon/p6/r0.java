// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.CancellationException;

public final class r0 extends CancellationException
{
    public final transient q0 o;
    
    public r0(final String message, final Throwable cause, final q0 o) {
        super(message);
        this.o = o;
        if (cause != null) {
            this.initCause(cause);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof r0) {
                final r0 r0 = (r0)o;
                if (Intrinsics.a(r0.getMessage(), this.getMessage()) && Intrinsics.a(r0.o, this.o) && Intrinsics.a(r0.getCause(), this.getCause())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public int hashCode() {
        final String message = this.getMessage();
        Intrinsics.b(message);
        final int hashCode = message.hashCode();
        final int hashCode2 = this.o.hashCode();
        final Throwable cause = this.getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.o);
        return sb.toString();
    }
}
