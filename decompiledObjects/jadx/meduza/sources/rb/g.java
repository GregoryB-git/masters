package rb;

import ec.i;
import java.io.Serializable;
import p2.m0;

/* loaded from: classes.dex */
public final class g<T> implements c<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public dc.a<? extends T> f13848a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13849b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13850c;

    public g(dc.a aVar) {
        i.e(aVar, "initializer");
        this.f13848a = aVar;
        this.f13849b = m0.B;
        this.f13850c = this;
    }

    @Override // rb.c
    public final T getValue() {
        T t;
        T t10 = (T) this.f13849b;
        m0 m0Var = m0.B;
        if (t10 != m0Var) {
            return t10;
        }
        synchronized (this.f13850c) {
            t = (T) this.f13849b;
            if (t == m0Var) {
                dc.a<? extends T> aVar = this.f13848a;
                i.b(aVar);
                t = aVar.invoke();
                this.f13849b = t;
                this.f13848a = null;
            }
        }
        return t;
    }

    public final String toString() {
        return this.f13849b != m0.B ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
