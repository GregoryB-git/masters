// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f1;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Arrays;
import g0.M;
import java.util.List;
import c1.e;
import java.util.ArrayList;
import g0.g;
import c1.s;
import c1.k;
import java.util.zip.Inflater;
import g0.z;
import c1.t;

public final class a implements t
{
    public final z a;
    public final z b;
    public final a c;
    public Inflater d;
    
    public a() {
        this.a = new z();
        this.b = new z();
        this.c = new a();
    }
    
    public static a f(final z z, final a a) {
        final int g = z.g();
        final int g2 = z.G();
        final int m = z.M();
        final int n = z.f() + m;
        final a a2 = null;
        if (n > g) {
            z.T(g);
            return null;
        }
        a a3 = null;
        if (g2 != 128) {
            switch (g2) {
                default: {
                    a3 = a2;
                    break;
                }
                case 22: {
                    a.f(z, m);
                    a3 = a2;
                    break;
                }
                case 21: {
                    a.e(z, m);
                    a3 = a2;
                    break;
                }
                case 20: {
                    a.g(z, m);
                    a3 = a2;
                    break;
                }
            }
        }
        else {
            final a d = a.d();
            a.h();
            a3 = d;
        }
        z.T(n);
        return a3;
    }
    
    @Override
    public void c(final byte[] array, final int n, final int n2, final b b, final g g) {
        this.a.R(array, n2 + n);
        this.a.T(n);
        this.e(this.a);
        this.c.h();
        final ArrayList<a> list = new ArrayList<a>();
        while (this.a.a() >= 3) {
            final a f = f(this.a, this.c);
            if (f != null) {
                list.add(f);
            }
        }
        g.accept(new e(list, -9223372036854775807L, -9223372036854775807L));
    }
    
    @Override
    public int d() {
        return 2;
    }
    
    public final void e(final z z) {
        if (z.a() > 0 && z.j() == 120) {
            if (this.d == null) {
                this.d = new Inflater();
            }
            if (M.v0(z, this.b, this.d)) {
                z.R(this.b.e(), this.b.g());
            }
        }
    }
    
    public static final class a
    {
        public final z a;
        public final int[] b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        
        public a() {
            this.a = new z();
            this.b = new int[256];
        }
        
        public f0.a d() {
            if (this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0 && this.a.g() != 0 && this.a.f() == this.a.g() && this.c) {
                this.a.T(0);
                final int n = this.h * this.i;
                final int[] a = new int[n];
                int i = 0;
                while (i < n) {
                    final int g = this.a.G();
                    if (g != 0) {
                        final int n2 = i + 1;
                        a[i] = this.b[g];
                        i = n2;
                    }
                    else {
                        final int g2 = this.a.G();
                        if (g2 == 0) {
                            continue;
                        }
                        int n3;
                        if ((g2 & 0x40) == 0x0) {
                            n3 = (g2 & 0x3F);
                        }
                        else {
                            n3 = ((g2 & 0x3F) << 8 | this.a.G());
                        }
                        int val;
                        if ((g2 & 0x80) == 0x0) {
                            val = this.b[0];
                        }
                        else {
                            val = this.b[this.a.G()];
                        }
                        final int toIndex = n3 + i;
                        Arrays.fill(a, i, toIndex, val);
                        i = toIndex;
                    }
                }
                return new f0.a.b().f(Bitmap.createBitmap(a, this.h, this.i, Bitmap$Config.ARGB_8888)).k(this.f / (float)this.d).l(0).h(this.g / (float)this.e, 0).i(0).n(this.h / (float)this.d).g(this.i / (float)this.e).a();
            }
            return null;
        }
        
        public final void e(final z z, int f) {
            if (f < 4) {
                return;
            }
            z.U(3);
            final boolean b = (z.G() & 0x80) != 0x0;
            int a;
            final int n = a = f - 4;
            if (b) {
                if (n < 7) {
                    return;
                }
                final int j = z.J();
                if (j < 4) {
                    return;
                }
                this.h = z.M();
                this.i = z.M();
                this.a.P(j - 4);
                a = f - 11;
            }
            f = this.a.f();
            final int g = this.a.g();
            if (f < g && a > 0) {
                final int min = Math.min(a, g - f);
                z.l(this.a.e(), f, min);
                this.a.T(f + min);
            }
        }
        
        public final void f(final z z, final int n) {
            if (n < 19) {
                return;
            }
            this.d = z.M();
            this.e = z.M();
            z.U(11);
            this.f = z.M();
            this.g = z.M();
        }
        
        public final void g(final z z, int i) {
            if (i % 5 != 2) {
                return;
            }
            z.U(2);
            Arrays.fill(this.b, 0);
            int n;
            int g;
            int g2;
            int g3;
            int g4;
            int g5;
            double n2;
            double n3;
            int n4;
            double n5;
            for (n = i / 5, i = 0; i < n; ++i) {
                g = z.G();
                g2 = z.G();
                g3 = z.G();
                g4 = z.G();
                g5 = z.G();
                n2 = g2;
                n3 = g3 - 128;
                n4 = (int)(1.402 * n3 + n2);
                n5 = g4 - 128;
                this.b[g] = (M.p((int)(n2 - 0.34414 * n5 - n3 * 0.71414), 0, 255) << 8 | (g5 << 24 | M.p(n4, 0, 255) << 16) | M.p((int)(n2 + n5 * 1.772), 0, 255));
            }
            this.c = true;
        }
        
        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.P(0);
            this.c = false;
        }
    }
}
