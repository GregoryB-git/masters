// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import z2.g;
import android.content.Intent;

public final class A extends B
{
    public final /* synthetic */ Intent a;
    public final /* synthetic */ g b;
    
    public A(final Intent a, final g b, final int n) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, 2);
        }
    }
}
