package A4;

import B4.a;

/* loaded from: classes.dex */
public final class f implements a.InterfaceC0010a {

    /* renamed from: a, reason: collision with root package name */
    public static final F4.a f558a = F4.a.e();

    @Override // B4.a.InterfaceC0010a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e7) {
            f558a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e7);
        }
    }
}
