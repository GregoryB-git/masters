package D6;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a implements b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f1489q = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: o, reason: collision with root package name */
    public d f1490o;

    /* renamed from: p, reason: collision with root package name */
    public long f1491p;

    public a B(byte[] bArr) {
        if (bArr != null) {
            return C(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public a C(byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j7 = i8;
        g.b(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            d x7 = x(1);
            int min = Math.min(i9 - i7, 8192 - x7.f1499c);
            System.arraycopy(bArr, i7, x7.f1497a, x7.f1499c, min);
            i7 += min;
            x7.f1499c += min;
        }
        this.f1491p += j7;
        return this;
    }

    public a D(int i7) {
        d x7 = x(1);
        byte[] bArr = x7.f1497a;
        int i8 = x7.f1499c;
        x7.f1499c = i8 + 1;
        bArr[i8] = (byte) i7;
        this.f1491p++;
        return this;
    }

    public a E(long j7) {
        if (j7 == 0) {
            return D(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j7)) / 4) + 1;
        d x7 = x(numberOfTrailingZeros);
        byte[] bArr = x7.f1497a;
        int i7 = x7.f1499c;
        for (int i8 = (i7 + numberOfTrailingZeros) - 1; i8 >= i7; i8--) {
            bArr[i8] = f1489q[(int) (15 & j7)];
            j7 >>>= 4;
        }
        x7.f1499c += numberOfTrailingZeros;
        this.f1491p += numberOfTrailingZeros;
        return this;
    }

    public a F(String str, int i7, int i8, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i7 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i7);
        }
        if (i8 < i7) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i8 + " < " + i7);
        }
        if (i8 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(g.f1508a)) {
                return H(str, i7, i8);
            }
            byte[] bytes = str.substring(i7, i8).getBytes(charset);
            return C(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i8 + " > " + str.length());
    }

    public a G(String str) {
        return H(str, 0, str.length());
    }

    public a H(String str, int i7, int i8) {
        int i9;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i7);
        }
        if (i8 < i7) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i8 + " < " + i7);
        }
        if (i8 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i8 + " > " + str.length());
        }
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt < 128) {
                d x7 = x(1);
                byte[] bArr = x7.f1497a;
                int i10 = x7.f1499c - i7;
                int min = Math.min(i8, 8192 - i10);
                int i11 = i7 + 1;
                bArr[i7 + i10] = (byte) charAt;
                while (i11 < min) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i11 + i10] = (byte) charAt2;
                    i11++;
                }
                int i12 = x7.f1499c;
                int i13 = (i10 + i11) - i12;
                x7.f1499c = i12 + i13;
                this.f1491p += i13;
                i7 = i11;
            } else {
                if (charAt < 2048) {
                    i9 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    D((charAt >> '\f') | 224);
                    i9 = ((charAt >> 6) & 63) | 128;
                } else {
                    int i14 = i7 + 1;
                    char charAt3 = i14 < i8 ? str.charAt(i14) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        D(63);
                        i7 = i14;
                    } else {
                        int i15 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        D((i15 >> 18) | 240);
                        D(((i15 >> 12) & 63) | 128);
                        D(((i15 >> 6) & 63) | 128);
                        D((i15 & 63) | 128);
                        i7 += 2;
                    }
                }
                D(i9);
                D((charAt & '?') | 128);
                i7++;
            }
        }
        return this;
    }

    public a I(int i7) {
        int i8;
        int i9;
        if (i7 >= 128) {
            if (i7 < 2048) {
                i9 = (i7 >> 6) | 192;
            } else {
                if (i7 < 65536) {
                    if (i7 >= 55296 && i7 <= 57343) {
                        D(63);
                        return this;
                    }
                    i8 = (i7 >> 12) | 224;
                } else {
                    if (i7 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i7));
                    }
                    D((i7 >> 18) | 240);
                    i8 = ((i7 >> 12) & 63) | 128;
                }
                D(i8);
                i9 = ((i7 >> 6) & 63) | 128;
            }
            D(i9);
            i7 = (i7 & 63) | 128;
        }
        D(i7);
        return this;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = new a();
        if (this.f1491p == 0) {
            return aVar;
        }
        d c7 = this.f1490o.c();
        aVar.f1490o = c7;
        c7.f1503g = c7;
        c7.f1502f = c7;
        d dVar = this.f1490o;
        while (true) {
            dVar = dVar.f1502f;
            if (dVar == this.f1490o) {
                aVar.f1491p = this.f1491p;
                return aVar;
            }
            aVar.f1490o.f1503g.b(dVar.c());
        }
    }

    public boolean b() {
        return this.f1491p == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        long j7 = this.f1491p;
        if (j7 != aVar.f1491p) {
            return false;
        }
        long j8 = 0;
        if (j7 == 0) {
            return true;
        }
        d dVar = this.f1490o;
        d dVar2 = aVar.f1490o;
        int i7 = dVar.f1498b;
        int i8 = dVar2.f1498b;
        while (j8 < this.f1491p) {
            long min = Math.min(dVar.f1499c - i7, dVar2.f1499c - i8);
            int i9 = 0;
            while (i9 < min) {
                int i10 = i7 + 1;
                int i11 = i8 + 1;
                if (dVar.f1497a[i7] != dVar2.f1497a[i8]) {
                    return false;
                }
                i9++;
                i7 = i10;
                i8 = i11;
            }
            if (i7 == dVar.f1499c) {
                dVar = dVar.f1502f;
                i7 = dVar.f1498b;
            }
            if (i8 == dVar2.f1499c) {
                dVar2 = dVar2.f1502f;
                i8 = dVar2.f1498b;
            }
            j8 += min;
        }
        return true;
    }

    public int hashCode() {
        d dVar = this.f1490o;
        if (dVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = dVar.f1499c;
            for (int i9 = dVar.f1498b; i9 < i8; i9++) {
                i7 = (i7 * 31) + dVar.f1497a[i9];
            }
            dVar = dVar.f1502f;
        } while (dVar != this.f1490o);
        return i7;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public byte l() {
        long j7 = this.f1491p;
        if (j7 == 0) {
            throw new IllegalStateException("size == 0");
        }
        d dVar = this.f1490o;
        int i7 = dVar.f1498b;
        int i8 = dVar.f1499c;
        int i9 = i7 + 1;
        byte b7 = dVar.f1497a[i7];
        this.f1491p = j7 - 1;
        if (i9 == i8) {
            this.f1490o = dVar.a();
            e.a(dVar);
        } else {
            dVar.f1498b = i9;
        }
        return b7;
    }

    public byte[] n(long j7) {
        g.b(this.f1491p, 0L, j7);
        if (j7 <= 2147483647L) {
            byte[] bArr = new byte[(int) j7];
            s(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j7);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        d dVar = this.f1490o;
        if (dVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), dVar.f1499c - dVar.f1498b);
        byteBuffer.put(dVar.f1497a, dVar.f1498b, min);
        int i7 = dVar.f1498b + min;
        dVar.f1498b = i7;
        this.f1491p -= min;
        if (i7 == dVar.f1499c) {
            this.f1490o = dVar.a();
            e.a(dVar);
        }
        return min;
    }

    public void s(byte[] bArr) {
        int i7 = 0;
        while (i7 < bArr.length) {
            int read = read(bArr, i7, bArr.length - i7);
            if (read == -1) {
                throw new EOFException();
            }
            i7 += read;
        }
    }

    public String t(long j7, Charset charset) {
        g.b(this.f1491p, 0L, j7);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j7 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j7);
        }
        if (j7 == 0) {
            return "";
        }
        d dVar = this.f1490o;
        int i7 = dVar.f1498b;
        if (i7 + j7 > dVar.f1499c) {
            return new String(n(j7), charset);
        }
        String str = new String(dVar.f1497a, i7, (int) j7, charset);
        int i8 = (int) (dVar.f1498b + j7);
        dVar.f1498b = i8;
        this.f1491p -= j7;
        if (i8 == dVar.f1499c) {
            this.f1490o = dVar.a();
            e.a(dVar);
        }
        return str;
    }

    public String toString() {
        return v().toString();
    }

    public String u() {
        try {
            return t(this.f1491p, g.f1508a);
        } catch (EOFException e7) {
            throw new AssertionError(e7);
        }
    }

    public final c v() {
        long j7 = this.f1491p;
        if (j7 <= 2147483647L) {
            return w((int) j7);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f1491p);
    }

    public final c w(int i7) {
        return i7 == 0 ? c.f1493s : new f(this, i7);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            d x7 = x(1);
            int min = Math.min(i7, 8192 - x7.f1499c);
            byteBuffer.get(x7.f1497a, x7.f1499c, min);
            i7 -= min;
            x7.f1499c += min;
        }
        this.f1491p += remaining;
        return remaining;
    }

    public d x(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException();
        }
        d dVar = this.f1490o;
        if (dVar != null) {
            d dVar2 = dVar.f1503g;
            return (dVar2.f1499c + i7 > 8192 || !dVar2.f1501e) ? dVar2.b(e.b()) : dVar2;
        }
        d b7 = e.b();
        this.f1490o = b7;
        b7.f1503g = b7;
        b7.f1502f = b7;
        return b7;
    }

    public int read(byte[] bArr, int i7, int i8) {
        g.b(bArr.length, i7, i8);
        d dVar = this.f1490o;
        if (dVar == null) {
            return -1;
        }
        int min = Math.min(i8, dVar.f1499c - dVar.f1498b);
        System.arraycopy(dVar.f1497a, dVar.f1498b, bArr, i7, min);
        int i9 = dVar.f1498b + min;
        dVar.f1498b = i9;
        this.f1491p -= min;
        if (i9 == dVar.f1499c) {
            this.f1490o = dVar.a();
            e.a(dVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }
}
