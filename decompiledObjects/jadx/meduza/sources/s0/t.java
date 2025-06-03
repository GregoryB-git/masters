package s0;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import s0.x;

/* loaded from: classes.dex */
public final class t extends c<Float> implements RandomAccess, x0 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f14103b;

    /* renamed from: c, reason: collision with root package name */
    public int f14104c;

    static {
        new t(0, new float[0]).f13948a = false;
    }

    public t() {
        this(0, new float[10]);
    }

    public t(int i10, float[] fArr) {
        this.f14103b = fArr;
        this.f14104c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f14104c)) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14104c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
        float[] fArr = this.f14103b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[a0.j.d(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f14103b, i10, fArr2, i10 + 1, this.f14104c - i10);
            this.f14103b = fArr2;
        }
        this.f14103b[i10] = floatValue;
        this.f14104c++;
        ((AbstractList) this).modCount++;
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = x.f14119a;
        collection.getClass();
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i10 = tVar.f14104c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14104c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f14103b;
        if (i12 > fArr.length) {
            this.f14103b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(tVar.f14103b, 0, this.f14103b, this.f14104c, tVar.f14104c);
        this.f14104c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // s0.x.c
    public final x.c c(int i10) {
        if (i10 < this.f14104c) {
            throw new IllegalArgumentException();
        }
        return new t(this.f14104c, Arrays.copyOf(this.f14103b, i10));
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f14104c != tVar.f14104c) {
            return false;
        }
        float[] fArr = tVar.f14103b;
        for (int i10 = 0; i10 < this.f14104c; i10++) {
            if (Float.floatToIntBits(this.f14103b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        i(i10);
        return Float.valueOf(this.f14103b[i10]);
    }

    public final void h(float f) {
        a();
        int i10 = this.f14104c;
        float[] fArr = this.f14103b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[a0.j.d(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f14103b = fArr2;
        }
        float[] fArr3 = this.f14103b;
        int i11 = this.f14104c;
        this.f14104c = i11 + 1;
        fArr3[i11] = f;
    }

    @Override // s0.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14104c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f14103b[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f14104c) {
            StringBuilder n2 = a0.j.n("Index:", i10, ", Size:");
            n2.append(this.f14104c);
            throw new IndexOutOfBoundsException(n2.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        i(i10);
        float[] fArr = this.f14103b;
        float f = fArr[i10];
        if (i10 < this.f14104c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f14104c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // s0.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f14104c; i10++) {
            if (obj.equals(Float.valueOf(this.f14103b[i10]))) {
                float[] fArr = this.f14103b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f14104c - i10) - 1);
                this.f14104c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14103b;
        System.arraycopy(fArr, i11, fArr, i10, this.f14104c - i11);
        this.f14104c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        i(i10);
        float[] fArr = this.f14103b;
        float f = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14104c;
    }

    @Override // s0.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
