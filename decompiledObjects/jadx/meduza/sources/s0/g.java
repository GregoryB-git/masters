package s0;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final e f13982b = new e(x.f14120b);

    /* renamed from: c, reason: collision with root package name */
    public static final c f13983c;

    /* renamed from: a, reason: collision with root package name */
    public int f13984a = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            s0.f fVar = (s0.f) this;
            int i10 = fVar.f13961a;
            if (i10 >= fVar.f13962b) {
                throw new NoSuchElementException();
            }
            fVar.f13961a = i10 + 1;
            return Byte.valueOf(fVar.f13963c.k(i10));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // s0.g.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public interface c {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public static abstract class d extends g {
        @Override // s0.g, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new s0.f(this);
        }
    }

    public static class e extends d {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f13985d;

        public e(byte[] bArr) {
            bArr.getClass();
            this.f13985d = bArr;
        }

        @Override // s0.g
        public byte a(int i10) {
            return this.f13985d[i10];
        }

        @Override // s0.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i10 = this.f13984a;
            int i11 = eVar.f13984a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (0 + size > eVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + eVar.size());
            }
            byte[] bArr = this.f13985d;
            byte[] bArr2 = eVar.f13985d;
            int p10 = p() + size;
            int p11 = p();
            int p12 = eVar.p() + 0;
            while (p11 < p10) {
                if (bArr[p11] != bArr2[p12]) {
                    return false;
                }
                p11++;
                p12++;
            }
            return true;
        }

        @Override // s0.g
        public byte k(int i10) {
            return this.f13985d[i10];
        }

        @Override // s0.g
        public final boolean l() {
            int p10 = p();
            return m1.f14049a.c(this.f13985d, p10, size() + p10) == 0;
        }

        @Override // s0.g
        public final int m(int i10, int i11) {
            byte[] bArr = this.f13985d;
            int p10 = p() + 0;
            Charset charset = x.f14119a;
            for (int i12 = p10; i12 < p10 + i11; i12++) {
                i10 = (i10 * 31) + bArr[i12];
            }
            return i10;
        }

        @Override // s0.g
        public final String n(Charset charset) {
            return new String(this.f13985d, p(), size(), charset);
        }

        @Override // s0.g
        public final void o(m.e eVar) {
            eVar.s(this.f13985d, p(), size());
        }

        public int p() {
            return 0;
        }

        @Override // s0.g
        public int size() {
            return this.f13985d.length;
        }
    }

    public static final class f implements c {
        @Override // s0.g.c
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f13983c = s0.d.a() ? new f() : new b();
    }

    public static int h(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(a0.j.h("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(defpackage.f.i("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(defpackage.f.i("End index: ", i11, " >= ", i12));
    }

    public static e i(byte[] bArr, int i10, int i11) {
        h(i10, i10 + i11, bArr.length);
        return new e(f13983c.a(bArr, i10, i11));
    }

    public abstract byte a(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f13984a;
        if (i10 == 0) {
            int size = size();
            i10 = m(size, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f13984a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new s0.f(this);
    }

    public abstract byte k(int i10);

    public abstract boolean l();

    public abstract int m(int i10, int i11);

    public abstract String n(Charset charset);

    public abstract void o(m.e eVar);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
