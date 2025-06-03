package pc;

import pc.f;

/* loaded from: classes.dex */
public final class i {
    public static b a(int i10, a aVar, int i11) {
        b nVar;
        a aVar2 = a.SUSPEND;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = aVar2;
        }
        if (i10 != -2) {
            if (i10 == -1) {
                if (aVar == aVar2) {
                    return new n(1, a.DROP_OLDEST, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? aVar == aVar2 ? new b(i10, null) : new n(i10, aVar, null) : new b(Integer.MAX_VALUE, null);
            }
            nVar = aVar == aVar2 ? new b(0, null) : new n(1, aVar, null);
        } else if (aVar == aVar2) {
            f.f13159m.getClass();
            nVar = new b(f.a.f13161b, null);
        } else {
            nVar = new n(1, aVar, null);
        }
        return nVar;
    }
}
