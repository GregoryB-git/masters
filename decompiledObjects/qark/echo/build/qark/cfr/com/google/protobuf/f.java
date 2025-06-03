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
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.NoSuchElementException
 */
package com.google.protobuf;

import com.google.protobuf.e0;
import com.google.protobuf.l0;
import com.google.protobuf.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class f
implements Iterable,
Serializable {
    public static final f p = new i(t.d);
    public static final f q;
    public static final Comparator r;
    public int o = 0;

    static {
        f f8 = com.google.protobuf.d.c() ? new j(null) : new d(null);
        q = f8;
        r = new Comparator(){

            public int a(f f8, f f9) {
                g g8 = f8.D();
                g g9 = f9.D();
                while (g8.hasNext() && g9.hasNext()) {
                    int n8 = Integer.valueOf((int)f.V(g8.c())).compareTo(Integer.valueOf((int)f.V(g9.c())));
                    if (n8 == 0) continue;
                    return n8;
                }
                return Integer.valueOf((int)f8.size()).compareTo(Integer.valueOf((int)f9.size()));
            }
        };
    }

    public static int V(byte by) {
        return by & 255;
    }

    public static f a0(byte[] arrby) {
        return new i(arrby);
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

    public static f i(String string2) {
        return new i(string2.getBytes(t.b));
    }

    public g D() {
        return new c(){
            public int o;
            public final int p;
            {
                this.o = 0;
                this.p = f.this.size();
            }

            @Override
            public byte c() {
                int n8 = this.o;
                if (n8 < this.p) {
                    this.o = n8 + 1;
                    return f.this.q(n8);
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

    public abstract int M(int var1, int var2, int var3);

    public final int S() {
        return this.o;
    }

    public abstract f T(int var1, int var2);

    public final byte[] U() {
        int n8 = this.size();
        if (n8 == 0) {
            return t.d;
        }
        byte[] arrby = new byte[n8];
        this.k(arrby, 0, 0, n8);
        return arrby;
    }

    public final String W(Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.X(charset);
    }

    public abstract String X(Charset var1);

    public final String Y() {
        return this.W(t.b);
    }

    public final String Z() {
        if (this.size() <= 50) {
            return e0.a(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e0.a(this.T(0, 47)));
        stringBuilder.append("...");
        return stringBuilder.toString();
    }

    public abstract void b0(com.google.protobuf.e var1);

    public abstract byte d(int var1);

    public abstract boolean equals(Object var1);

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.o;
        if (n8 == 0) {
            n9 = this.size();
            n9 = n8 = this.M(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.o = n9;
        }
        return n9;
    }

    public abstract void k(byte[] var1, int var2, int var3, int var4);

    public abstract byte q(int var1);

    public abstract boolean s();

    public abstract int size();

    public final String toString() {
        return String.format((Locale)Locale.ROOT, (String)"<ByteString@%s size=%d contents=\"%s\">", (Object[])new Object[]{Integer.toHexString((int)System.identityHashCode((Object)this)), this.size(), this.Z()});
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
    }

    public static final class e
    extends i {
        private static final long serialVersionUID = 1L;
        public final int t;
        public final int u;

        public e(byte[] arrby, int n8, int n9) {
            super(arrby);
            f.g(n8, n8 + n9, arrby.length);
            this.t = n8;
            this.u = n9;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override
        public byte d(int n8) {
            f.f(n8, this.size());
            return this.s[this.t + n8];
        }

        @Override
        public int d0() {
            return this.t;
        }

        @Override
        public void k(byte[] arrby, int n8, int n9, int n10) {
            System.arraycopy((Object)this.s, (int)(this.d0() + n8), (Object)arrby, (int)n9, (int)n10);
        }

        @Override
        public byte q(int n8) {
            return this.s[this.t + n8];
        }

        @Override
        public int size() {
            return this.u;
        }

        public Object writeReplace() {
            return f.a0(this.U());
        }
    }

    public static interface f {
    }

    public static interface g
    extends Iterator {
        public byte c();
    }

    public static abstract class h
    extends f {
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
        public final int M(int n8, int n9, int n10) {
            return t.h(n8, this.s, this.d0() + n9, n10);
        }

        @Override
        public final f T(int n8, int n9) {
            if ((n9 = f.g(n8, n9, this.size())) == 0) {
                return f.p;
            }
            return new e(this.s, this.d0() + n8, n9);
        }

        @Override
        public final String X(Charset charset) {
            return new String(this.s, this.d0(), this.size(), charset);
        }

        @Override
        public final void b0(com.google.protobuf.e e8) {
            e8.a(this.s, this.d0(), this.size());
        }

        public final boolean c0(f f8, int n8, int n9) {
            if (n9 <= f8.size()) {
                int n10 = n8 + n9;
                if (n10 <= f8.size()) {
                    if (f8 instanceof i) {
                        f8 = (i)f8;
                        byte[] arrby = this.s;
                        byte[] arrby2 = f8.s;
                        int n11 = this.d0();
                        n10 = this.d0();
                        n8 = f8.d0() + n8;
                        while (n10 < n11 + n9) {
                            if (arrby[n10] != arrby2[n8]) {
                                return false;
                            }
                            ++n10;
                            ++n8;
                        }
                        return true;
                    }
                    return f8.T(n8, n10).equals(this.T(0, n9));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(n8);
                stringBuilder.append(", ");
                stringBuilder.append(n9);
                stringBuilder.append(", ");
                stringBuilder.append(f8.size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            f8 = new StringBuilder();
            f8.append("Length too large: ");
            f8.append(n9);
            f8.append(this.size());
            throw new IllegalArgumentException(f8.toString());
        }

        @Override
        public byte d(int n8) {
            return this.s[n8];
        }

        public int d0() {
            return 0;
        }

        @Override
        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof f)) {
                return false;
            }
            if (this.size() != ((f)object).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (object instanceof i) {
                object = (i)object;
                int n8 = this.S();
                int n9 = object.S();
                if (n8 != 0 && n9 != 0 && n8 != n9) {
                    return false;
                }
                return this.c0((f)object, 0, this.size());
            }
            return object.equals((Object)this);
        }

        @Override
        public void k(byte[] arrby, int n8, int n9, int n10) {
            System.arraycopy((Object)this.s, (int)n8, (Object)arrby, (int)n9, (int)n10);
        }

        @Override
        public byte q(int n8) {
            return this.s[n8];
        }

        @Override
        public final boolean s() {
            int n8 = this.d0();
            return l0.m(this.s, n8, this.size() + n8);
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
    }

}

