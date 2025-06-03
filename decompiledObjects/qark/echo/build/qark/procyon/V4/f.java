// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V4;

public abstract class f extends Exception
{
    public static final boolean o;
    public static final StackTraceElement[] p;
    
    static {
        o = (System.getProperty("surefire.test.class.path") != null);
        p = new StackTraceElement[0];
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        // monitorenter(this)
        // monitorexit(this)
        return null;
    }
}
