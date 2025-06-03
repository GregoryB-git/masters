// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

public final class k
{
    public static final k b;
    public static final k c;
    public static final k d;
    public final String a;
    
    static {
        b = new k("ENABLED");
        c = new k("DISABLED");
        d = new k("DESTROYED");
    }
    
    public k(final String a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
