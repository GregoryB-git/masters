// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import c4.d;
import Q3.l;
import s3.e;

public class g extends f
{
    public void I(final A d) {
        super.d = d;
    }
    
    public void J(final A c) {
        super.c = c;
    }
    
    public void K(final e l) {
        synchronized (this) {
            super.l = l;
        }
    }
    
    public void L(final l obj) {
        // monitorenter(this)
        while (true) {
            try {
                this.b();
                final int n = g$a.a[obj.ordinal()];
                d.a i;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown log level: ");
                                    sb.append(obj);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                i = c4.d.a.s;
                            }
                            else {
                                i = c4.d.a.r;
                            }
                        }
                        else {
                            i = c4.d.a.q;
                        }
                    }
                    else {
                        i = c4.d.a.p;
                    }
                }
                else {
                    i = c4.d.a.o;
                }
                super.i = i;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void M(final long k) {
        // monitorenter(this)
        Label_0054: {
            try {
                this.b();
                if (k < 1048576L) {
                    throw new Q3.d("The minimum cache size must be at least 1MB");
                }
                if (k <= 104857600L) {
                    super.k = k;
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0054;
            }
            throw new Q3.d("Firebase Database currently doesn't support a cache size larger than 100MB");
        }
    }
    // monitorexit(this)
    
    public void N(final boolean j) {
        synchronized (this) {
            this.b();
            super.j = j;
        }
    }
    
    public void O(final String f) {
        // monitorenter(this)
        Label_0039: {
            try {
                this.b();
                if (f != null && !f.isEmpty()) {
                    super.f = f;
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0039;
            }
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
    }
    // monitorexit(this)
}
