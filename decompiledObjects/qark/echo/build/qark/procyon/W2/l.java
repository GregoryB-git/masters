// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.io.Serializable;

public abstract class l implements Serializable
{
    private static final long serialVersionUID = 0L;
    
    public static l a() {
        return a.e();
    }
    
    public static l d(final Object o) {
        return new p(m.j(o));
    }
    
    public abstract Object b();
    
    public abstract boolean c();
}
