package r3;

/* loaded from: classes.dex */
public final class h implements m3.b<e> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f13558a = new h();
    }

    @Override // qb.a
    public final Object get() {
        r3.a aVar = e.f13555a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
