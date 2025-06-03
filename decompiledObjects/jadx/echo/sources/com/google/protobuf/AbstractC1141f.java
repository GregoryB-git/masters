package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1141f implements Iterable, Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC1141f f12047p = new i(AbstractC1154t.f12253d);

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC0180f f12048q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator f12049r;

    /* renamed from: o, reason: collision with root package name */
    public int f12050o = 0;

    /* renamed from: com.google.protobuf.f$a */
    public class a extends c {

        /* renamed from: o, reason: collision with root package name */
        public int f12051o = 0;

        /* renamed from: p, reason: collision with root package name */
        public final int f12052p;

        public a() {
            this.f12052p = AbstractC1141f.this.size();
        }

        @Override // com.google.protobuf.AbstractC1141f.g
        public byte c() {
            int i7 = this.f12051o;
            if (i7 >= this.f12052p) {
                throw new NoSuchElementException();
            }
            this.f12051o = i7 + 1;
            return AbstractC1141f.this.q(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12051o < this.f12052p;
        }
    }

    /* renamed from: com.google.protobuf.f$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1141f abstractC1141f, AbstractC1141f abstractC1141f2) {
            g D7 = abstractC1141f.D();
            g D8 = abstractC1141f2.D();
            while (D7.hasNext() && D8.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC1141f.V(D7.c())).compareTo(Integer.valueOf(AbstractC1141f.V(D8.c())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC1141f.size()).compareTo(Integer.valueOf(abstractC1141f2.size()));
        }
    }

    /* renamed from: com.google.protobuf.f$c */
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

    /* renamed from: com.google.protobuf.f$d */
    public static final class d implements InterfaceC0180f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.f$e */
    public static final class e extends i {
        private static final long serialVersionUID = 1;

        /* renamed from: t, reason: collision with root package name */
        public final int f12054t;

        /* renamed from: u, reason: collision with root package name */
        public final int f12055u;

        public e(byte[] bArr, int i7, int i8) {
            super(bArr);
            AbstractC1141f.g(i7, i7 + i8, bArr.length);
            this.f12054t = i7;
            this.f12055u = i8;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC1141f.i, com.google.protobuf.AbstractC1141f
        public byte d(int i7) {
            AbstractC1141f.f(i7, size());
            return this.f12056s[this.f12054t + i7];
        }

        @Override // com.google.protobuf.AbstractC1141f.i
        public int d0() {
            return this.f12054t;
        }

        @Override // com.google.protobuf.AbstractC1141f.i, com.google.protobuf.AbstractC1141f
        public void k(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f12056s, d0() + i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC1141f.i, com.google.protobuf.AbstractC1141f
        public byte q(int i7) {
            return this.f12056s[this.f12054t + i7];
        }

        @Override // com.google.protobuf.AbstractC1141f.i, com.google.protobuf.AbstractC1141f
        public int size() {
            return this.f12055u;
        }

        public Object writeReplace() {
            return AbstractC1141f.a0(U());
        }
    }

    /* renamed from: com.google.protobuf.f$f, reason: collision with other inner class name */
    public interface InterfaceC0180f {
    }

    /* renamed from: com.google.protobuf.f$g */
    public interface g extends Iterator {
        byte c();
    }

    /* renamed from: com.google.protobuf.f$h */
    public static abstract class h extends AbstractC1141f {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.D();
        }
    }

    /* renamed from: com.google.protobuf.f$i */
    public static class i extends h {
        private static final long serialVersionUID = 1;

        /* renamed from: s, reason: collision with root package name */
        public final byte[] f12056s;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f12056s = bArr;
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final int M(int i7, int i8, int i9) {
            return AbstractC1154t.h(i7, this.f12056s, d0() + i8, i9);
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final AbstractC1141f T(int i7, int i8) {
            int g7 = AbstractC1141f.g(i7, i8, size());
            return g7 == 0 ? AbstractC1141f.f12047p : new e(this.f12056s, d0() + i7, g7);
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final String X(Charset charset) {
            return new String(this.f12056s, d0(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final void b0(AbstractC1140e abstractC1140e) {
            abstractC1140e.a(this.f12056s, d0(), size());
        }

        public final boolean c0(AbstractC1141f abstractC1141f, int i7, int i8) {
            if (i8 > abstractC1141f.size()) {
                throw new IllegalArgumentException("Length too large: " + i8 + size());
            }
            int i9 = i7 + i8;
            if (i9 > abstractC1141f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i7 + ", " + i8 + ", " + abstractC1141f.size());
            }
            if (!(abstractC1141f instanceof i)) {
                return abstractC1141f.T(i7, i9).equals(T(0, i8));
            }
            i iVar = (i) abstractC1141f;
            byte[] bArr = this.f12056s;
            byte[] bArr2 = iVar.f12056s;
            int d02 = d0() + i8;
            int d03 = d0();
            int d04 = iVar.d0() + i7;
            while (d03 < d02) {
                if (bArr[d03] != bArr2[d04]) {
                    return false;
                }
                d03++;
                d04++;
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractC1141f
        public byte d(int i7) {
            return this.f12056s[i7];
        }

        public int d0() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1141f) || size() != ((AbstractC1141f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int S6 = S();
            int S7 = iVar.S();
            if (S6 == 0 || S7 == 0 || S6 == S7) {
                return c0(iVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC1141f
        public void k(byte[] bArr, int i7, int i8, int i9) {
            System.arraycopy(this.f12056s, i7, bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC1141f
        public byte q(int i7) {
            return this.f12056s[i7];
        }

        @Override // com.google.protobuf.AbstractC1141f
        public final boolean s() {
            int d02 = d0();
            return l0.m(this.f12056s, d02, size() + d02);
        }

        @Override // com.google.protobuf.AbstractC1141f
        public int size() {
            return this.f12056s.length;
        }
    }

    /* renamed from: com.google.protobuf.f$j */
    public static final class j implements InterfaceC0180f {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f12048q = AbstractC1139d.c() ? new j(aVar) : new d(aVar);
        f12049r = new b();
    }

    public static int V(byte b7) {
        return b7 & 255;
    }

    public static AbstractC1141f a0(byte[] bArr) {
        return new i(bArr);
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

    public static AbstractC1141f i(String str) {
        return new i(str.getBytes(AbstractC1154t.f12251b));
    }

    public g D() {
        return new a();
    }

    public abstract int M(int i7, int i8, int i9);

    public final int S() {
        return this.f12050o;
    }

    public abstract AbstractC1141f T(int i7, int i8);

    public final byte[] U() {
        int size = size();
        if (size == 0) {
            return AbstractC1154t.f12253d;
        }
        byte[] bArr = new byte[size];
        k(bArr, 0, 0, size);
        return bArr;
    }

    public final String W(Charset charset) {
        return size() == 0 ? "" : X(charset);
    }

    public abstract String X(Charset charset);

    public final String Y() {
        return W(AbstractC1154t.f12251b);
    }

    public final String Z() {
        if (size() <= 50) {
            return e0.a(this);
        }
        return e0.a(T(0, 47)) + "...";
    }

    public abstract void b0(AbstractC1140e abstractC1140e);

    public abstract byte d(int i7);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f12050o;
        if (i7 == 0) {
            int size = size();
            i7 = M(size, 0, size);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f12050o = i7;
        }
        return i7;
    }

    public abstract void k(byte[] bArr, int i7, int i8, int i9);

    public abstract byte q(int i7);

    public abstract boolean s();

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), Z());
    }
}
