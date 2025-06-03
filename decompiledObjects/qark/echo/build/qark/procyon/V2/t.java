// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class t implements G
{
    public final Executor a;
    public final b b;
    public final K c;
    
    public t(final Executor a, final b b, final K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void c(final j j) {
        this.a.execute(new s(this, j));
    }
}
