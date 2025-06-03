package n7;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t<T> implements q<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final T f11318a;

    public t(T t) {
        this.f11318a = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return x6.b.Q(this.f11318a, ((t) obj).f11318a);
        }
        return false;
    }

    @Override // n7.q
    public final T get() {
        return this.f11318a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11318a});
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Suppliers.ofInstance(");
        l10.append(this.f11318a);
        l10.append(")");
        return l10.toString();
    }
}
