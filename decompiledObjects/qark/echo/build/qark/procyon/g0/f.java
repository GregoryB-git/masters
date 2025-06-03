// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

public class f
{
    public final c a;
    public boolean b;
    
    public f() {
        this(c.a);
    }
    
    public f(final c a) {
        this.a = a;
    }
    
    public void a() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0023: {
            try {
                while (!this.b) {
                    this.wait();
                }
            }
            finally {
                break Label_0023;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void b() {
        // monitorenter(this)
        boolean b = false;
        while (true) {
            while (true) {
                Label_0042: {
                    try {
                        while (!this.b) {
                            final f f = this;
                            f.wait();
                        }
                        break Label_0042;
                    }
                    finally {
                        break Label_0042;
                    }
                    try {
                        final f f = this;
                        f.wait();
                        continue;
                        // iftrue(Label_0039:, !b)
                        Thread.currentThread().interrupt();
                        Label_0039: {
                            break Label_0039;
                            b = true;
                            continue;
                        }
                        // monitorexit(this)
                        return;
                    }
                    // monitorexit(this)
                    catch (InterruptedException ex) {}
                }
                break;
            }
            continue;
        }
    }
    
    public boolean c() {
        synchronized (this) {
            final boolean b = this.b;
            this.b = false;
            return b;
        }
    }
    
    public boolean d() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public boolean e() {
        synchronized (this) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.notifyAll();
            return true;
        }
    }
}
