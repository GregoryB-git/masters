package ma;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import ma.a0;

/* loaded from: classes.dex */
public final class g extends c<Boolean> implements RandomAccess, c1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f10958b;

    /* renamed from: c, reason: collision with root package name */
    public int f10959c;

    static {
        new g(new boolean[0], 0, false);
    }

    public g() {
        this(new boolean[10], 0, true);
    }

    public g(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f10958b = zArr;
        this.f10959c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f10959c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f10959c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        boolean[] zArr = this.f10958b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f10958b, i10, zArr2, i10 + 1, this.f10959c - i10);
            this.f10958b = zArr2;
        }
        this.f10958b[i10] = booleanValue;
        this.f10959c++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        Charset charset = a0.f10909a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i10 = gVar.f10959c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10959c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f10958b;
        if (i12 > zArr.length) {
            this.f10958b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(gVar.f10958b, 0, this.f10958b, this.f10959c, gVar.f10959c);
        this.f10959c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ma.a0.d
    public final a0.d c(int i10) {
        if (i10 >= this.f10959c) {
            return new g(Arrays.copyOf(this.f10958b, i10), this.f10959c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f10959c != gVar.f10959c) {
            return false;
        }
        boolean[] zArr = gVar.f10958b;
        for (int i10 = 0; i10 < this.f10959c; i10++) {
            if (this.f10958b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Boolean.valueOf(this.f10958b[i10]);
    }

    public final void h(boolean z10) {
        a();
        int i10 = this.f10959c;
        boolean[] zArr = this.f10958b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f10958b = zArr2;
        }
        boolean[] zArr3 = this.f10958b;
        int i11 = this.f10959c;
        this.f10959c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // ma.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10959c; i11++) {
            i10 = (i10 * 31) + a0.a(this.f10958b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f10959c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f10959c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f10959c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f10958b[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ma.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        boolean[] zArr = this.f10958b;
        boolean z10 = zArr[i10];
        if (i10 < this.f10959c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f10959c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f10958b;
        System.arraycopy(zArr, i11, zArr, i10, this.f10959c - i11);
        this.f10959c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        i(i10);
        boolean[] zArr = this.f10958b;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10959c;
    }

    @Override // ma.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}
