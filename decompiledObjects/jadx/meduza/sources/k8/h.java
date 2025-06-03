package k8;

import ec.j;
import k8.i;

/* loaded from: classes.dex */
public final class h extends j implements dc.a<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9138a = new h();

    public h() {
        super(0);
    }

    @Override // dc.a
    public final String invoke() {
        StringBuilder l10 = defpackage.f.l("Must not be called on a main thread, was called on ");
        i.f9139d.getClass();
        l10.append(i.a.b());
        l10.append('.');
        return l10.toString();
    }
}
