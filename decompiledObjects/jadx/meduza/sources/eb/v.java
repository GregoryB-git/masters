package eb;

import eb.o0;
import n7.g;

/* loaded from: classes.dex */
public abstract class v<T extends o0<T>> extends o0<T> {
    @Override // eb.o0
    public n0 a() {
        return d().a();
    }

    public abstract o0<?> d();

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(d(), "delegate");
        return b10.toString();
    }
}
