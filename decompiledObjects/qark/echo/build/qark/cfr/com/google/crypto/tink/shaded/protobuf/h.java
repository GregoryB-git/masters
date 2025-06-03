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
 *  java.util.Locale
 *  java.util.NoSuchElementException
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i0;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class h
implements Iterable,
Serializable {
    public static final h p = new j(z.d);
    public static final f q;
    public static final Comparator r;
    public int o = 0;

    static {
        f f8 = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(null) : new d(null);
        q = f8;
        r = new Comparator(){

            public int a(h h8, h h9) {
                g g8 = h8.S();
                g g9 = h9.S();
                while (g8.hasNext() && g9.hasNext()) {
                    int n8 = Integer.valueOf((int)h.Z(g8.c())).compareTo(Integer.valueOf((int)h.Z(g9.c())));
                    if (n8 == 0) continue;
                    return n8;
                }
                return Integer.valueOf((int)h8.size()).compareTo(Integer.valueOf((int)h9.size()));
            }
        };
    }

    public static h T(int n8) {
        return new h(n8, null);
    }

    public static int Z(byte by) {
        return by & 255;
    }

    public static h e0(byte[] arrby) {
        return new j(arrby);
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

    public static h f0(byte[] arrby, int n8, int n9) {
        return new e(arrby, n8, n9);
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

    public static h i(byte[] arrby) {
        return h.k(arrby, 0, arrby.length);
    }

    public static h k(byte[] arrby, int n8, int n9) {
        h.g(n8, n8 + n9, arrby.length);
        return new j(q.a(arrby, n8, n9));
    }

    public static h q(String string2) {
        return new j(string2.getBytes(z.b));
    }

    public abstract byte D(int var1);

    public abstract boolean M();

    public g S() {
        return new c(){
            public int o;
            public final int p;
            {
                this.o = 0;
                this.p = h.this.size();
            }

            @Override
            public byte c() {
                int n8 = this.o;
                if (n8 < this.p) {
                    this.o = n8 + 1;
                    return h.this.D(n8);
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

    public abstract com.google.crypto.tink.shaded.protobuf.i U();

    public abstract int V(int var1, int var2, int var3);

    public final int W() {
        return this.o;
    }

    public abstract h X(int var1, int var2);

    public final byte[] Y() {
        int n8 = this.size();
        if (n8 == 0) {
            return z.d;
        }
        byte[] arrby = new byte[n8];
        this.s(arrby, 0, 0, n8);
        return arrby;
    }

    public final String a0(Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.b0(charset);
    }

    public abstract String b0(Charset var1);

    public final String c0() {
        return this.a0(z.b);
    }

    public abstract byte d(int var1);

    public final String d0() {
        if (this.size() <= 50) {
            return i0.a(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i0.a(this.X(0, 47)));
        stringBuilder.append("...");
        return stringBuilder.toString();
    }

    public abstract boolean equals(Object var1);

    public abstract void g0(com.google.crypto.tink.shaded.protobuf.g var1);

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.o;
        if (n8 == 0) {
            n9 = this.size();
            n9 = n8 = this.V(n9, 0, n9);
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
        return String.format((Locale)Locale.ROOT, (String)"<ByteString@%s size=%d contents=\"%s\">", (Object[])new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.size(), this.d0()});
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
    extends j {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;

        public e(byte[] arrby, int n8, int n9) {
            super(arrby);
            h.g(n8, n8 + n9, arrby.length);
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
            h.f(n8, this.size());
            return this.s[this.t + n8];
        }

        @Override
        public int i0() {
            return this.t;
        }

        @Override
        public void s(byte[] arrby, int n8, int n9, int n10) {
            System.arraycopy((Object)this.s, (int)(this.i0() + n8), (Object)arrby, (int)n9, (int)n10);
        }

        @Override
        public int size() {
            return this.u;
        }

        public Object writeReplace() {
            return h.e0(this.Y());
        }
    }

    public static interface f {
        public byte[] a(byte[] var1, int var2, int var3);
    }

    public static interface g
    extends Iterator {
        public byte c();
    }

    public static final class h {
        public final com.google.crypto.tink.shaded.protobuf.k a;
        public final byte[] b;

        public h(int n8) {
            byte[] arrby = new byte[n8];
            this.b = arrby;
            this.a = com.google.crypto.tink.shaded.protobuf.k.U(arrby);
        }

        public /* synthetic */ h(int n8,  a8) {
            this(n8);
        }

        public h a() {
            this.a.c();
            return new j(this.b);
        }

        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.a;
        }
    }

    public static abstract class i
    extends h {
    }

    public static class j
    extends i {
        private static final long serialVersionUID = 1L;
        public final byte[] s;

        public j(byte[] arrby) {
            arrby.getClass();
            this.s = arrby;
        }

        @Override
        public byte D(int n8) {
            return this.s[n8];
        }

        @Override
        public final boolean M() {
            int n8 = this.i0();
            return p0.n(this.s, n8, this.size() + n8);
        }

        @Override
        public final com.google.crypto.tink.shaded.protobuf.i U() {
            return com.google.crypto.tink.shaded.protobuf.i.j(this.s, this.i0(), this.size(), true);
        }

        @Override
        public final int V(int n8, int n9, int n10) {
            return z.h(n8, this.s, this.i0() + n9, n10);
        }

        @Override
        public final h X(int n8, int n9) {
            if ((n9 = h.g(n8, n9, this.size())) == 0) {
                return h.p;
            }
            return new e(this.s, this.i0() + n8, n9);
        }

        @Override
        public final String b0(Charset charset) {
            return new String(this.s, this.i0(), this.size(), charset);
        }

        @Override
        public byte d(int n8) {
            return this.s[n8];
        }

        @Override
        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof h)) {
                return false;
            }
            if (this.size() != ((h)object).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (object instanceof j) {
                object = (j)object;
                int n8 = this.W();
                int n9 = object.W();
                if (n8 != 0 && n9 != 0 && n8 != n9) {
                    return false;
                }
                return this.h0((h)object, 0, this.size());
            }
            return object.equals((Object)this);
        }

        @Override
        public final void g0(com.google.crypto.tink.shaded.protobuf.g g8) {
            g8.a(this.s, this.i0(), this.size());
        }

        public final boolean h0(h h8, int n8, int n9) {
            if (n9 <= h8.size()) {
                int n10 = n8 + n9;
                if (n10 <= h8.size()) {
                    if (h8 instanceof j) {
                        h8 = (j)h8;
                        byte[] arrby = this.s;
                        byte[] arrby2 = h8.s;
                        int n11 = this.i0();
                        n10 = this.i0();
                        n8 = h8.i0() + n8;
                        while (n10 < n11 + n9) {
                            if (arrby[n10] != arrby2[n8]) {
                                return false;
                            }
                            ++n10;
                            ++n8;
                        }
                        return true;
                    }
                    return h8.X(n8, n10).equals(this.X(0, n9));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(n8);
                stringBuilder.append(", ");
                stringBuilder.append(n9);
                stringBuilder.append(", ");
                stringBuilder.append(h8.size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            h8 = new StringBuilder();
            h8.append("Length too large: ");
            h8.append(n9);
            h8.append(this.size());
            throw new IllegalArgumentException(h8.toString());
        }

        public int i0() {
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

    public static final class k
    implements f {
        public k() {
        }

        public /* synthetic */ k( a8) {
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

