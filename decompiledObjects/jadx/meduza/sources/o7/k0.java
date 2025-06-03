package o7;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class k0<T> implements Comparator<T> {
    public <S extends T> k0<S> a() {
        return new p0(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t10);
}
