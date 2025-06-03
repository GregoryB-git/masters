// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import java.util.Iterator;
import f2.p;
import o2.b;
import n2.d;
import java.util.concurrent.Executor;

public class v
{
    public final Executor a;
    public final d b;
    public final x c;
    public final b d;
    
    public v(final Executor a, final d b, final x c, final b d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void c() {
        this.a.execute(new t(this));
    }
}
