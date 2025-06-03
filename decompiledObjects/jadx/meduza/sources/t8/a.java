package t8;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements Iterator<Map.Entry<Object, Object>> {

    /* renamed from: a, reason: collision with root package name */
    public int f14643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14644b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f14645c;

    public a(b bVar, int i10) {
        this.f14645c = bVar;
        this.f14643a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14644b) {
            if (this.f14643a >= 0) {
                return true;
            }
        } else if (this.f14643a < this.f14645c.f14646a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Map.Entry<Object, Object> next() {
        b bVar = this.f14645c;
        Object[] objArr = bVar.f14646a;
        int i10 = this.f14643a;
        Object obj = objArr[i10];
        Object obj2 = bVar.f14647b[i10];
        this.f14643a = this.f14644b ? i10 - 1 : i10 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
