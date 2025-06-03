// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import android.os.Handler;
import android.os.HandlerThread;

public class o
{
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public Runnable e;
    public m f;
    
    public o(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean b() {
        final m f = this.f;
        return f != null && f.b();
    }
    
    public Integer d() {
        final m f = this.f;
        if (f != null) {
            return f.a();
        }
        return null;
    }
    
    public void e(final m m) {
        this.d.post((Runnable)new n(this, m));
    }
    
    public void f() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0036: {
            try {
                final HandlerThread c = this.c;
                if (c != null) {
                    c.quit();
                    this.c = null;
                    this.d = null;
                }
            }
            finally {
                break Label_0036;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void g(final Runnable e) {
        synchronized (this) {
            ((Thread)(this.c = new HandlerThread(this.a, this.b))).start();
            this.d = new Handler(this.c.getLooper());
            this.e = e;
        }
    }
    
    public void h(final m f) {
        f.b.run();
        this.f = f;
        this.e.run();
    }
}
