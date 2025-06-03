// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a1;

import g0.a;
import d0.A;
import F0.u;
import F0.s;
import g0.z;

public final class f
{
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j;
    public final z k;
    
    public f() {
        this.j = new int[255];
        this.k = new z(255);
    }
    
    public boolean a(final s s, final boolean b) {
        this.b();
        this.k.P(27);
        final byte[] e = this.k.e();
        int i = 0;
        if (!u.b(s, e, 0, 27, b)) {
            return false;
        }
        if (this.k.I() != 1332176723L) {
            return false;
        }
        if ((this.a = this.k.G()) != 0) {
            if (b) {
                return false;
            }
            throw A.d("unsupported bit stream revision");
        }
        else {
            this.b = this.k.G();
            this.c = this.k.u();
            this.d = this.k.w();
            this.e = this.k.w();
            this.f = this.k.w();
            final int g = this.k.G();
            this.g = g;
            this.h = g + 27;
            this.k.P(g);
            if (!u.b(s, this.k.e(), 0, this.g, b)) {
                return false;
            }
            while (i < this.g) {
                this.j[i] = this.k.G();
                this.i += this.j[i];
                ++i;
            }
            return true;
        }
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
    
    public boolean c(final s s) {
        return this.d(s, -1L);
    }
    
    public boolean d(final s s, final long n) {
        g0.a.a(s.p() == s.m());
        this.k.P(4);
        long n2;
        while (true) {
            n2 = lcmp(n, -1L);
            if ((n2 != 0 && s.p() + 4L >= n) || !u.b(s, this.k.e(), 0, 4, true)) {
                break;
            }
            this.k.T(0);
            if (this.k.I() == 1332176723L) {
                s.h();
                return true;
            }
            s.i(1);
        }
        while ((n2 == 0 || s.p() < n) && s.b(1) != -1) {}
        return false;
    }
}
