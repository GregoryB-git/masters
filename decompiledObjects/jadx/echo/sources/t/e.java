package t;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f19380o;

    /* renamed from: p, reason: collision with root package name */
    public int f19381p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19382q;

    public e(int i7) {
        this.f19380o = i7;
    }

    public abstract Object b(int i7);

    public abstract void d(int i7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19381p < this.f19380o;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b7 = b(this.f19381p);
        this.f19381p++;
        this.f19382q = true;
        return b7;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f19382q) {
            throw new IllegalStateException();
        }
        int i7 = this.f19381p - 1;
        this.f19381p = i7;
        d(i7);
        this.f19380o--;
        this.f19382q = false;
    }
}
