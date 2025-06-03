package o7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class s0 extends b<Object> {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator<Object> f12048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f12049d;

    public s0(t0 t0Var) {
        this.f12049d = t0Var;
        this.f12048c = t0Var.f12055a.iterator();
    }

    @Override // o7.b
    public final Object a() {
        while (this.f12048c.hasNext()) {
            Object next = this.f12048c.next();
            if (this.f12049d.f12056b.contains(next)) {
                return next;
            }
        }
        this.f11938a = 3;
        return null;
    }
}
