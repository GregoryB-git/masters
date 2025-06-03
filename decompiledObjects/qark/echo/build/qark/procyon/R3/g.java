// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R3;

import java.util.concurrent.ExecutorService;
import r4.b;
import java.util.concurrent.atomic.AtomicReference;
import r4.a;
import V3.A;

public class g implements A
{
    public final r4.a a;
    public final AtomicReference b;
    
    public g(final r4.a a) {
        this.a = a;
        this.b = new AtomicReference();
        a.a((r4.a.a)new e(this));
    }
    
    @Override
    public void a(final boolean b, final a a) {
        android.support.v4.media.a.a(this.b.get());
        a.a(null);
    }
    
    @Override
    public void b(final ExecutorService executorService, final b b) {
        this.a.a((r4.a.a)new f(executorService, b));
    }
}
