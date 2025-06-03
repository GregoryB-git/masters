/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a1;

import F0.s;
import F0.u;
import d0.A;
import g0.a;
import g0.z;

public final class f {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    public final z k = new z(255);

    public boolean a(s s8, boolean bl) {
        this.b();
        this.k.P(27);
        byte[] arrby = this.k.e();
        if (u.b(s8, arrby, 0, 27, bl)) {
            int n8;
            if (this.k.I() != 1332176723L) {
                return false;
            }
            this.a = n8 = this.k.G();
            if (n8 != 0) {
                if (bl) {
                    return false;
                }
                throw A.d("unsupported bit stream revision");
            }
            this.b = this.k.G();
            this.c = this.k.u();
            this.d = this.k.w();
            this.e = this.k.w();
            this.f = this.k.w();
            this.g = n8 = this.k.G();
            this.h = n8 + 27;
            this.k.P(n8);
            if (!u.b(s8, this.k.e(), 0, this.g, bl)) {
                return false;
            }
            for (int i8 = 0; i8 < this.g; ++i8) {
                this.j[i8] = this.k.G();
                this.i += this.j[i8];
            }
            return true;
        }
        return false;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(s s8) {
        return this.d(s8, -1L);
    }

    public boolean d(s s8, long l8) {
        long l9;
        boolean bl = s8.p() == s8.m();
        a.a(bl);
        this.k.P(4);
        while (((l9 = (l8 LCMP -1L)) == false || s8.p() + 4L < l8) && u.b(s8, this.k.e(), 0, 4, true)) {
            this.k.T(0);
            if (this.k.I() == 1332176723L) {
                s8.h();
                return true;
            }
            s8.i(1);
        }
        while ((l9 == false || s8.p() < l8) && s8.b(1) != -1) {
        }
        return false;
    }
}

