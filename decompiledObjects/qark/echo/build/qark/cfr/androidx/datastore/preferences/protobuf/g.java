/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.Serializable
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class g
implements Iterable,
Serializable {
    public static final g p = new i(y.c);
    public static final f q;
    public static final Comparator r;
    public int o = 0;

    static {
        f f8 = androidx.datastore.preferences.protobuf.d.c() ? new j(null) : new d(null);
        q = f8;
        r = new Comparator(){

            public int a(g g8, g g9) {
                g g10 = g8.S();
                g g11 = g9.S();
                while (g10.hasNext() && g11.hasNext()) {
                    int n8 = Integer.compare((int)g.X(g10.c()), (int)g.X(g11.c()));
                    if (n8 == 0) continue;
                    return n8;
                }
                return Integer.compare((int)g8.size(), (int)g9.size());
            }
        };
    }

    public static int X(byte by) {
        return by & 255;
    }

    public static g b0(byte[] arrby) {
        return new i(arrby);
    }

    public static g c0(byte[] arrby, int n8, int n9) {
        return new e(arrby, n8, n9);
    }

    public static void f(int n8, int n9) {
        if ((n9 - (n8 + 1) | n8) < 0) {
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n8);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    public static int g(int n8, int n9, int n10) {
        int n11 = n9 - n8;
        if ((n8 | n9 | n11 | n10 - n9) < 0) {
            if (n8 >= 0) {
                if (n9 < n8) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n8);
                    stringBuilder.append(", ");
                    stringBuilder.append(n9);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n9);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n8);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static g i(byte[] arrby) {
        return g.k(arrby, 0, arrby.length);
    }

    public static g k(byte[] arrby, int n8, int n9) {
        g.g(n8, n8 + n9, arrby.length);
        return new i(q.a(arrby, n8, n9));
    }

    public static g q(String string2) {
        return new i(string2.getBytes(y.a));
    }

    public abstract byte D(int var1);

    public abstract boolean M();

    public g S() {
        return new c(){
            public int o;
            public final int p;
            {
                this.o = 0;
                this.p = g.this.size();
            }

            @Override
            public byte c() {
                int n8 = this.o;
                if (n8 < this.p) {
                    this.o = n8 + 1;
                    return g.this.D(n8);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.o < this.p) {
                    return true;
                }
                return false;
            }
        };
    }

    public abstract int T(int var1, int var2, int var3);

    public final int U() {
        return this.o;
    }

    public abstract g V(int var1, int var2);

    public final byte[] W() {
        int n8 = this.size();
        if (n8 == 0) {
            return y.c;
        }
        byte[] arrby = new byte[n8];
        this.s(arrby, 0, 0, n8);
        return arrby;
    }

    public final String Y(Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.Z(charset);
    }

    public abstract String Z(Charset var1);

    public final String a0() {
        return this.Y(y.a);
    }

    public abstract byte d(int var1);

    public abstract void d0(androidx.datastore.preferences.protobuf.f var1);

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.o;
        if (n8 == 0) {
            n9 = this.size();
            n9 = n8 = this.T(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.o = n9;
        }
        return n9;
    }

    public abstract void s(byte[] var1, int var2, int var3, int var4);

    public abstract int size();

    public final String toString() {
        return String.format((String)"<ByteString@%s size=%d>", (Object[])new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.size()});
    }

    public static abstract class c
    implements g {
        public final Byte b() {
            return this.c();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d
    implements f {
        public d() {
        }

        public /* synthetic */ d( a8) {
            this();
        }

        @Override
        public byte[] a(byte[] arrby, int n8, int n9) {
            return Arrays.copyOfRange((byte[])arrby, (int)n8, (int)(n9 + n8));
        }
    }

    public static final class e
    extends i {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;

        public e(byte[] arrby, int n8, int n9) {
            super(arrby);
            g.g(n8, n8 + n9, arrby.length);
            this.t = n8;
            this.u = n9;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override
        public byte D(int n8) {
            return this.s[this.t + n8];
        }

        @Override
        public byte d(int n8) {
            g.f(n8, this.size());
            return this.s[this.t + n8];
        }

        @Override
        public int f0() {
            return this.t;
        }

        @Override
        public void s(byte[] arrby, int n8, int n9, int n10) {
            System.arraycopy((Object)this.s, (int)(this.f0() + n8), (Object)arrby, (int)n9, (int)n10);
        }

        @Override
        public int size() {
            return this.u;
        }

        public Object writeReplace() {
            return g.b0(this.W());
        }
    }

    public static interface f {
        public byte[] a(byte[] var1, int var2, int var3);
    }

    public static interface g
    extends Iterator {
        public byte c();
    }

    public static abstract class h
    extends g {
    }

    public static class i
    extends h {
        private static final long serialVersionUID = 1L;
        public final byte[] s;

        public i(byte[] arrby) {
            arrby.getClass();
            this.s = arrby;
        }

        @Override
        public byte D(int n8) {
            return this.s[n8];
        }

        @Override
        public final boolean M() {
            int n8 = this.f0();
            return q0.n(this.s, n8, this.size() + n8);
        }

        @Override
        public final int T(int n8, int n9, int n10) {
            return y.i(n8, this.s, this.f0() + n9, n10);
        }

        @Override
        public final g V(int n8, int n9) {
            if ((n9 = g.g(n8, n9, this.size())) == 0) {
                return g.p;
            }
            return new e(this.s, this.f0() + n8, n9);
        }

        @Override
        public final String Z(Charset charset) {
            return new String(this.s, this.f0(), this.size(), charset);
        }

        @Override
        public byte d(int n8) {
            return this.s[n8];
        }

        @Override
        public final void d0(androidx.datastore.preferences.protobuf.f f8) {
            f8.a(this.s, this.f0(), this.size());
        }

        public final boolean e0(g g8, int n8, int n9) {
            if (n9 <= g8.size()) {
                int n10 = n8 + n9;
                if (n10 <= g8.size()) {
                    if (g8 instanceof i) {
                        g8 = (i)g8;
                        byte[] arrby = this.s;
                        byte[] arrby2 = g8.s;
                        int n11 = this.f0();
                        n10 = this.f0();
                        n8 = g8.f0() + n8;
                        while (n10 < n11 + n9) {
                            if (arrby[n10] != arrby2[n8]) {
                                return false;
                            }
                            ++n10;
                            ++n8;
                        }
                        return true;
                    }
                    return g8.V(n8, n10).equals(this.V(0, n9));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(n8);
                stringBuilder.append(", ");
                stringBuilder.append(n9);
                stringBuilder.append(", ");
                stringBuilder.append(g8.size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            g8 = new StringBuilder();
            g8.append("Length too large: ");
            g8.append(n9);
            g8.append(this.size());
            throw new IllegalArgumentException(g8.toString());
        }

        @Override
        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof g)) {
                return false;
            }
            if (this.size() != ((g)object).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (object instanceof i) {
                object = (i)object;
                int n8 = this.U();
                int n9 = object.U();
                if (n8 != 0 && n9 != 0 && n8 != n9) {
                    return false;
                }
                return this.e0((g)object, 0, this.size());
            }
            return object.equals((Object)this);
        }

        public int f0() {
            return 0;
        }

        @Override
        public void s(byte[] arrby, int n8, int n9, int n10) {
            System.arraycopy((Object)this.s, (int)n8, (Object)arrby, (int)n9, (int)n10);
        }

        @Override
        public int size() {
            return this.s.length;
        }
    }

    public static final class j
    implements f {
        public j() {
        }

        public /* synthetic */ j( a8) {
            this();
        }

        @Override
        public byte[] a(byte[] arrby, int n8, int n9) {
            byte[] arrby2 = new byte[n9];
            System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)0, (int)n9);
            return arrby2;
        }
    }

}

