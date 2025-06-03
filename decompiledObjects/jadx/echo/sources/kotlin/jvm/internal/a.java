package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, h6.a {

    /* renamed from: o, reason: collision with root package name */
    public final Object[] f16213o;

    /* renamed from: p, reason: collision with root package name */
    public int f16214p;

    public a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f16213o = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16214p < this.f16213o.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f16213o;
            int i7 = this.f16214p;
            this.f16214p = i7 + 1;
            return objArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f16214p--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
