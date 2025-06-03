// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import h0.d;
import java.util.List;
import java.util.Collections;
import d0.q;
import java.util.Arrays;
import android.util.Pair;
import g0.z;
import F0.T;

public final class n implements m
{
    public static final double[] q;
    public String a;
    public T b;
    public final M c;
    public final z d;
    public final w e;
    public final boolean[] f;
    public final a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    
    static {
        q = new double[] { 23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0 };
    }
    
    public n() {
        this(null);
    }
    
    public n(final M c) {
        this.c = c;
        this.f = new boolean[4];
        this.g = new a(128);
        z d;
        if (c != null) {
            this.e = new w(178, 128);
            d = new z();
        }
        else {
            d = null;
            this.e = null;
        }
        this.d = d;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public static Pair f(final a a, final String s) {
        final byte[] copy = Arrays.copyOf(a.d, a.b);
        final byte b = copy[4];
        final byte b2 = copy[5];
        final byte b3 = copy[6];
        final int n = (b & 0xFF) << 4 | (b2 & 0xFF) >> 4;
        final int n2 = (b2 & 0xF) << 8 | (b3 & 0xFF);
        final int n3 = (copy[7] & 0xF0) >> 4;
        float n4 = 0.0f;
        Label_0165: {
            float n5;
            int n6;
            if (n3 != 2) {
                if (n3 != 3) {
                    if (n3 != 4) {
                        n4 = 1.0f;
                        break Label_0165;
                    }
                    n5 = (float)(n2 * 121);
                    n6 = n * 100;
                }
                else {
                    n5 = (float)(n2 * 16);
                    n6 = n * 9;
                }
            }
            else {
                n5 = (float)(n2 * 4);
                n6 = n * 3;
            }
            n4 = n5 / n6;
        }
        final q k = new q.b().a0(s).o0("video/mpeg2").v0(n).Y(n2).k0(n4).b0(Collections.singletonList(copy)).K();
        final int n7 = (copy[7] & 0xF) - 1;
        if (n7 >= 0) {
            final double[] q = l1.n.q;
            if (n7 < q.length) {
                final double n8 = q[n7];
                final byte b4 = copy[a.c + 9];
                final int n9 = (b4 & 0x60) >> 5;
                final int n10 = b4 & 0x1F;
                double n11 = n8;
                if (n9 != n10) {
                    n11 = n8 * ((n9 + 1.0) / (n10 + 1));
                }
                final long n12 = (long)(1000000.0 / n11);
                return Pair.create((Object)k, (Object)n12);
            }
        }
        final long n12 = 0L;
        return Pair.create((Object)k, (Object)n12);
    }
    
    @Override
    public void a(final z z) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void b() {
        h0.d.a(this.f);
        this.g.c();
        final w e = this.e;
        if (e != null) {
            e.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public void d(final long l, final int n) {
        this.l = l;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        this.a = d.b();
        this.b = t.a(d.c(), 2);
        final M c = this.c;
        if (c != null) {
            c.b(t, d);
        }
    }
    
    public static final class a
    {
        public static final byte[] e;
        public boolean a;
        public int b;
        public int c;
        public byte[] d;
        
        static {
            e = new byte[] { 0, 0, 1 };
        }
        
        public a(final int n) {
            this.d = new byte[n];
        }
        
        public void a(final byte[] array, final int n, int n2) {
            if (!this.a) {
                return;
            }
            n2 -= n;
            final byte[] d = this.d;
            final int length = d.length;
            final int b = this.b;
            if (length < b + n2) {
                this.d = Arrays.copyOf(d, (b + n2) * 2);
            }
            System.arraycopy(array, n, this.d, this.b, n2);
            this.b += n2;
        }
        
        public boolean b(final int n, int n2) {
            if (this.a) {
                n2 = this.b - n2;
                this.b = n2;
                if (this.c != 0 || n != 181) {
                    this.a = false;
                    return true;
                }
                this.c = n2;
            }
            else if (n == 179) {
                this.a = true;
            }
            final byte[] e = l1.n.a.e;
            this.a(e, 0, e.length);
            return false;
        }
        
        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }
}
