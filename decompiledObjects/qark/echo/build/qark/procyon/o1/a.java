// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o1;

import android.os.Build$VERSION;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public final int a() {
        if (Build$VERSION.SDK_INT >= 30) {
            return o1.a.a.a.a();
        }
        return 0;
    }
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        public final int a() {
            return E.a.a(1000000);
        }
    }
}
