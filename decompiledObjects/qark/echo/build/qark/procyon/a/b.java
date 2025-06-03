// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a;

public abstract class b
{
    public static final String a = "_COROUTINE";
    
    public static final StackTraceElement b(final Throwable t, final String str) {
        final StackTraceElement stackTraceElement = t.getStackTrace()[0];
        final StringBuilder sb = new StringBuilder();
        sb.append(b.a);
        sb.append('.');
        sb.append(str);
        return new StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
