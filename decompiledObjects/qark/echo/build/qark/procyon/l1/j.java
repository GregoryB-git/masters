// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.d;
import java.util.ArrayList;
import g0.z;
import android.util.SparseArray;
import X2.v;
import java.util.List;

public final class j implements c
{
    public final int a;
    public final List b;
    
    public j(final int n) {
        this(n, v.Y());
    }
    
    public j(final int a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public SparseArray a() {
        return new SparseArray();
    }
    
    @Override
    public K b(final int n, final b b) {
        if (n != 2) {
            if (n == 3 || n == 4) {
                return new y(new t(b.b, b.a()));
            }
            if (n == 21) {
                return new y(new r());
            }
            if (n != 27) {
                if (n == 36) {
                    return new y(new q(this.c(b)));
                }
                if (n == 45) {
                    return new y(new u());
                }
                if (n == 89) {
                    return new y(new l(b.d));
                }
                if (n == 172) {
                    return new y(new f(b.b, b.a()));
                }
                if (n != 257) {
                    Label_0333: {
                        if (n != 138) {
                            if (n == 139) {
                                return new y(new k(b.b, b.a(), 5408));
                            }
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    return null;
                                                }
                                                case 134: {
                                                    if (this.f(16)) {
                                                        return null;
                                                    }
                                                    return new E(new x("application/x-scte35"));
                                                }
                                                case 135: {
                                                    return new y(new l1.c(b.b, b.a()));
                                                }
                                                case 136: {
                                                    break Label_0333;
                                                }
                                            }
                                            break;
                                        }
                                        case 130: {
                                            if (!this.f(64)) {
                                                return null;
                                            }
                                            break Label_0333;
                                        }
                                        case 129: {
                                            return new y(new l1.c(b.b, b.a()));
                                        }
                                        case 128: {
                                            return new y(new n(this.d(b)));
                                        }
                                    }
                                    break;
                                }
                                case 17: {
                                    if (this.f(2)) {
                                        return null;
                                    }
                                    return new y(new s(b.b, b.a()));
                                }
                                case 16: {
                                    return new y(new o(this.d(b)));
                                }
                                case 15: {
                                    if (this.f(2)) {
                                        return null;
                                    }
                                    return new y(new i(false, b.b, b.a()));
                                }
                            }
                        }
                    }
                    return new y(new k(b.b, b.a(), 4096));
                }
                return new E(new x("application/vnd.dvb.ait"));
            }
            else {
                if (this.f(4)) {
                    return null;
                }
                return new y(new p(this.c(b), this.f(1), this.f(8)));
            }
        }
        return new y(new n(this.d(b)));
    }
    
    public final F c(final b b) {
        return new F(this.e(b));
    }
    
    public final M d(final b b) {
        return new M(this.e(b));
    }
    
    public final List e(final b b) {
        if (this.f(32)) {
            return this.b;
        }
        final z z = new z(b.e);
        List<d0.q> b2 = (List<d0.q>)this.b;
        while (z.a() > 0) {
            final int g = z.G();
            final int g2 = z.G();
            final int f = z.f();
            if (g == 134) {
                final ArrayList<d0.q> list = new ArrayList<d0.q>();
                final int g3 = z.G();
                int n = 0;
                while (true) {
                    b2 = list;
                    if (n >= (g3 & 0x1F)) {
                        break;
                    }
                    final String d = z.D(3);
                    final int g4 = z.G();
                    boolean b3 = true;
                    final boolean b4 = (g4 & 0x80) != 0x0;
                    int n2;
                    String s;
                    if (b4) {
                        n2 = (g4 & 0x3F);
                        s = "application/cea-708";
                    }
                    else {
                        s = "application/cea-608";
                        n2 = 1;
                    }
                    final byte b5 = (byte)z.G();
                    z.U(1);
                    List b6;
                    if (b4) {
                        if ((b5 & 0x40) == 0x0) {
                            b3 = false;
                        }
                        b6 = g0.d.b(b3);
                    }
                    else {
                        b6 = null;
                    }
                    list.add(new d0.q.b().o0(s).e0(d).L(n2).b0(b6).K());
                    ++n;
                }
            }
            z.T(f + g2);
        }
        return b2;
    }
    
    public final boolean f(final int n) {
        return (n & this.a) != 0x0;
    }
}
