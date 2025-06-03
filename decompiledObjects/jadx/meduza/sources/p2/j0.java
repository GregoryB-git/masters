package p2;

import java.util.List;
import x2.s;

/* loaded from: classes.dex */
public final class j0 implements o.a<List<s.c>, o2.o> {
    @Override // o.a
    public final o2.o apply(List<s.c> list) {
        List<s.c> list2 = list;
        if (list2 == null || list2.size() <= 0) {
            return null;
        }
        return list2.get(0).a();
    }
}
