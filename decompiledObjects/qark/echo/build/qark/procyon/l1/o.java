// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import h0.d;
import g0.a;
import java.util.List;
import java.util.Collections;
import g0.y;
import java.util.Arrays;
import d0.q;
import F0.T;
import g0.z;

public final class o implements m
{
    public static final float[] l;
    public final M a;
    public final z b;
    public final boolean[] c;
    public final a d;
    public final w e;
    public b f;
    public long g;
    public String h;
    public T i;
    public boolean j;
    public long k;
    
    static {
        l = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public o(final M a) {
        this.a = a;
        this.c = new boolean[4];
        this.d = new a(128);
        this.k = -9223372036854775807L;
        z b;
        if (a != null) {
            this.e = new w(178, 128);
            b = new z();
        }
        else {
            b = null;
            this.e = null;
        }
        this.b = b;
    }
    
    public static q f(final a a, int i, final String s) {
        final byte[] copy = Arrays.copyOf(a.e, a.c);
        final y y = new y(copy);
        y.s(i);
        y.s(4);
        y.q();
        y.r(8);
        if (y.g()) {
            y.r(4);
            y.r(3);
        }
        i = y.h(4);
        float n = 1.0f;
        Label_0143: {
            if (i == 15) {
                i = y.h(8);
                final int h = y.h(8);
                if (h != 0) {
                    n = i / (float)h;
                    break Label_0143;
                }
            }
            else {
                final float[] l = o.l;
                if (i < l.length) {
                    n = l[i];
                    break Label_0143;
                }
            }
            g0.o.h("H263Reader", "Invalid aspect ratio");
        }
        if (y.g()) {
            y.r(2);
            y.r(1);
            if (y.g()) {
                y.r(15);
                y.q();
                y.r(15);
                y.q();
                y.r(15);
                y.q();
                y.r(3);
                y.r(11);
                y.q();
                y.r(15);
                y.q();
            }
        }
        if (y.h(2) != 0) {
            g0.o.h("H263Reader", "Unhandled video object layer shape");
        }
        y.q();
        i = y.h(16);
        y.q();
        if (y.g()) {
            if (i == 0) {
                g0.o.h("H263Reader", "Invalid vop_increment_time_resolution");
            }
            else {
                --i;
                int n2 = 0;
                while (i > 0) {
                    ++n2;
                    i >>= 1;
                }
                y.r(n2);
            }
        }
        y.q();
        i = y.h(13);
        y.q();
        final int h2 = y.h(13);
        y.q();
        y.q();
        return new q.b().a0(s).o0("video/mp4v-es").v0(i).Y(h2).k0(n).b0(Collections.singletonList(copy)).K();
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.f);
        g0.a.h(this.i);
        int f = z.f();
        final int g = z.g();
        final byte[] e = z.e();
        this.g += z.a();
        this.i.e(z, z.a());
        while (true) {
            final int c = h0.d.c(e, f, g, this.c);
            if (c == g) {
                break;
            }
            final byte[] e2 = z.e();
            final int n = c + 3;
            final int n2 = e2[n] & 0xFF;
            final int n3 = c - f;
            final boolean j = this.j;
            final boolean b = false;
            if (!j) {
                if (n3 > 0) {
                    this.d.a(e, f, c);
                }
                int n4;
                if (n3 < 0) {
                    n4 = -n3;
                }
                else {
                    n4 = 0;
                }
                if (this.d.b(n2, n4)) {
                    final T i = this.i;
                    final a d = this.d;
                    i.d(f(d, d.d, (String)g0.a.e(this.h)));
                    this.j = true;
                }
            }
            this.f.a(e, f, c);
            final w e3 = this.e;
            if (e3 != null) {
                int n5;
                if (n3 > 0) {
                    e3.a(e, f, c);
                    n5 = (b ? 1 : 0);
                }
                else {
                    n5 = -n3;
                }
                if (this.e.b(n5)) {
                    final w e4 = this.e;
                    ((z)g0.M.i(this.b)).R(this.e.d, h0.d.r(e4.d, e4.e));
                    ((M)g0.M.i(this.a)).a(this.k, this.b);
                }
                if (n2 == 178 && z.e()[c + 2] == 1) {
                    this.e.e(n2);
                }
            }
            final int n6 = g - c;
            this.f.b(this.g - n6, n6, this.j);
            this.f.c(n2, this.k);
            f = n;
        }
        if (!this.j) {
            this.d.a(e, f, g);
        }
        this.f.a(e, f, g);
        final w e5 = this.e;
        if (e5 != null) {
            e5.a(e, f, g);
        }
    }
    
    @Override
    public void b() {
        h0.d.a(this.c);
        this.d.c();
        final b f = this.f;
        if (f != null) {
            f.d();
        }
        final w e = this.e;
        if (e != null) {
            e.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
        g0.a.h(this.f);
        if (b) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }
    
    @Override
    public void d(final long k, final int n) {
        this.k = k;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.h = d.b();
        final T a = t.a(d.c(), 2);
        this.i = a;
        this.f = new b(a);
        final M a2 = this.a;
        if (a2 != null) {
            a2.b(t, d);
        }
    }
    
    public static final class a
    {
        public static final byte[] f;
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;
        
        static {
            f = new byte[] { 0, 0, 1 };
        }
        
        public a(final int n) {
            this.e = new byte[n];
        }
        
        public void a(final byte[] array, final int n, int n2) {
            if (!this.a) {
                return;
            }
            n2 -= n;
            final byte[] e = this.e;
            final int length = e.length;
            final int c = this.c;
            if (length < c + n2) {
                this.e = Arrays.copyOf(e, (c + n2) * 2);
            }
            System.arraycopy(array, n, this.e, this.c, n2);
            this.c += n2;
        }
        
        public boolean b(final int n, int b) {
            final int b2 = this.b;
            Label_0166: {
                if (b2 != 0) {
                    final int n2 = 2;
                    Label_0112: {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                final int n3 = 4;
                                if (b2 != 3) {
                                    if (b2 != 4) {
                                        throw new IllegalStateException();
                                    }
                                    if (n == 179 || n == 181) {
                                        this.c -= b;
                                        this.a = false;
                                        return true;
                                    }
                                    break Label_0166;
                                }
                                else if ((n & 0xF0) == 0x20) {
                                    this.d = this.c;
                                    b = n3;
                                    break Label_0112;
                                }
                            }
                            else if (n <= 31) {
                                this.b = 3;
                                break Label_0166;
                            }
                        }
                        else {
                            b = n2;
                            if (n == 181) {
                                break Label_0112;
                            }
                        }
                        g0.o.h("H263Reader", "Unexpected start code value");
                        this.c();
                        break Label_0166;
                    }
                    this.b = b;
                }
                else if (n == 176) {
                    this.b = 1;
                    this.a = true;
                }
            }
            final byte[] f = o.a.f;
            this.a(f, 0, f.length);
            return false;
        }
        
        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }
    
    public static final class b
    {
        public final T a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;
        
        public b(final T a) {
            this.a = a;
        }
        
        public void a(final byte[] array, final int n, final int n2) {
            if (this.c) {
                final int f = this.f;
                final int n3 = n + 1 - f;
                if (n3 < n2) {
                    this.d = ((array[n3] & 0xC0) >> 6 == 0);
                    this.c = false;
                    return;
                }
                this.f = f + (n2 - n);
            }
        }
        
        public void b(final long n, final int n2, final boolean b) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public void c(final int e, final long h) {
            this.e = e;
            this.d = false;
            final boolean b = true;
            this.b = (e == 182 || e == 179);
            this.c = (e == 182 && b);
            this.f = 0;
            this.h = h;
        }
        
        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }
}
