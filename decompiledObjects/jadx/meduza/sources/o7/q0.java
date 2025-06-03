package o7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class q0 extends b<Object> {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator<Object> f12037c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator<Object> f12038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f12039e;

    public q0(r0 r0Var) {
        this.f12039e = r0Var;
        this.f12037c = r0Var.f12044a.iterator();
        this.f12038d = r0Var.f12045b.iterator();
    }

    @Override // o7.b
    public final Object a() {
        if (this.f12037c.hasNext()) {
            return this.f12037c.next();
        }
        while (this.f12038d.hasNext()) {
            Object next = this.f12038d.next();
            if (!this.f12039e.f12044a.contains(next)) {
                return next;
            }
        }
        this.f11938a = 3;
        return null;
    }
}
