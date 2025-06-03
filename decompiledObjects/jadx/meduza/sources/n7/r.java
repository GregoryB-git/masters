package n7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r<T> implements q<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final q<T> f11312a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f11313b;

    /* renamed from: c, reason: collision with root package name */
    public transient T f11314c;

    public r(q<T> qVar) {
        this.f11312a = qVar;
    }

    @Override // n7.q
    public final T get() {
        if (!this.f11313b) {
            synchronized (this) {
                if (!this.f11313b) {
                    T t = this.f11312a.get();
                    this.f11314c = t;
                    this.f11313b = true;
                    return t;
                }
            }
        }
        return this.f11314c;
    }

    public final String toString() {
        Object obj;
        StringBuilder l10 = defpackage.f.l("Suppliers.memoize(");
        if (this.f11313b) {
            StringBuilder l11 = defpackage.f.l("<supplier that returned ");
            l11.append(this.f11314c);
            l11.append(">");
            obj = l11.toString();
        } else {
            obj = this.f11312a;
        }
        l10.append(obj);
        l10.append(")");
        return l10.toString();
    }
}
