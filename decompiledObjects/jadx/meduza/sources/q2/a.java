package q2;

import defpackage.f;
import o2.j;
import x2.s;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f13195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13196b;

    public a(b bVar, s sVar) {
        this.f13196b = bVar;
        this.f13195a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j d10 = j.d();
        String str = b.f13197e;
        StringBuilder l10 = f.l("Scheduling work ");
        l10.append(this.f13195a.f16830a);
        d10.a(str, l10.toString());
        this.f13196b.f13198a.e(this.f13195a);
    }
}
