package m9;

import g9.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10831a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10832b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f10833c = true;

    /* renamed from: d, reason: collision with root package name */
    public ma.h f10834d = ma.h.f10961b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10835e = false;

    public final k0 a() {
        t8.e<j9.i> eVar = j9.i.f8683c;
        t8.e<j9.i> eVar2 = eVar;
        t8.e<j9.i> eVar3 = eVar2;
        t8.e<j9.i> eVar4 = eVar3;
        for (Map.Entry entry : this.f10832b.entrySet()) {
            j9.i iVar = (j9.i) entry.getKey();
            i.a aVar = (i.a) entry.getValue();
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                eVar4 = eVar4.a(iVar);
            } else if (ordinal == 1) {
                eVar2 = eVar2.a(iVar);
            } else {
                if (ordinal != 2) {
                    x6.b.T("Encountered invalid change type: %s", aVar);
                    throw null;
                }
                eVar3 = eVar3.a(iVar);
            }
        }
        return new k0(this.f10834d, this.f10835e, eVar2, eVar3, eVar4);
    }
}
