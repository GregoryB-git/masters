/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package L0;

import F0.T;
import L0.e;
import d0.q;
import g0.z;
import h0.d;
import java.util.List;

public final class f
extends e {
    public final z b = new z(d.a);
    public final z c = new z(4);
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public f(T t8) {
        super(t8);
    }

    @Override
    public boolean b(z z8) {
        int n8 = z8.G();
        int n9 = n8 >> 4 & 15;
        if ((n8 &= 15) == 7) {
            this.g = n9;
            if (n9 != 5) {
                return true;
            }
            return false;
        }
        z8 = new StringBuilder();
        z8.append("Video format not supported: ");
        z8.append(n8);
        throw new e.a(z8.toString());
    }

    @Override
    public boolean c(z object, long l8) {
        int n8 = object.G();
        long l9 = object.q();
        if (n8 == 0 && !this.e) {
            z z8 = new z(new byte[object.a()]);
            object.l(z8.e(), 0, object.a());
            object = F0.d.b(z8);
            this.d = object.b;
            object = new q.b().o0("video/avc").O(object.l).v0(object.c).Y(object.d).k0(object.k).b0(object.a).K();
            this.a.d((q)object);
            this.e = true;
            return false;
        }
        if (n8 == 1 && this.e) {
            n8 = this.g == 1 ? 1 : 0;
            if (!this.f && n8 == 0) {
                return false;
            }
            byte[] arrby = this.c.e();
            arrby[0] = 0;
            arrby[1] = 0;
            arrby[2] = 0;
            int n9 = this.d;
            int n10 = 0;
            while (object.a() > 0) {
                object.l(this.c.e(), 4 - n9, this.d);
                this.c.T(0);
                int n11 = this.c.K();
                this.b.T(0);
                this.a.e(this.b, 4);
                this.a.e((z)object, n11);
                n10 = n10 + 4 + n11;
            }
            this.a.b(l8 + l9 * 1000L, n8, n10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}

