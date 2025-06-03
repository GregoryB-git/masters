package ma;

import ma.w;

/* loaded from: classes.dex */
public final class v implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f11096a = new v();

    @Override // ma.r0
    public final q0 a(Class<?> cls) {
        if (!w.class.isAssignableFrom(cls)) {
            StringBuilder l10 = defpackage.f.l("Unsupported message type: ");
            l10.append(cls.getName());
            throw new IllegalArgumentException(l10.toString());
        }
        try {
            return (q0) w.u(cls.asSubclass(w.class)).t(w.f.BUILD_MESSAGE_INFO);
        } catch (Exception e10) {
            StringBuilder l11 = defpackage.f.l("Unable to get message info for ");
            l11.append(cls.getName());
            throw new RuntimeException(l11.toString(), e10);
        }
    }

    @Override // ma.r0
    public final boolean b(Class<?> cls) {
        return w.class.isAssignableFrom(cls);
    }
}
