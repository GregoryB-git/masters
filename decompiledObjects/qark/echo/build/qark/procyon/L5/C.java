// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import java.util.HashMap;
import V2.m;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import V2.k;

public class C
{
    public final k a;
    public final E5.k b;
    
    public C(final E5.k b) {
        this.a = new k();
        this.b = b;
    }
    
    public static /* synthetic */ k b(final C c) {
        return c.a;
    }
    
    public Object c(final Map map) {
        new Handler(Looper.getMainLooper()).post((Runnable)new B(this, map));
        return m.a(this.a.a());
    }
}
