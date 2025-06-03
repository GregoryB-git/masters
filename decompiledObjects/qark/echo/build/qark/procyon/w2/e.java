// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Message;
import android.os.Looper;
import L2.f;

public final class e extends f
{
    public final /* synthetic */ c a;
    
    public e(final c a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        c.d(this.a, message);
    }
}
