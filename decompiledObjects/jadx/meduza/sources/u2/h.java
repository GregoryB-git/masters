package u2;

import android.os.Build;
import x2.s;

/* loaded from: classes.dex */
public final class h extends d<t2.c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f14933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v2.g<t2.c> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14933b = 7;
    }

    @Override // u2.d
    public final int a() {
        return this.f14933b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        int i10 = sVar.f16838j.f11703a;
        return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
    }

    @Override // u2.d
    public final boolean c(t2.c cVar) {
        t2.c cVar2 = cVar;
        ec.i.e(cVar2, "value");
        return !cVar2.f14414a || cVar2.f14416c;
    }
}
