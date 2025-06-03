package nc;

import ub.h;

/* loaded from: classes.dex */
public final class z extends ec.j implements dc.p<Boolean, h.b, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public static final z f11579a = new z();

    public z() {
        super(2);
    }

    @Override // dc.p
    public final Boolean invoke(Boolean bool, h.b bVar) {
        return Boolean.valueOf(bool.booleanValue() || (bVar instanceof x));
    }
}
