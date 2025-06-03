package s0;

import s0.v;

/* loaded from: classes.dex */
public final class u implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u f14105a = new u();

    @Override // s0.n0
    public final m0 a(Class<?> cls) {
        if (!v.class.isAssignableFrom(cls)) {
            StringBuilder l10 = defpackage.f.l("Unsupported message type: ");
            l10.append(cls.getName());
            throw new IllegalArgumentException(l10.toString());
        }
        try {
            return (m0) v.l(cls.asSubclass(v.class)).k(v.f.BUILD_MESSAGE_INFO);
        } catch (Exception e10) {
            StringBuilder l11 = defpackage.f.l("Unable to get message info for ");
            l11.append(cls.getName());
            throw new RuntimeException(l11.toString(), e10);
        }
    }

    @Override // s0.n0
    public final boolean b(Class<?> cls) {
        return v.class.isAssignableFrom(cls);
    }
}
