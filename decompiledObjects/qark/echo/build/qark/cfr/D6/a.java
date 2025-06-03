/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.Flushable
 *  java.lang.AssertionError
 *  java.lang.Cloneable
 *  java.lang.IllegalAccessError
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.ByteBuffer
 *  java.nio.channels.ByteChannel
 *  java.nio.channels.WritableByteChannel
 *  java.nio.charset.Charset
 */
package D6;

import D6.b;
import D6.c;
import D6.d;
import D6.e;
import D6.f;
import D6.g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public final class a
implements b,
Closeable,
Flushable,
WritableByteChannel,
Cloneable,
ByteChannel {
    public static final byte[] q = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public d o;
    public long p;

    public a B(byte[] arrby) {
        if (arrby != null) {
            return this.C(arrby, 0, arrby.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public a C(byte[] arrby, int n8, int n9) {
        if (arrby != null) {
            long l8 = arrby.length;
            long l9 = n8;
            long l10 = n9;
            g.b(l8, l9, l10);
            while (n8 < (n9 += n8)) {
                d d8 = this.x(1);
                int n10 = Math.min((int)(n9 - n8), (int)(8192 - d8.c));
                System.arraycopy((Object)arrby, (int)n8, (Object)d8.a, (int)d8.c, (int)n10);
                n8 += n10;
                d8.c += n10;
            }
            this.p += l10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a D(int n8) {
        d d8 = this.x(1);
        byte[] arrby = d8.a;
        int n9 = d8.c;
        d8.c = n9 + 1;
        arrby[n9] = (byte)n8;
        ++this.p;
        return this;
    }

    public a E(long l8) {
        if (l8 == 0L) {
            return this.D(48);
        }
        int n8 = Long.numberOfTrailingZeros((long)Long.highestOneBit((long)l8)) / 4 + 1;
        d d8 = this.x(n8);
        byte[] arrby = d8.a;
        int n9 = d8.c;
        for (int i8 = n9 + n8 - 1; i8 >= n9; --i8) {
            arrby[i8] = q[(int)(15L & l8)];
            l8 >>>= 4;
        }
        d8.c += n8;
        this.p += (long)n8;
        return this;
    }

    public a F(String arrby, int n8, int n9, Charset charset) {
        if (arrby != null) {
            if (n8 >= 0) {
                if (n9 >= n8) {
                    if (n9 <= arrby.length()) {
                        if (charset != null) {
                            if (charset.equals((Object)g.a)) {
                                return this.H((String)arrby, n8, n9);
                            }
                            arrby = arrby.substring(n8, n9).getBytes(charset);
                            return this.C(arrby, 0, arrby.length);
                        }
                        throw new IllegalArgumentException("charset == null");
                    }
                    charset = new StringBuilder();
                    charset.append("endIndex > string.length: ");
                    charset.append(n9);
                    charset.append(" > ");
                    charset.append(arrby.length());
                    throw new IllegalArgumentException(charset.toString());
                }
                arrby = new StringBuilder();
                arrby.append("endIndex < beginIndex: ");
                arrby.append(n9);
                arrby.append(" < ");
                arrby.append(n8);
                throw new IllegalArgumentException(arrby.toString());
            }
            arrby = new StringBuilder();
            arrby.append("beginIndex < 0: ");
            arrby.append(n8);
            throw new IllegalAccessError(arrby.toString());
        }
        throw new IllegalArgumentException("string == null");
    }

    public a G(String string2) {
        return this.H(string2, 0, string2.length());
    }

    /*
     * Enabled aggressive block sorting
     */
    public a H(String string2, int n8, int n9) {
        if (string2 == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (n8 < 0) {
            string2 = new StringBuilder();
            string2.append("beginIndex < 0: ");
            string2.append(n8);
            throw new IllegalArgumentException(string2.toString());
        }
        if (n9 < n8) {
            string2 = new StringBuilder();
            string2.append("endIndex < beginIndex: ");
            string2.append(n9);
            string2.append(" < ");
            string2.append(n8);
            throw new IllegalArgumentException(string2.toString());
        }
        if (n9 > string2.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n9);
            stringBuilder.append(" > ");
            stringBuilder.append(string2.length());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        while (n8 < n9) {
            int n10;
            int n11;
            int n12;
            char c8 = string2.charAt(n8);
            if (c8 < '') {
                d d8 = this.x(1);
                byte[] arrby = d8.a;
                n10 = d8.c - n8;
                n12 = Math.min((int)n9, (int)(8192 - n10));
                n11 = n8 + 1;
                arrby[n8 + n10] = (byte)c8;
                n8 = n11;
            } else {
                if (c8 < '\u0800') {
                    n11 = c8 >> 6 | 192;
                } else {
                    if (c8 >= '\ud800' && c8 <= '\udfff') {
                        n10 = n8 + 1;
                        n11 = n10 < n9 ? (int)string2.charAt(n10) : 0;
                        if (c8 <= '\udbff' && n11 >= 56320 && n11 <= 57343) {
                            n11 = ((c8 & -55297) << 10 | -56321 & n11) + 65536;
                            this.D(n11 >> 18 | 240);
                            this.D(n11 >> 12 & 63 | 128);
                            this.D(n11 >> 6 & 63 | 128);
                            this.D(n11 & 63 | 128);
                            n8 += 2;
                            continue;
                        }
                        this.D(63);
                        n8 = n10;
                        continue;
                    }
                    this.D(c8 >> 12 | 224);
                    n11 = c8 >> 6 & 63 | 128;
                }
                this.D(n11);
                this.D(c8 & 63 | 128);
                ++n8;
                continue;
            }
            while (n8 < n12 && (n11 = (int)string2.charAt(n8)) < 128) {
                arrby[n8 + n10] = (byte)n11;
                ++n8;
            }
            n11 = d8.c;
            n10 = n10 + n8 - n11;
            d8.c = n11 + n10;
            this.p += (long)n10;
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public a I(int n8) {
        if (n8 >= 128) {
            int n9;
            if (n8 < 2048) {
                n9 = n8 >> 6 | 192;
            } else {
                if (n8 < 65536) {
                    if (n8 >= 55296 && n8 <= 57343) {
                        this.D(63);
                        return this;
                    }
                    n9 = n8 >> 12 | 224;
                } else {
                    if (n8 > 1114111) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected code point: ");
                        stringBuilder.append(Integer.toHexString((int)n8));
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    this.D(n8 >> 18 | 240);
                    n9 = n8 >> 12 & 63 | 128;
                }
                this.D(n9);
                n9 = n8 >> 6 & 63 | 128;
            }
            this.D(n9);
            n8 = n8 & 63 | 128;
        }
        this.D(n8);
        return this;
    }

    public a a() {
        d d8;
        a a8 = new a();
        if (this.p == 0L) {
            return a8;
        }
        a8.o = d8 = this.o.c();
        d8.g = d8;
        d8.f = d8;
        d8 = this.o;
        while ((d8 = d8.f) != this.o) {
            a8.o.g.b(d8.c());
        }
        a8.p = this.p;
        return a8;
    }

    public boolean b() {
        if (this.p == 0L) {
            return true;
        }
        return false;
    }

    public void close() {
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        long l8 = this.p;
        if (l8 != object.p) {
            return false;
        }
        if (l8 == 0L) {
            return true;
        }
        d d8 = this.o;
        object = object.o;
        int n8 = d8.b;
        int n9 = object.b;
        for (long i8 = 0L; i8 < this.p; i8 += l8) {
            l8 = Math.min((int)(d8.c - n8), (int)(object.c - n9));
            int n10 = 0;
            while ((long)n10 < l8) {
                if (d8.a[n8] != object.a[n9]) {
                    return false;
                }
                ++n10;
                ++n8;
                ++n9;
            }
            d d9 = d8;
            n10 = n8;
            if (n8 == d8.c) {
                d9 = d8.f;
                n10 = d9.b;
            }
            int n11 = n9;
            Object object2 = object;
            if (n9 == object.c) {
                object2 = object.f;
                n11 = object2.b;
            }
            d8 = d9;
            n8 = n10;
            n9 = n11;
            object = object2;
        }
        return true;
    }

    public void flush() {
    }

    public int hashCode() {
        int n8;
        d d8;
        d d9 = this.o;
        if (d9 == null) {
            return 0;
        }
        int n9 = 1;
        do {
            int n10 = d9.c;
            n8 = n9;
            for (int i8 = d9.b; i8 < n10; ++i8) {
                n8 = n8 * 31 + d9.a[i8];
            }
            d9 = d8 = d9.f;
            n9 = n8;
        } while (d8 != this.o);
        return n8;
    }

    public boolean isOpen() {
        return true;
    }

    public byte l() {
        long l8 = this.p;
        if (l8 != 0L) {
            d d8 = this.o;
            int n8 = d8.b;
            int n9 = d8.c;
            byte[] arrby = d8.a;
            int n10 = n8 + 1;
            byte by = arrby[n8];
            this.p = l8 - 1L;
            if (n10 == n9) {
                this.o = d8.a();
                e.a(d8);
                return by;
            }
            d8.b = n10;
            return by;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte[] n(long l8) {
        g.b(this.p, 0L, l8);
        if (l8 <= Integer.MAX_VALUE) {
            byte[] arrby = new byte[(int)l8];
            this.s(arrby);
            return arrby;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int read(ByteBuffer byteBuffer) {
        int n8;
        d d8 = this.o;
        if (d8 == null) {
            return -1;
        }
        int n9 = Math.min((int)byteBuffer.remaining(), (int)(d8.c - d8.b));
        byteBuffer.put(d8.a, d8.b, n9);
        d8.b = n8 = d8.b + n9;
        this.p -= (long)n9;
        if (n8 == d8.c) {
            this.o = d8.a();
            e.a(d8);
        }
        return n9;
    }

    public int read(byte[] arrby, int n8, int n9) {
        g.b(arrby.length, n8, n9);
        d d8 = this.o;
        if (d8 == null) {
            return -1;
        }
        n9 = Math.min((int)n9, (int)(d8.c - d8.b));
        System.arraycopy((Object)d8.a, (int)d8.b, (Object)arrby, (int)n8, (int)n9);
        d8.b = n8 = d8.b + n9;
        this.p -= (long)n9;
        if (n8 == d8.c) {
            this.o = d8.a();
            e.a(d8);
        }
        return n9;
    }

    public void s(byte[] arrby) {
        int n8;
        for (int i8 = 0; i8 < arrby.length; i8 += n8) {
            n8 = this.read(arrby, i8, arrby.length - i8);
            if (n8 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    public String t(long l8, Charset object) {
        g.b(this.p, 0L, l8);
        if (object != null) {
            if (l8 <= Integer.MAX_VALUE) {
                if (l8 == 0L) {
                    return "";
                }
                d d8 = this.o;
                int n8 = d8.b;
                if ((long)n8 + l8 > (long)d8.c) {
                    return new String(this.n(l8), (Charset)object);
                }
                object = new String(d8.a, n8, (int)l8, (Charset)object);
                d8.b = n8 = (int)((long)d8.b + l8);
                this.p -= l8;
                if (n8 == d8.c) {
                    this.o = d8.a();
                    e.a(d8);
                }
                return object;
            }
            object = new StringBuilder();
            object.append("byteCount > Integer.MAX_VALUE: ");
            object.append(l8);
            throw new IllegalArgumentException(object.toString());
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String toString() {
        return this.v().toString();
    }

    public String u() {
        try {
            String string2 = this.t(this.p, g.a);
            return string2;
        }
        catch (EOFException eOFException) {
            throw new AssertionError((Object)eOFException);
        }
    }

    public final c v() {
        long l8 = this.p;
        if (l8 <= Integer.MAX_VALUE) {
            return this.w((int)l8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.p);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final c w(int n8) {
        if (n8 == 0) {
            return c.s;
        }
        return new f(this, n8);
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int n8;
            int n9 = n8 = byteBuffer.remaining();
            while (n9 > 0) {
                d d8 = this.x(1);
                int n10 = Math.min((int)n9, (int)(8192 - d8.c));
                byteBuffer.get(d8.a, d8.c, n10);
                n9 -= n10;
                d8.c += n10;
            }
            this.p += (long)n8;
            return n8;
        }
        throw new IllegalArgumentException("source == null");
    }

    public d x(int n8) {
        block4 : {
            d d8;
            block6 : {
                d d9;
                block5 : {
                    if (n8 < 1 || n8 > 8192) break block4;
                    d8 = this.o;
                    if (d8 == null) {
                        this.o = d8 = e.b();
                        d8.g = d8;
                        d8.f = d8;
                        return d8;
                    }
                    d9 = d8.g;
                    if (d9.c + n8 > 8192) break block5;
                    d8 = d9;
                    if (d9.e) break block6;
                }
                d8 = d9.b(e.b());
            }
            return d8;
        }
        throw new IllegalArgumentException();
    }
}

