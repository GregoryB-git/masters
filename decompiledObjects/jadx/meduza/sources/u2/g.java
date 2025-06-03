package u2;

import android.os.Build;
import o2.j;
import x2.s;

/* loaded from: classes.dex */
public final class g extends d<t2.c> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14931c;

    /* renamed from: b, reason: collision with root package name */
    public final int f14932b;

    static {
        String f = j.f("NetworkNotRoamingCtrlr");
        ec.i.d(f, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f14931c = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v2.g<t2.c> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14932b = 7;
    }

    @Override // u2.d
    public final int a() {
        return this.f14932b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11703a == 4;
    }

    @Override // u2.d
    public final boolean c(t2.c cVar) {
        t2.c cVar2 = cVar;
        ec.i.e(cVar2, "value");
        if (Build.VERSION.SDK_INT < 24) {
            j.d().a(f14931c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (cVar2.f14414a) {
                return false;
            }
        } else if (cVar2.f14414a && cVar2.f14417d) {
            return false;
        }
        return true;
    }
}
