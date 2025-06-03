// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o6;

public abstract class b
{
    public static final boolean a = false;
    public static final ThreadLocal[] b;
    
    static {
        final ThreadLocal[] b2 = new ThreadLocal[4];
        for (int i = 0; i < 4; ++i) {
            b2[i] = new ThreadLocal();
        }
        b = b2;
    }
    
    public static final boolean a() {
        return o6.b.a;
    }
}
