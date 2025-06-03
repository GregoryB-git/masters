package rb;

import ec.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f13844a;

    /* renamed from: b, reason: collision with root package name */
    public final B f13845b;

    public d(A a10, B b10) {
        this.f13844a = a10;
        this.f13845b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f13844a, dVar.f13844a) && i.a(this.f13845b, dVar.f13845b);
    }

    public final int hashCode() {
        A a10 = this.f13844a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f13845b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.f13844a + ", " + this.f13845b + ')';
    }
}
