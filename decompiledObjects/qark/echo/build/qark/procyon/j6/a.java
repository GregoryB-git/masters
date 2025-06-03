// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j6;

import java.util.Random;

public abstract class a extends c
{
    @Override
    public int b(final int n) {
        return d.a(this.d().nextInt(), n);
    }
    
    @Override
    public int c() {
        return this.d().nextInt();
    }
    
    public abstract Random d();
}
