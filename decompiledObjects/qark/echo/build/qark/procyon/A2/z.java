// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.app.Activity;
import android.content.Intent;

public final class z extends B
{
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;
    
    public z(final Intent a, final Activity b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, this.c);
        }
    }
}
