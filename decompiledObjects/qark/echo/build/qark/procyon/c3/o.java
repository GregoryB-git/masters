// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import k3.t;
import java.util.Iterator;
import java.security.GeneralSecurityException;
import p3.z;
import p3.I;
import p3.y;
import p3.A;
import p3.C;

public final class o
{
    public final C.b a;
    
    public o(final C.b a) {
        this.a = a;
    }
    
    public static o i() {
        return new o(C.d0());
    }
    
    public static o j(final n n) {
        return new o((C.b)n.h().T());
    }
    
    public o a(final l l) {
        synchronized (this) {
            this.b(l.b(), false);
            return this;
        }
    }
    
    public int b(final A a, final boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                final C.c f = this.f(a);
                this.a.y(f);
                if (b) {
                    this.a.C(f.a0());
                }
                // monitorexit(this)
                return f.a0();
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final C.c c(final y y, final I i) {
        // monitorenter(this)
        Label_0060: {
            try {
                final int g = this.g();
                if (i != I.p) {
                    // monitorexit(this)
                    return (C.c)((com.google.crypto.tink.shaded.protobuf.x.a)C.c.e0().y(y).z(g).B(z.q).A(i)).n();
                }
            }
            finally {
                break Label_0060;
            }
            throw new GeneralSecurityException("unknown output prefix type");
        }
    }
    // monitorexit(this)
    
    public n d() {
        synchronized (this) {
            return n.e((C)((com.google.crypto.tink.shaded.protobuf.x.a)this.a).n());
        }
    }
    
    public final boolean e(final int n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0054: {
            Label_0050: {
                try {
                    final Iterator<C.c> iterator = this.a.B().iterator();
                    Block_4: {
                        while (iterator.hasNext()) {
                            if (iterator.next().a0() == n) {
                                break Block_4;
                            }
                        }
                        break Label_0050;
                    }
                    // monitorexit(this)
                    return true;
                }
                finally {
                    break Label_0054;
                }
            }
            return false;
        }
    }
    // monitorexit(this)
    
    public final C.c f(final A a) {
        synchronized (this) {
            return this.c(x.k(a), a.Z());
        }
    }
    
    public final int g() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0027: {
            int c;
            try {
                do {
                    c = t.c();
                } while (this.e(c));
            }
            finally {
                break Label_0027;
            }
            return c;
        }
    }
    // monitorexit(this)
    
    public o h(final int n) {
        // monitorenter(this)
        int n2 = 0;
        while (true) {
            Label_0128: {
                Label_0095: {
                    Label_0062: {
                        Label_0132: {
                            try {
                                if (n2 >= this.a.A()) {
                                    break Label_0095;
                                }
                                final C.c z = this.a.z(n2);
                                if (z.a0() != n) {
                                    break Label_0132;
                                }
                                if (z.c0().equals(p3.z.q)) {
                                    this.a.C(n);
                                    // monitorexit(this)
                                    return this;
                                }
                            }
                            finally {
                                break Label_0128;
                            }
                            break Label_0062;
                        }
                        ++n2;
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("cannot set key as primary because it's not enabled: ");
                    sb.append(n);
                    throw new GeneralSecurityException(sb.toString());
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("key not found: ");
                sb2.append(n);
                throw new GeneralSecurityException(sb2.toString());
            }
            // monitorexit(this)
            throw;
        }
    }
}
