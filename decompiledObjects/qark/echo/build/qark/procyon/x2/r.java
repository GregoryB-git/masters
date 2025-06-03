// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.content.Context;
import K2.i;

public final class r extends i
{
    public final Context a;
    public final /* synthetic */ j b;
    
    public r(final j b, final Context context) {
        this.b = b;
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        }
        else {
            looper = Looper.myLooper();
        }
        super(looper);
        this.a = context.getApplicationContext();
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle this message: ");
            sb.append(what);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        final int g = this.b.g(this.a);
        if (this.b.j(g)) {
            this.b.o(this.a, g);
        }
    }
}
