package ma;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import ma.h1;

/* loaded from: classes.dex */
public abstract class h implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0164h f10961b = new C0164h(a0.f10910b);

    /* renamed from: c, reason: collision with root package name */
    public static final e f10962c;

    /* renamed from: a, reason: collision with root package name */
    public int f10963a = 0;

    public class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public int f10964a = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f10965b;

        public a() {
            this.f10965b = h.this.size();
        }

        @Override // ma.h.f
        public final byte f() {
            int i10 = this.f10964a;
            if (i10 >= this.f10965b) {
                throw new NoSuchElementException();
            }
            this.f10964a = i10 + 1;
            return h.this.p(i10);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10964a < this.f10965b;
        }
    }

    public static abstract class b implements f {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(f());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class c implements e {
        @Override // ma.h.e
        public final byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public static final class d extends C0164h {

        /* renamed from: e, reason: collision with root package name */
        public final int f10967e;
        public final int f;

        public d(byte[] bArr, int i10, int i11) {
            super(bArr);
            h.l(i10, i10 + i11, bArr.length);
            this.f10967e = i10;
            this.f = i11;
        }

        @Override // ma.h.C0164h
        public final int D() {
            return this.f10967e;
        }

        @Override // ma.h.C0164h, ma.h
        public final byte i(int i10) {
            h.k(i10, this.f);
            return this.f10968d[this.f10967e + i10];
        }

        @Override // ma.h.C0164h, ma.h
        public final void n(int i10, byte[] bArr, int i11, int i12) {
            System.arraycopy(this.f10968d, this.f10967e + i10, bArr, i11, i12);
        }

        @Override // ma.h.C0164h, ma.h
        public final byte p(int i10) {
            return this.f10968d[this.f10967e + i10];
        }

        @Override // ma.h.C0164h, ma.h
        public final int size() {
            return this.f;
        }
    }

    public interface e {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface f extends Iterator<Byte> {
        byte f();
    }

    public static abstract class g extends h {
        public abstract boolean C(h hVar, int i10, int i11);

        @Override // ma.h, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new a();
        }

        @Override // ma.h
        public final int o() {
            return 0;
        }

        @Override // ma.h
        public final boolean q() {
            return true;
        }
    }

    /* renamed from: ma.h$h, reason: collision with other inner class name */
    public static class C0164h extends g {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f10968d;

        public C0164h(byte[] bArr) {
            bArr.getClass();
            this.f10968d = bArr;
        }

        @Override // ma.h
        public final String A(Charset charset) {
            return new String(this.f10968d, D(), size(), charset);
        }

        @Override // ma.h
        public final void B(m.e eVar) {
            eVar.s(this.f10968d, D(), size());
        }

        @Override // ma.h.g
        public final boolean C(h hVar, int i10, int i11) {
            if (i11 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + hVar.size());
            }
            if (!(hVar instanceof C0164h)) {
                return hVar.y(i10, i12).equals(y(0, i11));
            }
            C0164h c0164h = (C0164h) hVar;
            byte[] bArr = this.f10968d;
            byte[] bArr2 = c0164h.f10968d;
            int D = D() + i11;
            int D2 = D();
            int D3 = c0164h.D() + i10;
            while (D2 < D) {
                if (bArr[D2] != bArr2[D3]) {
                    return false;
                }
                D2++;
                D3++;
            }
            return true;
        }

        public int D() {
            return 0;
        }

        @Override // ma.h
        public final ByteBuffer a() {
            return ByteBuffer.wrap(this.f10968d, D(), size()).asReadOnlyBuffer();
        }

        @Override // ma.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0164h)) {
                return obj.equals(this);
            }
            C0164h c0164h = (C0164h) obj;
            int i10 = this.f10963a;
            int i11 = c0164h.f10963a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                return C(c0164h, 0, size());
            }
            return false;
        }

        @Override // ma.h
        public byte i(int i10) {
            return this.f10968d[i10];
        }

        @Override // ma.h
        public void n(int i10, byte[] bArr, int i11, int i12) {
            System.arraycopy(this.f10968d, i10, bArr, i11, i12);
        }

        @Override // ma.h
        public byte p(int i10) {
            return this.f10968d[i10];
        }

        @Override // ma.h
        public final boolean r() {
            int D = D();
            return u1.e(this.f10968d, D, size() + D);
        }

        @Override // ma.h
        public int size() {
            return this.f10968d.length;
        }

        @Override // ma.h
        public final ma.i t() {
            return ma.i.f(this.f10968d, D(), size(), true);
        }

        @Override // ma.h
        public final int u(int i10, int i11, int i12) {
            byte[] bArr = this.f10968d;
            int D = D() + i11;
            Charset charset = a0.f10909a;
            for (int i13 = D; i13 < D + i12; i13++) {
                i10 = (i10 * 31) + bArr[i13];
            }
            return i10;
        }

        @Override // ma.h
        public final int x(int i10, int i11, int i12) {
            int D = D() + i11;
            return u1.f11095a.e(i10, this.f10968d, D, i12 + D);
        }

        @Override // ma.h
        public final h y(int i10, int i11) {
            int l10 = h.l(i10, i11, size());
            return l10 == 0 ? h.f10961b : new d(this.f10968d, D() + i10, l10);
        }
    }

    public static final class i implements e {
        @Override // ma.h.e
        public final byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f10962c = ma.d.a() ? new i() : new c();
    }

    public static h h(Iterator<h> it, int i10) {
        h1 h1Var;
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        h h10 = h(it, i11);
        h h11 = h(it, i10 - i11);
        if (Integer.MAX_VALUE - h10.size() < h11.size()) {
            StringBuilder l10 = defpackage.f.l("ByteString would be too long: ");
            l10.append(h10.size());
            l10.append("+");
            l10.append(h11.size());
            throw new IllegalArgumentException(l10.toString());
        }
        if (h11.size() == 0) {
            return h10;
        }
        if (h10.size() == 0) {
            return h11;
        }
        int size = h11.size() + h10.size();
        if (size < 128) {
            int size2 = h10.size();
            int size3 = h11.size();
            int i12 = size2 + size3;
            byte[] bArr = new byte[i12];
            int i13 = size2 + 0;
            l(0, i13, h10.size());
            l(0, i13, i12);
            if (size2 > 0) {
                h10.n(0, bArr, 0, size2);
            }
            l(0, size3 + 0, h11.size());
            l(size2, i12, i12);
            if (size3 > 0) {
                h11.n(0, bArr, size2, size3);
            }
            return new C0164h(bArr);
        }
        if (h10 instanceof h1) {
            h1 h1Var2 = (h1) h10;
            if (h11.size() + h1Var2.f.size() < 128) {
                h hVar = h1Var2.f;
                int size4 = hVar.size();
                int size5 = h11.size();
                int i14 = size4 + size5;
                byte[] bArr2 = new byte[i14];
                int i15 = size4 + 0;
                l(0, i15, hVar.size());
                l(0, i15, i14);
                if (size4 > 0) {
                    hVar.n(0, bArr2, 0, size4);
                }
                l(0, size5 + 0, h11.size());
                l(size4, i14, i14);
                if (size5 > 0) {
                    h11.n(0, bArr2, size4, size5);
                }
                h1Var = new h1(h1Var2.f10971e, new C0164h(bArr2));
                return h1Var;
            }
            if (h1Var2.f10971e.o() > h1Var2.f.o() && h1Var2.f10973p > h11.o()) {
                return new h1(h1Var2.f10971e, new h1(h1Var2.f, h11));
            }
        }
        if (size >= h1.C(Math.max(h10.o(), h11.o()) + 1)) {
            h1Var = new h1(h10, h11);
            return h1Var;
        }
        h1.b bVar = new h1.b();
        bVar.a(h10);
        bVar.a(h11);
        h pop = bVar.f10976a.pop();
        while (!bVar.f10976a.isEmpty()) {
            pop = new h1(bVar.f10976a.pop(), pop);
        }
        return pop;
    }

    public static void k(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(defpackage.f.i("Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(defpackage.f.h("Index < 0: ", i10));
        }
    }

    public static int l(int i10, int i11, int i12) {
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

    public static C0164h m(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        return new C0164h(f10962c.a(bArr, i10, i11));
    }

    public abstract String A(Charset charset);

    public abstract void B(m.e eVar);

    public abstract ByteBuffer a();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f10963a;
        if (i10 == 0) {
            int size = size();
            i10 = u(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f10963a = i10;
        }
        return i10;
    }

    public abstract byte i(int i10);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void n(int i10, byte[] bArr, int i11, int i12);

    public abstract int o();

    public abstract byte p(int i10);

    public abstract boolean q();

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f iterator() {
        return new a();
    }

    public abstract int size();

    public abstract ma.i t();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = b.z.i(this);
        } else {
            str = b.z.i(y(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract int u(int i10, int i11, int i12);

    public abstract int x(int i10, int i11, int i12);

    public abstract h y(int i10, int i11);

    public final byte[] z() {
        int size = size();
        if (size == 0) {
            return a0.f10910b;
        }
        byte[] bArr = new byte[size];
        n(0, bArr, 0, size);
        return bArr;
    }
}
