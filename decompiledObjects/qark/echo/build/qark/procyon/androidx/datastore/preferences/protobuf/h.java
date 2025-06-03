// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.io.InputStream;

public abstract class h
{
    public int a;
    public int b;
    public int c;
    public i d;
    public boolean e;
    
    public h() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
    
    public static int b(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long c(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public static h f(final InputStream inputStream) {
        return g(inputStream, 4096);
    }
    
    public static h g(final InputStream inputStream, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return h(y.c);
        }
        return new c(inputStream, n, null);
    }
    
    public static h h(final byte[] array) {
        return i(array, 0, array.length);
    }
    
    public static h i(final byte[] array, final int n, final int n2) {
        return j(array, n, n2, false);
    }
    
    public static h j(final byte[] array, final int n, final int n2, final boolean b) {
        final b b2 = new b(array, n, n2, b, null);
        try {
            b2.l(n2);
            return b2;
        }
        catch (z cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public abstract String A();
    
    public abstract int B();
    
    public abstract int C();
    
    public abstract long D();
    
    public abstract boolean E(final int p0);
    
    public abstract void a(final int p0);
    
    public abstract int d();
    
    public abstract boolean e();
    
    public abstract void k(final int p0);
    
    public abstract int l(final int p0);
    
    public abstract boolean m();
    
    public abstract g n();
    
    public abstract double o();
    
    public abstract int p();
    
    public abstract int q();
    
    public abstract long r();
    
    public abstract float s();
    
    public abstract int t();
    
    public abstract long u();
    
    public abstract int v();
    
    public abstract long w();
    
    public abstract int x();
    
    public abstract long y();
    
    public abstract String z();
    
    public static final class b extends h
    {
        public final byte[] f;
        public final boolean g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public boolean m;
        public int n;
        
        public b(final byte[] f, final int n, final int n2, final boolean g) {
            super(null);
            this.n = Integer.MAX_VALUE;
            this.f = f;
            this.h = n2 + n;
            this.j = n;
            this.k = n;
            this.g = g;
        }
        
        @Override
        public String A() {
            final int j = this.J();
            if (j > 0) {
                final int h = this.h;
                final int i = this.j;
                if (j <= h - i) {
                    final String e = q0.e(this.f, i, j);
                    this.j += j;
                    return e;
                }
            }
            if (j == 0) {
                return "";
            }
            if (j <= 0) {
                throw z.f();
            }
            throw z.k();
        }
        
        @Override
        public int B() {
            if (this.e()) {
                return this.l = 0;
            }
            final int j = this.J();
            this.l = j;
            if (r0.a(j) != 0) {
                return this.l;
            }
            throw z.b();
        }
        
        @Override
        public int C() {
            return this.J();
        }
        
        @Override
        public long D() {
            return this.K();
        }
        
        @Override
        public boolean E(final int n) {
            final int b = r0.b(n);
            if (b == 0) {
                this.P();
                return true;
            }
            if (b == 1) {
                this.O(8);
                return true;
            }
            if (b == 2) {
                this.O(this.J());
                return true;
            }
            if (b == 3) {
                this.N();
                this.a(r0.c(r0.a(n), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                this.O(4);
                return true;
            }
            throw z.d();
        }
        
        public byte F() {
            final int j = this.j;
            if (j != this.h) {
                final byte[] f = this.f;
                this.j = j + 1;
                return f[j];
            }
            throw z.k();
        }
        
        public byte[] G(int n) {
            if (n > 0) {
                final int h = this.h;
                final int j = this.j;
                if (n <= h - j) {
                    n += j;
                    this.j = n;
                    return Arrays.copyOfRange(this.f, j, n);
                }
            }
            if (n > 0) {
                throw z.k();
            }
            if (n == 0) {
                return y.c;
            }
            throw z.f();
        }
        
        public int H() {
            final int j = this.j;
            if (this.h - j >= 4) {
                final byte[] f = this.f;
                this.j = j + 4;
                return (f[j + 3] & 0xFF) << 24 | ((f[j] & 0xFF) | (f[j + 1] & 0xFF) << 8 | (f[j + 2] & 0xFF) << 16);
            }
            throw z.k();
        }
        
        public long I() {
            final int j = this.j;
            if (this.h - j >= 8) {
                final byte[] f = this.f;
                this.j = j + 8;
                return ((long)f[j + 7] & 0xFFL) << 56 | (((long)f[j] & 0xFFL) | ((long)f[j + 1] & 0xFFL) << 8 | ((long)f[j + 2] & 0xFFL) << 16 | ((long)f[j + 3] & 0xFFL) << 24 | ((long)f[j + 4] & 0xFFL) << 32 | ((long)f[j + 5] & 0xFFL) << 40 | ((long)f[j + 6] & 0xFFL) << 48);
            }
            throw z.k();
        }
        
        public int J() {
            final int j = this.j;
            final int h = this.h;
            if (h != j) {
                final byte[] f = this.f;
                final int i = j + 1;
                final byte b = f[j];
                if (b >= 0) {
                    this.j = i;
                    return b;
                }
                if (h - i >= 9) {
                    int k = j + 2;
                    final int n = f[i] << 7 ^ b;
                    int n2 = 0;
                    Label_0284: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            int n3 = j + 3;
                            final int n4 = f[k] << 14 ^ n;
                            int n8 = 0;
                            Label_0111: {
                                if (n4 < 0) {
                                    final int n5 = j + 4;
                                    final int n6 = n4 ^ f[n3] << 21;
                                    int n9 = 0;
                                    Label_0148: {
                                        if (n6 >= 0) {
                                            final int n7 = j + 5;
                                            final byte b2 = f[n5];
                                            n8 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                                            n3 = n7;
                                            Label_0278: {
                                                if (b2 < 0) {
                                                    n9 = j + 6;
                                                    if (f[n7] < 0) {
                                                        final int n10 = n3 = j + 7;
                                                        if (f[n9] >= 0) {
                                                            break Label_0278;
                                                        }
                                                        final int n11 = n9 = j + 8;
                                                        if (f[n10] < 0) {
                                                            final int n12 = n3 = j + 9;
                                                            if (f[n11] >= 0) {
                                                                break Label_0278;
                                                            }
                                                            if (f[n12] < 0) {
                                                                return (int)this.L();
                                                            }
                                                            final int n13 = j + 10;
                                                            n2 = n8;
                                                            k = n13;
                                                            break Label_0284;
                                                        }
                                                    }
                                                    break Label_0148;
                                                }
                                            }
                                            break Label_0111;
                                        }
                                        final int n14 = 0xFFE03F80 ^ n6;
                                        n9 = n5;
                                        n8 = n14;
                                    }
                                    final int n15 = n9;
                                    n2 = n8;
                                    k = n15;
                                    break Label_0284;
                                }
                                n8 = (n4 ^ 0x3F80);
                            }
                            final int n16 = n3;
                            n2 = n8;
                            k = n16;
                        }
                    }
                    this.j = k;
                    return n2;
                }
            }
            return (int)this.L();
        }
        
        public long K() {
            final int j = this.j;
            final int h = this.h;
            if (h != j) {
                final byte[] f = this.f;
                final int i = j + 1;
                final byte b = f[j];
                if (b >= 0) {
                    this.j = i;
                    return b;
                }
                if (h - i >= 9) {
                    int k = j + 2;
                    final int n = f[i] << 7 ^ b;
                    long n2 = 0L;
                    Label_0359: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            final int n3 = j + 3;
                            final int n4 = f[k] << 14 ^ n;
                            if (n4 >= 0) {
                                n2 = (n4 ^ 0x3F80);
                                k = n3;
                            }
                            else {
                                k = j + 4;
                                final int n5 = n4 ^ f[n3] << 21;
                                if (n5 < 0) {
                                    n2 = (0xFFE03F80 ^ n5);
                                }
                                else {
                                    final long n6 = n5;
                                    final int n7 = j + 5;
                                    long n8 = n6 ^ (long)f[k] << 28;
                                    long n12 = 0L;
                                    Label_0190: {
                                        if (n8 < 0L) {
                                            k = j + 6;
                                            long n9 = n8 ^ (long)f[n7] << 35;
                                            long n10;
                                            if (n9 < 0L) {
                                                n10 = -34093383808L;
                                            }
                                            else {
                                                final int n11 = j + 7;
                                                n8 = (n9 ^ (long)f[k] << 42);
                                                if (n8 >= 0L) {
                                                    n12 = 4363953127296L;
                                                    k = n11;
                                                    break Label_0190;
                                                }
                                                k = j + 8;
                                                n9 = (n8 ^ (long)f[n11] << 49);
                                                if (n9 < 0L) {
                                                    n10 = -558586000294016L;
                                                }
                                                else {
                                                    final int n13 = j + 9;
                                                    n2 = (n9 ^ (long)f[k] << 56 ^ 0xFE03F80FE03F80L);
                                                    k = n13;
                                                    if (n2 >= 0L) {
                                                        break Label_0359;
                                                    }
                                                    if (f[n13] < 0L) {
                                                        return this.L();
                                                    }
                                                    k = j + 10;
                                                    break Label_0359;
                                                }
                                            }
                                            n2 = (n9 ^ n10);
                                            break Label_0359;
                                        }
                                        n12 = 266354560L;
                                        k = n7;
                                    }
                                    n2 = (n8 ^ n12);
                                }
                            }
                        }
                    }
                    this.j = k;
                    return n2;
                }
            }
            return this.L();
        }
        
        public long L() {
            long n = 0L;
            for (int i = 0; i < 64; i += 7) {
                final byte f = this.F();
                n |= (long)(f & 0x7F) << i;
                if ((f & 0x80) == 0x0) {
                    return n;
                }
            }
            throw z.e();
        }
        
        public final void M() {
            final int h = this.h + this.i;
            this.h = h;
            final int n = h - this.k;
            final int n2 = this.n;
            if (n > n2) {
                final int i = n - n2;
                this.i = i;
                this.h = h - i;
                return;
            }
            this.i = 0;
        }
        
        public void N() {
            int b;
            do {
                b = this.B();
            } while (b != 0 && this.E(b));
        }
        
        public void O(final int n) {
            if (n >= 0) {
                final int h = this.h;
                final int j = this.j;
                if (n <= h - j) {
                    this.j = j + n;
                    return;
                }
            }
            if (n < 0) {
                throw z.f();
            }
            throw z.k();
        }
        
        public final void P() {
            if (this.h - this.j >= 10) {
                this.Q();
                return;
            }
            this.R();
        }
        
        public final void Q() {
            for (int i = 0; i < 10; ++i) {
                if (this.f[this.j++] >= 0) {
                    return;
                }
            }
            throw z.e();
        }
        
        public final void R() {
            for (int i = 0; i < 10; ++i) {
                if (this.F() >= 0) {
                    return;
                }
            }
            throw z.e();
        }
        
        @Override
        public void a(final int n) {
            if (this.l == n) {
                return;
            }
            throw z.a();
        }
        
        @Override
        public int d() {
            return this.j - this.k;
        }
        
        @Override
        public boolean e() {
            return this.j == this.h;
        }
        
        @Override
        public void k(final int n) {
            this.n = n;
            this.M();
        }
        
        @Override
        public int l(int n) {
            if (n < 0) {
                throw z.f();
            }
            n += this.d();
            final int n2 = this.n;
            if (n <= n2) {
                this.n = n;
                this.M();
                return n2;
            }
            throw z.k();
        }
        
        @Override
        public boolean m() {
            return this.K() != 0L;
        }
        
        @Override
        public g n() {
            final int j = this.J();
            if (j > 0) {
                final int h = this.h;
                final int i = this.j;
                if (j <= h - i) {
                    g g;
                    if (this.g && this.m) {
                        g = androidx.datastore.preferences.protobuf.g.c0(this.f, i, j);
                    }
                    else {
                        g = androidx.datastore.preferences.protobuf.g.k(this.f, i, j);
                    }
                    this.j += j;
                    return g;
                }
            }
            if (j == 0) {
                return androidx.datastore.preferences.protobuf.g.p;
            }
            return androidx.datastore.preferences.protobuf.g.b0(this.G(j));
        }
        
        @Override
        public double o() {
            return Double.longBitsToDouble(this.I());
        }
        
        @Override
        public int p() {
            return this.J();
        }
        
        @Override
        public int q() {
            return this.H();
        }
        
        @Override
        public long r() {
            return this.I();
        }
        
        @Override
        public float s() {
            return Float.intBitsToFloat(this.H());
        }
        
        @Override
        public int t() {
            return this.J();
        }
        
        @Override
        public long u() {
            return this.K();
        }
        
        @Override
        public int v() {
            return this.H();
        }
        
        @Override
        public long w() {
            return this.I();
        }
        
        @Override
        public int x() {
            return androidx.datastore.preferences.protobuf.h.b(this.J());
        }
        
        @Override
        public long y() {
            return androidx.datastore.preferences.protobuf.h.c(this.K());
        }
        
        @Override
        public String z() {
            final int j = this.J();
            if (j > 0) {
                final int h = this.h;
                final int i = this.j;
                if (j <= h - i) {
                    final String s = new String(this.f, i, j, y.a);
                    this.j += j;
                    return s;
                }
            }
            if (j == 0) {
                return "";
            }
            if (j < 0) {
                throw z.f();
            }
            throw z.k();
        }
    }
    
    public static final class c extends h
    {
        public final InputStream f;
        public final byte[] g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        
        public c(final InputStream f, final int n) {
            super(null);
            this.m = Integer.MAX_VALUE;
            y.b(f, "input");
            this.f = f;
            this.g = new byte[n];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
        
        private void P() {
            final int h = this.h + this.i;
            this.h = h;
            final int n = this.l + h;
            final int m = this.m;
            if (n > m) {
                final int i = n - m;
                this.i = i;
                this.h = h - i;
                return;
            }
            this.i = 0;
        }
        
        private void U() {
            if (this.h - this.j >= 10) {
                this.V();
                return;
            }
            this.W();
        }
        
        private void V() {
            for (int i = 0; i < 10; ++i) {
                if (this.g[this.j++] >= 0) {
                    return;
                }
            }
            throw z.e();
        }
        
        private void W() {
            for (int i = 0; i < 10; ++i) {
                if (this.G() >= 0) {
                    return;
                }
            }
            throw z.e();
        }
        
        @Override
        public String A() {
            final int m = this.M();
            int j = this.j;
            final int h = this.h;
            byte[] array;
            if (m <= h - j && m > 0) {
                array = this.g;
                this.j = j + m;
            }
            else {
                if (m == 0) {
                    return "";
                }
                j = 0;
                if (m <= h) {
                    this.Q(m);
                    array = this.g;
                    this.j = m;
                }
                else {
                    array = this.H(m, false);
                }
            }
            return q0.e(array, j, m);
        }
        
        @Override
        public int B() {
            if (this.e()) {
                return this.k = 0;
            }
            final int m = this.M();
            this.k = m;
            if (r0.a(m) != 0) {
                return this.k;
            }
            throw z.b();
        }
        
        @Override
        public int C() {
            return this.M();
        }
        
        @Override
        public long D() {
            return this.N();
        }
        
        @Override
        public boolean E(final int n) {
            final int b = r0.b(n);
            if (b == 0) {
                this.U();
                return true;
            }
            if (b == 1) {
                this.S(8);
                return true;
            }
            if (b == 2) {
                this.S(this.M());
                return true;
            }
            if (b == 3) {
                this.R();
                this.a(r0.c(r0.a(n), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                this.S(4);
                return true;
            }
            throw z.d();
        }
        
        public final g F(int n) {
            final byte[] i = this.I(n);
            if (i != null) {
                return androidx.datastore.preferences.protobuf.g.i(i);
            }
            final int j = this.j;
            final int h = this.h;
            final int n2 = h - j;
            this.l += h;
            this.j = 0;
            this.h = 0;
            final List k = this.J(n - n2);
            final byte[] array = new byte[n];
            System.arraycopy(this.g, j, array, 0, n2);
            final Iterator<byte[]> iterator = k.iterator();
            n = n2;
            while (iterator.hasNext()) {
                final byte[] array2 = iterator.next();
                System.arraycopy(array2, 0, array, n, array2.length);
                n += array2.length;
            }
            return androidx.datastore.preferences.protobuf.g.b0(array);
        }
        
        public byte G() {
            if (this.j == this.h) {
                this.Q(1);
            }
            return this.g[this.j++];
        }
        
        public final byte[] H(int n, final boolean b) {
            final byte[] i = this.I(n);
            if (i != null) {
                byte[] array = i;
                if (b) {
                    array = i.clone();
                }
                return array;
            }
            final int j = this.j;
            final int h = this.h;
            final int n2 = h - j;
            this.l += h;
            this.j = 0;
            this.h = 0;
            final List k = this.J(n - n2);
            final byte[] array2 = new byte[n];
            System.arraycopy(this.g, j, array2, 0, n2);
            final Iterator<byte[]> iterator = k.iterator();
            n = n2;
            while (iterator.hasNext()) {
                final byte[] array3 = iterator.next();
                System.arraycopy(array3, 0, array2, n, array3.length);
                n += array3.length;
            }
            return array2;
        }
        
        public final byte[] I(final int n) {
            if (n == 0) {
                return y.c;
            }
            if (n < 0) {
                throw z.f();
            }
            final int l = this.l;
            final int j = this.j;
            final int n2 = l + j + n;
            if (n2 - super.c > 0) {
                throw z.j();
            }
            final int m = this.m;
            if (n2 > m) {
                this.S(m - l - j);
                throw z.k();
            }
            int i = this.h - j;
            final int n3 = n - i;
            if (n3 >= 4096 && n3 > this.f.available()) {
                return null;
            }
            final byte[] b = new byte[n];
            System.arraycopy(this.g, this.j, b, 0, i);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (i < n) {
                final int read = this.f.read(b, i, n - i);
                if (read == -1) {
                    throw z.k();
                }
                this.l += read;
                i += read;
            }
            return b;
        }
        
        public final List J(int i) {
            final ArrayList<byte[]> list = new ArrayList<byte[]>();
            while (i > 0) {
                final int min = Math.min(i, 4096);
                final byte[] b = new byte[min];
                int read;
                for (int j = 0; j < min; j += read) {
                    read = this.f.read(b, j, min - j);
                    if (read == -1) {
                        throw z.k();
                    }
                    this.l += read;
                }
                i -= min;
                list.add(b);
            }
            return list;
        }
        
        public int K() {
            int n;
            if (this.h - (n = this.j) < 4) {
                this.Q(4);
                n = this.j;
            }
            final byte[] g = this.g;
            this.j = n + 4;
            return (g[n + 3] & 0xFF) << 24 | ((g[n] & 0xFF) | (g[n + 1] & 0xFF) << 8 | (g[n + 2] & 0xFF) << 16);
        }
        
        public long L() {
            int n;
            if (this.h - (n = this.j) < 8) {
                this.Q(8);
                n = this.j;
            }
            final byte[] g = this.g;
            this.j = n + 8;
            return ((long)g[n + 7] & 0xFFL) << 56 | (((long)g[n] & 0xFFL) | ((long)g[n + 1] & 0xFFL) << 8 | ((long)g[n + 2] & 0xFFL) << 16 | ((long)g[n + 3] & 0xFFL) << 24 | ((long)g[n + 4] & 0xFFL) << 32 | ((long)g[n + 5] & 0xFFL) << 40 | ((long)g[n + 6] & 0xFFL) << 48);
        }
        
        public int M() {
            final int j = this.j;
            final int h = this.h;
            if (h != j) {
                final byte[] g = this.g;
                final int i = j + 1;
                final byte b = g[j];
                if (b >= 0) {
                    this.j = i;
                    return b;
                }
                if (h - i >= 9) {
                    int k = j + 2;
                    final int n = g[i] << 7 ^ b;
                    int n2 = 0;
                    Label_0284: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            int n3 = j + 3;
                            final int n4 = g[k] << 14 ^ n;
                            int n8 = 0;
                            Label_0111: {
                                if (n4 < 0) {
                                    final int n5 = j + 4;
                                    final int n6 = n4 ^ g[n3] << 21;
                                    int n9 = 0;
                                    Label_0148: {
                                        if (n6 >= 0) {
                                            final int n7 = j + 5;
                                            final byte b2 = g[n5];
                                            n8 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                                            n3 = n7;
                                            Label_0278: {
                                                if (b2 < 0) {
                                                    n9 = j + 6;
                                                    if (g[n7] < 0) {
                                                        final int n10 = n3 = j + 7;
                                                        if (g[n9] >= 0) {
                                                            break Label_0278;
                                                        }
                                                        final int n11 = n9 = j + 8;
                                                        if (g[n10] < 0) {
                                                            final int n12 = n3 = j + 9;
                                                            if (g[n11] >= 0) {
                                                                break Label_0278;
                                                            }
                                                            if (g[n12] < 0) {
                                                                return (int)this.O();
                                                            }
                                                            final int n13 = j + 10;
                                                            n2 = n8;
                                                            k = n13;
                                                            break Label_0284;
                                                        }
                                                    }
                                                    break Label_0148;
                                                }
                                            }
                                            break Label_0111;
                                        }
                                        final int n14 = 0xFFE03F80 ^ n6;
                                        n9 = n5;
                                        n8 = n14;
                                    }
                                    final int n15 = n9;
                                    n2 = n8;
                                    k = n15;
                                    break Label_0284;
                                }
                                n8 = (n4 ^ 0x3F80);
                            }
                            final int n16 = n3;
                            n2 = n8;
                            k = n16;
                        }
                    }
                    this.j = k;
                    return n2;
                }
            }
            return (int)this.O();
        }
        
        public long N() {
            final int j = this.j;
            final int h = this.h;
            if (h != j) {
                final byte[] g = this.g;
                final int i = j + 1;
                final byte b = g[j];
                if (b >= 0) {
                    this.j = i;
                    return b;
                }
                if (h - i >= 9) {
                    int k = j + 2;
                    final int n = g[i] << 7 ^ b;
                    long n2 = 0L;
                    Label_0359: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            final int n3 = j + 3;
                            final int n4 = g[k] << 14 ^ n;
                            if (n4 >= 0) {
                                n2 = (n4 ^ 0x3F80);
                                k = n3;
                            }
                            else {
                                k = j + 4;
                                final int n5 = n4 ^ g[n3] << 21;
                                if (n5 < 0) {
                                    n2 = (0xFFE03F80 ^ n5);
                                }
                                else {
                                    final long n6 = n5;
                                    final int n7 = j + 5;
                                    long n8 = n6 ^ (long)g[k] << 28;
                                    long n12 = 0L;
                                    Label_0190: {
                                        if (n8 < 0L) {
                                            k = j + 6;
                                            long n9 = n8 ^ (long)g[n7] << 35;
                                            long n10;
                                            if (n9 < 0L) {
                                                n10 = -34093383808L;
                                            }
                                            else {
                                                final int n11 = j + 7;
                                                n8 = (n9 ^ (long)g[k] << 42);
                                                if (n8 >= 0L) {
                                                    n12 = 4363953127296L;
                                                    k = n11;
                                                    break Label_0190;
                                                }
                                                k = j + 8;
                                                n9 = (n8 ^ (long)g[n11] << 49);
                                                if (n9 < 0L) {
                                                    n10 = -558586000294016L;
                                                }
                                                else {
                                                    final int n13 = j + 9;
                                                    n2 = (n9 ^ (long)g[k] << 56 ^ 0xFE03F80FE03F80L);
                                                    k = n13;
                                                    if (n2 >= 0L) {
                                                        break Label_0359;
                                                    }
                                                    if (g[n13] < 0L) {
                                                        return this.O();
                                                    }
                                                    k = j + 10;
                                                    break Label_0359;
                                                }
                                            }
                                            n2 = (n9 ^ n10);
                                            break Label_0359;
                                        }
                                        n12 = 266354560L;
                                        k = n7;
                                    }
                                    n2 = (n8 ^ n12);
                                }
                            }
                        }
                    }
                    this.j = k;
                    return n2;
                }
            }
            return this.O();
        }
        
        public long O() {
            long n = 0L;
            for (int i = 0; i < 64; i += 7) {
                final byte g = this.G();
                n |= (long)(g & 0x7F) << i;
                if ((g & 0x80) == 0x0) {
                    return n;
                }
            }
            throw z.e();
        }
        
        public final void Q(final int n) {
            if (this.X(n)) {
                return;
            }
            if (n > super.c - this.l - this.j) {
                throw z.j();
            }
            throw z.k();
        }
        
        public void R() {
            int b;
            do {
                b = this.B();
            } while (b != 0 && this.E(b));
        }
        
        public void S(final int n) {
            final int h = this.h;
            final int j = this.j;
            if (n <= h - j && n >= 0) {
                this.j = j + n;
                return;
            }
            this.T(n);
        }
        
        public final void T(final int n) {
            if (n < 0) {
                throw z.f();
            }
            final int l = this.l;
            final int j = this.j;
            final int m = this.m;
            if (l + j + n <= m) {
                this.l = l + j;
                int i = this.h - j;
                this.h = 0;
                this.j = 0;
                while (i < n) {
                    long skip = 0L;
                    Label_0277: {
                        try {
                            final InputStream f = this.f;
                            final long n2 = n - i;
                            skip = f.skip(n2);
                            final long n3 = lcmp(skip, 0L);
                            if (n3 < 0 || skip > n2) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(this.f.getClass());
                                sb.append("#skip returned invalid result: ");
                                sb.append(skip);
                                sb.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb.toString());
                            }
                            if (n3 != 0) {
                                break Label_0277;
                            }
                        }
                        finally {
                            this.l += i;
                            this.P();
                        }
                        break;
                    }
                    i += (int)skip;
                }
                this.l += i;
                this.P();
                if (i < n) {
                    final int h = this.h;
                    int n4 = h - this.j;
                    this.j = h;
                    int k;
                    while (true) {
                        this.Q(1);
                        k = n - n4;
                        final int h2 = this.h;
                        if (k <= h2) {
                            break;
                        }
                        n4 += h2;
                        this.j = h2;
                    }
                    this.j = k;
                }
                return;
            }
            this.S(m - l - j);
            throw z.k();
        }
        
        public final boolean X(final int i) {
            final int j = this.j;
            final int h = this.h;
            if (j + i <= h) {
                final StringBuilder sb = new StringBuilder();
                sb.append("refillBuffer() called when ");
                sb.append(i);
                sb.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb.toString());
            }
            final int c = super.c;
            final int l = this.l;
            if (i > c - l - j) {
                return false;
            }
            if (l + j + i > this.m) {
                return false;
            }
            if (j > 0) {
                if (h > j) {
                    final byte[] g = this.g;
                    System.arraycopy(g, j, g, 0, h - j);
                }
                this.l += j;
                this.h -= j;
                this.j = 0;
            }
            final InputStream f = this.f;
            final byte[] g2 = this.g;
            final int h2 = this.h;
            final int read = f.read(g2, h2, Math.min(g2.length - h2, super.c - this.l - h2));
            if (read == 0 || read < -1 || read > this.g.length) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f.getClass());
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.h += read;
                this.P();
                return this.h >= i || this.X(i);
            }
            return false;
        }
        
        @Override
        public void a(final int n) {
            if (this.k == n) {
                return;
            }
            throw z.a();
        }
        
        @Override
        public int d() {
            return this.l + this.j;
        }
        
        @Override
        public boolean e() {
            return this.j == this.h && !this.X(1);
        }
        
        @Override
        public void k(final int m) {
            this.m = m;
            this.P();
        }
        
        @Override
        public int l(int m) {
            if (m < 0) {
                throw z.f();
            }
            m += this.l + this.j;
            final int i = this.m;
            if (m <= i) {
                this.m = m;
                this.P();
                return i;
            }
            throw z.k();
        }
        
        @Override
        public boolean m() {
            return this.N() != 0L;
        }
        
        @Override
        public g n() {
            final int m = this.M();
            final int h = this.h;
            final int j = this.j;
            if (m <= h - j && m > 0) {
                final g k = androidx.datastore.preferences.protobuf.g.k(this.g, j, m);
                this.j += m;
                return k;
            }
            if (m == 0) {
                return androidx.datastore.preferences.protobuf.g.p;
            }
            return this.F(m);
        }
        
        @Override
        public double o() {
            return Double.longBitsToDouble(this.L());
        }
        
        @Override
        public int p() {
            return this.M();
        }
        
        @Override
        public int q() {
            return this.K();
        }
        
        @Override
        public long r() {
            return this.L();
        }
        
        @Override
        public float s() {
            return Float.intBitsToFloat(this.K());
        }
        
        @Override
        public int t() {
            return this.M();
        }
        
        @Override
        public long u() {
            return this.N();
        }
        
        @Override
        public int v() {
            return this.K();
        }
        
        @Override
        public long w() {
            return this.L();
        }
        
        @Override
        public int x() {
            return androidx.datastore.preferences.protobuf.h.b(this.M());
        }
        
        @Override
        public long y() {
            return androidx.datastore.preferences.protobuf.h.c(this.N());
        }
        
        @Override
        public String z() {
            final int m = this.M();
            if (m > 0) {
                final int h = this.h;
                final int j = this.j;
                if (m <= h - j) {
                    final String s = new String(this.g, j, m, y.a);
                    this.j += m;
                    return s;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= this.h) {
                this.Q(m);
                final String s2 = new String(this.g, this.j, m, y.a);
                this.j += m;
                return s2;
            }
            return new String(this.H(m, false), y.a);
        }
    }
}
