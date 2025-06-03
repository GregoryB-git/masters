package com.google.crypto.tink.shaded.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1093h implements Iterable, Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC1093h f11337p = new j(AbstractC1110z.f11555d);

    /* renamed from: q, reason: collision with root package name */
    public static final f f11338q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator f11339r;

    /* renamed from: o, reason: collision with root package name */
    public int f11340o = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    public class a extends c {

        /* renamed from: o, reason: collision with root package name */
        public int f11341o = 0;

        /* renamed from: p, reason: collision with root package name */
        public final int f11342p;

        public a() {
            this.f11342p = AbstractC1093h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.g
        public byte c() {
            int i7 = this.f11341o;
            if (i7 >= this.f11342p) {
                throw new NoSuchElementException();
            }
            this.f11341o = i7 + 1;
            return AbstractC1093h.this.D(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11341o < this.f11342p;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1093h abstractC1093h, AbstractC1093h abstractC1093h2) {
            g S6 = abstractC1093h.S();
            g S7 = abstractC1093h2.S();
            while (S6.hasNext() && S7.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC1093h.Z(S6.c())).compareTo(Integer.valueOf(AbstractC1093h.Z(S7.c())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC1093h.size()).compareTo(Integer.valueOf(abstractC1093h2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    public static abstract class c implements g {
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

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            return Arrays.copyOfRange(bArr, i7, i8 + i7);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    public static final class e extends j {
        private static final long serialVersionUID = 1;

        /* renamed from: t, reason: collision with root package name */
        public final int f11344t;

        /* renamed from: u, reason: collision with root package name */
        public final int f11345u;

        public e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC1093h.g(i7, i7 + i8, bArr.length);
            this.f11344t = i7;
            this.f11345u = i8;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.j, com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public byte D(int i7) {
            return this.f11348s[this.f11344t + i7];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.j, com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public byte d(int i7) {
            AbstractC1093h.f(i7, size());
            return this.f11348s[this.f11344t + i7];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.j
        public int i0() {
            return this.f11344t;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.j, com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public void s(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f11348s, i0() + i7, bArr, i8, i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.j, com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public int size() {
            return this.f11345u;
        }

        public Object writeReplace() {
            return AbstractC1093h.e0(Y());
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    public interface f {
        byte[] a(byte[] bArr, int i7, int i8);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator {
        byte c();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    public static final class C0173h {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1096k f11346a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f11347b;

        public C0173h(int i7) {
            byte[] bArr = new byte[i7];
            this.f11347b = bArr;
            this.f11346a = AbstractC1096k.U(bArr);
        }

        public AbstractC1093h a() {
            this.f11346a.c();
            return new j(this.f11347b);
        }

        public AbstractC1096k b() {
            return this.f11346a;
        }

        public /* synthetic */ C0173h(int i7, a aVar) {
            this(i7);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    public static abstract class i extends AbstractC1093h {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.S();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    public static class j extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: s, reason: collision with root package name */
        public final byte[] f11348s;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f11348s = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public byte D(int i7) {
            return this.f11348s[i7];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final boolean M() {
            int i02 = i0();
            return p0.n(this.f11348s, i02, size() + i02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final AbstractC1094i U() {
            return AbstractC1094i.j(this.f11348s, i0(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final int V(int i7, int i8, int i9) {
            return AbstractC1110z.h(i7, this.f11348s, i0() + i8, i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final AbstractC1093h X(int i7, int i8) {
            int g7 = AbstractC1093h.g(i7, i8, size());
            return g7 == 0 ? AbstractC1093h.f11337p : new e(this.f11348s, i0() + i7, g7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final String b0(Charset charset) {
            return new String(this.f11348s, i0(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public byte d(int i7) {
            return this.f11348s[i7];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1093h) || size() != ((AbstractC1093h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int W6 = W();
            int W7 = jVar.W();
            if (W6 == 0 || W7 == 0 || W6 == W7) {
                return h0(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public final void g0(AbstractC1092g abstractC1092g) {
            abstractC1092g.a(this.f11348s, i0(), size());
        }

        public final boolean h0(AbstractC1093h abstractC1093h, int i7, int i8) {
            if (i8 > abstractC1093h.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC1093h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC1093h.size());
            }
            if (!(abstractC1093h instanceof j)) {
                return abstractC1093h.X(i7, i9).equals(X(0, i8));
            }
            j jVar = (j) abstractC1093h;
            byte[] bArr = this.f11348s;
            byte[] bArr2 = jVar.f11348s;
            int i02 = i0() + i8;
            int i03 = i0();
            int i04 = jVar.i0() + i7;
            while (i03 < i02) {
                if (bArr[i03] != bArr2[i04]) {
                    return false;
                }
                i03++;
                i04++;
            }
            return true;
        }

        public int i0() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public void s(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f11348s, i7, bArr, i8, i9);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h
        public int size() {
            return this.f11348s.length;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    public static final class k implements f {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1093h.f
        public byte[] a(byte[] bArr, int i7, int i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f11338q = AbstractC1089d.c() ? new k(aVar) : new d(aVar);
        f11339r = new b();
    }

    public static C0173h T(int i7) {
        return new C0173h(i7, null);
    }

    public static int Z(byte b7) {
        return b7 & 255;
    }

    public static AbstractC1093h e0(byte[] bArr) {
        return new j(bArr);
    }

    public static void f(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
        }
    }

    public static AbstractC1093h f0(byte[] bArr, int i7, int i8) {
        return new e(bArr, i7, i8);
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

    public static AbstractC1093h i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC1093h k(byte[] bArr, int i7, int i8) {
        g(i7, i7 + i8, bArr.length);
        return new j(f11338q.a(bArr, i7, i8));
    }

    public static AbstractC1093h q(String str) {
        return new j(str.getBytes(AbstractC1110z.f11553b));
    }

    public abstract byte D(int i7);

    public abstract boolean M();

    public g S() {
        return new a();
    }

    public abstract AbstractC1094i U();

    public abstract int V(int i7, int i8, int i9);

    public final int W() {
        return this.f11340o;
    }

    public abstract AbstractC1093h X(int i7, int i8);

    public final byte[] Y() {
        int size = size();
        if (size == 0) {
            return AbstractC1110z.f11555d;
        }
        byte[] bArr = new byte[size];
        s(bArr, 0, 0, size);
        return bArr;
    }

    public final String a0(Charset charset) {
        return size() == 0 ? "" : b0(charset);
    }

    public abstract String b0(Charset charset);

    public final String c0() {
        return a0(AbstractC1110z.f11553b);
    }

    public abstract byte d(int i7);

    public final String d0() {
        if (size() <= 50) {
            return i0.a(this);
        }
        return i0.a(X(0, 47)) + "...";
    }

    public abstract boolean equals(Object obj);

    public abstract void g0(AbstractC1092g abstractC1092g);

    public final int hashCode() {
        int i7 = this.f11340o;
        if (i7 == 0) {
            int size = size();
            i7 = V(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f11340o = i7;
        }
        return i7;
    }

    public abstract void s(byte[] bArr, int i7, int i8, int i9);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), d0());
    }
}
