// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K4;

import M4.o;
import M4.k;
import android.content.Context;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import F4.a;

public class i
{
    public static final a e;
    public final Runtime a;
    public final ActivityManager b;
    public final ActivityManager$MemoryInfo c;
    public final Context d;
    
    static {
        e = a.e();
    }
    
    public i(final Context context) {
        this(Runtime.getRuntime(), context);
    }
    
    public i(final Runtime a, final Context d) {
        this.a = a;
        this.d = d;
        (this.b = (ActivityManager)d.getSystemService("activity")).getMemoryInfo(this.c = new ActivityManager$MemoryInfo());
    }
    
    public int a() {
        return o.c(k.t.c(this.c.totalMem));
    }
    
    public int b() {
        return o.c(k.t.c(this.a.maxMemory()));
    }
    
    public int c() {
        return o.c(k.r.c(this.b.getMemoryClass()));
    }
}
