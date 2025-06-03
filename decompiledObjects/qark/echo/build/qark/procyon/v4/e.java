// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v4;

import java.util.concurrent.TimeUnit;
import s4.q;

public class e
{
    public static final long d;
    public static final long e;
    public final q a;
    public long b;
    public int c;
    
    static {
        d = TimeUnit.HOURS.toMillis(24L);
        e = TimeUnit.MINUTES.toMillis(30L);
    }
    
    public e() {
        this.a = q.c();
    }
    
    public static boolean c(final int n) {
        return n == 429 || (n >= 500 && n < 600);
    }
    
    public static boolean d(final int n) {
        return (n >= 200 && n < 300) || n == 401 || n == 404;
    }
    
    public final long a(final int n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0061: {
            try {
                if (!c(n)) {
                    // monitorexit(this)
                    return v4.e.d;
                }
            }
            finally {
                break Label_0061;
            }
            return (long)Math.min(Math.pow(2.0, this.c) + this.a.e(), (double)v4.e.e);
        }
    }
    // monitorexit(this)
    
    public boolean b() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0050: {
            boolean b = false;
            Label_0045: {
                try {
                    if (this.c != 0) {
                        if (this.a.a() <= this.b) {
                            b = false;
                            break Label_0045;
                        }
                    }
                }
                finally {
                    break Label_0050;
                }
                b = true;
            }
            return b;
        }
    }
    // monitorexit(this)
    
    public final void e() {
        synchronized (this) {
            this.c = 0;
        }
    }
    
    public void f(final int n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0053: {
            try {
                if (d(n)) {
                    this.e();
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0053;
            }
            ++this.c;
            this.b = this.a.a() + this.a(n);
            return;
        }
    }
    // monitorexit(this)
}
