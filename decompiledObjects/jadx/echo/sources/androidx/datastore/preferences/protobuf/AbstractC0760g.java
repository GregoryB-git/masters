package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0760g implements Iterable, Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC0760g f8950p = new i(AbstractC0777y.f9200c);

    /* renamed from: q, reason: collision with root package name */
    public static final f f8951q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator f8952r;

    /* renamed from: o, reason: collision with root package name */
    public int f8953o = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    public class a extends c {

        /* renamed from: o, reason: collision with root package name */
        public int f8954o = 0;

        /* renamed from: p, reason: collision with root package name */
        public final int f8955p;

        public a() {
            this.f8955p = AbstractC0760g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.InterfaceC0156g
        public byte c() {
            int i7 = this.f8954o;
            if (i7 >= this.f8955p) {
                throw new NoSuchElementException();
            }
            this.f8954o = i7 + 1;
            return AbstractC0760g.this.D(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8954o < this.f8955p;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0760g abstractC0760g, AbstractC0760g abstractC0760g2) {
            InterfaceC0156g S6 = abstractC0760g.S();
            InterfaceC0156g S7 = abstractC0760g2.S();
            while (S6.hasNext() && S7.hasNext()) {
                int compare = Integer.compare(AbstractC0760g.X(S6.c()), AbstractC0760g.X(S7.c()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC0760g.size(), abstractC0760g2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static abstract class c implements InterfaceC0156g {
        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    public static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: t, reason: collision with root package name */
        public final int f8957t;

        /* renamed from: u, reason: collision with root package name */
        public final int f8958u;

        public e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC0760g.g(i7, i7 + i8, bArr.length);
            this.f8957t = i7;
            this.f8958u = i8;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.i, androidx.datastore.preferences.protobuf.AbstractC0760g
        public byte D(int i7) {
            return this.f8959s[this.f8957t + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.i, androidx.datastore.preferences.protobuf.AbstractC0760g
        public byte d(int i7) {
            AbstractC0760g.f(i7, size());
            return this.f8959s[this.f8957t + i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.i
        public int f0() {
            return this.f8957t;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.i, androidx.datastore.preferences.protobuf.AbstractC0760g
        public void s(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f8959s, f0() + i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.i, androidx.datastore.preferences.protobuf.AbstractC0760g
        public int size() {
            return this.f8958u;
        }

        public Object writeReplace() {
            return AbstractC0760g.b0(W());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    public interface f {
        byte[] a(byte[] bArr, int i7, int i8);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0156g extends Iterator {
        byte c();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    public static abstract class h extends AbstractC0760g {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.S();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    public static class i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: s, reason: collision with root package name */
        public final byte[] f8959s;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f8959s = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public byte D(int i7) {
            return this.f8959s[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final boolean M() {
            int f02 = f0();
            return q0.n(this.f8959s, f02, size() + f02);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final int T(int i7, int i8, int i9) {
            return AbstractC0777y.i(i7, this.f8959s, f0() + i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final AbstractC0760g V(int i7, int i8) {
            int g7 = AbstractC0760g.g(i7, i8, size());
            return g7 == 0 ? AbstractC0760g.f8950p : new e(this.f8959s, f0() + i7, g7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final String Z(Charset charset) {
            return new String(this.f8959s, f0(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public byte d(int i7) {
            return this.f8959s[i7];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final void d0(AbstractC0759f abstractC0759f) {
            abstractC0759f.a(this.f8959s, f0(), size());
        }

        public final boolean e0(AbstractC0760g abstractC0760g, int i7, int i8) {
            if (i8 > abstractC0760g.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC0760g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC0760g.size());
            }
            if (!(abstractC0760g instanceof i)) {
                return abstractC0760g.V(i7, i9).equals(V(0, i8));
            }
            i iVar = (i) abstractC0760g;
            byte[] bArr = this.f8959s;
            byte[] bArr2 = iVar.f8959s;
            int f02 = f0() + i8;
            int f03 = f0();
            int f04 = iVar.f0() + i7;
            while (f03 < f02) {
                if (bArr[f03] != bArr2[f04]) {
                    return false;
                }
                f03++;
                f04++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0760g) || size() != ((AbstractC0760g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int U6 = U();
            int U7 = iVar.U();
            if (U6 == 0 || U7 == 0 || U6 == U7) {
                return e0(iVar, 0, size());
            }
            return false;
        }

        public int f0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public void s(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f8959s, i7, bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g
        public int size() {
            return this.f8959s.length;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    public static final class j implements f {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0760g.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f8951q = AbstractC0757d.c() ? new j(aVar) : new d(aVar);
        f8952r = new b();
    }

    public static int X(byte b7) {
        return b7 & 255;
    }

    public static AbstractC0760g b0(byte[] bArr) {
        return new i(bArr);
    }

    public static AbstractC0760g c0(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
    }

    public static void f(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    public static int g(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static AbstractC0760g i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC0760g k(byte[] bArr, int i7, int i8) {
        g(i7, i7 + i8, bArr.length);
        return new i(f8951q.a(bArr, i7, i8));
    }

    public static AbstractC0760g q(String str) {
        return new i(str.getBytes(AbstractC0777y.f9198a));
    }

    public abstract byte D(int i7);

    public abstract boolean M();

    public InterfaceC0156g S() {
        return new a();
    }

    public abstract int T(int i7, int i8, int i9);

    public final int U() {
        return this.f8953o;
    }

    public abstract AbstractC0760g V(int i7, int i8);

    public final byte[] W() {
        int size = size();
        if (size == 0) {
            return AbstractC0777y.f9200c;
        }
        byte[] bArr = new byte[size];
        s(bArr, 0, 0, size);
        return bArr;
    }

    public final String Y(Charset charset) {
        return size() == 0 ? "" : Z(charset);
    }

    public abstract String Z(Charset charset);

    public final String a0() {
        return Y(AbstractC0777y.f9198a);
    }

    public abstract byte d(int i7);

    public abstract void d0(AbstractC0759f abstractC0759f);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f8953o;
        if (i7 == 0) {
            int size = size();
            i7 = T(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f8953o = i7;
        }
        return i7;
    }

    public abstract void s(byte[] bArr, int i7, int i8, int i9);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
