// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P3;

import java.util.Stack;

public class e
{
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;
    
    public e(final String a, final String b, final StackTraceElement[] c, final e d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static e a(Throwable cause, final d d) {
        final Stack<Throwable> stack = new Stack<Throwable>();
        while (cause != null) {
            stack.push(cause);
            cause = cause.getCause();
        }
        e e = null;
        while (!stack.isEmpty()) {
            final Throwable t = stack.pop();
            e = new e(t.getLocalizedMessage(), t.getClass().getName(), d.a(t.getStackTrace()), e);
        }
        return e;
    }
}
