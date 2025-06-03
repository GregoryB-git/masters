// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.M;
import android.os.Bundle;

public abstract class B extends Exception
{
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public final int o;
    public final long p;
    public final Bundle q;
    
    static {
        r = M.w0(0);
        s = M.w0(1);
        t = M.w0(2);
        u = M.w0(3);
        v = M.w0(4);
        w = M.w0(5);
    }
    
    public B(final String message, final Throwable cause, final int o, final Bundle q, final long p5) {
        super(message, cause);
        this.o = o;
        this.q = q;
        this.p = p5;
    }
}
