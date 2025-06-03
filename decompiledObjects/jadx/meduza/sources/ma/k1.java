package ma;

import java.util.Iterator;
import java.util.Map;
import ma.s;

/* loaded from: classes.dex */
public final class k1 extends l1<Object, Object> {
    public k1(int i10) {
        super(i10);
    }

    @Override // ma.l1
    public final void h() {
        if (!this.f11041d) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((s.a) d(i10).getKey()).b();
            }
            Iterator<Map.Entry<Object, Object>> it = f().iterator();
            while (it.hasNext()) {
                ((s.a) it.next().getKey()).b();
            }
        }
        super.h();
    }

    @Override // ma.l1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
