package e7;

import e7.e3;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap<e3.a, k> f4453a;

    public l() {
        this.f4453a = new EnumMap<>(e3.a.class);
    }

    public l(EnumMap<e3.a, k> enumMap) {
        EnumMap<e3.a, k> enumMap2 = new EnumMap<>((Class<e3.a>) e3.a.class);
        this.f4453a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public final void a(e3.a aVar, int i10) {
        k kVar = k.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    kVar = k.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        kVar = k.INITIALIZATION;
                    }
                }
            }
            kVar = k.API;
        } else {
            kVar = k.TCF;
        }
        this.f4453a.put((EnumMap<e3.a, k>) aVar, (e3.a) kVar);
    }

    public final void b(e3.a aVar, k kVar) {
        this.f4453a.put((EnumMap<e3.a, k>) aVar, (e3.a) kVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (e3.a aVar : e3.a.values()) {
            k kVar = this.f4453a.get(aVar);
            if (kVar == null) {
                kVar = k.UNSET;
            }
            sb2.append(kVar.f4391a);
        }
        return sb2.toString();
    }
}
