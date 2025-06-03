// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A6;

import android.os.Build$VERSION;
import E5.j;
import E5.k;

public class a implements A5.a, c
{
    public k a;
    
    @Override
    public void onAttachedToEngine(final A5.a.b b) {
        (this.a = new k(b.b(), "flutter_native_splash")).e((k.c)this);
    }
    
    @Override
    public void onDetachedFromEngine(final A5.a.b b) {
        this.a.e(null);
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        if (j.a.equals("getPlatformVersion")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Android ");
            sb.append(Build$VERSION.RELEASE);
            d.a(sb.toString());
            return;
        }
        d.c();
    }
}
