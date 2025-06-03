// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.app.Dialog;

public final class V extends D
{
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ W b;
    
    public V(final W b, final Dialog a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        X.r(this.b.p);
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
