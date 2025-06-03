// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import android.os.Handler;
import android.os.HandlerThread;

public class u implements q
{
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    
    public u(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        final HandlerThread c = this.c;
        if (c != null) {
            c.quit();
            this.c = null;
            this.d = null;
        }
    }
    
    @Override
    public void c(final m m) {
        this.d.post(m.b);
    }
    
    @Override
    public void start() {
        ((Thread)(this.c = new HandlerThread(this.a, this.b))).start();
        this.d = new Handler(this.c.getLooper());
    }
}
