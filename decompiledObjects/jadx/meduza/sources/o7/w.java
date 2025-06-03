package o7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class w<K, V> extends g<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient u<K, ? extends r<V>> f12069d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f12070e;

    public w(m0 m0Var, int i10) {
        this.f12069d = m0Var;
        this.f12070e = i10;
    }

    @Override // o7.f
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // o7.f
    public final Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // o7.f0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o7.f
    public final Set<K> d() {
        throw new AssertionError("unreachable");
    }

    @Override // o7.f
    public final Iterator e() {
        return new v(this);
    }

    @Override // o7.f, o7.f0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public u<K, Collection<V>> a() {
        return this.f12069d;
    }

    @Override // o7.f0
    public final int size() {
        return this.f12070e;
    }
}
