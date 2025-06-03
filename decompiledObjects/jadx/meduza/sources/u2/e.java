package u2;

import android.os.Build;
import x2.s;

/* loaded from: classes.dex */
public final class e extends d<t2.c> {

    /* renamed from: b, reason: collision with root package name */
    public final int f14928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v2.g<t2.c> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14928b = 7;
    }

    @Override // u2.d
    public final int a() {
        return this.f14928b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11703a == 2;
    }

    @Override // u2.d
    public final boolean c(t2.c cVar) {
        t2.c cVar2 = cVar;
        ec.i.e(cVar2, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!cVar2.f14414a || !cVar2.f14415b) {
                return true;
            }
        } else if (!cVar2.f14414a) {
            return true;
        }
        return false;
    }
}
