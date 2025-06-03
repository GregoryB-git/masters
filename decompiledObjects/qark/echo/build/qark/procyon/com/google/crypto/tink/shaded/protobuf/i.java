// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.io.InputStream;

public abstract class i
{
    public static volatile int f = 100;
    public int a;
    public int b;
    public int c;
    public j d;
    public boolean e;
    
    public i() {
        this.b = i.f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
    
    public static int b(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long c(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public static i f(final InputStream inputStream) {
        return g(inputStream, 4096);
    }
    
    public static i g(final InputStream inputStream, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return h(z.d);
        }
        return new c(inputStream, n, null);
    }
    
    public static i h(final byte[] array) {
        return i(array, 0, array.length);
    }
    
    public static i i(final byte[] array, final int n, final int n2) {
        return j(array, n, n2, false);
    }
    
    public static i j(final byte[] array, final int n, final int n2, final boolean b) {
        final b b2 = new b(array, n, n2, b, null);
        try {
            b2.l(n2);
            return b2;
        }
        catch (A cause) {
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
    
    public abstract h n();
    
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
    
    public static final class b extends i
    {
        public final byte[] g;
        public final boolean h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public int o;
        
        public b(final byte[] g, final int n, final int n2, final boolean h) {
            super(null);
            this.o = Integer.MAX_VALUE;
            this.g = g;
            this.i = n2 + n;
            this.k = n;
            this.l = n;
            this.h = h;
        }
        
        @Override
        public String A() {
            final int j = this.J();
            if (j > 0) {
                final int i = this.i;
                final int k = this.k;
                if (j <= i - k) {
                    final String e = p0.e(this.g, k, j);
                    this.k += j;
                    return e;
                }
            }
            if (j == 0) {
                return "";
            }
            if (j <= 0) {
                throw A.g();
            }
            throw A.m();
        }
        
        @Override
        public int B() {
            if (this.e()) {
                return this.m = 0;
            }
            final int j = this.J();
            this.m = j;
            if (q0.a(j) != 0) {
                return this.m;
            }
            throw A.c();
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
            final int b = q0.b(n);
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
                this.a(q0.c(q0.a(n), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                this.O(4);
                return true;
            }
            throw A.e();
        }
        
        public byte F() {
            final int k = this.k;
            if (k != this.i) {
                final byte[] g = this.g;
                this.k = k + 1;
                return g[k];
            }
            throw A.m();
        }
        
        public byte[] G(int n) {
            if (n > 0) {
                final int i = this.i;
                final int k = this.k;
                if (n <= i - k) {
                    n += k;
                    this.k = n;
                    return Arrays.copyOfRange(this.g, k, n);
                }
            }
            if (n > 0) {
                throw A.m();
            }
            if (n == 0) {
                return z.d;
            }
            throw A.g();
        }
        
        public int H() {
            final int k = this.k;
            if (this.i - k >= 4) {
                final byte[] g = this.g;
                this.k = k + 4;
                return (g[k + 3] & 0xFF) << 24 | ((g[k] & 0xFF) | (g[k + 1] & 0xFF) << 8 | (g[k + 2] & 0xFF) << 16);
            }
            throw A.m();
        }
        
        public long I() {
            final int k = this.k;
            if (this.i - k >= 8) {
                final byte[] g = this.g;
                this.k = k + 8;
                return ((long)g[k + 7] & 0xFFL) << 56 | (((long)g[k] & 0xFFL) | ((long)g[k + 1] & 0xFFL) << 8 | ((long)g[k + 2] & 0xFFL) << 16 | ((long)g[k + 3] & 0xFFL) << 24 | ((long)g[k + 4] & 0xFFL) << 32 | ((long)g[k + 5] & 0xFFL) << 40 | ((long)g[k + 6] & 0xFFL) << 48);
            }
            throw A.m();
        }
        
        public int J() {
            final int k = this.k;
            final int i = this.i;
            if (i != k) {
                final byte[] g = this.g;
                final int j = k + 1;
                final byte b = g[k];
                if (b >= 0) {
                    this.k = j;
                    return b;
                }
                if (i - j >= 9) {
                    int l = k + 2;
                    final int n = g[j] << 7 ^ b;
                    int n2 = 0;
                    Label_0284: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            int n3 = k + 3;
                            final int n4 = g[l] << 14 ^ n;
                            int n8 = 0;
                            Label_0111: {
                                if (n4 < 0) {
                                    final int n5 = k + 4;
                                    final int n6 = n4 ^ g[n3] << 21;
                                    int n9 = 0;
                                    Label_0148: {
                                        if (n6 >= 0) {
                                            final int n7 = k + 5;
                                            final byte b2 = g[n5];
                                            n8 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                                            n3 = n7;
                                            Label_0278: {
                                                if (b2 < 0) {
                                                    n9 = k + 6;
                                                    if (g[n7] < 0) {
                                                        final int n10 = n3 = k + 7;
                                                        if (g[n9] >= 0) {
                                                            break Label_0278;
                                                        }
                                                        final int n11 = n9 = k + 8;
                                                        if (g[n10] < 0) {
                                                            final int n12 = n3 = k + 9;
                                                            if (g[n11] >= 0) {
                                                                break Label_0278;
                                                            }
                                                            if (g[n12] < 0) {
                                                                return (int)this.L();
                                                            }
                                                            final int n13 = k + 10;
                                                            n2 = n8;
                                                            l = n13;
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
                                    l = n15;
                                    break Label_0284;
                                }
                                n8 = (n4 ^ 0x3F80);
                            }
                            final int n16 = n3;
                            n2 = n8;
                            l = n16;
                        }
                    }
                    this.k = l;
                    return n2;
                }
            }
            return (int)this.L();
        }
        
        public long K() {
            final int k = this.k;
            final int i = this.i;
            if (i != k) {
                final byte[] g = this.g;
                final int j = k + 1;
                final byte b = g[k];
                if (b >= 0) {
                    this.k = j;
                    return b;
                }
                if (i - j >= 9) {
                    int l = k + 2;
                    final int n = g[j] << 7 ^ b;
                    long n2 = 0L;
                    Label_0359: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            final int n3 = k + 3;
                            final int n4 = g[l] << 14 ^ n;
                            if (n4 >= 0) {
                                n2 = (n4 ^ 0x3F80);
                                l = n3;
                            }
                            else {
                                l = k + 4;
                                final int n5 = n4 ^ g[n3] << 21;
                                if (n5 < 0) {
                                    n2 = (0xFFE03F80 ^ n5);
                                }
                                else {
                                    final long n6 = n5;
                                    final int n7 = k + 5;
                                    long n8 = n6 ^ (long)g[l] << 28;
                                    long n12 = 0L;
                                    Label_0190: {
                                        if (n8 < 0L) {
                                            l = k + 6;
                                            long n9 = n8 ^ (long)g[n7] << 35;
                                            long n10;
                                            if (n9 < 0L) {
                                                n10 = -34093383808L;
                                            }
                                            else {
                                                final int n11 = k + 7;
                                                n8 = (n9 ^ (long)g[l] << 42);
                                                if (n8 >= 0L) {
                                                    n12 = 4363953127296L;
                                                    l = n11;
                                                    break Label_0190;
                                                }
                                                l = k + 8;
                                                n9 = (n8 ^ (long)g[n11] << 49);
                                                if (n9 < 0L) {
                                                    n10 = -558586000294016L;
                                                }
                                                else {
                                                    final int n13 = k + 9;
                                                    n2 = (n9 ^ (long)g[l] << 56 ^ 0xFE03F80FE03F80L);
                                                    l = n13;
                                                    if (n2 >= 0L) {
                                                        break Label_0359;
                                                    }
                                                    if (g[n13] < 0L) {
                                                        return this.L();
                                                    }
                                                    l = k + 10;
                                                    break Label_0359;
                                                }
                                            }
                                            n2 = (n9 ^ n10);
                                            break Label_0359;
                                        }
                                        n12 = 266354560L;
                                        l = n7;
                                    }
                                    n2 = (n8 ^ n12);
                                }
                            }
                        }
                    }
                    this.k = l;
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
            throw A.f();
        }
        
        public final void M() {
            final int i = this.i + this.j;
            this.i = i;
            final int n = i - this.l;
            final int o = this.o;
            if (n > o) {
                final int j = n - o;
                this.j = j;
                this.i = i - j;
                return;
            }
            this.j = 0;
        }
        
        public void N() {
            int b;
            do {
                b = this.B();
            } while (b != 0 && this.E(b));
        }
        
        public void O(final int n) {
            if (n >= 0) {
                final int i = this.i;
                final int k = this.k;
                if (n <= i - k) {
                    this.k = k + n;
                    return;
                }
            }
            if (n < 0) {
                throw A.g();
            }
            throw A.m();
        }
        
        public final void P() {
            if (this.i - this.k >= 10) {
                this.Q();
                return;
            }
            this.R();
        }
        
        public final void Q() {
            for (int i = 0; i < 10; ++i) {
                if (this.g[this.k++] >= 0) {
                    return;
                }
            }
            throw A.f();
        }
        
        public final void R() {
            for (int i = 0; i < 10; ++i) {
                if (this.F() >= 0) {
                    return;
                }
            }
            throw A.f();
        }
        
        @Override
        public void a(final int n) {
            if (this.m == n) {
                return;
            }
            throw A.b();
        }
        
        @Override
        public int d() {
            return this.k - this.l;
        }
        
        @Override
        public boolean e() {
            return this.k == this.i;
        }
        
        @Override
        public void k(final int o) {
            this.o = o;
            this.M();
        }
        
        @Override
        public int l(int o) {
            if (o < 0) {
                throw A.g();
            }
            o += this.d();
            if (o < 0) {
                throw A.h();
            }
            final int o2 = this.o;
            if (o <= o2) {
                this.o = o;
                this.M();
                return o2;
            }
            throw A.m();
        }
        
        @Override
        public boolean m() {
            return this.K() != 0L;
        }
        
        @Override
        public h n() {
            final int j = this.J();
            if (j > 0) {
                final int i = this.i;
                final int k = this.k;
                if (j <= i - k) {
                    h h;
                    if (this.h && this.n) {
                        h = com.google.crypto.tink.shaded.protobuf.h.f0(this.g, k, j);
                    }
                    else {
                        h = com.google.crypto.tink.shaded.protobuf.h.k(this.g, k, j);
                    }
                    this.k += j;
                    return h;
                }
            }
            if (j == 0) {
                return com.google.crypto.tink.shaded.protobuf.h.p;
            }
            return com.google.crypto.tink.shaded.protobuf.h.e0(this.G(j));
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
            return com.google.crypto.tink.shaded.protobuf.i.b(this.J());
        }
        
        @Override
        public long y() {
            return com.google.crypto.tink.shaded.protobuf.i.c(this.K());
        }
        
        @Override
        public String z() {
            final int j = this.J();
            if (j > 0) {
                final int i = this.i;
                final int k = this.k;
                if (j <= i - k) {
                    final String s = new String(this.g, k, j, z.b);
                    this.k += j;
                    return s;
                }
            }
            if (j == 0) {
                return "";
            }
            if (j < 0) {
                throw A.g();
            }
            throw A.m();
        }
    }
    
    public static final class c extends i
    {
        public final InputStream g;
        public final byte[] h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        
        public c(final InputStream g, final int n) {
            super(null);
            this.n = Integer.MAX_VALUE;
            z.b(g, "input");
            this.g = g;
            this.h = new byte[n];
            this.i = 0;
            this.k = 0;
            this.m = 0;
        }
        
        public static int F(final InputStream inputStream) {
            try {
                return inputStream.available();
            }
            catch (A a) {
                a.j();
                throw a;
            }
        }
        
        public static int G(final InputStream inputStream, final byte[] b, int read, final int len) {
            try {
                read = inputStream.read(b, read, len);
                return read;
            }
            catch (A a) {
                a.j();
                throw a;
            }
        }
        
        private void R() {
            final int i = this.i + this.j;
            this.i = i;
            final int n = this.m + i;
            final int n2 = this.n;
            if (n > n2) {
                final int j = n - n2;
                this.j = j;
                this.i = i - j;
                return;
            }
            this.j = 0;
        }
        
        public static long T(final InputStream inputStream, long skip) {
            try {
                skip = inputStream.skip(skip);
                return skip;
            }
            catch (A a) {
                a.j();
                throw a;
            }
        }
        
        private void X() {
            if (this.i - this.k >= 10) {
                this.Y();
                return;
            }
            this.Z();
        }
        
        private void Y() {
            for (int i = 0; i < 10; ++i) {
                if (this.h[this.k++] >= 0) {
                    return;
                }
            }
            throw A.f();
        }
        
        private void Z() {
            for (int i = 0; i < 10; ++i) {
                if (this.I() >= 0) {
                    return;
                }
            }
            throw A.f();
        }
        
        @Override
        public String A() {
            final int o = this.O();
            int k = this.k;
            final int i = this.i;
            byte[] array;
            if (o <= i - k && o > 0) {
                array = this.h;
                this.k = k + o;
            }
            else {
                if (o == 0) {
                    return "";
                }
                k = 0;
                if (o <= i) {
                    this.S(o);
                    array = this.h;
                    this.k = o;
                }
                else {
                    array = this.J(o, false);
                }
            }
            return p0.e(array, k, o);
        }
        
        @Override
        public int B() {
            if (this.e()) {
                return this.l = 0;
            }
            final int o = this.O();
            this.l = o;
            if (q0.a(o) != 0) {
                return this.l;
            }
            throw A.c();
        }
        
        @Override
        public int C() {
            return this.O();
        }
        
        @Override
        public long D() {
            return this.P();
        }
        
        @Override
        public boolean E(final int n) {
            final int b = q0.b(n);
            if (b == 0) {
                this.X();
                return true;
            }
            if (b == 1) {
                this.V(8);
                return true;
            }
            if (b == 2) {
                this.V(this.O());
                return true;
            }
            if (b == 3) {
                this.U();
                this.a(q0.c(q0.a(n), 4));
                return true;
            }
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                this.V(4);
                return true;
            }
            throw A.e();
        }
        
        public final h H(int n) {
            final byte[] k = this.K(n);
            if (k != null) {
                return com.google.crypto.tink.shaded.protobuf.h.i(k);
            }
            final int i = this.k;
            final int j = this.i;
            final int n2 = j - i;
            this.m += j;
            this.k = 0;
            this.i = 0;
            final List l = this.L(n - n2);
            final byte[] array = new byte[n];
            System.arraycopy(this.h, i, array, 0, n2);
            final Iterator<byte[]> iterator = l.iterator();
            n = n2;
            while (iterator.hasNext()) {
                final byte[] array2 = iterator.next();
                System.arraycopy(array2, 0, array, n, array2.length);
                n += array2.length;
            }
            return com.google.crypto.tink.shaded.protobuf.h.e0(array);
        }
        
        public byte I() {
            if (this.k == this.i) {
                this.S(1);
            }
            return this.h[this.k++];
        }
        
        public final byte[] J(int n, final boolean b) {
            final byte[] k = this.K(n);
            if (k != null) {
                byte[] array = k;
                if (b) {
                    array = k.clone();
                }
                return array;
            }
            final int i = this.k;
            final int j = this.i;
            final int n2 = j - i;
            this.m += j;
            this.k = 0;
            this.i = 0;
            final List l = this.L(n - n2);
            final byte[] array2 = new byte[n];
            System.arraycopy(this.h, i, array2, 0, n2);
            final Iterator<byte[]> iterator = l.iterator();
            n = n2;
            while (iterator.hasNext()) {
                final byte[] array3 = iterator.next();
                System.arraycopy(array3, 0, array2, n, array3.length);
                n += array3.length;
            }
            return array2;
        }
        
        public final byte[] K(final int n) {
            if (n == 0) {
                return z.d;
            }
            if (n < 0) {
                throw A.g();
            }
            final int m = this.m;
            final int k = this.k;
            final int n2 = m + k + n;
            if (n2 - super.c > 0) {
                throw A.l();
            }
            final int n3 = this.n;
            if (n2 > n3) {
                this.V(n3 - m - k);
                throw A.m();
            }
            int i = this.i - k;
            final int n4 = n - i;
            if (n4 >= 4096 && n4 > F(this.g)) {
                return null;
            }
            final byte[] array = new byte[n];
            System.arraycopy(this.h, this.k, array, 0, i);
            this.m += this.i;
            this.k = 0;
            this.i = 0;
            while (i < n) {
                final int g = G(this.g, array, i, n - i);
                if (g == -1) {
                    throw A.m();
                }
                this.m += g;
                i += g;
            }
            return array;
        }
        
        public final List L(int i) {
            final ArrayList<byte[]> list = new ArrayList<byte[]>();
            while (i > 0) {
                final int min = Math.min(i, 4096);
                final byte[] b = new byte[min];
                int read;
                for (int j = 0; j < min; j += read) {
                    read = this.g.read(b, j, min - j);
                    if (read == -1) {
                        throw A.m();
                    }
                    this.m += read;
                }
                i -= min;
                list.add(b);
            }
            return list;
        }
        
        public int M() {
            int n;
            if (this.i - (n = this.k) < 4) {
                this.S(4);
                n = this.k;
            }
            final byte[] h = this.h;
            this.k = n + 4;
            return (h[n + 3] & 0xFF) << 24 | ((h[n] & 0xFF) | (h[n + 1] & 0xFF) << 8 | (h[n + 2] & 0xFF) << 16);
        }
        
        public long N() {
            int n;
            if (this.i - (n = this.k) < 8) {
                this.S(8);
                n = this.k;
            }
            final byte[] h = this.h;
            this.k = n + 8;
            return ((long)h[n + 7] & 0xFFL) << 56 | (((long)h[n] & 0xFFL) | ((long)h[n + 1] & 0xFFL) << 8 | ((long)h[n + 2] & 0xFFL) << 16 | ((long)h[n + 3] & 0xFFL) << 24 | ((long)h[n + 4] & 0xFFL) << 32 | ((long)h[n + 5] & 0xFFL) << 40 | ((long)h[n + 6] & 0xFFL) << 48);
        }
        
        public int O() {
            final int k = this.k;
            final int i = this.i;
            if (i != k) {
                final byte[] h = this.h;
                final int j = k + 1;
                final byte b = h[k];
                if (b >= 0) {
                    this.k = j;
                    return b;
                }
                if (i - j >= 9) {
                    int l = k + 2;
                    final int n = h[j] << 7 ^ b;
                    int n2 = 0;
                    Label_0284: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            int n3 = k + 3;
                            final int n4 = h[l] << 14 ^ n;
                            int n8 = 0;
                            Label_0111: {
                                if (n4 < 0) {
                                    final int n5 = k + 4;
                                    final int n6 = n4 ^ h[n3] << 21;
                                    int n9 = 0;
                                    Label_0148: {
                                        if (n6 >= 0) {
                                            final int n7 = k + 5;
                                            final byte b2 = h[n5];
                                            n8 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                                            n3 = n7;
                                            Label_0278: {
                                                if (b2 < 0) {
                                                    n9 = k + 6;
                                                    if (h[n7] < 0) {
                                                        final int n10 = n3 = k + 7;
                                                        if (h[n9] >= 0) {
                                                            break Label_0278;
                                                        }
                                                        final int n11 = n9 = k + 8;
                                                        if (h[n10] < 0) {
                                                            final int n12 = n3 = k + 9;
                                                            if (h[n11] >= 0) {
                                                                break Label_0278;
                                                            }
                                                            if (h[n12] < 0) {
                                                                return (int)this.Q();
                                                            }
                                                            final int n13 = k + 10;
                                                            n2 = n8;
                                                            l = n13;
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
                                    l = n15;
                                    break Label_0284;
                                }
                                n8 = (n4 ^ 0x3F80);
                            }
                            final int n16 = n3;
                            n2 = n8;
                            l = n16;
                        }
                    }
                    this.k = l;
                    return n2;
                }
            }
            return (int)this.Q();
        }
        
        public long P() {
            final int k = this.k;
            final int i = this.i;
            if (i != k) {
                final byte[] h = this.h;
                final int j = k + 1;
                final byte b = h[k];
                if (b >= 0) {
                    this.k = j;
                    return b;
                }
                if (i - j >= 9) {
                    int l = k + 2;
                    final int n = h[j] << 7 ^ b;
                    long n2 = 0L;
                    Label_0359: {
                        if (n < 0) {
                            n2 = (n ^ 0xFFFFFF80);
                        }
                        else {
                            final int n3 = k + 3;
                            final int n4 = h[l] << 14 ^ n;
                            if (n4 >= 0) {
                                n2 = (n4 ^ 0x3F80);
                                l = n3;
                            }
                            else {
                                l = k + 4;
                                final int n5 = n4 ^ h[n3] << 21;
                                if (n5 < 0) {
                                    n2 = (0xFFE03F80 ^ n5);
                                }
                                else {
                                    final long n6 = n5;
                                    final int n7 = k + 5;
                                    long n8 = n6 ^ (long)h[l] << 28;
                                    long n12 = 0L;
                                    Label_0190: {
                                        if (n8 < 0L) {
                                            l = k + 6;
                                            long n9 = n8 ^ (long)h[n7] << 35;
                                            long n10;
                                            if (n9 < 0L) {
                                                n10 = -34093383808L;
                                            }
                                            else {
                                                final int n11 = k + 7;
                                                n8 = (n9 ^ (long)h[l] << 42);
                                                if (n8 >= 0L) {
                                                    n12 = 4363953127296L;
                                                    l = n11;
                                                    break Label_0190;
                                                }
                                                l = k + 8;
                                                n9 = (n8 ^ (long)h[n11] << 49);
                                                if (n9 < 0L) {
                                                    n10 = -558586000294016L;
                                                }
                                                else {
                                                    final int n13 = k + 9;
                                                    n2 = (n9 ^ (long)h[l] << 56 ^ 0xFE03F80FE03F80L);
                                                    l = n13;
                                                    if (n2 >= 0L) {
                                                        break Label_0359;
                                                    }
                                                    if (h[n13] < 0L) {
                                                        return this.Q();
                                                    }
                                                    l = k + 10;
                                                    break Label_0359;
                                                }
                                            }
                                            n2 = (n9 ^ n10);
                                            break Label_0359;
                                        }
                                        n12 = 266354560L;
                                        l = n7;
                                    }
                                    n2 = (n8 ^ n12);
                                }
                            }
                        }
                    }
                    this.k = l;
                    return n2;
                }
            }
            return this.Q();
        }
        
        public long Q() {
            long n = 0L;
            for (int i = 0; i < 64; i += 7) {
                final byte j = this.I();
                n |= (long)(j & 0x7F) << i;
                if ((j & 0x80) == 0x0) {
                    return n;
                }
            }
            throw A.f();
        }
        
        public final void S(final int n) {
            if (this.a0(n)) {
                return;
            }
            if (n > super.c - this.m - this.k) {
                throw A.l();
            }
            throw A.m();
        }
        
        public void U() {
            int b;
            do {
                b = this.B();
            } while (b != 0 && this.E(b));
        }
        
        public void V(final int n) {
            final int i = this.i;
            final int k = this.k;
            if (n <= i - k && n >= 0) {
                this.k = k + n;
                return;
            }
            this.W(n);
        }
        
        public final void W(final int n) {
            if (n < 0) {
                throw A.g();
            }
            final int m = this.m;
            final int k = this.k;
            final int n2 = this.n;
            if (m + k + n <= n2) {
                this.m = m + k;
                int i = this.i - k;
                this.i = 0;
                this.k = 0;
                while (i < n) {
                    long t = 0L;
                    Label_0278: {
                        try {
                            final InputStream g = this.g;
                            final long n3 = n - i;
                            t = T(g, n3);
                            final long n4 = lcmp(t, 0L);
                            if (n4 < 0 || t > n3) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append(this.g.getClass());
                                sb.append("#skip returned invalid result: ");
                                sb.append(t);
                                sb.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb.toString());
                            }
                            if (n4 != 0) {
                                break Label_0278;
                            }
                        }
                        finally {
                            this.m += i;
                            this.R();
                        }
                        break;
                    }
                    i += (int)t;
                }
                this.m += i;
                this.R();
                if (i < n) {
                    final int j = this.i;
                    int n5 = j - this.k;
                    this.k = j;
                    int l;
                    while (true) {
                        this.S(1);
                        l = n - n5;
                        final int i2 = this.i;
                        if (l <= i2) {
                            break;
                        }
                        n5 += i2;
                        this.k = i2;
                    }
                    this.k = l;
                }
                return;
            }
            this.V(n2 - m - k);
            throw A.m();
        }
        
        @Override
        public void a(final int n) {
            if (this.l == n) {
                return;
            }
            throw A.b();
        }
        
        public final boolean a0(final int i) {
            final int k = this.k;
            final int j = this.i;
            if (k + i <= j) {
                final StringBuilder sb = new StringBuilder();
                sb.append("refillBuffer() called when ");
                sb.append(i);
                sb.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb.toString());
            }
            final int c = super.c;
            final int m = this.m;
            if (i > c - m - k) {
                return false;
            }
            if (m + k + i > this.n) {
                return false;
            }
            if (k > 0) {
                if (j > k) {
                    final byte[] h = this.h;
                    System.arraycopy(h, k, h, 0, j - k);
                }
                this.m += k;
                this.i -= k;
                this.k = 0;
            }
            final InputStream g = this.g;
            final byte[] h2 = this.h;
            final int l = this.i;
            final int g2 = G(g, h2, l, Math.min(h2.length - l, super.c - this.m - l));
            if (g2 == 0 || g2 < -1 || g2 > this.h.length) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.g.getClass());
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(g2);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (g2 > 0) {
                this.i += g2;
                this.R();
                return this.i >= i || this.a0(i);
            }
            return false;
        }
        
        @Override
        public int d() {
            return this.m + this.k;
        }
        
        @Override
        public boolean e() {
            return this.k == this.i && !this.a0(1);
        }
        
        @Override
        public void k(final int n) {
            this.n = n;
            this.R();
        }
        
        @Override
        public int l(int n) {
            if (n < 0) {
                throw A.g();
            }
            n += this.m + this.k;
            final int n2 = this.n;
            if (n <= n2) {
                this.n = n;
                this.R();
                return n2;
            }
            throw A.m();
        }
        
        @Override
        public boolean m() {
            return this.P() != 0L;
        }
        
        @Override
        public h n() {
            final int o = this.O();
            final int i = this.i;
            final int k = this.k;
            if (o <= i - k && o > 0) {
                final h j = com.google.crypto.tink.shaded.protobuf.h.k(this.h, k, o);
                this.k += o;
                return j;
            }
            if (o == 0) {
                return com.google.crypto.tink.shaded.protobuf.h.p;
            }
            return this.H(o);
        }
        
        @Override
        public double o() {
            return Double.longBitsToDouble(this.N());
        }
        
        @Override
        public int p() {
            return this.O();
        }
        
        @Override
        public int q() {
            return this.M();
        }
        
        @Override
        public long r() {
            return this.N();
        }
        
        @Override
        public float s() {
            return Float.intBitsToFloat(this.M());
        }
        
        @Override
        public int t() {
            return this.O();
        }
        
        @Override
        public long u() {
            return this.P();
        }
        
        @Override
        public int v() {
            return this.M();
        }
        
        @Override
        public long w() {
            return this.N();
        }
        
        @Override
        public int x() {
            return com.google.crypto.tink.shaded.protobuf.i.b(this.O());
        }
        
        @Override
        public long y() {
            return com.google.crypto.tink.shaded.protobuf.i.c(this.P());
        }
        
        @Override
        public String z() {
            final int o = this.O();
            if (o > 0) {
                final int i = this.i;
                final int k = this.k;
                if (o <= i - k) {
                    final String s = new String(this.h, k, o, z.b);
                    this.k += o;
                    return s;
                }
            }
            if (o == 0) {
                return "";
            }
            if (o <= this.i) {
                this.S(o);
                final String s2 = new String(this.h, this.k, o, z.b);
                this.k += o;
                return s2;
            }
            return new String(this.J(o, false), z.b);
        }
    }
}
