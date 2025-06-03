package r6;

/* loaded from: classes.dex */
public abstract class f {
    public static final d a(int i7, a aVar, g6.l lVar) {
        d bVar;
        if (i7 == -2) {
            bVar = aVar == a.SUSPEND ? new b(d.f19124a.a(), lVar) : new l(1, aVar, lVar);
        } else {
            if (i7 == -1) {
                if (aVar == a.SUSPEND) {
                    return new l(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i7 != 0) {
                return i7 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i7, lVar) : new l(i7, aVar, lVar) : new b(Integer.MAX_VALUE, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b(0, lVar) : new l(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i7, a aVar, g6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return a(i7, aVar, lVar);
    }
}
