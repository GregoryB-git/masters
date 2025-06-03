/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package H0;

import H0.a;
import g0.M;
import g0.o;
import g0.z;

public final class d
implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public d(int n8, int n9, int n10, int n11, int n12, int n13) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = n13;
    }

    public static d d(z z8) {
        int n8 = z8.t();
        z8.U(12);
        int n9 = z8.t();
        int n10 = z8.t();
        int n11 = z8.t();
        z8.U(4);
        int n12 = z8.t();
        int n13 = z8.t();
        z8.U(8);
        return new d(n8, n9, n10, n11, n12, n13);
    }

    @Override
    public int a() {
        return 1752331379;
    }

    public long b() {
        return M.W0(this.e, (long)this.c * 1000000L, this.d);
    }

    public int c() {
        int n8 = this.a;
        if (n8 != 1935960438) {
            if (n8 != 1935963489) {
                if (n8 != 1937012852) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Found unsupported streamType fourCC: ");
                    stringBuilder.append(Integer.toHexString((int)this.a));
                    o.h("AviStreamHeaderChunk", stringBuilder.toString());
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }
}

