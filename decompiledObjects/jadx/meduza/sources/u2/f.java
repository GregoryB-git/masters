package u2;

import android.os.Build;
import o2.j;
import x2.s;

/* loaded from: classes.dex */
public final class f extends d<t2.c> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14929c;

    /* renamed from: b, reason: collision with root package name */
    public final int f14930b;

    static {
        String f = j.f("NetworkMeteredCtrlr");
        ec.i.d(f, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f14929c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v2.g<t2.c> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14930b = 7;
    }

    @Override // u2.d
    public final int a() {
        return this.f14930b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11703a == 5;
    }

    @Override // u2.d
    public final boolean c(t2.c cVar) {
        t2.c cVar2 = cVar;
        ec.i.e(cVar2, "value");
        if (Build.VERSION.SDK_INT < 26) {
            j.d().a(f14929c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (cVar2.f14414a) {
                return false;
            }
        } else if (cVar2.f14414a && cVar2.f14416c) {
            return false;
        }
        return true;
    }
}
