package o7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z extends b<Object> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f12074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n7.j f12075d;

    public z(Iterator it, n7.j jVar) {
        this.f12074c = it;
        this.f12075d = jVar;
    }

    @Override // o7.b
    public final Object a() {
        while (this.f12074c.hasNext()) {
            Object next = this.f12074c.next();
            if (this.f12075d.apply(next)) {
                return next;
            }
        }
        this.f11938a = 3;
        return null;
    }
}
