// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w4;

public class b implements a
{
    public static b a;
    
    public static b b() {
        if (b.a == null) {
            b.a = new b();
        }
        return b.a;
    }
    
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}
